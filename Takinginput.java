package scratchofjavalanuage;
import java.util.Scanner;
public class Takinginput {
    public static void main(String[] args) {
        // java scanner class tutorial
        Scanner sc = new Scanner(System.in);
        //how to take  integer input .
        //System.out.print("enter the lucky number : ");
        //int num_1 = sc.nextInt();
        //System.out.println("the lucky number is : "+num_1);
        // how to take  String input .
        //System.out.print("enter your name :");
        //String name = sc.next();// space ke badd input nhi lega
        //System.out.println("the enter name is here : "+name);
        // System.out.println("Enter the temple name : ");
        // String temple_name =  sc.nextLine();// ye space ke baad bhi string ko hamra print karta hai.
        // System.out.println("the temple name is here : "+temple_name);
        // adition of two numbers by taking user input.
        // System.out.print("enter the first number : ");
        // int num_1 = sc.nextInt();
        // System.out.print("enter the second number : ");
        // int num_2 = sc.nextInt();
        // int sum = num_1 + num_2;
        // System.out.println("the addition of two number : "+sum);
        // calculate the simple intersest ?
        System.out.print(" enter the principal : ");
        float p = sc.nextFloat();
        System.out.print("enter the rate of interest : ");
        float r = sc.nextFloat();
        System.out.print("enter the time : ");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("principle : "+p);
        System.out.println("rate :"+r);
        System.out.println("time :"+t);
        System.out.println("simple interest : "+si);
    }
}
