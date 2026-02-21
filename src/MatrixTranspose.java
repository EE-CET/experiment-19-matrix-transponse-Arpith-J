import java.util.Scanner;
public class MatrixTranspose {
        static Scanner sc = new Scanner(System.in);

        public static int[][] arrInput(int n){
                int[][] arr = new int[n][n];
                for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
                return arr;
        }

        public static int[][] matrixSwap(int[][] arr, int n){
                for(int i=0; i<n; i++){
                        for(int j=i+1; j<n; j++){
                                int temp = arr[i][j];
                                arr[i][j] = arr[j][i];
                                arr[j][i] = temp;
                        }
                }
                return arr;
        }
        public static void arrOutput(int[][] arr,int n){
                for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                                System.out.print(arr[i][j]);
                                if(j != n-1){
                                        System.out.print(" ");
                                }
                        }
                if(i != n-1)
                        System.out.println();
                }
        }
        // TODO: Read N
        // TODO: Read the N x N matrix
        // TODO: Transpose the matrix INPLACE (Swap mat[i][j] with mat[j][i])
        // TODO: Print the modified matrix
        
        public static void main(String[] args) {
                int N = sc.nextInt();
                int[][] arr = arrInput(N);
                arr = matrixSwap(arr, N);
                arrOutput(arr, N);
        }
}
