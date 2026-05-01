package daynumber;
import java.util.*;

public class Daynumber {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day number:");
        int day=sc.nextInt();
        
        if (day%7==0)
        {
            System.out.println("Today is Sunday.");
        }
        else if (day%7==1)
        {
            System.out.println("Today is Monday");
        }
        else if (day%7==2)
        {
            System.out.println("Today is Tuesday");
        }
        else if (day%7==3)
        {
            System.out.println("Today is Wednesday");
        }
        else if (day%7==4)
        {
            System.out.println("Today is Thursday");
        }
        else if (day%7==5)
        {
            System.out.println("Today is Friday");
        }
        else if (day%7==6)
        {
            System.out.println("Today is Saturday");
        }
        else
        {
            System.out.println("Enter a valid date.");
        }
    }
    
}
