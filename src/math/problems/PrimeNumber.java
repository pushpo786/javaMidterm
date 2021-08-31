package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        System.out.print("Prime numbers from 2 to 1,000,000");
        for(int i=1; i<=1000000; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }


    }
    public static boolean isPrime(int num){
        if(num==2 || num==3){
            return true;
        }
        if (num %2==0 || num %3==0){
            return false;
        }
        for(int i=3; i<Math.sqrt(num); i +=2){
            if(num %i==0 || num %Math.sqrt(num)==0){
                return false;
            }
        }
        return true;
    }

}
