package Lejlas_Weekly_Task;

public class FINRA {

     /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {


        for (int i = 1; i <=30 ; i++) {

            boolean by3 =i % 3 == 0;
            boolean by5 =i % 5 == 0;
            String result = " ";

            if(by3 && by5){
                result = "FINRA";
            }else if(by3){
            result = "FIN";
            }else if(by5){
                result = "RA";
            }else{
                result = "" + i ;
            }
            System.out.println(result + " ");

        }


    }
    
}
