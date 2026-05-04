package maxelement;

public class Maxelement {

    public static void main(String[] args) {
        int A[] = {2,6,7,3,5,12,11,4,8};
        int max=A[0];
        
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("Maximum element is: "+ max);
    }
    
}
