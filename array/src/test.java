import java.util.Scanner;

public class test {
   public static int find(int arr[] ){
       int max = arr[0];
       for(int i=1; i< arr.length; i++){
           if(arr[i] > max){
             max = arr[i];
           }
       }                           // find largest no.
       return max;
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array : ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("enter"+n+"elements");
       for(int i =1; i<n; i++){
           arr[i] = sc.nextInt();
       }
       int result = find(arr);
       System.out.println(result);
       sc.close();
   }
}
