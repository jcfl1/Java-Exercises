import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Inserting the numbers into an array list
        System.out.println("Insert 4 numbers to sum:");
        for (int i = 0; i < 4; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}