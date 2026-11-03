package Department;

// Importing Scanner class from java.util package to take user input
import java.util.Scanner;

// Defining a class named calculator
public class BasicCalculator {
//MUHAMMAD MUZAMMIL
//ROLL NO 2K23/CSE/97

        // Main method, the entry point of the program
        public static void main(String[] args) {
            // Creating a Scanner object to take user input from the console
            Scanner scn = new Scanner(System.in);

            // Displaying a welcome message to the user
            System.out.println("WELCOME TO ARITHMETIC CALCULATOR");

            // Asking the user to enter the first number
            System.out.print("Enter the first number: ");
            // Reading the first number entered by the user and storing it in the variable operand1
            double operand1 = scn.nextDouble();

            // Asking the user to choose an operator (+, -, *, /)
            System.out.print("Choose the operator (+, -, *, /): ");
            // Reading the operator entered by the user and storing it in the variable operator
            char operator = scn.next().charAt(0);

            // Asking the user to enter the second number
            System.out.print("Enter the second number: ");
            // Reading the second number entered by the user and storing it in the variable operand2
            double operand2 = scn.nextDouble();

            // Variable to store the result of the arithmetic operation
            double result;

            // Using a switch statement to perform the corresponding arithmetic operation based on the operator entered by the user
            switch (operator) {
                // If the operator is '+', add operand1 and operand2 and store the result in the variable 'result'
                case '+':
                    result = operand1 + operand2;
                    // Displaying the result of the addition operation to the user
                    System.out.println("result: " + operand1 + " " + operator + " " + operand2 + " = " + result);
                    break;

                // If the operator is '-', subtract operand2 from operand1 and store the result in the variable 'result'
                case '-':
                    result = operand1 - operand2;
                    // Displaying the result of the subtraction operation to the user
                    System.out.println("result: " + operand1 + " " + operator + " " + operand2 + " = " + result);
                    break;

                // If the operator is '*', multiply operand1 and operand2 and store the result in the variable 'result'
                case '*':
                    result = operand1 * operand2;
                    // Displaying the result of the multiplication operation to the user
                    System.out.println("result: " + operand1 + " " + operator + " " + operand2 + " = " + result);
                    break;

                // If the operator is '/', check if operand2 is not zero, then divide operand1 by operand2 and store the result in the variable 'result'
                case '/':
                    if (operand2 == 0) {
                        // If operand2 is zero, display an error message as division by zero is not allowed
                        System.out.println("Error: Division by zero is not allowed");
                    } else {
                        result = operand1 / operand2;
                        // Displaying the result of the division operation to the user
                        System.out.println("result: " + operand1 + " " + operator + " " + operand2 + " = " + result);
                    }
                    break;

                // If the user enters an invalid operator, display an error message
                default:
                    System.out.println("Invalid Selection of operator");
            }

            // Displaying a thank you message to the user
            System.out.println("\nThank you for using ☺");
        }
    }


