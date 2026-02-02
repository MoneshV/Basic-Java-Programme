import java.util.Scanner;

public class switch_case_17 {
    public static void main(String[] args){

        //Enhanced switch - A replacement for many else if statements
        //                 (Java14 feature)

        /*String day = "Monday";
        if(day.equals("Monday")){
            System.out.println("This is a weekday 😔.");
        }
        else if (day.equals("Tuseday")) {
            System.out.println("This is a weekday 😔.");

        }
        else if (day.equals("Wednesday")) {
            System.out.println("This is a weekday 😔.");
        }
        else if (day.equals("Thursday")) {
            System.out.println("This is a weekday 😔.");
        }
        else if (day.equals("Friday")) {
            System.out.println("This is a weekday 😔.");
        }
        else if (day.equals("Saturday")) {
            System.out.println("This is a Weekend day 🥰.");
        }
        else if (day.equals("Sunday")) {
            System.out.println("This is a weekend day 😍.");
        }

        else {
            System.out.println(day +"This is not day of a week");
        }

         */

        /*
        String day = "saturday";

        switch (day){
            case "monday" -> System.out.println("This is a week day 😔");
            case "tuesday" -> System.out.println("This is a week day 😔");
            case "wednesday" -> System.out.println("This is a week day 😔");
            case "thursday" -> System.out.println("This is a week day 😔");
            case "friday" -> System.out.println("This is a week day 😔");
            case "saturday" -> System.out.println("This is a weekend day 😍");
            case "sunday" -> System.out.println("This is a weekend day 😍");
            default -> System.out.println( day +" This is not a day");
            }
         */

        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the week of the day : ");
        day = scanner.nextLine();

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("This a week day 😟");
            case "Saturday", "Sunday" -> System.out.println("This is a weekend day 😍");
            default -> System.out.println(day + " This is not a day");
        }
        scanner.close();
    }
}
