import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char[] chars = word.toCharArray();
        int lower = 0;
        int upper = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i]>=(char)97 && chars[i]<=(char)122){
                lower++;
            }else{
                upper++;
            }
        }
        if(lower>= upper){
            System.out.println(word.toLowerCase());
        }else{
            System.out.println(word.toUpperCase());
        }
    }
}