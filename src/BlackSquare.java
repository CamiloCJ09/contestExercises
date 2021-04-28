import java.util.Arrays;
import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strips = sc.nextLine().split(" ");
        String[] moves = sc.nextLine().split("");
        int count = 0;

        for(int i = 0; i < moves.length; i++){
            if(Integer.parseInt(moves[i])==1){
                count += Integer.parseInt(strips[0]);
            }else if(Integer.parseInt(moves[i])==2){
                count += Integer.parseInt(strips[1]);
            }else if(Integer.parseInt(moves[i])==3){
                count += Integer.parseInt(strips[2]);
            }else{
                count += Integer.parseInt(strips[3]);
            }
        }
        System.out.println(count);
    }
}
