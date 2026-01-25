public class PrintStatements2_10 {
    public static void main(String[] args){

        // printf(() :
        //[.precision]

        double mark = 90.02;
        double  mark1 = 91.25;
        double mark2 = 88.975;
        double mark3 = 99.9876;
        double mark4 = -15000.08;

        System.out.printf("%f\n",mark);
        System.out.printf("%.1f\n", mark1);
        System.out.printf("%.2f\n",mark2);
        System.out.printf("%.3f\n",mark3);
        System.out.printf("%f\n", mark4);

        // flags
        /*
         + = output a plus
         , = comma grouping separator
         ( = negative numbers are closed in ()
         space = display  a minus  if negative , space is postive.
         */

        System.out.printf("%+f\n",mark);
        System.out.printf("%+.1f\n", mark1);
        System.out.printf("%+.2f\n",mark2);
        System.out.printf("%+.3f\n",mark3);
        System.out.printf("%+f\n", mark4);

        System.out.printf("%,f\n",mark);
        System.out.printf("%,.1f\n", mark1);
        System.out.printf("%,.2f\n",mark2);
        System.out.printf("%,.3f\n",mark3);
        System.out.printf("%,f\n", mark4);

        System.out.printf("%(f\n",mark);
        System.out.printf("%(.1f\n", mark1);
        System.out.printf("%(.2f\n",mark2);
        System.out.printf("%(.3f\n",mark3);
        System.out.printf("%(.2f\n", mark4);

        System.out.printf("% f\n",mark);
        System.out.printf("% .1f\n", mark1);
        System.out.printf("% .2f\n",mark2);
        System.out.printf("% .3f\n",mark3);
        System.out.printf("% .2f\n", mark4);

        // Width
        /*
         0 = Zero Padding
         number = Right justified padding
         negative number = Left justified padding
         */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //zero
        System.out.printf("%04d\n",id1); // only zero means java will give a warning
        System.out.printf("%04d\n",id2); // include a number with zero like (eg - 04) in b/w % and D.
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        // number
        System.out.printf("%5d\n",id1); // it can be any number
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        //negative number
        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);
    }
}
