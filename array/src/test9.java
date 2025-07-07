import java.util.Scanner;
public class test9 {

    public static void mutiarray(int arr[][]){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.println("the elements are : ");
                Scanner sc = new Scanner(System.in);
                 arr[i][j] = sc.nextInt();
            }
        }

    }
    public static void sum(int arr[][] ){
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                int sum = 0;
                  sum = sum+arr[i][j];
                System.out.println("Sum of all elements : "+sum);
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        mutiarray(arr);
        sum(arr );
    }
}
