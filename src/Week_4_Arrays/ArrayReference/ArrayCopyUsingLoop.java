package Week_4_Arrays.ArrayReference;

public class ArrayCopyUsingLoop {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 9};
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        b[0] = 5;
        System.out.println("Original array ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nCopied Array ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
