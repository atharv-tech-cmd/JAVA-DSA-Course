package scratchofjavalanuage;
import java.util.Scanner;
public class Assignmentoperators {
    public static void main(String[] args) {
        // java code for assignment operators.
        int p = 10 ;
        int q ;
        // = 
        q=p;
        System.out.println(q);
        // +=
        p+=q;// p= p+q, p = 10+10 =20
        System.out.println(p); //20
        p-=q; // p = p-q , p = 20 -10
        System.out.println(p); //10
        p*=q; // p = p*q
        System.out.println(p);// ans = 20
        p/=q ;// p=p/q, p= 100/10
        System.out.println(p);
        p%=q; // p=p%q, p= 10%10=0
        System.out.println(p);
    }
}
