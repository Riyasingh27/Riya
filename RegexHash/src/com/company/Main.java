package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

        public class Main {
            ArrayList< String > tweet = new ArrayList< String >();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your sentence:");
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("[#]+([A-Za-z0-9-_]+)");
            Matcher matcher = pattern.matcher(input);
            Pattern pattern1 = Pattern.compile("[@]+([A-Za-z0-9-_]+)");
            Matcher matcher1 = pattern.matcher(input);

        while (matcher.find())  {
                System.out.println(matcher.find() && matcher1.find());
                System.out.println("Hashtags:"+matcher+" "+"Mentions:"+matcher1);
            }


        }

