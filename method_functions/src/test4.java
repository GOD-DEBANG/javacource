import java.util.Scanner;

public class test4 {
    public static int fibo(int a){
        int first_term = 0;
        int second_term = 1;
        int n_term = 0;
        for(int i = 2; i<=a; i++){
             n_term = first_term + second_term;
            first_term = second_term;
            second_term = n_term;               

        }

        return n_term;  // fibonachi series
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = fibo(a);
        System.out.println(result);
        sc.close();
    }
}
