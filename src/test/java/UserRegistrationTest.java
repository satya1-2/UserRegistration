import com.bridgelabz.userRegistrationProblem.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

    public boolean isValidFirstName(String firstName) {
        // code to validate first name
        return true;	}
    private String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private Pattern pattern = Pattern.compile(regex);

    @Test
    public void testValidFirstName() {
        UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
        boolean result = userRegistrationTest.isValidFirstName("altaf");
        Assert.assertEquals(true, result);
        String firstName = "Altaf";
        try {
            validateFirstName(firstName);
        } catch (InvalidFirstNameException e) {
            Assert.assertEquals("Valid first name should not throw exception", e.getMessage());
        }
    }

    public boolean isValidLastName(String lastName) {
        // code to validate last name
        return true;
        @Test
        public void testInvalidFirstName() {
            String firstName = "";
            try {
                validateFirstName(firstName);
            } catch (InvalidFirstNameException e) {
                Assert.assertEquals("Invalid first name should throw exception", "Invalid first name", e.getMessage());
            }
        }

        @Test
        public void testValidLastName() {
            UserRegistrationTest userRegistrationProblemTest = new UserRegistrationTest();
            boolean result = userRegistrationProblemTest.isValidLastName("khan");
            Assert.assertEquals(true, result);
            String lastName = "Khan";
            try {
                validateLastName(lastName);
            } catch (InvalidLastNameException e) {
                Assert.assertEquals("Valid last name should not throw exception", e.getMessage());
            }
        }

        public boolean isValidEmail(String email) {
            // code to validate email
            return true;
            @Test
            public void testInvalidLastName() {
                String lastName = "";
                try {
                    validateLastName(lastName);
                } catch (InvalidLastNameException e) {
                    Assert.assertEquals("Invalid last name should throw exception", "Invalid last name", e.getMessage());
                }
            }

            @Test
            public void testValidEmail() {
                UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
                boolean result = userRegistrationTest.isValidEmail("abc123rT");
                Assert.assertEquals(true, result);
                String email = "altaf.khan@yahoo.com";
                try {
                    validateEmail(email);
                } catch (InvalidEmailException e) {
                    Assert.assertEquals("Valid email should not throw exception", e.getMessage());
                }
            }
            public boolean isValidMobileNo(String mobileno) {
                // code to validate MobileNo
                return true;

                @Test
                public void testInvalidEmail() {
                    String email = "altaf@. com.my";
                    try {
                        validateEmail(email);
                    } catch (InvalidEmailException e) {
                        Assert.assertEquals("Invalid email should throw exception", "Invalid email", e.getMessage());
                    }
                }

                @Test
                public void testValidMobileno() {
                    UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
                    boolean result = userRegistrationTest.isValidMobileNo("91 9855217816");
                    Assert.assertEquals(true, result);
                    public void testValidMobile() {
                        String mobile = "1234567890";
                        try {
                            validateMobile(mobile);
                        } catch (InvalidMobileException e) {
                            Assert.assertEquals("Valid mobile should not throw exception", e.getMessage());
                        }
                    }
                    public boolean isValidPassword(String password) {
                        // code to validate password
                        return true;

                        @Test
                        public void testInvalidMobile() {
                            String mobile = "123";
                            try {
                                validateMobile(mobile);
                            } catch (InvalidMobileException e) {
                                Assert.assertEquals("Invalid mobile should throw exception", "Invalid mobile", e.getMessage());
                            }
                        }

                        @Test
                        public void testValidPassword() {
                            UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
                            boolean result = userRegistrationTest.isValidPassword("khan9090");
                            Assert.assertEquals(true, result);
                            String password = "Altaf1234";
                            try {
                                validatePassword(password);
                            } catch (InvalidPasswordException e) {
                                Assert.assertEquals("Valid password should not throw exception", e.getMessage());
                            }
                        }
                    }

                    @Test
                    public void testInvalidPassword() {
                        String password = "abcd";
                        try {
                            validatePassword(password);
                        } catch (InvalidPasswordException e) {
                            Assert.assertEquals("Invalid password should throw exception", "Invalid password", e.getMessage());
                        }
                    }

                    private void validateFirstName(String firstName) throws InvalidFirstNameException {
                        if (firstName.isEmpty()) {
                            throw new InvalidFirstNameException("Invalid first name");
                        }
                    }

                    private void validateLastName(String lastName) throws InvalidLastNameException {
                        if (lastName.isEmpty()) {
                            throw new InvalidLastNameException("Invalid last name");
                        }
                    }

                    private void validateEmail(String email) throws InvalidEmailException {
                        Matcher matcher = pattern.matcher(email);
                        if (!matcher.matches()) {
                            throw new InvalidEmailException("Invalid email");
                        }
                    }

                    private void validateMobile(String mobile) throws InvalidMobileException {
                        if (mobile.length() != 10) {
                            throw new InvalidMobileException("Invalid mobile");
                        }
                    }

                    private void validatePassword(String password) throws InvalidPasswordException {
                        if (password.length() < 8) {
                            throw new InvalidPasswordException("Invalid password");
                        }
                    }

                }