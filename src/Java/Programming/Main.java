package Java.Programming;

import javax.swing.*;

public class Main {

    static void addition(double number1, double number2) {
        System.out.println("The answer is " + (number1 + number2));
    }

    static void subtraction(double number1, double number2) {
        System.out.println("The answer is " + (number1 - number2));
    }

    static void multiplication(double number1, double number2) {
        System.out.println("The answer is " + (number1 * number2));
    }

    static void division(double number1, double number2) {
        System.out.println("The answer is " + (number1 / number2));
    }

    static void toThePowerOf(double number1, double number2) {
        double power = 1;
        while(number2 > 0) {
            power = power * number1;
            number2--;
        }
        System.out.println("The answer is " + power);
    }


    public static void main(String[] args) {
        double input1, input2;
        String select;
        char arithmeticOperation;


        input1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first number "));
        select = JOptionPane.showInputDialog("Please select the operation( +  -  *  /  e(exponentiation))");
        input2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second number: "));

        // Alernative without possible ...then change switch (arithmeticOperation) to (select), and ('') to ("") in the case.
        arithmeticOperation = select.charAt(0);

        switch (arithmeticOperation) {
            case '+':
                addition(input1, input2);
                break;
            case '-':
                subtraction(input1, input2);
                break;
            case '*':
                multiplication(input1, input2);
                break;
            case '/':
                division(input1, input2);
                break;
            case 'e':
                toThePowerOf(input1, input2);
                break;
            default:
                System.out.println("OOPS! Your entry was invalid. Please try again.");

        }

        System.exit(0);
    }
}
