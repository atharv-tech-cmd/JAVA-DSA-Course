package scratchofjavalanuage;
import java.util.Scanner;
public class problemonjavconditionals {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number : ");
    // int age = sc.nextInt();
    // if(age<=12){
    //     System.out.println("child");
    // }
    // else if(age>12 && age<=18){         
    //     System.out.println("teenager");
    
    // }
    // else{
    //     System.out.println("adult");
    // }









        // wap to print the value if it is even and divisible by 3.
    //      System.out.println("enter the value :" );
    //     int value  = sc.nextInt();
       
    // if(value%2==0 && value%3==0){
    //     System.out.println("the number which is even and divisible by three: " +value);
    // }
    // else{
    //     System.out.println("not divisible by 3 and also not  even");
  //}


// wap to print the value if it is divisible by three or 5 .
System.out.println("enter the number : ");
int number = sc .nextInt();
if(number%3==0 && number%5==0){
    System.out.println("the number is :"+number);
}
else{
    System.out.println("the number is not divisible three or five");
}
  }  
}
