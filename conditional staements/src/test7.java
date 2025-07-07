import java.util.Scanner;

public class test7 {
    public static void check(char ch){
        if(ch == '1' && ch == '2' && ch == '3'){
            System.out.println("It is number");
        } else if (ch == 'a' || ch == 'e' || ch =='i'||ch == 'o' || ch =='u') {
            System.out.println("It is vowel");
        }
        else if (ch != 'a' || ch != 'e' || ch !='i'||ch != 'o' || ch !='u') {
            System.out.println("It is consonent");
        }
        else if(ch == '@' || ch == '#' || ch == '$' || ch == '^' || ch == '*'){
            System.out.println("It is special cheracter");  //Check whether a character is a vowel, consonant, digit, or special character.
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(0);
        check(num);
        sc.close();
    }
}
