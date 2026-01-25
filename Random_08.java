import java.util.Random;

public class Random_08 {
    public static void main(String[] args){

        Random random = new Random();
        int otp;
        otp = random.nextInt(0,600001);
        System.out.println("Your OTP is : " +otp);

        double number;
        number = random.nextDouble();
        System.out.println("starts from 0 - 1 :" +number);

        boolean ishead;
        ishead = random.nextBoolean();
        //System.out.println(ishead);

        if (ishead){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
