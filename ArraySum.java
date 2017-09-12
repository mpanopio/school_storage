/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Author: Marius Panopio
 *  Description:    This program will compute the sum of
 *                  an array that is populated by powers of two.
 *  Compiles:       Yes
 *  Works:          Yes
 */
public class ArraySum {
    int[] array = new int[10];
    
    
    /**
     * <pre>
     * Description: This method will initialize an array by
     *              populating it with powers of two.
     * Pre: We have an array with its size declared.
     * Post:
     * </pre>
     */
    public void init()
    {
//        System.out.println("Initializing array.");
        int element = 1;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = element;
            element = element * 2;
//            System.out.printf("Element %d: %d\n", i+1, array[i]);
        }
    }
    
    /**
     * <pre>
     * Description: This method will compute the sum of
     *              an array's integer elements.
     * Pre: We have an array of ints
     * Post: 
     * </pre>
     */
    public void sum()
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        System.out.printf("The sum of the array elements is %d.\n", sum);
    }
    
    static public void main(String[] args)
    {
        ArraySum a1 = new ArraySum();
        a1.init();
        a1.sum();
    }
}
