import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class AntonAndDanik {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String sNumOfGames = sc.nextLine();
        String[] iNumOfGames = sNumOfGames.split(" ");
        int numOfGames = Integer.parseInt(iNumOfGames[0]);
        String games = sc.nextLine();
        games = games.toUpperCase();
        games = games.replace(" ","");
        //System.out.println(games);
        String[] gamesArray = games.split("");
        System.out.println(solve(numOfGames, gamesArray));
    }
    public static String solve(int numOfGames, String[] gamesArray){
        String ret = "";
        int anton = 0;
        int danik = 0;
        for(int i = 0; i < numOfGames; i++){
            //System.out.println(gamesArray[i]);
            if(gamesArray[i].equals("A")){
                //System.out.println("Holi");
                anton++;
            }else if(gamesArray[i].equals("D")){
                //System.out.println("Hey");
                danik++;
            }
        }
        if(anton > danik){
            ret = "Anton";
        }else if(danik > anton){
            ret = "Danik";
        }else{
            ret = "Friendship";
        }
        return ret;
    }

}
