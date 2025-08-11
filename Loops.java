package scratchofjavalanuage;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.print("Enter the number up to print: ");
        int n = sc.nextInt();

        System.out.println("The numbers from 1 to " + n + " are:");
        while (num <= n) {
            System.out.println(num);
            num = num + 1;
        }
    }
}