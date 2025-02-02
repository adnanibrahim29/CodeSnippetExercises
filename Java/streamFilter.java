import java.util.*;
import java.util.stream.Collectors;

public class streamFilter {
   /**
    * Current code prints all numbers which are even
    * 
    * Task - Print all numbers over 40 (inclusive)
    * @param args
    */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65, 70);

        /**
         * Filtering using Stream API
         * Change: Change parameters in filter
         * 
         * Previously: 
         * List<Integer> evenNumbers = numbers.stream()
         *                                    .filter(n -> n % 2 == 0)
         *                                    .collect(Collectors.toList());
         *  
         */
        
         List<Integer> overFourty = numbers.stream()
                                           .filter(n -> n >= 40)
                                           .collect(Collectors.toList());

        // Printing the filtered list
        System.out.println("Over Fourty: " + overFourty);
    }
}
