/*
Advantages  of 2D arraylist over arrays:
    1. Variable size
    2. The arraylists inside the arraylist can be of different sizes:
        Example: a = {10, 20, 30}
                 b = {40, 50}
                 c = {60, 70, 80, 90, 100}

                 The arraylist 'v' = {a, b, c} where a, b, c are arraylist of variable length
*/

package Week_5_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2D {
    public static void main(String[] args) {

        // creating 1D arraylist
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);

        List<Integer> c = new ArrayList<>();    // empty arraylist

        List<Integer> d = new ArrayList<>();
        d.add(60);

        // creating 2D arraylist
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(a); grid.add(b); grid.add(c); grid.add(d);

        // printing 1D arraylist 'a'
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
        System.out.println();

        // printing 2D arraylist 'grid' in different ways:

        // Method 1:
        for (int i = 0; i < grid.size(); i++) {
            System.out.println(grid.get(i));
        }

        System.out.println(grid.get(1).get(1));     // printing particular element of 2D arraylist 'grid' i.e. 50

        // Method 2:
        for (int i = 0; i < grid.size(); i++) {
            List<Integer> x = grid.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }

        // Method 2 can be reduced to :
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                System.out.print(grid.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // Method 3
        System.out.println(grid);

    }
}
