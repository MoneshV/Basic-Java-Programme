import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){

        // To calculate compound interest

        Scanner scanner = new Scanner(System.in);

        int principal;
        int years;
        int times;
        double rateOfInterest;
        double amount;

        System.out.print("Enter the Principal amount : ");
        principal = scanner.nextInt();

        System.out.print("Enter the rate of interest: ");
        rateOfInterest = scanner.nextDouble() / 100;

        System.out.print("Enter the no of years: ");
        years = scanner.nextInt();

        System.out.print("Enter the no of years times: ");
        times = scanner.nextInt();

        amount = principal * Math.pow(1 + rateOfInterest / times, times * years);
        System.out.printf("The amount after %d years is $%.2f", years, amount);


        scanner.close();

    }
}
