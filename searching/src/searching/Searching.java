// Searching an element in array
package searching;
import java.util.*;
public class Searching {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int key;
        System.out.println("Which element you want to found? ");
        key=sc.nextInt();
        
        for(int i=0;i<A.length;i++){
            if(A[i]== key){
                System.out.println("Element found at position: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element is not found.");
    }
    
}
