import java.util.Scanner;
public class test3 {
    public static int sum(int arr[]){

        int add = 0;
        for(int i =0; i<arr.length; i++){
             add = add+arr[i];
        }                     // sum of all element
        return add;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = sum(arr);
        System.out.println(result);
        sc.close();

    }
}
