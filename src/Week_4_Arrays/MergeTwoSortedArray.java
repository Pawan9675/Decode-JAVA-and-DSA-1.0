package Week_4_Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] a = {1, 5, 8};
        int [] b = {2, 3, 6, 9};

        int [] merge = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                merge[k++] = a[i++];
            }
            else{
                merge[k++] = b[j++];
            }
        }
        while (i < a.length){
            merge[k++] = a[i++];
        }
        while (j < b.length){
            merge[k++] = b[j++];
        }

        System.out.println("Sorted Merged Array: ");
        for (int m = 0; m < merge.length; m++) {
            System.out.print(merge[m]+" ");
        }
    }
}
