package io.github.ellerct.java11exercises.basics;

import java.util.Scanner;

/**
 * This takes a given input and prints 'true' if the input is a palindrome, or 'false' if not.
 * <p>
 *     Originally intended for numbers, this will work with strings as well. It simply cuts
 *     a string in half, reverses the second half, and compares the two for a match. While this
 *     does work with strings, it considers a space to be its own letter, and so 'race car' will
 *     show false, but racecar will show true.
 * </p>
 * @author Christopher Eller
 */
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Check if the following is a palindrome:");
        String input = scan.nextLine();
        String firstHalf;
        String secondHalf;
        int middle = ((input.length())/2);
        if (input.length()%2 == 0) {
            firstHalf = input.substring(0,middle);
            secondHalf = input.substring(middle);
        } else {
            firstHalf = input.substring(0, middle);
            secondHalf = input.substring(middle+1);
        }
        System.out.println(compareHalves(firstHalf, secondHalf));
    }

    private static boolean compareHalves(String first, String second){
        StringBuilder reversedSecond = new StringBuilder();
        for (int i = second.length()-1; i >=0 ; i--){
            reversedSecond.append(second.toCharArray()[i]);
        }
        return first.equalsIgnoreCase(reversedSecond.toString());
    }
}
