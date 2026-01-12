import java.util.*;
public class AverageOfNos {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2st Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3st Number : ");
        int c = sc.nextInt();

        float avg = (a+b+c) /3f;
        System.out.println("The average of these 3 Numbers are : "+avg);
    }
}
