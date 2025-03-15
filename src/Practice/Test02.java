package Practice;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test02 {
    // Data Structure and Algorithum  Practise

    // 01) Array
    public static void main(String[] args) {
       /*
        String[] cars = {"A","B","C","D","E"};
        //System.out.println(cars[2]);
        cars[3] = "lakshan";

        System.out.println(cars.length);

        for(int i =0;i< cars.length;i++){
            System.out.println(cars[i]);
        }

        */

        // An array storing different ages
        /*
        int ages[] = {1,2,3,4,5,6,7,8};

        float avg , sum=0;

        // get the length of the array
        int length = ages.length;

        // Loop through the element of the array
        for(int i=0;i< ages.length;i++){
            sum += i;
        }

        // Calculate the average by dividing the sum by the lenght
        avg = sum / length;

        // Print the average
        System.out.println("The Average age is : "+avg);

        */

        // 2D array
        /*
        int[][] mynumbers = {{1,2,3,4},{5,6,7}};
        for (int i=0;i< mynumbers.length;i++){
            for(int j=0;j< mynumbers[i].length;j++){
                System.out.println(mynumbers[i][j]);
            }
        }

         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Lambo");
        cars.add("Agera");

        // insert element at the beginning of the list

        cars.add(2,"lakshan");

        // get the answer using index
        //System.out.println(cars.get(1));

        // change the item
        cars.set(2,"sachintha");
        System.out.println(cars.get(2));

        // remove an item one by one
        cars.remove(0);
        System.out.println(cars);

        // clear all elements
        cars.clear();
        System.out.println(cars);


    }
}
