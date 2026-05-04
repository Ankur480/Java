package increasesize;

public class Increasesize {

    public static void main(String[] args) {
        int A[] = {8,6,10,9,2};
        int B[] = new int[2*A.length];
        System.out.println("Size of array A is "+A.length);
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        System.out.println("Size of array A is "+A.length);
        for(int j=0;j<A.length;j++){
            System.out.print(A[j]+" ");
        }
    }
    
}
