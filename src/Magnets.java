import java.util.ArrayList;
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        int magnets = 1;

        String line = sc.nextLine();

        for(int i = 1; i<amount; i++){
            String line2 = sc.nextLine();
            if(!line.equals(line2)){
                magnets += 1;
            }
            line = line2;
        }
        System.out.println(magnets);
    }
}
