package io.github.ellerct.java11exercises.basics;

import java.util.Scanner;

/**
 * An exercise wherein the user inputs a decimal number, and the program turns it into a binary
 * representation of that number.
 * <p>
 *     For the purpose of the exercise, Integer.to
 *     Algorithm used:
 *     <ol>
 *         <li>Divide number by 2</li>
 *         <li>Get interger quotient for next iteration</li>
 *         <li>Use remainder for binary digit</li>
 *         <li>Repeat until quotient is 0</li>
 *     </ol>
 * </p>
 * @author Christopher Eller
 */
public class BinaryConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int quotient;
        int remainder;
        String binary = "";

        System.out.println("Please enter a number to convert into binary:");
        number = scanner.nextInt();

        quotient = number;

        do {
            remainder = quotient % 2;
            // Binary is built from right to left, with left newer.
            binary = Integer.toString(remainder) + binary;
            quotient = Math.floorDiv(quotient, 2);
        } while(quotient != 0);

        System.out.println("Converted number: " + binary);
        System.out.println("Converted with toBinaryString: "+ Integer.toBinaryString(number));

        if (binary.equalsIgnoreCase(Integer.toBinaryString(number))){
            System.out.println("Match!");
        }
    }
}
