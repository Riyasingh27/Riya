package com.example.LoginTask.Controller;

import com.example.LoginTask.Repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class LoginController {

    @Autowired
    JdbcTemplate jdbcTemplate;



    @PostMapping(path = "/Signup")
    public String Signup(WebRequest webRequest){
        String Name = webRequest.getParameter("name");
        String Email = webRequest.getParameter("email");
        String Phno = webRequest.getParameter("phone");
        String Password= webRequest.getParameter("password");
        String Repassword= webRequest.getParameter("repassword");
        LoginRepo.InsertInDatabase(Name,Email,Phno,Password,Repassword);
        String response = "Hi,"+Name+ ","+ "You have successfully Logged in.";
        return response;
    }

    @PostMapping(path = "/Login")
    public String Loginup(WebRequest webRequest){
        String Name= webRequest.getParameter("name");
        String Phno = webRequest.getParameter("phone");
        String Password= webRequest.getParameter("password");
        String response = "You have logged in."+"Hi,"+Name+ ","+ "This is your Main Page.";
        return response;
    }
}
