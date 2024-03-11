package Week_6_Strings;

public class CharAt_and_Length {
    public static void main(String[] args) {
        String str = "Pawan";

        // Accessing a particular character of a string using charAt() method
        // Indexing starts from 0
        System.out.println("Character at index 0: " + str.charAt(0)); // Output: P
        System.out.println("Character at index 2: " + str.charAt(2)); // Output: w
        // Uncommenting the line below will result in a StringIndexOutOfBoundsException
        // System.out.println("Character at index 6: " + str.charAt(6)); // Error: Index out of bounds

        // Printing the length of the string using length() method
        System.out.println("Length of the string: " + str.length()); // Output: 5
    }
}
