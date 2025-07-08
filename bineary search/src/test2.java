public class test2 {
    public static int oder_agnostic_binarysearch(int arr[] , int terget){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }
         while(start <= end){
             int mid = start +(end - start)/2;
             if(arr[mid] == terget){
                 return mid;
             }
             if(isAsc){
                 if(terget < arr[mid]){
                     end = mid-1;
                 } else  {
                     start = mid+1;                        // oder agnostic binary search
                 }
             }
             else{
                 if(terget > arr[mid]){
                     end = mid-1;
                 } else  {
                     start = mid+1;
                 }
             }
         }
         return -1;
    }
    public static void main(String[] args){
        int arr[] = {10000,100,90,80,70,60,50,40,30,20,10};
        int terget = 80;
        int result = oder_agnostic_binarysearch(arr,terget);
        System.out.println(result);
    }
}

