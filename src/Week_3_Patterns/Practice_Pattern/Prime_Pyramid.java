package Week_3_Patterns.Practice_Pattern;

public class Prime_Pyramid {
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                boolean flag = true;
                for (int k = 2; k*k <= number; k++) {
                    if (number % k == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(number + " ");
                } else {
                    j--;
                }
                number++;
            }
            System.out.println();
        }
    }
}
