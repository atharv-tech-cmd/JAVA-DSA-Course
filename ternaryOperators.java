package scratchofjavalanuage;
import java.util.Scanner;
public class ternaryOperators {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();
    String ans ;
       ans = (num % 2 == 0) ? "Even" : "Odd";
       System.out.println("the number is : "+ans);
    } 
    
    

}
