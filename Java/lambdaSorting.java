import java.util.*;

public class lambdaSorting {

    /**
     * Current code prints out the Array in alphabetical order
     * 
     * Task - Modify the program to print the array in reverse order
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob", "David");

        /**
         * Sorting using a lambda expression
         * Change: swap a and b 
         * 
         * Previously: 
         * names.sort((a, b) -> a.compareTo(b)); // a is smaller than b
         */
        names.sort((b, a) -> a.compareTo(b)); // b is smaller than a

        // Print sorted names
        names.forEach(name -> System.out.print(name + " "));
    }
}
