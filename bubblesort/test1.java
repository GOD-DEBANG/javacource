

public class test1 {
    public static void bubblesort(int arr[]){
        
        
    for(int i=0; i<arr.length; i++){
        boolean swaped = false;
        int nums = arr.length-i;
        for(int j = 1; j< nums; j++){
            if(arr[j] < arr[j-1]){
               swap(j-1, j, arr);
               swaped = true;
            }

        }
        if(swaped == false){
            System.out.println("Array is sorted");
            break;
        }

    } 

    }
    public static void swap(int i , int j , int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        bubblesort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
    }

}
    

