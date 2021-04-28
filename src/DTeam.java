import java.util.Scanner;

public class DTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = Integer.parseInt(sc.nextLine());

        int solucion = 0;
        int i = 0;
        while(i < numCases){
            String[] team = sc.nextLine().split(" ");
            solucion += solve(team);
            i++;
        }
        System.out.println(solucion);
    }
    public static int solve(String[] team){
        int ret = 0;
        int count = 0;
        int[] intTeam = new int[team.length];
        for(int i = 0; i < intTeam.length; i++){
            intTeam[i] = Integer.parseInt(team[i]);
        }
        for(int i = 0; i < intTeam.length; i++){
            if(intTeam[i]>0){
                count++;
            }
        }
        if(count>= 2){
            ret = 1;
        }
        return ret;
    }
}
