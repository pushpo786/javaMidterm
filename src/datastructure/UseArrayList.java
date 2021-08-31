package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Tom");
        myArray.add("John");
        myArray.add("Jain");
        myArray.add("Lily");
        myArray.add("Lotus");
        System.out.println("This is Arraylist for add methods "+myArray.toString());

        peek(myArray);

        myArray.remove(1);
        System.out.println("Arraylist looks: after remove one person "+myArray.toString());

        Iterator<String> data = myArray.iterator();

        System.out.println("print something into while loop: ");
        while (data.hasNext()){
            System.out.println(data.next());
        }
        System.out.println();
        System.out.println("Print something into for each loop: ");
        for(String test : myArray){
            System.out.println(test);
        }

//        //CONNECT TO DATABASE
//        connectToSqlDB.insertDataFromArrayListToSqlTable(myArray,"New Table","Cat");
//        List<String> letters  = connectToSqlDB.readDataBase("", "");
//        System.out.println();



    }


    public static void peek(ArrayList<String> structure){
        if (structure.size()==0){
            System.out.println("no data");
        }else{
            System.out.println("The peek is "+structure.get(structure.size()-1));
        }
    }


}





