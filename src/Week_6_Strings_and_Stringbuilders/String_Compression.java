package Week_6_Strings_and_Stringbuilders;

/**
 * This class demonstrates a simple string compression algorithm.
 * It compresses a string by replacing consecutive repeated characters with the character followed by the count of its occurrences.
 * For example, "aaabbccc" would be compressed to "a3b2c3".
 */
public class String_Compression {
    public static void main(String[] args) {
        // Input string to be compressed
        String str = "aaaabbccccddefffffghh";
        // Convert the string to a character array for easy traversal
        char[] ch = str.toCharArray();

        int i = 0, j = 0; // Pointers to track the start and end of each repeated sequence
        String ans = ""; // Variable to store the compressed string
        // Loop through the character array
        while (j < ch.length) {
            // If the current character is the same as the next character, move the end pointer
            if (ch[i] == ch[j]) j++;
            else {
                // If the characters are different, add the current character to the compressed string
                ans += ch[i];
                // Calculate the length of the repeated sequence
                int len = j - i;
                // If the length is greater than 1, add it to the compressed string
                if (len > 1) ans += len;
                // Move the start pointer to the next character
                i = j;
            }
        }
        // Add the last character and its count to the compressed string
        ans += ch[i];
        int len = j - i;
        if (len > 1) ans += len;

        // Print the compressed string
        System.out.println("Compressed string is: " + ans);
    }
}
