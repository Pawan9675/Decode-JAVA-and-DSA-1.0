// Write a Java program to remove the third element from given arraylist of size n.
package Week_4_Arrays.ArrayList.ArrayListQuestion;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: " + list);
        list.remove(2);
        System.out.println("Modified List: " + list);
    }
}
