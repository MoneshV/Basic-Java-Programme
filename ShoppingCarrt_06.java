import java.util.Scanner;

public class ShoppingCarrt_06 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what do you like to have? : ");
        item = scanner.nextLine();

        System.out.print("What is the price of each? : ");
        price = scanner.nextDouble();

        System.out.print("no of quantity? : ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.print("Total of your item is " + currency +total);
    }
}
