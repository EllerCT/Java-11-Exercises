package io.github.ellerct.java11exercises.sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * An implementation of a single-pivot quick sort algorithm.
 * <p>
 *     The partition algorithm selects the right-most number as the initial pivot,
 *     then walks from the left. It will maintain another variable indicating where
 *     we think the actual pivot is. When we find something smaller than the initial pivot,
 *     we move our expected pivot up one, and swap the smaller number with whatever was there
 *     originally. As we go, we ensure that the pivot actual has all smaller numbers to the left
 *     and all larger numbers to the right.
 * </p>
 * @author Christopher Eller
 */
public class QuickSort {
    private static void quickSort(ArrayList<Integer> array, int lowIndex, int highIndex){
        if (lowIndex < highIndex) {
            int pivot = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, pivot-1);
            quickSort(array, pivot, highIndex);
        }
    }

    private static int partition(ArrayList<Integer> array, int lowIndex, int highIndex){
        int compareValue = array.get(highIndex);
        int pivot = lowIndex-1;
        for (int i = lowIndex; i < highIndex; i++){
            if (array.get(i) < compareValue){
                pivot++;
                swap(array, i, pivot);
            }
        }
        pivot++;
        swap(array, pivot, highIndex);
        return pivot;
    }

    private static void swap(ArrayList<Integer> array, int firstIndex, int secondIndex){
        int temp = array.get(firstIndex);
        array.set(firstIndex, array.get(secondIndex));
        array.set(secondIndex, temp);
    }

    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5,4,6,3,1,2));
        System.out.println("Start: "+array.toString());
        quickSort(array, 0, array.size()-1);
        System.out.println("Finish: "+ array.toString());
    }
}
