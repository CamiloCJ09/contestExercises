import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        line1 = line1.replaceAll(" ", "");
        String line2 = sc.nextLine();
        line2 = line2.replaceAll(" ", "");
        if(line1.compareToIgnoreCase(line2)<0){
            System.out.println("-1");
        }else if (line1.compareToIgnoreCase(line2)>0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
