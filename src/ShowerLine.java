import java.util.Scanner;

public class ShowerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        String line4 = sc.nextLine();
        String line5 = sc.nextLine();

        String[][] matrix = new String[5][5];
        matrix[0] = line1.split(" ");
        matrix[1] = line2.split(" ");
        matrix[2] = line3.split(" ");
        matrix[3] = line4.split(" ");
        matrix[4] = line5.split(" ");

        int maxSum = 0;

        for(int a = 0; a<5; a++){
            for (int b = 0; b<5; b++){
                for (int c = 0; c<5; c++){
                    for (int d = 0; d<5; d++){
                        for (int e = 0; e<5; e++){
                            int maxefiencicy = getEficiency(matrix, a, b , c, d , e);
                            if(maxefiencicy > maxSum && (a != b && a!=c && a!=d && a != e) && (b != c && b != d && b != e) && (c != d && c!= e) && (d != e)){
                                maxSum = maxefiencicy;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxSum);
    }

    public static int getEficiency(String[][] matrix, int first, int second, int third, int fourt, int fifth){
        int eficiency = 0;
        eficiency += Integer.parseInt(matrix[first][second]) +
                Integer.parseInt(matrix[second][first]) + Integer.parseInt(matrix[third][fourt]) + Integer.parseInt(matrix[fourt][third]) +
                Integer.parseInt(matrix[second][third]) + Integer.parseInt(matrix[third][second]) + Integer.parseInt(matrix[fourt][fifth]) + Integer.parseInt(matrix[fifth][fourt]) +
                Integer.parseInt(matrix[third][fourt]) + Integer.parseInt(matrix[fourt][third]) + Integer.parseInt(matrix[fourt][fifth]) + Integer.parseInt(matrix[fifth][fourt]);
        return eficiency;
    }


}
