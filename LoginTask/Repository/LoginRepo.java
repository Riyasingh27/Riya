package com.example.LoginTask.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void InsertInDatabase(String name,String email,String phno,String password,String Repassword){
        String sql= "INSERT INTO springdemo.Contacts (name,email,phone) VALUES(?,?,?)";
        Object params[] = new Object[]{name,email,phno,password,Repassword};
        jdbcTemplate.update(sql,params);
    }
}
