package approxAllaboutString;
import java.util.Scanner;
public class AddingTwoString {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first = scn.nextLine();

        System.out.println("Enter your Last name: ");
        String second = scn.nextLine();

        System.out.println(first+ " " +second);
    }
}
