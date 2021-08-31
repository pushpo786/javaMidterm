package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        findLongestWord(s);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String [] myString=wordGiven.split(" ");
        String st = "";

        for (int i=0; i<myString.length; i++){
            map.put(i+1,myString[i]);

        }

        // Implement here

        return map;
    }
    public static void findLongestWord(String s){
        String [] myString=s.split(" ");
        String longestWord="";
        for(int i=0; i< myString.length; i++){
            if (myString[i].length() >=longestWord.length()) {
                longestWord=myString[i];

            }
            System.out.println(longestWord.length()+ " "+longestWord);
        }
    }
}
