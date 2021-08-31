package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> num1 = new ArrayList<String>();
        List<String> num2 = new ArrayList<String>();
        List<String> num3 = new ArrayList<String>();
        List<String> num4 = new ArrayList<String>();
        List<String> num5 = new ArrayList<String>();

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        System.out.println("Print Array List: ");

        num1.add("1");
        num1.add("Added num1");
        num2.add("2");
        num2.add("Added num2");
        num3.add("3");
        num3.add("Added num3");
        num4.add("4");
        num4.add("Added num4");
        num5.add("5");
        num5.add("Added num5");
        String number = num1.get(0).toString();
        String number2 = num2.get(0).toString();
        String number3 = num3.get(0).toString();
        String number4 = num4.get(0).toString();
        String number5 = num5.get(0).toString();
        for (String st:num1){
            map.put(number, new ArrayList<>());
            map.get(number).add(st);
        }
        for (String st:num2){
            map.put(number2,new ArrayList<String>());
            map.get(number2).add(st);
        }
        for (String st:num3){
            map.put(number3,new ArrayList<String>());
            map.get(number3).add(st);
        }
        for (String st:num4){
            map.put(number4,new ArrayList<String>());
            map.get(number4).add(st);
        }
        for (String st:num5){
            map.put(number5,new ArrayList<String>());
            map.get(number5).add(st);
        }
        Iterator<Map.Entry<String, List<String>>> itr = map.entrySet().iterator();

        //for each loop
        System.out.println("for each loop: ");
        for(Map.Entry <String, List<String>> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //while loop
        System.out.println();
        System.out.println("while loop: ");
        while(itr.hasNext()){
            Map.Entry <String, List<String>> entry= itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


    }

}
