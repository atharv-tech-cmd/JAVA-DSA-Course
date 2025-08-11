package DSAbyManviMam;
import java.util.Scanner;
class Algebra{
    int add (int a,int b){
    int ans = a+b;
    return ans;
    }
}


public class SumusingFUNCTION {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int x = sc.nextInt();
        System.out.println("enter the second number :");
        int y =sc.nextInt();
        System.out.println("sum of input numbers is");
    System.out.println(obj.add(x,y));
    }
}
// stnadard library methods 
// print()
// sqrt(
// floor()
// 🔹 Math class ka kaam
// Ye class tumhe ready-made methods deti hai jisse tum easily maths operations kar sakte ho, jaise:

// Square root (Math.sqrt(16) → 4)

// Power (Math.pow(2, 3) → 8)

// Round off (Math.round(5.6) → 6)

// Minimum & Maximum (Math.min(5, 9) → 5)

// Random number (Math.random())

// Floor / Ceil (Math.floor(5.8) → 5.0, Math.ceil(5.8) → 6.0)

// Math class java.lang package me hoti hai.

// Tumhe import karne ki zarurat nahi hoti, kyunki java.lang package automatically import hota hai.

// Iske sare methods static hote hain → Matlab tumhe Math class ka object banane ki zarurat nahi, tum directly call kar sakte ho:

// java
// Copy code
