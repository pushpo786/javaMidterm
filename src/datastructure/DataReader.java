package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {
//    static String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
//    static String absolutePath=System.getProperty("user.dir");
//    static String relativePath="/src/data/self-driving-car";
//    static final String path=absolutePath+relativePath;
//    static FileReader fileReader;
//    static BufferedReader bufferedReader;


    public static void main(String[] args) {

            /*
             * Create an API to read the below textFile and print it to the console.
             *      HINT: Use BufferedReader class
             * Use try-catch block to handle Exceptions
             *
             * Store and retrieve the file to/from a database table.
             *
             * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
             * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
             * order from LinkedList and retrieve as FILO order from Stack.
             *
             * Demonstrate how to use Stack using push, peek, search & pop methods.
             * Use For-Each & While-loop with Iterator to retrieve data.
             */

        String line = "";
        String[] name;
        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
        BufferedReader bufferedReader = null;
        LinkedList<String> storeLINK = new LinkedList<String>();
        Stack<String> storeSTACK = new Stack<>();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        try {
            bufferedReader = new BufferedReader(new FileReader(textFile));
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (lineNumber == 0) {
                    lineNumber++;
                    continue;
                }

                if (line.isEmpty() || line.trim().equals("") || line.trim().equals("\n")) {
                } else {
                    System.out.print(line);
                    String[] test = line.split(" ");
                    for (int i = 0; i < test.length; i++) {
                        storeLINK.add(test[i]);
                        storeSTACK.add(test[i]);
                    }


                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            //FOR LOOP
            System.out.println();
            System.out.println("*************");
            System.out.println("from linked list (for loop)");


            for (String s : storeLINK) {
                System.out.println(s);
            }


            System.out.println("*************");
            System.out.println("from stack (for loop)");
            for (String s : storeSTACK) {
                System.out.println(s);
            }


            System.out.println();
            System.out.println("************");
            storeSTACK.push("something");
            System.out.println("push something into Stack");
            System.out.println("peek: " + storeSTACK.peek());
            System.out.println("popped out: " + storeSTACK.pop());
            System.out.println();


            System.out.println("***************");
            System.out.println("linked list and while loop");
            Iterator<String> itr = storeLINK.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println();


            System.out.println("*************");
            System.out.println("Stack while loop");
            Iterator<String> itr2 = storeSTACK.iterator();
            while (itr2.hasNext()) {
                System.out.println(itr2.next());
            }


        }

    }









