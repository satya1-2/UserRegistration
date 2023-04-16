package com.bridgelabz.userRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegularExpressionPattern {

    public void checkRegularExpPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z]{3,}");
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        System.out.println(b);
    }
    public static void main(String[] args) {
        CheckRegularExpressionPattern  search = new CheckRegularExpressionPattern();
        search.checkRegularExpPattern();

    }
}


