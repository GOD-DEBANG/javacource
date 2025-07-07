public class test5 {
    public static int search(int arr[][] , int terget){
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                int element = arr[i][j];
                if(element == terget){
                    return arr[i][j];
                }
            }                 // searching in 2d array
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] arr = {
                {200, 300, 400},
                {500, 600, 100000},
                {10, 40, 60}
        };
        int target = 600;
        int result = search(arr, target);
        System.out.println(result);

    }
}
