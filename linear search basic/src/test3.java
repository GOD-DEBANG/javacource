public class test3 {
    public static int searchinrange(int arr[] , int target , int start , int end){
        for(int i = start; i<=end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }         // search in range
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,10000,100,2000,12,100};
        int start = 0;
        int end = 7;
        int target = 10000;
        int result = searchinrange(arr, target, start, end);
        System.out.println(result);
    }
}
