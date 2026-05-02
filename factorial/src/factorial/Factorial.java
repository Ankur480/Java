package factorial;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i=1, fact=1;
        int num=sc.nextInt();
        if (num==0)
        {
            System.out.println("Factorial of 0 is 1");
        }
        else {
            for(;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of "+num+" is "+fact);
        }
    }
    
}
