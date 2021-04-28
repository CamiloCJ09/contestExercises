import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();

        if(Character.isLowerCase(words.charAt(0))) {
            words = Character.toUpperCase(words.charAt(0))+ words.substring(1);
        }
        System.out.println(words);
    }
}
