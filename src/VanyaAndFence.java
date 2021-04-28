import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class VanyaAndFence {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
        String[] values = firstLine.split(" ");
        String[] values2 = secondLine.split(" ");
        int[] intValues = new int[values.length];
        int[] intValues2 = new int[values2.length];
        for(int i = 0; i < values.length; i++){
            intValues[i] = Integer.parseInt(values[i]);
        }
        for(int i = 0; i < values2.length; i++){
            intValues2[i] = Integer.parseInt(values2[i]);
        }
        System.out.println(solve(intValues, intValues2));
    }

    public static int solve(int[] firstLine, int[] friends){
        int ret = 0;
        int length = 0;
        for(int i = 0; i < friends.length; i++){
            if(friends[i]<=firstLine[1]){
                ret += 1;
            }else{
                ret += 2;
            }
        }
        return ret;
    }
}
