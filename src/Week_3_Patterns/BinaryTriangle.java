package Week_3_Patterns;

public class BinaryTriangle {
    public static void main(String[] args) {
        // Method 1
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                if ((i+j)%2 == 0){
                    System.out.print(1+" ");
                }
                else System.out.print(0+" ");
            }
            System.out.println();
        }

        System.out.println();

        // Method 2
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                if (i%2==1){
                    if (j%2==1) System.out.print(1+" ");
                    else System.out.print(0+" ");
                }
                else { //i%2 == 0
                    if (j%2==0) System.out.print(1+" ");
                    else System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
