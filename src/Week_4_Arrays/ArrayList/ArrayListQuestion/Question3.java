// Write a Java program to swap two elements in an array list of size n.
package Week_4_Arrays.ArrayList.ArrayListQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: " + list);

        System.out.print("Enter the indices: ");
        int i = sc.nextInt();
        int j = sc.nextInt();

        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        System.out.println("List after swapped: " + list);

    }
}
