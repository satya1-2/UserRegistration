package com.bridgelabz.userRegistrationProblem;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface FirstName {
    public abstract String checkName(String name);

    class CheckRegularExpressionPattern {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            FirstName name1 = (name) -> {
                return name;
            };
            System.out.println(name1.checkName("Satya"));

        }
    }
}

@FunctionalInterface
interface LastName {
    public abstract String checkLastName(String name);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            LastName lastName1 = (name) -> {
                return name;
            };
            System.out.println(lastName1.checkLastName("Yadav"));

        }
    }
}
@FunctionalInterface
interface PhoneNumber {
    public abstract String checkPhoneNumber(String phoneNumber);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            PhoneNumber phoneNumber1 = (phoneNumber) -> {
                return phoneNumber;
            };
            System.out.println(phoneNumber1.checkPhoneNumber("+91789543456"));

        }
    }
}
@FunctionalInterface
interface Email {
    public abstract String checkGmail(String gmailId);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            Email gmailId1 = (gmailId) -> {
                return "gmail:"+ gmailId;
            };
            System.out.println(gmailId1.checkGmail("sspra143@gmail"));

        }
    }
}
@FunctionalInterface
interface Password {
    public abstract String checkPassword(String password);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            Password password1 = (password) -> {
                return "password:" + password;
            };
            System.out.println(password1.checkPassword("Satya124@3456.com"));

        }
    }
}