public class Nested_if_statements_11 {
    public static void main(String[] args) {

        // Nested if statements

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isSenior) {

            if (isStudent) {

                System.out.println("You got a senior discount of 20%");
                System.out.println("You got a student discount of 10%");
                price *= 0.7;
            } else {

                System.out.println("You got a student discount of 20%");
                price *= 0.8;
            }
        } else {
            if (isStudent) {

                System.out.println("You got a student discount of 10%");
                price *= 0.9;
            } else {
                price *= 1;
            }
        }

        System.out.printf("The price of a ticket is $%.2f", price);
    }

    }

