public class test {
    public static int bineary(int arr[] , int terget){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(terget < arr[mid]){
            end = mid-1;
            } else if (terget > arr[mid]) {
            start = mid+1;                        // binary sesarch
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int terget = 6;
        int result = bineary(arr,terget);
        System.out.println(result);

    }
}

