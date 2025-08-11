package scratchofjavalanuage;
import java.util.Scanner;
public class ProblemsOnloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print the sum of first n natural numbers,Where n is the input.
        

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculating sum using formula: sum = n * (n + 1) / 2
        int sum = n * (n + 1) / 2;

        // Displaying the result
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        
        
    }
}

    
