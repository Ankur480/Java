package apseries;
import java.util.*;

public class APseries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of terms in series: ");
        int term=sc.nextInt();
        
        System.out.println("Enter the first term: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the common difference: ");
        int d = sc.nextInt();
        
        int series=0;
        for (int i=0; i<term; i++)
        {
            series = a + i*d;
            System.out.print(series+" ");
        }
        System.out.println("\n");
    }
    
}
