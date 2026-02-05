import java.util.Scanner;

public class Temperature_Converter_16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // coverting temperature from Celsius to Fahrenheit.

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the current temperature : ");
        temp = scanner.nextDouble();

        System.out.print("convert celsius  to fahrenheit (C / F):  ");
        unit = scanner.next().toUpperCase();

        // Conditional check
        if (unit.equals("C") || unit.equals("F")) {

            // Ternary operator for conversion
            newtemp = unit.equals("C")
                    ? (temp - 32) * 5 / 9
                    : (temp * 9 / 5) + 32;

            System.out.printf("Converted Temperature: %.1f°%s", newtemp, unit);

        }
        else {
            System.out.println("Invalid choice! Please enter only C or F.");
        }

        scanner.close();
    }
}

