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

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int[] a = new int[0];
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int[] mergeSort(int[] array,int l, int r) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    //helper method
    public void merge(int[] array, int lowIndex, int midIndex, int highIndex) {
        int[] l = new int[midIndex - lowIndex + 2];

        for (int i = lowIndex; i <= midIndex; i++) {
            l[i - lowIndex] = array[i];
        }
        l[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
        int[] r = new int[highIndex - midIndex + 1];

        for (int i = midIndex + 1; i <= highIndex; i++) {
            r[i - midIndex - 1] = array[i];
        }
        r[highIndex - midIndex] = Integer.MAX_VALUE;
        int i = 0, j = 0;

        for (int k = lowIndex; k <= highIndex; k++) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            }
            else {
                array[k] = r[j];
                j++;
            }
        }
    }





}












