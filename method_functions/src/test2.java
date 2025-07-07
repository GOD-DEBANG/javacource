import java.util.Scanner;

public class test2 {
    public static int check(int a ){
        int sum = 0;
        for(int i =0; i <= a; i++){           //sum of numbers
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = check(a);
        System.out.println(result);
        sc.close();
    }
}
