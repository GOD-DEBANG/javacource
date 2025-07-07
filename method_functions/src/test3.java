import java.util.Scanner;

public class test3 {
    public static int prime(int a ){
        int count =0;
        for(int i = 1; i<=a; i++){
            if(a % i == 0){
                count ++;
            }
        }  //prime no
            if( count == 2){
                System.out.println(" prime");
            } else  {
                System.out.println("Not prime");
            }

        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = prime(num);
        System.out.println(result);
        sc.close();

    }
}
