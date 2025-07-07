import java.util.Scanner;

public class test5 {
    public static double average(int arr[]){
        int add = 0;
        for(int i =0; i<arr.length; i++){
            add = add+arr[i];
        }
        int sum  = add/arr.length;       // find the average
        return sum;

}
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        double result = average(arr);
    System.out.println(result);
    sc.close();
}
}
