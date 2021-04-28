import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int columns = Integer.parseInt(sc.nextLine());
        String[] numCubes = sc.nextLine().split(" ");

        solve(columns, numCubes);

    }
    public static void solve(int columns, String[] numCubes){
        int[] cubes = new int[numCubes.length];
        for(int i = 0; i < columns; i++){
            cubes[i] = Integer.parseInt(numCubes[i]);
        }
        for(int i = 0; i < cubes.length; i++){
            int min = cubes[i];
            for( int j = i+1; j < cubes.length; j++){
                if(cubes[j] < min){
                    int temp = cubes[j];
                    cubes[j] = min;
                    min = temp;
                }
            }
            cubes[i] = min;
        }
        for(int i = 0; i < cubes.length; i++){
            System.out.print(cubes[i]+" ");
        }
    }
}
