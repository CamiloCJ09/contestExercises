import java.util.ArrayList;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        solve(n);
    }
    public static void solve(String n){
        String name = n;
        String contains = "";
        int letters = 0;

        for(int i = 0; i<name.length(); i++){
            if(!contains.contains(String.valueOf(name.charAt(i)))){
                contains += name.charAt(i);
                letters++;
            }
        }
        if(letters % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
