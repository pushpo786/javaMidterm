package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        int num=5;
        long factorial=multiplyNumbers(num);
        System.out.println("factorial of " + num + " = " +factorial);


    }

    public static long multiplyNumbers(int num){
        if (num>=1)
            return num*multiplyNumbers(num-1);
        else
            return 1;
    }
}
