package Week_6_Strings;

public class Contains_StartsWith {
    public static void main(String[] args) {
        String str = "Pawan";

        // contains() method:
        // Checks if the string contains a specific sequence of characters
        System.out.println(str.contains("a"));    // Output: true
        System.out.println(str.contains("awa"));  // Output: true
        System.out.println(str.contains("abc"));  // Output: false

        // startsWith() method:
        // Checks if the string starts with a specific prefix
        System.out.println(str.startsWith("Pa")); // Output: true
        System.out.println(str.startsWith("Ab")); // Output: false

        // endsWith() method:
        // Checks if the string ends with a specific suffix
        System.out.println(str.endsWith("an"));   // Output: true
        System.out.println(str.endsWith("cd"));   // Output: false
    }
}
