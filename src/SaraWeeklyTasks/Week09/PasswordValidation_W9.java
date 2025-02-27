package SaraWeeklyTasks.Week09;

import java.util.Scanner;

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

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" put your password: ");
        String pass = scanner.nextLine();
        System.out.println(isValidPassword(pass));

//        System.out.println(isValidPassword("testPassword123!"));
//        System.out.println(isValidPassword("mockPassword2024$"));
//        System.out.println(isValidPassword("examplePWD456@"));
    }


}
