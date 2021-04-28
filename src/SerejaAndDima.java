import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int numOfCards = Integer.parseInt(sc.nextLine());
        String[] arrCards =  sc.nextLine().split(" ");

        solve(numOfCards, arrCards);
    }
    public static void solve(int numOfCards, String[] arrCards){
        ArrayList<Integer> cards = new ArrayList<>();
        int turn = 1;
        int girls = 0;
        int boys = 0;
        for(int i = 0; i < numOfCards; i++){
            cards.add(Integer.parseInt(arrCards[i]));
        }
        for(int i = 0; i < numOfCards; i++){
            if(turn == 1){
                if(cards.get(0) < cards.get(cards.size()-1)){
                    girls += cards.remove(cards.size()-1);
                }else{
                    girls += cards.remove(0);
                }
                turn = 2;
            }else{
                if(cards.get(0) < cards.get(cards.size()-1)){
                    boys += cards.remove(cards.size()-1);
                }else{
                    boys += cards.remove(0);
                }
                turn = 1;
            }
        }
        System.out.println(girls+" "+boys);
    }

}
