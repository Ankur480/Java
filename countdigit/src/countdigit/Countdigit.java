package countdigit;
import java.util.*;
public class Countdigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=0, r;
        int temp=num;
        while(temp!=0){
            r = temp%10;
            temp=temp/10;
            i++;
        }
        System.out.println("Number of digit in the number "+num+" is "+i);
    }
    
}
