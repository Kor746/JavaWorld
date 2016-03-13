/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Daniel
 */
public class TestSort extends MergeSort{
    
    public static void main(String[] args)
    {
        MergeSort ms = new MergeSort();
        
        int[] values = {10,5,4,3,2,6,7,9,1,1,1,1,1,1,1,1,1,1,2,3,4,1,10,1000,2,4,1,2,924,23,2};
        
    
        ms.sort(values);
        for(int i: values)
        {
            System.out.print(i + " , ");
        }
    }
    
}
