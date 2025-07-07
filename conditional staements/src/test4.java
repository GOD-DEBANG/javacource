import java.util.Scanner;

public class test4 {
    public static int check(int num){
        if(num < 1){
            System.out.println("It is negative");
        } else if (num > 1) {
            System.out.println("It is positive");

        }
        else{
            System.out.println("It is 0");     // Check whether a number is positive, negative, or zero.
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = check(num);
        sc.close();
    }
}
