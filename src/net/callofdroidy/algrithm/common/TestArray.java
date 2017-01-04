package net.callofdroidy.algrithm.common;

/**
 * Created by yli on 03/01/17.
 */
public class TestArray {
    protected int[] theArray; // ref to the array
    protected int length; // number of data items

    public TestArray(int length){
        theArray = new int[length];
        this.length = length;
        init(length);
    }

    public void init(int length){
        for(int i = 0; i < length; i++){
            theArray[i] = (int)(Math.random() * 99);
        }
    }

    public void display(){
        for(int i = 0; i < length; i++)
            System.out.print(theArray[i] + " ");
        System.out.println("");
    }
}
