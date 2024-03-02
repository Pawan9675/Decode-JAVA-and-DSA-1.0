//Write a Java program to insert an element into given array list of size n at the first position

package Week_4_Arrays.ArrayList.ArrayListQuestion;
import java.util.ArrayList;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: " + list);
        list.add(0, 1);
        list.add(0, 99);
        System.out.println("Modified List: " + list);

    }
}
