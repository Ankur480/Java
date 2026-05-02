package digitnumber;
import java.util.*;

public class Digitnumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rem;
        while(num!=0)
        {
            rem = num%10;
            System.out.println(rem);
            num=num/10;
        }
    }
    
}
