package io.github.ellerct.java11exercises.sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * An implementation of a basic insertion sort.
 * <p>
 *     An insertion sort is one of the most basic sorting algorithms, and also usually not
 *     the most efficient in terms of calculation time. We walk through the array to be sorted, and
 *     move the current index to the most appropriate space given what we've already sorted.
 * </p>
 */
public class InsertionSort {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(6,1,5,3,2,4,4,1,6,7,8,12,0));
        System.out.println("Starting: " + array.toString());
        for (int i = 0; i < array.size(); i++){
            for (int j = i+1; j < array.size(); j++){
                if (array.get(j) < array.get(i)){
                    // ArrayList's remove command returns the removed element, and adding
                    // at an index bumps them all over for an in-place 'move'.
                    array.add(i, array.remove(j));
                }
            }
        }
        System.out.println(array.toString());
    }
}
