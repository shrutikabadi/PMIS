package Day7;


import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();


        numbers.add(12);
        numbers.add(7);
        numbers.add(23);
        numbers.add(44);
        numbers.add(91);
        numbers.add(50);

        // Create a list to store even numbers
        List<Integer> evens = new ArrayList<>();

        // Filter even numbers
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        // Display the even numbers
        System.out.println("Even numbers: " + evens);
    }


}

