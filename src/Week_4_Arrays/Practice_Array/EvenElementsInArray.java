// Traverse over the elements of the array {1,2,3,4,5,6,7,8}
// using for each loop and print all even elements.
package Week_4_Arrays.Practice_Array;

public class EvenElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        for (int element : arr){
            if (element%2 == 0){
                System.out.print(element+" ");
            }
        }
    }
}
