package sumofnumber;
import java.util.*;

public class Sumofnumber {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the number of terms:");
       int n=sc.nextInt();
       int i=1, sum=0;
       for (;i<=n;i++)
       {
           sum+=i;
           
       }
       System.out.println(sum);
    }
    
}
