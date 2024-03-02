package Week_1_Basics;

public class AreaOfCircle {
    public static void main(String[] args) {

        //Area of Circle
        double r = 6.9;
        double a = 3.141592 * r * r;
        System.out.println("Area of Circle with radius "+r+" is "+a);

        //Volume of Sphere
        double b = (4 * 3.141592 * r * r * r)/3;
        System.out.println("Volume of Sphere with radius "+r+" is "+b);

    }
}
