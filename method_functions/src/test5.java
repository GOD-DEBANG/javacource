import java.util.Scanner;

public class test5 {
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }                // swapping of two numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println("Before swap: a = " + a + ", b = " + b);
        sc.close();
    }
}
