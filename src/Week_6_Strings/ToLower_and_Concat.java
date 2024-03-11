package Week_6_Strings;

public class ToLower_and_Concat {
    public static void main(String[] args) {
        String str = "Ashutosh is a TikTok boy";

        // toLowerCase():
        System.out.println("Printing in lowercase: ");
        // str.toLowerCase();
        // System.out.println(str);      // nothing will change

        // To change the string in lowercase, we can do 3 things:

        // 1. Directly print it:
        System.out.println(str.toLowerCase());

        // 2. Store this in another string and print that string:
        String str2 = str.toLowerCase();
        System.out.println(str2);

        // 3. Update the current string and print it
        // Permanently change in string str
        str = str.toLowerCase();
        System.out.println(str);

        // toUpperCase():
        System.out.println("Printing in uppercase: ");
        // str.toUpperCase();
        // System.out.println(str);      // nothing will change

        // To change the string in uppercase, we can do 3 things:

        // 1. Directly print it:
        System.out.println(str.toUpperCase());

        // 2. Store this in another string and print that string:
        String str3 = str.toUpperCase();
        System.out.println(str3);

        // 3. Update the current string and print it
        // Permanently change in string str
        str = str.toUpperCase();
        System.out.println(str);


        // concat():
        // Method 1 (Using + operator):
        System.out.println("Concatenating the string: ");
        String string1 = "Pawan";
        String string2 = "Kumar";
        System.out.println(string1+string2);

        // Method 2 (Using concat() method):
        // string1.concat(string2);
        // System.out.println(string1);     // nothing will change

        // To concatenating two string, we can do 3 things:

        // 1. Directly print it:
        System.out.println(string1.concat(string2));

        // 2. Store this in another string and print that string:
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // 3. Update the current string and print it
        // Permanently change in string str
        string1 = string1.concat(string2);
        System.out.println(string1);

    }
}
