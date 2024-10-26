package Week_12_LinkedList.Singly_LinkedList;

public class Shallow_Copy_Of_A_Node {
    public static void main(String[] args) {
        // Creating the first node with value 100
        Node a = new Node(100);
        System.out.println("Value of node 'a': " + a.val);  // Output: 100

        // Shallow copy: temp1 refers to the same object as 'a'
        Node temp1 = a;
        System.out.println("Value of shallow copy (temp1): " + temp1.val);  // Output: 100

        // Displaying memory addresses (references)
        System.out.println("Reference of node 'a': " + a);     // e.g., Node@6acbcfc0
        System.out.println("Reference of temp1: " + temp1);    // Same as 'a', Node@6acbcfc0

        // Modifying value through the shallow copy (temp1)
        temp1.val = 12;  // This will change the value in both 'a' and 'temp1', since they refer to the same object
        System.out.println("Modified value of node 'a': " + a.val);  // Output: 12
        System.out.println("Modified value of temp1: " + temp1.val); // Output: 12

        // Creating a new node temp2 with the same value as 'a', but this is a deep copy
        Node temp2 = new Node(100);
        System.out.println("Reference of node 'a': " + a);     // e.g., Node@6acbcfc0
        System.out.println("Reference of temp2 (deep copy): " + temp2); // Different from 'a', e.g., Node@5f184fc6
    }
}
