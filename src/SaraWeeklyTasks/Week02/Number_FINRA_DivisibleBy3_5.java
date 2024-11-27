package SaraWeeklyTasks.Week02;

import java.util.Scanner;

public class Number_FINRA_DivisibleBy3_5 {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number grater than 10 : ");
        int num = scanner.nextInt();

        finraDivisibleBy3_5(num);

    }

    public static void finraDivisibleBy3_5(int num){

        if( num <= 10){
            System.out.println("Opps! ... " + num + " is not grater than 10!");
        }else {
            for (int i =1 ; i < num + 1; i++) {
                if( (i %3 == 0) && ( i %5 == 0)){
                    System.out.print(" FINRA");
                }else if( i %5 ==0 ){
                    System.out.print(" FIN");
                }else if ( i %3 ==0){
                    System.out.print(" RA");
                }else {
                    System.out.print(" " + i);
                }
            }
        }
    }
}
