import java.util.Scanner;

public class test7 {
    public static void print(int [][] matrix){

        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void input(int [][] matrix , Scanner sc){

        for(int i =0; i<matrix.length; i++){ // print 2d matrix
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows :");
        int rows = sc.nextInt();
        System.out.println("Enter column :");
        int column = sc.nextInt();

        int[][] matrix = new int[rows][column];
        input(matrix,sc);
        print(matrix);
        sc.close();
    }
}
