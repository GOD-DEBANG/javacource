public class test2 {
    public static int string(char arr[] , char terget){


            for(int index = 0; index<arr.length; index++){
                int element = arr[index];
                if(terget == element){
                    return index;     // search in strings
                }
            }

        return -1;
    }
    public static void main(String[] args){
        char arr[] = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g'};
        char terget = 'c';
        int result = string(arr , terget);
        System.out.println(result);
    }
}
