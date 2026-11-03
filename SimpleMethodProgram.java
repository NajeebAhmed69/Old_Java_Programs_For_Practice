import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class SimpleMethodProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String userName = scanner.nextLine();
        displayGreeting(userName);
    }
        private static void displayGreeting(String name){
            System.out.println("Hello "+name+"! Welcome to the greeting Program");
        }
}
