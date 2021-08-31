package math.problems;

import java.util.ArrayList;
import java.util.List;

import databases.ConnectToSqlDB;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */
        int temp,size;

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90,
                45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        size= array.length;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("lowest number of this array is: "+array[0]);


    }

}
