package Week_4_Arrays;

public class PreviousGreatestElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int n = arr.length;
        int [] ans = new int[n];
        ans[0] = -1;
        int pge = arr[0];

        for (int i = 1; i <=n-1 ; i++) {
            ans[i] = pge;
            pge = Math.max(pge, arr[i]);
        }

        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
