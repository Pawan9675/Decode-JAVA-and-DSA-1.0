// Given n string consisting of digits from 0 to 9. Return the string which has maximum value.

package Week_6_Strings_and_Stringbuilders;

public class Largest_String {

    // Method to compare two strings and return the larger one
    public static String max(String a, String b) {
        // Removing leading zeros from both strings
        String s = purify(a);
        String t = purify(b);

        // Comparing lengths of strings
        if (s.length() > t.length())
            return a; // Return first string if it has more digits
        if (s.length() < t.length())
            return b; // Return second string if it has more digits

        // If both strings have equal lengths, compare character by character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i))
                    return a; // Return first string if its current character is greater
                else
                    return b; // Return second string if its current character is greater
            }
        }
        // If both strings are exactly the same, return either one
        if (a.length() >= b.length())
            return a;
        else
            return b;
    }

    // Method to remove leading zeros from a string
    public static String purify(String st) {
        // Loop through the string until a non-zero digit is found
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != '0')
                return st.substring(i); // Return substring from the first non-zero digit
        }
        // If all characters are zeros, return the original string
        return st;
    }

    public static void main(String[] args) {
        /*
         Method 1: This method uses Integer.parseInt() to convert strings to integers and find the maximum value.
                   However, it fails when an integer is out of the bounds of the int value, leading to NumberFormatException.
        String[] str = {"100", "101", "103", "104", "105"};

        int max = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            max = Math.max(max, n);
        }
        System.out.println(max);
        */

        // Array of strings to find the largest
        String[] str = {"71536", "438778787999804085", "00577", "8745", "68423"};
        String maxS = str[0];

        // Iterate through the array to find the largest string
        for (int i = 0; i < str.length; i++) {
            maxS = max(maxS, str[i]);
        }

        // Print the largest string
        System.out.println("Maximum number in String array: " + maxS);
    }
}