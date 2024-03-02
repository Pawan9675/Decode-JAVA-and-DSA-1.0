// Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and
// print all strings stored on odd indices of the array.
package Week_4_Arrays.Practice_Array;

public class OddIndicesInStringArray {
    public static void main(String[] args) {
        String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};

        for (int i = 0; i <arr.length ; i++) {
            if ((i%2) != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
