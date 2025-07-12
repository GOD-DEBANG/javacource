

import java.util.Scanner;

public class test1 {
    public static int multiply(int a , int b){
        int result = 1;
        if(a == 0 || b == 0){
            System.out.println("Cant multiply by zero");
            return 0;
        }
        else if(a < 0 || b < 0){
            System.out.println("Cant multiply negative numbers");
            return -1;
        }
        else{
            System.out.println("Multiplying " + a + " and " + b);
        }
        int i = a;
        while(i <= 10){
            result = result*i;
            i++;
        }
        int j = b;
        while(j <= 10){
              result = result*j;
             j++;
        }
        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to multiply:");
        int a = sc.nextInt();
        System.out.println("Enter a number to multiply:");
        int b = sc.nextInt();
        int result = multiply(a, b);
        System.out.println("Result: " + result);
        sc.close();
    }
}
    

