package net.callofdroidy.algrithm.common;

import net.callofdroidy.algrithm.sorting.QuickSortArray;

/**
 * Created by yli on 04/01/17.
 */
public class Runner {
    public static void main(String[] args){

        int arraySize = 16;
        QuickSortArray arr = new QuickSortArray(arraySize);

        System.out.println("Array unsorted: ");
        arr.display();

        System.out.println("\nSorting this array...");
        arr.quickSort();

        System.out.println("\nArray sorted: ");
        arr.display();
    }
}
