package math.problems;

import java.util.Scanner;

import static org.testng.internal.Utils.log;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        int p=40;
        printFibonacci(p);



    }
    public static void printFibonacci(int p){
        int num1=0;
        int num2=1;
        int cnt=0;
        while (cnt<p){
            System.out.print(num1 + " ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            cnt=cnt+1;
        }
    }
}



