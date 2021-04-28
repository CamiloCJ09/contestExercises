import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bears = sc.nextLine().split(" ");
        solve(bears);

    }
    public static void solve(String[] bears){
        int b1 = Integer.parseInt(bears[0]);
        int b2 = Integer.parseInt(bears[1]);
        int years = 0;
        while(b1 <= b2){
            b1 = b1*3;
            b2 = b2*2;
            years++;
        }
        System.out.println(years);
    }
}
