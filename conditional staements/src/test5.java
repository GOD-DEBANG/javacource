import java.util.Scanner;

public class test5 {
    public static int calculator(int grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("c");
                                         //Grade Calculator
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("d");
        } else {
            System.out.println("Fail");
        }
        return grade;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = calculator(num);
        sc.close();
    }
    }
