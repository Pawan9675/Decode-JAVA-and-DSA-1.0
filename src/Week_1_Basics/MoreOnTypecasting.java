package Week_1_Basics;

public class MoreOnTypecasting {
    public static void main(String[] args) {
        System.out.println(5/2);        // int / int = int
        System.out.println(5.0/2.0);    // double / double = double
        System.out.println(5.0/2);      // double / int = double
        System.out.println(5/2.0);      // int / double = double

        double d = (double) 5/2;
        System.out.println(d);
    }
}
