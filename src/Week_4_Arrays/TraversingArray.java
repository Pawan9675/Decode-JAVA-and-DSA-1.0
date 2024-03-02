package Week_4_Arrays;

public class TraversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // Using for loop
        for (int i = 0; i < 5 ; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
        // Using for each loop
        for (int element : arr){
            System.out.print(element+"\t");
        }

        System.out.println();
        // Using while loop
        int i = 0;
        while (i<5){
            System.out.print(arr[i]+"\t");
            i++;
            //we can write ++i also
        }
    }
}
