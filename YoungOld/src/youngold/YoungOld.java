package youngold;
import java.util.Scanner;
/**
 *
 * @author ankur
 */
public class YoungOld {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("How old are you?");
        int myage = sc.nextInt();
        
        if (myage <= 25)
        {
            System.out.println("You are young boy!");
        }
        else if (myage > 25 && myage < 40)
        {
            System.out.println("You are mid age guy!");
        }
        else {
            System.out.println("You are old big boy!");
        }
        
    }
    
}
