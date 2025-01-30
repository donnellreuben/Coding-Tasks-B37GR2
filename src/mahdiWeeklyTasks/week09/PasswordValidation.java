package mahdiWeeklyTasks.week09;

public class PasswordValidation {
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
        // Check if password is null or has less than 6 characters or contains a space
        if (password == null || password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Flags to check if password contains required characters
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // Check each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Return true if all conditions are met
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    public static void main(String[] args) {
        String password = "Passw0rd6!";
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
