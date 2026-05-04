package fibonacciseries;
import java.util.*;

public class Fibonacciseries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of term:");
        int t = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
//        if (t == 1 ){
//            System.out.println("The series is: "+a);
//        }
//        else if (t == 2)
//        {
//            System.out.println("The series is: "+a+" "+b);
//        }
//        else{
            
            for (int i=0;i<t;i++){
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
                
            }
//        }
    }
    
}
