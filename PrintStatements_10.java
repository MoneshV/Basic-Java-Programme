public class PrintStatements_10 {
    public static void main(String[] args){

        //printf() =is a method used to format a output.
        //  %[flags][width][.precision][specify character]

        String name = "Nitish";
        char firstLetter = 'N';
        double height = 68.070;
        int age = 22;
        boolean Employed = true;

        //  % specify character
        /*
        % s - String
        % c - Char
        % f - Double or float
        % d - Int
        % b - Boolean
         */

        System.out.printf("Hello %s\n", name);
        System.out.printf("youre first letter is %c\n", firstLetter);
        System.out.printf("youre height is: %f cm\n", height);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("Employed: %b\n",Employed);

        System.out.printf("%s is %d years old.", name, age);



    }
}
