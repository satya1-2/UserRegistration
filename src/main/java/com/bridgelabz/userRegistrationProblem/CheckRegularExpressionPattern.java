package com.bridgelabz.userRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegularExpressionPattern {

    public void checkOneSpecialChracterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password one upper case one number and a Secial  chracter password : ");
        String password = scanner.next();
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Given  password  is valid");
        } else {
            System.out.println("Given password  is not valid");
        }
    }

    public static void main(String[] args) {
        CheckRegularExpressionPattern search = new CheckRegularExpressionPattern();
        search.checkOneSpecialChracterPassword();

    }
}


