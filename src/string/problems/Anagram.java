package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {
        isAnagram("CAT","ACT");
        isAnagram("FART","RAFT");



    }
    public static void isAnagram(String str1,String str2){
        String s1=str1.replaceAll("\\s","");
        String s2=str2.replaceAll("\\s","");
        boolean result=true;
        if(s1.length()!=s2.length()){
            result=false;
        }else{
            char[] ArrayS1=s1.toLowerCase().toCharArray();
            char[] Arrays2=s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(Arrays2);
            result=Arrays.equals(ArrayS1,Arrays2);
        }
        if(result){
            System.out.println(s1+ " and " +s2+" are anagrams");
        }else{
            System.out.println(s1+ " and " +s2+" are not anagrams");
        }

    }
}
