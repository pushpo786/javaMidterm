package algorithm;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestSorting {

    private long executionTime;

    /*
          This class is used to help with unit testing of sorting algorithms from the Sort class
         */
    public int[] main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        int[] sorting = {38, 27, 3, 11, 7, 15, 11, 23, 44, 55, 66, 77, 88, 99};

        // Create instance of Sort class
        Sort sort = new Sort();

        int[] array = new int[0];
        int[] list = array;

        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);
        System.out.println(Arrays.toString(sort.heapSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.insertionSort(unSortedArray)));
        //System.out.println(Arrays.toString(sort.mergeSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.selectionSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.bubbleSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.quickSort(unSortedArray, 0, unSortedArray.length - 1)));


        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
            Assert.assertEquals(sortedArray, sort.insertionSort(unSortedArray), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
            Assert.assertEquals(sortedArray, sort.bubbleSort(unSortedArray), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
            Assert.assertEquals(sortedArray, sort.quickSort(unSortedArray, 0, unSortedArray.length - 1), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");


        } catch (Exception ex) {
            ex.getMessage();
        }

        return list;  

    }




}












