package Week_2_Loops;

public class PrintEvenOdd {
    public static void main(String[] args) {
        System.out.print("Even Numbers From 1 To 100: ");
        for (int i=1;i<=100;i++){
            if (i%2==0) System.out.print(i+" ");
        }

        System.out.println();

        System.out.print("Odd Numbers From 1 To 100: ");
        for (int i=1;i<=100;i++){
            if (i%2==1) System.out.print(i+" ");
        }

    }
}
