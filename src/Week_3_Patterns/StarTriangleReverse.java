package Week_3_Patterns;
//        Star Triangle reverse
//        * * * *
//        * * *
//        * *
//        *
public class StarTriangleReverse {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        /* for (int i=1;i<=4;i++){
            for (int j=1;j<=(4+1-i);j++){
                System.out.print("*");
            }
            System.out.println();

        Logic:
        i=1 -> j= 1 to 5
        i=2 -> j= 1 to 4
        i=3 -> j= 1 to 3
        i=4 -> j= 1 to 2
        i=5 -> j= 1 to 1

        i + j(max) = n+1
        j(max)=n+1-i
        j<=n+1-i
        }*/
    }
}
