package io.github.ellerct.java11exercises.basics;

import java.util.Scanner;

/**
 * Basic arithmetic operations on user input.
 * <p>
 *     A simple exercise getting two numbers, and then doing something with them. In this case,
 *     using multiple basic operations on them, then printing them.
 * </p>
 * @author Christopher Eller
 */
public class ArithmeticIO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input A will receive a number of operations performed upon it by B, then displayed.");
        System.out.println("Please enter input A:");
        int inputA = scanner.nextInt();
        System.out.println("Please enter input B:");
        int inputB = scanner.nextInt();

        System.out.printf("Addition: %d%n" +
                "Subtraction: %d%n" +
                "Multiplication: %d%n" +
                "Division: %.2f%n" +
                "Modulus: %d%n",
                inputA+inputB, inputA-inputB, inputA*inputB, (float) inputA/inputB, inputA%inputB);
    }
}
