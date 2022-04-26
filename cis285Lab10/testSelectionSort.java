package cis285Lab10;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

	@Test
	public void test() {
		//fail("Not yet implemented");
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		}
	public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        
        int[] arr2 = new int[5];
        arr2 = temp1.basicSelectionSort(arr);

        assertArrayEquals("Failed Positive Test", arr2, Sortedarr);
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort temp1 = new SelectionSort();
        
        int[] arr2 = new int[5];
        arr2 = temp1.basicSelectionSort(arr);

        assertArrayEquals("Failed Negative Test", arr2, Sortedarr);
        /** Test data contains negative values only **/
    }

	public void testMixed(){
    
		int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = -2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        
        int[] arr2 = new int[5];
        arr2 = temp1.basicSelectionSort(arr);

        assertArrayEquals("Failed Mixed Test", arr2, Sortedarr);
    /** Test data contains with both positive, negative and zeros **/
	}

	public void testDuplicates(){
    
		int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = -7;
        arr[3] = -7;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -7;
        Sortedarr[2] = 2;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        SelectionSort temp1 = new SelectionSort();
        
        int[] arr2 = new int[5];
        arr2 = temp1.basicSelectionSort(arr);

        assertArrayEquals("Failed Duplicate Test", arr2, Sortedarr);
    /** Test data contains duplicates **/
	}

}


