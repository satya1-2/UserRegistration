package com.bridgelabz.userRegistrationProblem;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


                        public class CheckRegularExpressionPattern {
                            public void checkFirstName () {
                                    Pattern p = Pattern.compile("[a-zA-Z]{3,}");
                                    Matcher m = p.matcher("Satya");
                                    boolean b = m.matches();
                                    System.out.println(b);
                                }

                                public void checkLastName () {
                                    Pattern p = Pattern.compile("[a-zA-Z]{3,}");
                                    Matcher m = p.matcher("yadav");
                                    boolean b = m.matches();
                                    System.out.println(b);
                                }

                                public void checkPhoneNumber () {
                                    String regex = "^[+]{1}(?:[0-9\\-\\(\\)\\/\\.]\\s?){6,15}[0-9]{1}$";
                                    Pattern pattern = Pattern.compile(regex);
                                    Matcher matcher = pattern.matcher("+917052606198");
                                    if (matcher.matches()) {
                                        System.out.println("Given phone number  is valid");
                                    } else {
                                        System.out.println("Given phone number  is not valid");

                                    }
                                }

                                public void checkPassword () {
                                    String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
                                    Pattern pattern = Pattern.compile(regex);
                                    Matcher matcher = pattern.matcher("Satya1234@");
                                    if (matcher.matches()) {
                                        System.out.println("Given password  is valid");
                                    } else {
                                        System.out.println("Given password  is not valid");
                                    }
                                }

                                public void checkEmail () {
                                    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
                                    Pattern pattern = Pattern.compile(regex);
                                    Matcher matcher = pattern.matcher("sspra143@gmail.com");
                                    if (matcher.matches()) {
                                        System.out.println("Given email id is valid");
                                    } else {
                                        System.out.println("Given email id is not valid");
                                    }
                                }


                                public static void main (String[]args){
                                    CheckRegularExpressionPattern search = new CheckRegularExpressionPattern();
                                    search.checkFirstName();
                                    search.checkLastName();
                                    search.checkPhoneNumber();
                                    search.checkPassword();
                                    search.checkEmail();
                                }
                            }
