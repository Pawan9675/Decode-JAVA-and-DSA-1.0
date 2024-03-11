package Week_6_Strings;

public class IndexOf_and_CompareTo {
    public static void main(String[] args) {
        String str = "Pawan";

        // indexOf() method:
        // Accessing the kth index of the character in a string str
        System.out.println(str.indexOf('w'));  // Output: 2

        // Accessing the first index of the character in a string str
        System.out.println(str.indexOf('a'));  // Output: 1

        // Accessing the last index of the character in a string str
        System.out.println(str.lastIndexOf('a'));  // Output: 4

        // Accessing the index of character in a string str which does not exist
        System.out.println(str.indexOf('z'));  // Output: -1


        // compareTo method:
        String str1 = "abc";
        String str2 = "bbc";
        // compareTo compares the strings lexicographically.
        // It returns the difference in ASCII values of the first non-matching characters.
        // Here, 'a' (97) - 'b' (98) = -1
        System.out.println(str1.compareTo(str2));  // Output: -1

        String str3 = "bbc";
        String str4 = "abc";
        // Here, 'b' (98) - 'a' (97) = 1
        System.out.println(str3.compareTo(str4));  // Output: 1

        String str5 = "abc";
        String str6 = "abc";
        // Both strings are the same, so the result is 0
        System.out.println(str5.compareTo(str6));  // Output: 0

        String str7 = "abc";
        String str8 = "abcgggg";
        // Here, "abc" is compared with "abcgggg".
        // In this case, the first three characters of both strings are the same ("abc").
        // The result is the length of the second string minus the length of the first string.
        // Here, 3 (length of "abc") - 7 (length of "abcgggg") = -4
        System.out.println(str7.compareTo(str8));  // Output: -4

        String str9 = "abcgggg";
        String str10 = "abc";
        // Here, "abcgggg" is compared with "abc".
        // The result is the length of the first string minus the length of the second string.
        // Here, 7 (length of "abcgggg") - 3 (length of "abc") = 4
        System.out.println(str9.compareTo(str10));  // Output: 4
    }
}
