import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // mortgage calculator
        final byte MONTH_IN_A_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        double monthlyInterest = annualInterestRate / MONTH_IN_A_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();

        double num = Math.pow(monthlyInterest + 1, period * MONTH_IN_A_YEAR);
        double calculatedResult = principal * num * monthlyInterest / (num - 1);

        String result = currency.format(calculatedResult);
        System.out.print("Mortgage: " + result);
    }
}
