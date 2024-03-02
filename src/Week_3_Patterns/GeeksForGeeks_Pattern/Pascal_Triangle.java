package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            int curr = 1;
           for (int k = 0; k <= i; k++) {
               System.out.print(curr+" ");
               curr = curr*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}

/*
Logic:
The next element(i C j+1)  can by find by previous element(i C j).
As i C j+1 = i C j * ((i-j)/(j+1))
i.e. curr = curr * (i-j)/(j+1)
*/
