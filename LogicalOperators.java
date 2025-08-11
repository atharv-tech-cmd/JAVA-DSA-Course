package scratchofjavalanuage;
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        int p = 15 , q = 10 , r= 5 ;
        // &&  logical and operators
        System.out.println((p>q) && (p>r));
        System.out.println((p>q)&&(p<r));
        // ||  logical or operator
        System.out.println((r<q) || (p<q));
        System.out.println((p>q)||(q>r));
        System.out.println((p>q) || (q>r));
        // ! logical not operator
        System.out.println(!( p == q));
        System.out.println(!(p>q));
    }
}
