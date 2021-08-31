package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String st = "DAD";
        String st1="";
        for (int i=st.length()-1;i>=0;i--){
            st += st.charAt(i);
        }

        if (st.equals(st1)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }




   }


}
