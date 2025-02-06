package raminaWeeklyTasks.week09;

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

    public static void main(String[] args) {
        System.out.println(isValidPassword("ABC123!"));
        System.out.println(isValidPassword("Abc123!"));
        System.out.println(isValidPassword("123!"));
        System.out.println(isValidPassword("ABc!"));

    }
    public static boolean isValidPassword(String password){
        boolean hasLower =false;
        boolean hasUpper=false;
        boolean hasDigit=false;
        boolean hasSpecialCh = false;

        if(password.length() >= 6 && !password.contains(" ")){
            for (int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i))) {
                    hasUpper = true;
                }else if(Character.isLowerCase(password.charAt(i))){
                    hasLower = true;
                }else if(Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                }else if(!Character.isLetterOrDigit(password.charAt(i))) {
                    hasSpecialCh = true;
                }
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecialCh;
    }
}
