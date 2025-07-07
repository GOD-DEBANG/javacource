import java.util.Scanner;

public class test8 {
    public static void input(int [][] matrix , Scanner sc){
        System.out.println("Enter inputs : ");
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void add(int [][] matrix , int [][] firstmatrix, int [][] secondmatrix){
        for(int i =0 ; i<firstmatrix.length; i++){
            for(int j =0; j<secondmatrix[0].length; j++){
               matrix[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
            }
        }

    }
    public static void print(int [][] matrix){
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"");
            }                                         // sum of matrices
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int a[][] = new int[row][column];
        int b[][] = new int[row][column];
        int[][] result = new int[row][column];
        input(a, sc);
        input(b,sc);
        add(a, b, result);
        print(result);
        sc.close();
    }
}
