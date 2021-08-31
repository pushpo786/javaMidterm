package datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */


        Queue<String> queue = new LinkedList<>();
        queue.add("white");
        queue.add("pink");
        queue.add("red");
        queue.add("black");
        System.out.println(queue);


        queue.remove("white");
        System.out.println(queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue have only 4 values : " + queue.contains("white"));


        //for each loop
        System.out.println();
        System.out.println("for each loop: ");
        for (String color : queue) {
            System.out.println(color);

        }


        System.out.println();
        System.out.println("while loop: ");
            while (true) {
                if (!queue.isEmpty()) {
                    String color = queue.poll();
                    System.out.println(queue + "  " + color);
                }
            }
        }

}

