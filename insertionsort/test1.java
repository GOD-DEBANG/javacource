

public class test1 {
    public static void insertionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
          for(int j =i+1; j>0; j--){
            if(arr[j] < arr[j-1]){
                swap(arr, j, j-1);
            }
            else{
                break; // No need to continue if the current element is in the correct position
            }
          }
        }
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int arr[] = {55, -4, 33, 52, 100};
        
        insertionsort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
