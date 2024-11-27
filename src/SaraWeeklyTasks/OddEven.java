package SaraWeeklyTasks;

/*
    Write a method which can identifies given number is even or odd

        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        //scanner for getting the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        //condition for checking if the number is odd or even
        System.out.println("\n\t" + num + " is an " + ((num %2 == 0)? "even": "odd")+ " number.");
    }


}
