import java.util.Scanner;

public class test2 {
    public static int leapyear(int num){
        if(num % 4 == 0  && num % 100 != 0|| num % 400 == 0){
            System.out.println("It is leap year");
        }
        else{     //Write a program to check if a given year is a leap year.
            System.out.println("It is not leap year");
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int year = leapyear(num);
        sc.close();
    }
}
