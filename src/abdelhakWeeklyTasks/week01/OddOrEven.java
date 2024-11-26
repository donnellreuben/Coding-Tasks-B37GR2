package abdelhakWeeklyTasks.week01;

public class OddOrEven {
    public static void main(String[] args) {

        identify(5);
        identify(6);
        identify(-1);
        identify(-4);

    }

    public static void identify(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");

    }
}