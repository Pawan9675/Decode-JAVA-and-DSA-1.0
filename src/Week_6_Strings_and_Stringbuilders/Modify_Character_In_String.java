package Week_6_Strings_and_Stringbuilders;

public class Modify_Character_In_String {
    public static void main(String[] args) {
        // We cannot change individual characters in a string directly because strings are immutable in Java.
        // However, we can create a new string with the modified character(s).

        String str = "Hello";
        // changing 'l' (2nd index) to 'y'
        str = str.substring(0, 2) + 'y' + str.substring(3); // not an efficient method, it will consume a lot of time and space
        System.out.println(str);

        /*
        Explanation of the above operation:
        1. Initially, str points to the string "Hello".
        2. We create a new string by concatenating the substring from index 0 to 2 (excluding 2) of the original string ("He") with the character 'y' and then concatenate the remaining substring ("lo").
        3. This creates a new string "Heylo".
        4. Now, str points to the new string "Heylo", and the previous string "Hello" still resides in memory until it is garbage collected.
        But this method consumes a lot of time and space, which is not efficient.
        */

        // In Java, immutability is enforced for security, thread-safety, and optimization purposes.
    }
}
