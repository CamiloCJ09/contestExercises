import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PoliceOfficer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int numOfEvents = Integer.parseInt(sc.nextLine());
        String[] events = sc.nextLine().split(" ");

        solve(numOfEvents, events);

    }
    public static void solve(int numOfEvents, String[] events){
        int[] intEvents = new int[events.length];
        int aviableOfficers = 0;
        int crimes = 0;
        for(int i = 0; i < numOfEvents; i++){
            intEvents[i] = Integer.parseInt(events[i]);
        }

        for(int i = 0; i < numOfEvents; i++){
            if(intEvents[i]>0){
                aviableOfficers += intEvents[i];
            }else if(intEvents[i]<0){
                if(aviableOfficers>0){
                    aviableOfficers--;
                }else{
                    crimes++;
                }
            }
        }
        System.out.println(crimes);
    }
}
