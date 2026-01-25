import java.util.Scanner;

public class MathClass2_09 {
    public static void main(String[] args){

        // Hypotenuse c = Math.sqrt(a² +b²)

        Scanner scanner = new Scanner(System.in);

//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the value of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the value of B: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//        System.out.print("The Hypotenuse of side C is :" + c);

        //circumference = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius,2)
        // volume = 4/3 * Math.PI * Math.pow(radius,3)

        double circumference;
        double radius;
        double area;
        double volume;

        System.out.print("Enter the value of radius : ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3) ;

        System.out.println("The circumference is : "+ circumference + "cm");
        System.out.println("The area is : "+ area + "cm²"); // code is 0178
        System.out.println("The volume is : "+ volume + "cm³"); // code is 0179

        System.out.printf("The circumference is : %.1fcm\n", circumference);
        System.out.printf("The area is : %.1fcm²\n", area); // code is 0178
        System.out.printf("The volume is : %.2fcm³\n", volume); // code is 0179


        scanner.close();
    }

}
