// Given an input of some integers, sort the integers.
package Week_4_Arrays.ArrayList.ArrayListQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("List in ascending order: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List in descending order: " + list);
    }
}
