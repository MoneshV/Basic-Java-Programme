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

        newtemp = (unit == "C") ? (temp - 32) * 5 / 9 : (temp * 5/ 9) + 32;
        System.out.printf("%.1f°%s",newtemp, unit);

        scanner.close();
    }
}
