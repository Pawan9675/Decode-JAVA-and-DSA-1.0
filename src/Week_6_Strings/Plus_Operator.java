package Week_6_Strings;

public class Plus_Operator {
    public static void main(String[] args) {
        String str = "abc";

        // Concatenating string using plus operator
        str = str + "def";      // Adding at the end
        str = "xyz" + str;      // Adding at the front
        System.out.println(str);   // Output: xyzabcdef

        // Concatenating integer using plus operator
        str = str + 10;         // Adding at the end
        str = 10 + str;         // Adding at the front
        System.out.println(str);   // Output: 10xyzabcdef

        // Concatenating character using plus operator
        str = str + 'g';        // Adding at the end
        str = 'h' + str;        // Adding at the front
        System.out.println(str);   // Output: h10xyzabcdefg

        // Concatenating empty string using plus operator
        str = str + "";         // Adding at the end
        str = "" + str;         // Adding at the front
        System.out.println(str);   // Output: h10xyzabcdefg

        // '+' is an arithmetic operation, and it will execute from left to right
        // 1: "abc" + 10 + 20 -> String + Integer + Integer
        // 2: "abc10" + 20 -> String + Integer
        // 3: "abc10" + 20 -> Overall String
        System.out.println("abc" + 10 + 20);   // Output: "abc1020"

        // Similarly, it will execute from left to right
        // 1: 10 + 20 + "abc" -> Integer + Integer + String
        // 2: 30 + "abc" -> Integer + String
        // 3: "30abc" -> Overall String
        System.out.println(10 + 20 + "abc");   // Output: "30abc"
    }
}
