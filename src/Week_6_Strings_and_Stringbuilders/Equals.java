package Week_6_Strings_and_Stringbuilders;

public class Equals {
    public static void main(String[] args) {
        String str1 = "abcxyz";
        String str2 = "abcxyz";
        System.out.println(str1 == str2);     // true because of string interning, str1 and str2 reference the same string object "abcxyz"

        String str3 = "abc";
        str3 = str3 + "xyz"; // When concatenating, using + operator, a new string object is created in the heap
        System.out.println(str1 == str3);   // false because str3 is now a new string object, not interned, even though it has the same value as str1

        String str4 = new String("abcxyz"); // Creates a new string object in the heap
        System.out.println(str1 == str4);   // false because str4 is a new string in memory, even though it has the same value as str1

        // The '==' operator compares the memory addresses of two objects, so it returns true only if both references point to the same object

        System.out.println(str1.equals(str2));      // true because equals method compares values (character by character), not addresses
        System.out.println(str1.equals(str3));      // true because str1 and str3 have the same value
        System.out.println(str1.equals(str4));      // true because str1 and str4 have the same value

        // The equals() method compares the content of the strings, not their memory addresses

        // String interning is a process where the JVM stores only one copy of each distinct string value in the string pool,
        // allowing for more efficient memory usage and reference comparisons with the '==' operator for string literals.
    }
}
