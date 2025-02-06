package SaraWeeklyTasks.Week09;

public class PasswordValidation_W9 {

    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialCharacters = "!@#$%^&*(),.?\":{}|<>";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (specialCharacters.contains(String.valueOf(ch))) hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("New@123"));  // true
        System.out.println(isValidPassword("123Year"));   // false
        System.out.println(isValidPassword("PASS123"));   // false
        System.out.println(isValidPassword("Cydeo123"));   // false
        System.out.println(isValidPassword("New@"));     // false
    }


}
