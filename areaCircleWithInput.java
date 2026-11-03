package javainput;
import java.util.Scanner;
public class areaCircleWithInput {

    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius;
        radius = scn.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The area of circle is : "+area);

    }

}
