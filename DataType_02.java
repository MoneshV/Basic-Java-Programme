public class DataType_02 {
    public static void main(String[] args){
        /*
        Data types in java are
           (i) Primitive  - Simple value stored directly in memory  (Stack)
           (ii) Reference - Memory address (Stack) that points to the (Heap)

           Primitive Data Type     VS      Reference Data Type
                (i) int            |        (i) string
                (ii) double        |         (ii) array
                (iii) char         |         (iii) object
                (iv) boolean       |


           2 ways to creating a variable
           ------------------------------

           1. declaration
           2. assignment
         */

        int age = 22;
        System.out.println(age);
        System.out.println("My age is " + age);

        int quantity = 2;
        System.out.println("Total is " + quantity);

        double cgpa = 8.9;
        double update = 9; // Even integers can be allowed in double data type.
        System.out.println("My CGPA is " + cgpa);
        System.out.println(update);

        double temperature = 25.7;
        System.out.println("Current Temperature is " + temperature);

        char grade = 'A';
        System.out.println(grade);

        char symbol = '!';
        System.out.println(symbol);

        char currency = '$';
        System.out.println(currency);

        boolean isStudent = true; // special character is not allowed for example underScore(_) to separate the variable name
        boolean forSale = false; // instead we use as a first word  letter as lowercase second word first letter is uppercase.

        System.out.println(isStudent);
        System.out.println(forSale);

        String name = "Demi";
        String food = "Chicken";
        String email = "fake123@gmail.com";
        System.out.println(email);
    }
}
