// Given an array of integers, print an arraylist containing only all positive integers present in the array.
// If no positive integers found, print “NA”.
package Week_4_Arrays.ArrayList.ArrayListQuestion;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,5,-6,7,-8};
        ArrayList<Integer> list = new ArrayList<>();

        for (int element : arr){
            if (element>0){
                list.add(element);
            }
        }

        if (list.isEmpty()) System.out.println("N.A.");
        else System.out.println("ArrayList: "+list);
    }
}
