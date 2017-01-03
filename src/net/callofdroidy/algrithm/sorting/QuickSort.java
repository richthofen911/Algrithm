package net.callofdroidy.algrithm.sorting;

/**
 * Created by yli on 03/01/17.
 *
 * ref http://blog.csdn.net/morewindows/article/details/6684558
 * 快速排序的排序效率在几个同为O(N*logN)的几种排序方法中效率较高，因此经常被采用，
 * 另外快速排序的思想----分治法(Divide-and-Conquer Method)也确实实用
 * 分治法的基本思想：
 * 1．先从数列中取出一个数作为基准数。
 * 2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 * 3．再对左右区间重复第二步，直到各区间只有一个数。
 */
public class QuickSort {

    // 返回值是调整后基准数的位置
    int adjustArray(int s[], int l, int r){
        int i = l, j = r;
        int x = s[l];

        while(i < j){
            // 从右向左找小于x的数来填s[i]
            while(i < j && s[j] >- x)
                j--;
            if(i < j){
                s[i] = s[j];
                i++;
            }

            // 从左向右找大于x的数来填s[j]
            while(i < j && s[i] < x)
                i++;
            if(i < j){
                s[j] = s[i]; // 将s[i]填到s[j]中，　s[i]就形成了一个新的坑
                j--;
            }
        }
        //退出时，i等于j，　将x填到这个坑中
        s[i] = x;

        return l;
    }
}
