public class test1 {
    public static void selection(int arr[]){
       for(int i =0; i<arr.length; i++){
        int last = arr.length-i-1;
        int max = maxindex(arr, 0, last);
        swap(arr, max, last);
       }
    }
    public static int maxindex(int arr[], int start, int end){
        int max = start;
        for(int i = start; i<=end; i++){
       if(arr[max] < arr[i]){
        max = i;
       }
        }
        return max;
    
}
static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
    public static void main(String args[]){
        int arr[] = {5, 4, 3, 2, 1};
        selection(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
