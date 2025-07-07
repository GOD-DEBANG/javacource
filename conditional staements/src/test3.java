import java.util.Scanner;

public class test3 {
    public static int max(int num1 , int num2){
        if(num1 > num2 ){
            System.out.println("Greater");
        }                                //Write a program to find the largest between two numbers.
        else{
            System.out.println("Smaller");
        }
        return num1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = max(num1 , num2);
        sc.close();
    }
}
