import java.util.Scanner;

public class test2 {
    public static int smallest(int arr[]){
        int min = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }                       // find the smallest
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = smallest(arr);
        System.out.println(result);
        sc.close();
    }
}
