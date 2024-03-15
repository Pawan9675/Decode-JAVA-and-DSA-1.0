package Week_6_Strings_and_Stringbuilders;

public class Insert_and_Delete_In_StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);  // Prints "abc"

        // Inserting a character at index 2
        sb.insert(2, 'd');
        System.out.println(sb);  // Prints "abd c"

        // Inserting a string at index 1
        sb.insert(1, "xyz");
        System.out.println(sb);  // Prints "axyzbd c"

        // Inserting a boolean at index 5
        sb.insert(5, true);
        System.out.println(sb);  // Prints "axyzttruebd c"

        // Inserting an integer at index 0
        sb.insert(0, 10);
        System.out.println(sb);  // Prints "10axyzttruebd c"

        // Deleting the character at index 4
        sb.deleteCharAt(4);
        System.out.println(sb);  // Prints "10axzttruebd c"

        // Deleting characters from index 2 to 6 (exclusive)
        sb.delete(2, 7);
        System.out.println(sb);  // Prints "10truebd c"
    }
}
