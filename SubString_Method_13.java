import java.util.Scanner;

public class SubString_Method_13 {
    public static void main(String[] args){

        // .substring() -  A method is used to extract a portion of a string
        //                  .substring(start, end)



        /*
        String email = "Demi1@gmail.com";
        String username = email.substring(0,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') +1);
        System.out.println(username);
        System.out.println(domain);

         */

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email : ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@') + 1 );

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Your email must contain '@' ");
        }



        scanner.close();
    }
}
