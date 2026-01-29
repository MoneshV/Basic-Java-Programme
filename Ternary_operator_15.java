public class Ternary_operator_15 {
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true.

        // variable = (condition) ? ifTrue : ifFalse;

        // ? - ternary operator ,  : - otherwise or This or that.

        int score = 65;

        if (score >= 50) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        int mark = 50;
        String PassorFail = (mark >=50) ? "PASS" : "FAIL";
        System.out.println(PassorFail);
    }
}
