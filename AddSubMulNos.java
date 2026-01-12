// Addition, Subtractoin,Multiplication of 2 Numbers
import java.util.*;
public class AddSubMulNos {  
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int b = sc.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;

        System.out.println("Addition of Numbers is : "+c);
        System.out.println("Subtraction of Numbers is : "+d);
        System.out.println("Multiplication of Numbers is : "+e);
    }
}
