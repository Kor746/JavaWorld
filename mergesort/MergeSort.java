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
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    
    int[] primary;
    int[] helper;
    int number;
    
    public void sort(int[] values)
    {
        this.primary = values;
        this.number = values.length;
        this.helper = new int[number];
        mergeSort(0, number - 1);
        
        
        
    }
    public void mergeSort(int low, int high)
    {
        if(low < high)
        {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle+1, high);
            merge(low, middle, high);
        }
        
    }
    
    public void merge(int low, int middle, int high)
    {
        for(int i = low; i <= high; i++)
        {
            helper[i] = primary[i];
            
        }
        
        int i = low;
        int j = middle + 1;
        int k = low;
        
        while(i <= middle && j <= high)
        {
            if(helper[i] <= helper[j])
            {
                primary[k] = helper[i];
                i++;
            }
            else {
                primary[k] = helper[j];
                j++;
            }
            k++;
        }
        
        while(i <= middle)
        {
            primary[k] = helper[i];
            i++;
            k++;
            
        }
    }
    
}
