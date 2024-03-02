package Week_4_Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};

//      int [] ans = new int[arr.length];
//      int k = 0;
//      METHOD - 1 (TIME CONSUMING)
//        for (int i = 0; i < arr.length; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j]>max){
//                    max = arr[j];
//                }
//            }
//
//            if (max != Integer.MIN_VALUE) ans[k++] = max;
//            else ans[k++] = -1;
//        }

//      METHOD - 2 (OPTIMISED)
        int n = arr.length;
        int [] ans = new int[n];
        ans[n-1] = -1;
        int nge = arr[n-1];
//        int [] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        for (int i = n-2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(arr[i], nge);
        }

        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
