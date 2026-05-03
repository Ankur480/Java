package armstrong;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        
        int temp=num;
        double sum=0;
        double rem;
        while (temp!=0)
        {
            rem = temp % 10;
            sum = sum + Math.pow(rem, 3);
            temp = temp/10;
        }
        
        if(num==sum)
            System.out.println("The given number is armstrong number.");
    }
    
}
