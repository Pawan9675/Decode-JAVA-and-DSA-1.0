package Week_4_Arrays.ArrayReference;

public class CloningArray {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 9};
        int n = a.length;
        int[] b = a.clone();        // deep copy
        b[0] = 5;
        System.out.println("Original array ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nCloned Array ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
