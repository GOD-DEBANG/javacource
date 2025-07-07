import java.util.Scanner;

public class test8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter your choices : ");
        int choice = sc.nextInt();
        if(choice >= 1 && choice <= 4){
            System.out.println("your choice is processing");
        }
        else{
            System.out.println("Invalid choice , cant be processed");
        }
        switch(choice){
            case 1: int result = num1+num2;
                System.out.println(result);
            break;
            case 2: int result1 = num1-num2;
                System.out.println(result1);
            break;
            case 3: int result2 = num1*num2;
                System.out.println(result2);
            break;
            case 4: int result3 = num1/num2;
                System.out.println(result3);
            break;
            default :
                break;

        }
    }
}
