import java.util.Scanner;
public class largestNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        if (num1==num2){
            System.out.println("both are  equal");
        } else if (num1>num2) {
            System.out.println("number 1 is greater than number 2!");

        }else {
            System.out.println("number 2 is greater than number 1!");
        }
    }

}
