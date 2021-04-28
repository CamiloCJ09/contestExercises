import java.util.Arrays;
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firtsLine = sc.nextLine().split(" ");
        int numOfRocks = Integer.parseInt(firtsLine[0]);
        String[] rocks = sc.nextLine().split("");
        int moves = 0;
        for(int i = 1; i < numOfRocks; i++){
            if(numOfRocks == 1){
                System.out.println("0");
            }else{
                if(rocks[i].equals(rocks[i-1])){
                    moves++;
                }
            }

        }
        System.out.println(moves);
    }
}
