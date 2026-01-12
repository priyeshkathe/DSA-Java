import java.util.*;
public class AreaOfSquare {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height of Square : ");
        int height = sc.nextInt();

        int area = height*height;

        System.out.println(area);
    }
}
