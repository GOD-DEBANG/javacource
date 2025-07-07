public class test {
    public static int linearsearch(int arr[] , int terget){
        if(arr.length == terget){
            return -1;
        }
        else{
            for(int index =0; index<arr.length; index++){
                int element = arr[index];
                if(terget == arr[index]){
                    return index;
                }                     // linear search
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {200,300,400,500,600,100000,10,40};
        int terget = 600;
        int result = linearsearch(arr , terget);
        System.out.println(result);

    }
}
