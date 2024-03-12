package Week_6_Strings;

public class SubString {
    public static void main(String[] args) {
        // Substring is a continuous part of a string of whatever length

        // Empty string
        String str = "";
        System.out.println("Length of str: " + str.length());

        String str1 = "abcde";
        // Print the substring starting from index 2 to end
        System.out.println("Substring from index 2 to end: " + str1.substring(2));

        // Print the substring starting from index 2 to 5-1 = 4
        System.out.println("Substring from index 2 to 5-1: " + str1.substring(2, 5));

        // No characters will be printed as start and end index are the same
        System.out.println("Substring from index 2 to 2: " + str1.substring(2, 2));

        // Print the entire string as start index is 0 and end index is 5-1 = 4
        System.out.println("Substring from index 0 to 5-1: " + str1.substring(0, 5));

        // Trying to access index -1 which is out of bounds, so it will throw StringIndexOutOfBoundsException
        // System.out.println(str1.substring(-1));

        // Trying to access index 9 which is out of bounds (length of the string is 5), so it will throw StringIndexOutOfBoundsException
        // System.out.println(str1.substring(2, 9));
    }
}
