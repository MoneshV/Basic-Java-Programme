public class String_Methods_12 {
    public static void main(String[] args) {

        // String Methods
        /*
        1. length
        2. charAt
        3. indexOf
        4. lastIndexOf
        5. toUpperCase
        6. toLowerCase
        7. trim
        8. replace
        9. isEmpty
        10.contains
        11.equals
        12.equalsIgnoreCase
         */

        String name = "monesh ram";

        //1. Length - to find the length of a string.
        int length = name.length();
        System.out.println(length);

        //2. charAt - to find the  char at the index
        char letter = name.charAt(7);
        System.out.println(letter);

        //indexOf - to find the index of a char
        int index = name.indexOf('o');
        System.out.println(index);

        //lastIndexOf - to find the last index of a char
        int last = name.lastIndexOf('m');
        System.out.println(last);

        // toUpperCase - to change the string to uppercase
        name = name.toUpperCase();
        System.out.println(name);

        // toLowerCase - to change the string to lowercase
        name = name.toLowerCase();
        System.out.println(name);

        // trim - is used to remove a space b/w a string
        String name2 = "   demi god    ";
        name2 = name2.trim();
        System.out.println(name2);

        // replace - is used to replace a char to the string
        name2 = name2.replace('d', 'a');
        System.out.println(name2);

        // isEmpty() - is a method to check the string is a empty.
        String name3 = "";
        System.out.println(name3.isEmpty());

        if (name2.isEmpty()) {
            System.out.println("Your name is Empty.");
        } else {
            System.out.println("Your name is Hello " + name2);
        }

        // contains - is a method to check contains any char or space
        if (name.contains("d")) {
            System.out.println("your name contains " + name);
        } else {
            System.out.println("your name doest contain any char");
        }

        // equals - to check the both string are equals
        String name4 = "password";
        if (name4.equals("password")) {
            System.out.println("username and password cannot be same. ");
        } else {
            System.out.println("username is hello " + name4);
        }

        // equalsIgnoreCase  - to check the both string are equals ignore case sensitive
        if (name4.equalsIgnoreCase("Password")) {
            System.out.println("username and password is cannot be same.");
        } else {
            System.out.println("username is " + name4);
        }

    }
}

