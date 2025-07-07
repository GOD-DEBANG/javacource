public class test3 {
    public static int bineary(int arr[] , int terget , boolean firstindex){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start <= end){
           int mid = start + (end-start)/2;
           if(terget < arr[mid]){
               end = mid - 1;
           } else if (terget > arr[mid]) {
               start = mid+1;
           }
           else{
                result = mid;
               if (firstindex) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }

           }
        }
        return result;
    }
    public static int search(int arr[] , int terget){
        int first = bineary(arr , terget , true);
        int last = bineary(arr , terget , false);
        int result = last - first +1;

        if(first == -1){
            return 0;
        }
        else{
            return result;
        }


    }
    public static void main(String[] args){
        int arr[] = {2, 4, 4, 4, 6, 6};
        int terget = 4;
        System.out.println(search(arr, terget));
    }
}
