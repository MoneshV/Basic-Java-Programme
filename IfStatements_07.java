import java.util.Scanner;

public class IfStatements_07 {
    public static void main(String[] args){

        // if statements  are perform a block of code if the condition is true.

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        if(age == 0){
            System.out.println("Your are a baby 👶 ");
        } else if (age < 18){
            System.out.println("you are a child 🧒");

        } else if (age >= 18){
            System.out.println("You are an adult 👨");

        }
        else{
            System.out.println("Enter the valid option.");
        }

    }
}
