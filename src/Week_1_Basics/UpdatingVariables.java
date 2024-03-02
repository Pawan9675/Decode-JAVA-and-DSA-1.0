package Week_1_Basics;

public class UpdatingVariables {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = 7;
        System.out.println(x);
        x = x+6;
        System.out.println(x);
        x = x-20;
        System.out.println(x);
        x = x*-1;
        System.out.println(x);
        x = x+3;
        System.out.println(x);
        x = x/2;
        System.out.println(x);

        System.out.println("After using Short-cut");
        x = 5;
        System.out.println(x);
        x += 7;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x *= 6;
        System.out.println(x);
        x /= 12;
        System.out.println(x);
        // Note x+=7 is faster than x = x+7  --> Comment
    }
}
