import java.util.Scanner;

public class test1 {
    public static int sum(int num1 , int num2){
        int result = num1+num2; //sum of two numbers
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sum(num1,num2);
        System.out.println(sum);
        sc.close();
    }
}
