import java.util.Scanner;

public class java6 {
    public static int calculator(int a, int b , int choice) {

        switch (choice) {
            case 1:
                return add(a, b);


            case 2:
                return  diff(a, b);

                                             // calculator programe
            case 3:
                return multiply(a,b);


            case 4:
                if(b == 0){
                    return 0;
                }
                else {
                    return  division(a,b);
                }




        }
        return choice;

    }

    public static int add(int a ,int b){
        int sum = a+b;
        return sum;
    }
    public static int diff(int a , int b){
        int minus = a-b;
        return minus;
    }
    public static int multiply(int a, int b){
        int into = a*b;
        return into;
    }
    public static int division(int a, int b){
        int devide = a/b;
        return devide;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1–4): ");
        int choice = sc.nextInt();

        System.out.println("Enter the 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int b = sc.nextInt();


       if(choice >= 1 && choice <= 4){
            System.out.println("Processing your request");
           int result = calculator(a,b,choice);
           System.out.println(result);
        }
       else{
           System.out.println("Invalid request");
       }



        sc.close();
    }

}
