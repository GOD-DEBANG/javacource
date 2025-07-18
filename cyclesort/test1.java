

public class test1 {
    public static void cycle(int arr[]){
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                // swap
                swap(arr, i, correct);
    }
    else{
        i++;
    }
    
}

    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 4};
        cycle(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
            
      
    
