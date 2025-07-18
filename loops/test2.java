public class test2 {
    public static void sum(int arr[]){
        for(int i = 0; i<arr.length; i++){
             arr[i] = arr[i]+1;
            }
        }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array before sum:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        
        sum(arr);
        
        System.out.println("Array after sum:");
        for(int i : arr){
            System.out.print(i + " ");
    }
}
}

    

