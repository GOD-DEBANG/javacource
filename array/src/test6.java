import java.util.Scanner;

public class test6 {
    public static void change(int arr[] , int index, int newvalue){


        if(index < 0 || index > arr.length){
            System.out.println(" Invalid cheracter");
        }
        else{
            arr[index] = newvalue;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to change: ");
        int index = sc.nextInt();
        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();
        change(arr,index,newValue);
        for(int i=0; i<newValue; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
