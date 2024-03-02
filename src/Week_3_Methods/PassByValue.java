package Week_3_Methods;

public class PassByValue {
    public static void change(int a){
        a = 10;
        System.out.println("Inside change function: "+ a);
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before calling change function: "+a);      //5
        change(a);                                                     //10
        System.out.println("After calling change function: "+a);       //10 X  //5
    }
}
/*
Java is always pass by value not pass by reference

Note: Java is officially always pass-by-value i.e. when any variable is passed to a method in Java, the value of
the variable on the stack is copied into a new variable inside the new method.
 */