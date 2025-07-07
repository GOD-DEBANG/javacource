public class test {
    public static int binearysearch(int arr[] , int terget){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(terget < arr[mid]){
                end = mid-1;
            } else if (terget > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] =  {200,500,600,700,800,900,1000};
        int terget = 600;
        int result = binearysearch(arr , terget);
        System.out.println(result);
    }
}
