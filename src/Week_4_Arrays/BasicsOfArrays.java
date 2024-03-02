package Week_4_Arrays;
import java.util.Scanner;
public class BasicsOfArrays {
    public static void main(String[] args) {
        int [] array;       //declaration
        array = new int[5];     //memory allocation

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];     // Declaration

        //Initialisation individual elements
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //Output of Array Elements
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");
        System.out.println();

        //Updating the Array Element
        System.out.println(arr[0]);
        arr[0] = 99;
        arr[0] += 10;
        System.out.println(arr[0]);


        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []brr = new int[n];
        //Input -> using for loop
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            brr[i] = sc.nextInt();
        }
        //Output -> using for loop
        System.out.print("Elements of Array are: ");
        for (int i = 0; i <=n-1; i++) {
            System.out.print(brr[i]+" ");
        }

        System.out.println();
        //initialization and declaration both
        int [] crr = {10,20,30,40,50,60};
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(crr[i]+" ");
        }

        /*
        Note:
        int a(25);                                    --> Wrong (int [] a)
        int size = 10, b[size];   --> Valid in C/C++  --> Wrong in JAVA (int size = 10; int [] b)
        int c = {0,1,2};                              --> Wrong (int [] c = {0,1,2})
        */

    }
}
