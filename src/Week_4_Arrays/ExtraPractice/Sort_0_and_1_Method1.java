package Week_4_Arrays.ExtraPractice;

public class Sort_0_and_1_Method1 {
    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 0, 0, 1, 0};
        int n = arr.length;

        int zeroes = 0;
        // count number of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                zeroes++;
            }
        }

        // 0 to zeroes-1 : 0, zeroes to n-1 : 1
        for (int i = 0; i < n; i++) {
            if (i < zeroes) arr[i] = 0;
            else  arr[i] = 1;
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
