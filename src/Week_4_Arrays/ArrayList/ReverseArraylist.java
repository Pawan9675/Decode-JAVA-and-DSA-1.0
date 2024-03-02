package Week_4_Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
    public static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size()-1;
        while (i<j){
            /*
            int temp = a;
            a = b;
            b = temp;
            */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: " + list);
        reverseList(list);
        System.out.println("Reversed List: " + list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println("Original List: " + list1);
        Collections.reverse(list1);
        System.out.println("Reversed List: " + list1);


    }
}
