import java.util.Scanner;
public class Input_03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
       String name = scanner.nextLine(); // It will reads strings with space use nextLine()
        // String name = scanner.next(); // It will ignore spaces use next()

        System.out.print("Enter your state :");
        String state = scanner.next();
        scanner.nextLine();


        System.out.print("Enter your age : ");
        int age = scanner.nextInt();


        System.out.printf("Enter your gpa : ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student ? (true / false ) : ");
        boolean isStudent = scanner.nextBoolean();





        System.out.println("Hello" + name);
        System.out.println("your state is " + state);
        System.out.println("You are " + age + " Years old.");
        System.out.println("You are gpa is " + gpa);
        System.out.println("You are a student " + isStudent);


        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width : ");
        width = scanner.nextDouble();
        System.out.print("Enter the height : ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("The area of a rectangle is " + area + "cm^2");

        scanner.close();
    }
}