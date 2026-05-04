package matrixmultiplication;

public class Matrixmultiplication {

    public static void main(String[] args) {

        int A[][] = {{1,5,3},{7,3,4},{4,9,2}};
        int B[][] = {{1,5,3},{7,3,4},{4,9,2}};

        if (A[0].length == B.length) {

            int C[][] = new int[A.length][B[0].length];

            for(int i=0; i<A.length; i++) {
                for(int j=0; j<B[0].length; j++) {
                    for(int k=0; k<A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Multiplication is not possible.");
        }
    }
}