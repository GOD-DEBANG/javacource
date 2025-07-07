import java.sql.SQLOutput;
import java.util.Scanner;

public class test6 {
    public static int divisible(int num){
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("It is divisible");
        }
        else{
            System.out.println("It is not divisible");   //Check if a number is divisible by both 3 and 5.
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = divisible(num);
        sc.close();
    }
}
