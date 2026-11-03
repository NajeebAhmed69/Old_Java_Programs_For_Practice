import java.util.Scanner;
public class calculator {
public static void main (String[] args){
    System.out.println("Welcome to the Calculator MADE BY NAJEEB");
Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
double a = sc.nextDouble();
    System.out.println("Enter the Second number");
double b = sc.nextDouble();
    System.out.println("Enter the Operator:+,-,/,*");
    char operator = sc.next().charAt(0);
double result ;
switch (operator) {
    case '+':
        result = a + b;
        break;
    case '-':
        result = a - b;
        break;
    case '*':
        result = a * b;
    case '/':
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("Error! cannot divide by zero:");
            return;
        }
        break;
    default:
        System.out.println("Error! Invalid Opertor:");
        return;
}
    System.out.println("Result is :"+result);
}
}