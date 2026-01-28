import java.util.Scanner;

public class Weight_Converter_14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to Weight Convertion Program");
        System.out.println("1. convert lbs to kilograms");
        System.out.println("2. convert kilograms to lbs");

        System.out.println("Enter your a choice : ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight to convert lbs to kg : ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight is : %.2f kg", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight to convert kgs to lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight is : %.2f lbs", newWeight);
        }
        else {
            System.out.println("Please Enter the valid choice.");
        }

        scanner.close();
    }
}
