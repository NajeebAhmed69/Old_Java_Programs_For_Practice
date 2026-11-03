package FunctionsAndMethods;
import java.util.Scanner;
 class AreaOfRectangle {
    static void  areaOfRectangle(int length , int breadth){
        int area = length * breadth;
        System.out.println("The Area of rectangle is: " +area);

    }


    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        int length = scn.nextInt();

        System.out.println("Enter the breadth of rectangle: ");
        int breadth = scn.nextInt();
         areaOfRectangle(length, breadth);
        areaOfRectangle(length, breadth);

}
}
