// Convert Set To ArrayList in JAVA

package Week_16_HashMap_And_HashSet;

import java.util.*;

public class SetToArrayListConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashSet to store unique elements
        Set<Integer> numberSet = new HashSet<>();

        // Taking input from user
        System.out.print("Enter the number of elements in the Set: ");
        int setSize = scanner.nextInt();

        System.out.println("Enter the elements of the Set (Duplicates will be ignored):");
        for (int i = 0; i < setSize; i++) {
            numberSet.add(scanner.nextInt()); // Set automatically handles uniqueness
        }

        // Convert Set to ArrayList
        List<Integer> numberList = new ArrayList<>(numberSet);

        // Display the converted ArrayList
        System.out.println("Converted ArrayList: " + numberList);

        scanner.close(); // Close scanner to prevent memory leak
    }
}
