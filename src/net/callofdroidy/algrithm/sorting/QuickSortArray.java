package net.callofdroidy.algrithm.sorting;

import net.callofdroidy.algrithm.common.TestArray;

/**
 * Created by yli on 03/01/17.
 *
 * ref http://blog.csdn.net/morewindows/article/details/6684558
 * 快速排序的排序效率在几个同为O(N*logN)的几种排序方法中效率较高，因此经常被采用，
 * 另外快速排序的思想----分治法(Divide-and-Conquer Method)也确实实用
 * 分治法的基本思想：
 * 1．先从数列中取出一个数作为基准数(本例中以第一个数作为基准数)。
 * 2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 * 3．再对左右区间重复第二步，直到各区间只有一个数。
 */
public class QuickSortArray extends TestArray{
    public QuickSortArray(int length){
        super(length);
    }

    public void quickSort(){
        recQuickSort(0, length - 1);
    }

    public void recQuickSort(int left, int right){ // the indices of leftmost and rightmost element
        if(right - left <= 0) // it means left==right 即　size <= 1
            return;  // already sorted
        else{
            int pivot = theArray[right]; // use the rightmost item as the pivot
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1); // recursively sort the left part
            recQuickSort(partition + 1, right); // recursively sort the right part
        }
    }

    // this method swap the pivot to the correct place
    public int partitionIt(int left, int right, int pivot){
        int leftPtr = left - 1; // 此处为了方便下面统一　++leftPtr
        int rightPtr = right;

        while(true){
            while(theArray[++leftPtr] < pivot)
                ;
            while(rightPtr > 0 && theArray[--rightPtr] > pivot)
                ;
            if(leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    public void swap(int dex1, int dex2){
        int tmp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = tmp;
    }

}
