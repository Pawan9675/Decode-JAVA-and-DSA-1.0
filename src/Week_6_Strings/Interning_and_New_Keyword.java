package Week_6_Strings;

public class Interning_and_New_Keyword {
    public static void main(String[] args) {
        // String "Pawan" is stored in the string pool
        String str = "Pawan";

        // Attempting to change characters in the string will throw errors as Strings are immutable
        // str.charAt(0) = 'N';  // This will throw an error
        // str.charAt(2) = 'm';  // This will throw an error

        // Changing the value of str to "Naman"
        // Here, a new string "Naman" is created in the string pool, and str now points to this new string
        str = "Naman";
        // Now str will point to the String "Naman", but the String "Pawan" is also still in memory
        System.out.println(str);  // Output: Naman

        // The String "abc" is already stored in the string pool
        // str1 and str2 will point to the same memory location to save space (string interning)
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1);  // Output: abc
        System.out.println(str2);  // Output: abc

        // Using the 'new' keyword, we can create a new String object at a different memory location,
        // even if that String already exists in memory
        // Here, a new string object is created in a different memory location, regardless of whether "abc" is already in the string pool
        String str3 = new String("abc");
        System.out.println(str3);  // Output: abc
    }
}
