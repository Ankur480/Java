package gpseries;
import java.util.*;

public class GPseries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of terms in series: ");
        int t=sc.nextInt();
        
        System.out.println("Enter the first term: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the common ratio: ");
        int r = sc.nextInt();
        
        int term=a;
        for (int i=0; i<t; i++)
        {
            System.out.print(term+" ");
            term = term * r;
        }
        System.out.println("\n");
    }
    
}
