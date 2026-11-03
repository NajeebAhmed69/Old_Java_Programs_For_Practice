package UniPractise;
import java.util.Scanner;
public class AgeAdult {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter your age : ");
        int age = scn.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
}
