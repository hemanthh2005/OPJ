import java.util.InputMismatchException;
import java.util.Scanner;
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
public class DuplicateChecker { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of integers you want to input:"); int count = scanner.nextInt();
    int[] numbers = new int[count];
    System.out.println("Enter " + count + " integers:"); try {
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
// Check for duplicates in the existing array
for (int j = 0; j < i; j++) {
            if (numbers[j] == num) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
        }
// Add number to the array if no duplicate is found
numbers[i] = num;
    }
    System.out.println("All numbers are unique. List:"); for (int num : numbers) {
        System.out.print(num + " ");
    }
} catch (DuplicateNumberException e) {
    System.out.println("Error: " + e.getMessage());
} catch (InputMismatchException e) {
    System.out.println("Error: Please enter valid integers.");
} finally { scanner.close();
}
}
}
