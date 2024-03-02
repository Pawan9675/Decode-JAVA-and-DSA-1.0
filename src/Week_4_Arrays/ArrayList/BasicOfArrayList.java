package Week_4_Arrays.ArrayList;

import java.util.ArrayList;

public class BasicOfArrayList {
    public static void main(String[] args) {
        /*
        Wrapper class:
        -> a class whose object contains or wraps PDT (Primitive Data Type).
        -> object of a wrapper class contains a field which stores PDT.
                PDT         WRAPPER CLASS
             1. int         Integer
             2. float       Float
             3. char        Character
             4. boolean     Boolean
             5. long        Long
        */

        // wrapper class
        ArrayList <Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(5);      //5
        l1.add(6);      //5, 6
        l1.add(7);      //5, 6, 7
        l1.add(8);      //5, 6, 7, 8

        // get an element at index i
        System.out.println(l1.get(1));      // 6

        // print with for loop
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");      // 5, 6, 7, 8
        }

        // printing the arraylist directly
        System.out.println();
        System.out.println(l1);     // [5, 6, 7, 8]

        // adding element at some index i
        l1.add(1,100);
        System.out.println(l1);     // [5, 100, 6, 7 ,8]

        // modify element at index i
        l1.set(1, 10);
        System.out.println(l1);     // [5, 10, 6, 7 ,8]

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);     // [5, 6, 7 ,8]

        // removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);     // [5, 6, 8]

        l1.remove(Integer.valueOf(17));     // Nothing will happen as 17 doesn't exist
        System.out.println(l1);     //[5, 6, 8]

        System.out.println(l1.remove(Integer.valueOf(7)));      // return boolean value

        // checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);

    }
}
