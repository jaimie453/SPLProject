// Java Example 3
// Variable Mutability

import java.util.Arrays;

public class Variable {
    public static void main(String[] args) {
        int[] numbers = new int[]{8,2,5,15,5,5,7,1};

        // The sort method takes an array of numbers by reference
        // This mutates the value in memory which numbers points to
        Arrays.sort(numbers);

        // prints [1, 2, 5, 5, 5, 7, 8, 15]
        System.out.println(Arrays.toString(numbers));

        // another example of variable mutability with strings
        String name = "Jaimie";
        name += " Bowen";

        // prints Jaimie Bowen
        System.out.println(name);
    }
}
