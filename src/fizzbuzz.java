import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = sc.nextInt();

        if (number % 15 == 0)
            System.out.println("fizzbuzz");
        else if (number % 5 == 0)
            System.out.println("fizz");
        else if (number % 3 == 0)
            System.out.println("buzz");
        else
            System.out.println(number);

//        switch (number) {
//            case 3:
//                System.out.println("fizz");
//                break;
//            case 5:
//                System.out.println("buzz");
//                break;
//            case 15:
//                System.out.println("fizzbuzz");
//                break;
//            default:
//                System.out.println(number);
//        }
//        switch (number) {
//            case 3 -> System.out.println("fizz");
//            case 5 -> System.out.println("buzz");
//            case 15 -> System.out.println("fizzbuzz");
//            default -> System.out.println(number);
//        }
    }
}
