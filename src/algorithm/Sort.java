package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
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




    public int[] quickSort(int[] array,int low,int high) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (low < high)
                {
                    int i = low - 1;
                    for(int j = low; j <= high - 1; j++)
                    {
                        if (list[j] < list[high])
                        {
                            i++;
                            int temp = list[i];
                            list[i] = list[j];
                            list[j] = temp;
                        }
                    }
                    int temp2 = list[i+1];
                    list[i+1] = list[high];
                    list[high] = temp2;

                    quickSort(list, low, i);
                    quickSort(list, i+2, high);
                }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp=0;
        //implement here
         int size = list.length;

                 for(int i = (size/2)-1; i >= 0; i--){
                     heapIt(list, size,i);
                 }

                 for(int j = list.length-1;j>0;j--){
                     temp = list[0];
                     list[0] = list[j];
                     list[j] = temp;
                     heapIt(list, j,0);
                 }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    private void heapIt(int[] list, int size , int i) {
            int maxNUM = i;
            int left = 2*i+1; //left subtree
            int right = 2*i+2; //right subtree
            int swapped;

            //check left child to root
            if(left < size && list[left] > list[maxNUM]) {
                maxNUM = left;
            }

            //check right child to root
            if(right < size && list[right] > list[maxNUM]){
                maxNUM = right;
            }
            //else
            if(maxNUM != i){
                swapped=list[i];
                list[i] = list[maxNUM];
                list[maxNUM] = swapped;
                heapIt(list, size,maxNUM);
            }

        }




    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int index =0;
        List<Integer>[] sorted = new List[list.length];

        for (int i = 0; i < list.length; i++) {
            sorted[i] = new ArrayList<Integer>();
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = list.length/2;
                while(n > 0) {

                    int i = (list.length / 2);

                    while (i < n) {

                        int current = i - (list.length / 2);

                        while (current >= 0) {

                            if (list[current] > list[current + n]) {
                                int temp = list[current];

                                list[current] = list[current + n];
                                list[current + n] = temp;
                                current = current - n;
                            } else {
                                break;
                            }
                            i++;
                        }
                    }
                    n /= 2;
                }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }



}
