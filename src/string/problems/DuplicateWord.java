package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        st = st.toLowerCase();
        String[] phrase = st.split(" ");
        //String avgLength;
        //avgLength(myStringArray);


        //public static void findDuplicateWords() {

        for (int i = 0; i < phrase.length; i++) {
            count = 1;
            for (int j = i + 1; j < phrase.length; j++) {
                if (phrase[i].equals(phrase[j])) {
                    count++;
                    phrase[j] = "0";
                }
            }
            if (count > 1 && phrase[i]!=("0")) {
                System.out.println(phrase[i] + " count " + count + "times");
            }
        }



    }
    public static void avgLength(String[] myStringArray){
        int lengthOfEachString;
        int totalLength=0;

        for(int i=0; i< myStringArray.length; i++){
            lengthOfEachString = myStringArray[i].length();
            totalLength = totalLength + lengthOfEachString;

        }
        System.out.println("Avg length of the word is "+ (totalLength / myStringArray.length));
    }





    }



