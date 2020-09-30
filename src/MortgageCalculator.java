import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // mortgage calculator
        final byte MONTH_IN_A_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        int principal;
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        float annualInterestRate;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        double monthlyInterest = annualInterestRate / MONTH_IN_A_YEAR / PERCENT;

        byte period;
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }

        double num = Math.pow(monthlyInterest + 1, period * MONTH_IN_A_YEAR);
        double calculatedResult = principal * num * monthlyInterest / (num - 1);

        String result = currency.format(calculatedResult);
        System.out.print("Mortgage: " + result);
    }
}
