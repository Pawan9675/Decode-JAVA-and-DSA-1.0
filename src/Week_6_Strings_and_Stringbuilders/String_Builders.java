package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class String_Builders {
    public static void main(String[] args) {
        // StringBuilder s = "abc";     --> Throws an error, not the correct way is to use the StringBuilder constructor

        // Creating an empty StringBuilder
        StringBuilder s1 = new StringBuilder();       // Method 1: Creates an empty StringBuilder with the default capacity (16 characters)
        StringBuilder s2 = new StringBuilder("");     // Method 2: Creates an empty StringBuilder with initial capacity 0
        System.out.println(s1);    // Prints an empty string
        System.out.println(s2);    // Prints an empty string
        System.out.println(s1.length());   // Prints 0
        System.out.println(s2.length());   // Prints 0

        // Creating a StringBuilder "abc"
        String s = "abc";
        StringBuilder sb1 = new StringBuilder("abc");    // Method 1: Creates a StringBuilder with the specified string
        StringBuilder sb2 = new StringBuilder(s);        // Method 2: Creates a StringBuilder with the content of the given string
        System.out.println(sb1);   // Prints "abc"
        System.out.println(sb2);   // Prints "abc"
        System.out.println(sb1.length());  // Prints 3 (length of "abc")
        System.out.println(sb2.length());  // Prints 3 (length of "abc")

        // Creating a StringBuilder with capacity 10
        StringBuilder sb3 = new StringBuilder(10);   // Creates a StringBuilder with the specified capacity (10)
        System.out.println(sb3.capacity());  // Prints the capacity of the StringBuilder (10)
        System.out.println(sb3.length());    // Prints the length of the StringBuilder (0)

        // The capacity() method returns the current capacity of the StringBuilder, which is the maximum number of characters it can hold without resizing.
        // The length() method returns the length of the StringBuilder, which is the number of characters currently in the StringBuilder.

        // Default capacity of an empty StringBuilder is 16
        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.capacity());   // Prints 16

        // Capacity of a StringBuilder with content "abc" is 16 (default) + 3 = 19
        StringBuilder sb6 = new StringBuilder("abc");
        System.out.println(sb6.capacity());   // Prints 19

        // Comparing two StringBuilders
        StringBuilder sb7 = new StringBuilder("abc");
        StringBuilder sb8 = new StringBuilder("xyz");
        System.out.println(sb7.compareTo(sb8));  // Compares the two StringBuilders lexicographically

        // Reversing a StringBuilder
        StringBuilder sb9 = new StringBuilder("abcxyz");
        System.out.println(sb9.reverse());  // Prints the reverse of the StringBuilder

        // Taking input of StringBuilder
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the StringBuilder: ");
        StringBuilder sb10 = new StringBuilder(sc.nextLine());
        System.out.println(sb10);   // Prints the input StringBuilder

        // Changing the character of a string in StringBuilder
        sb10.setCharAt(1, 'a');   // Sets the character at index 1 to 'a'
        System.out.println(sb10);   // Prints the StringBuilder after changing the character
    }
}
