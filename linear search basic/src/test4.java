public class test4 {
    public static int min(int arr[]){
        int ans = arr[0];
        for(int index = 1; index< arr.length; index++){

            if(arr[index] < ans){
                ans = arr[index];
                // return mininum
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {200,30,2,45,82,54,45,90,100,1200,1400,700,800};
        int result = min(arr);
        System.out.println(result);
    }
}
