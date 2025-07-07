import java.util.Arrays;

public class test2 {
    public static int[] search(int arr[] , int terget){
        int first = binerysearch(arr , terget , true);
        int last = binerysearch(arr , terget , false);
        return new int[]{first,last};
    }
    public static int binerysearch(int arr[] , int terget , boolean findFirst){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(terget < arr[mid]){
                end = mid-1;
            } else if (terget > arr[mid]) {
               start = mid + 1;
            }
            else{
              result =  mid;
                if(findFirst) {
                    end = mid - 1; // search on the left side
                }
                else {
                    start = mid + 1; // search on the right side
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int arr[] = {5, 7, 7, 8, 8, 10};
        int terget = 8;
        int[] result = search(arr, terget);
        System.out.println(Arrays.toString(result));

    }
}
