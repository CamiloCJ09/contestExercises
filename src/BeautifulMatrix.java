import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            String row = sc.nextLine();
            String[] aux = row.split(" ");
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = Integer.parseInt(aux[j]);
            }
        }
        int x = 0;
        int y = 0;
        int moves = 0;

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if(matrix[i][j] == 1){
                    x = i;
                    y = j;
                }
            }
        }
        while (x != 2 || y != 2){
            if(x != 2){
                if(x > 2){
                    x--;
                }else{
                    x++;
                }
                moves++;
            }else if(y != 2){
                if(y > 2){
                    y--;
                }else{
                    y++;
                }
                moves++;
            }
        }
        System.out.println(moves);
    }
}
