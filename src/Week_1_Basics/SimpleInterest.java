package Week_1_Basics;

public class SimpleInterest {
    public static void main(String[] args) {
        double p = 10000, r = 8.1, t = 3;
        double si = (p*r*t)/100;
        System.out.printf("Simple Interest with amount %.2f, rate %.2f and time %.2f is: %.2f",p,r,t,si);
    }
}
