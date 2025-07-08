import java.util.Scanner;

public class test1 {
     public static void check(int a ){
         if(a % 2 == 0){
             System.out.println("Even");
         }
         else{
             System.out.println("odd");
         }
                        //Write a program to check if a number is even or odd.
     }

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         check(a);
         sc.close();
     }

}
