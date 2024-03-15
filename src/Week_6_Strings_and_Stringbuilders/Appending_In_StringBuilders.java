package Week_6_Strings_and_Stringbuilders;

import java.util.*;
public class Appending_In_StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);  // Prints "abc"

        // Appending an integer
        sb.append(10);
        System.out.println(sb);  // Prints "abc10"

        // Appending a character
        sb.append('*');
        System.out.println(sb);  // Prints "abc10*"

        // Appending a string
        sb.append("xyz");
        System.out.println(sb);  // Prints "abc10*xyz"

        // Appending a character array
        char[] ch = {'p', 'a', 'w', 'a', 'n'};
        sb.append(ch);
        System.out.println(sb);  // Prints "abc10*xyzpawan"

        /*
        Appending an integer array
        Does not append the array's content, but the array's address is appended
        int[] arr = {1, 2, 3, 4};
        sb.append(arr);
        System.out.println(sb);
         */

        // Appending a StringBuilder object
        StringBuilder s = new StringBuilder("kumar");
        sb.append(s);
        System.out.println(sb);  // Prints "abc10*xyzpawankumar"

        /*
        We cannot directly use the += operator to append to a StringBuilder object:
        s += "singh" (throws an error)
        This operation is not supported because StringBuilder does not override the += operator for Strings.
        */

        // Other types that can be appended in StringBuilder:
        // - Floating point numbers
        sb.append(3.14);
        System.out.println(sb);  // Prints "abc10*xyzpawankumar3.14"

        // - Booleans
        sb.append(true);
        System.out.println(sb);  // Prints "abc10*xyzpawankumar3.14true"

        // - Characters
        sb.append('!');
        System.out.println(sb);  // Prints "abc10*xyzpawankumar3.14true!"

        // - Other StringBuilder objects
        sb.append(new StringBuilder("end"));
        System.out.println(sb);  // Prints "abc10*xyzpawankumar3.14true!end"

        // - CharSequence objects (e.g., String, StringBuffer)
        sb.append((CharSequence) "final");
        System.out.println(sb);  // Prints "abc10*xyzpawankumar3.14true!endfinal"

        // - Objects (their toString() method is called)
        sb.append(new Date());
        System.out.println(sb);  // Appends the current date

        /*
        Primitive Types:
        Integer: append(int)
        Long: append(long)
        Short: append(short)
        Byte: append(byte)
        Float: append(float)
        Double: append(double)
        Char: append(char)
        Boolean: append(boolean)

        Arrays:
        Array of Characters: append(char[])
        Array of Bytes: append(byte[])
        Array of Integers: append(int[])
        Array of Doubles: append(double[])
        Array of Objects: append(Object[])
        Other Types:

        String: append(String)
        CharSequence: append(CharSequence)
        StringBuilder: append(StringBuilder)
        StringBuffer: append(StringBuffer)
        Object: append(Object)
        Enum: append(Enum)
        Date: append(Date)
        Calendar: append(Calendar)
        Iterable (e.g., List, Set): append(Iterable)
        Iterator: append(Iterator)
        Map: append(Map)
        Scanner: append(Scanner)
        File: append(File)

        Null Values:
        append(null) will append the string "null"
        */
    }
}
