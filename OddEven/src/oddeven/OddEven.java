// Find a number if it is odd or even.

package oddeven;
/**
 *
 * @author ankur
 */
import java.lang.*;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        int num;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is odd.");
        }
    }
    
}
