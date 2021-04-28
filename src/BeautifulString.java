import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean found = true;
        String[] cases = new String[t];
        String[] notBeautiful = new String[t];
        sc.nextLine();
        for(int i=0; i<t; i++) {
            cases[i]= sc.nextLine();
        }
        int p=1;
        for(int j=0;j<t;j++) {
            char[] eachL= cases[j].toCharArray();
            found=true;
            if(eachL.length!=1) {
                for(int i=0; i<eachL.length && found;i++) {
                    if(eachL[i]>=97 && eachL[i]<=99 || eachL[i]==63) {
                        if(eachL[0]==63) {
                            if(eachL[i+1]!=97 ) {
                                eachL[0]=97;
                            }else if(eachL[i+1]!=98) {
                                eachL[0]=98;
                            }else {
                                eachL[0]=99;
                            }
                        }
                        if (eachL[i]==63) {
                            if(eachL[i-1]!=97 && eachL[i+1]!=97 ) {
                                eachL[i]=97;
                            }else if(eachL[i-1]!=98 && eachL[i+1]!=98) {
                                eachL[i]=98;
                            }else {
                                eachL[i]=99;
                            }
                        }
                        if(eachL[eachL.length-1]==63) {
                            if(eachL[eachL.length-2]!=97 ) {
                                eachL[eachL.length-1]=97;
                            }else if(eachL[eachL.length-2]!=98) {
                                eachL[eachL.length-1]=98;
                            }else {
                                eachL[eachL.length-1]=99;
                            }
                        }
                        if(i!=0) {
                            if(eachL[i]==eachL[i-1]) {
                                notBeautiful[j]="-1";
                                found = false;
                            }
                        }
                    }else {
                        p=0;
                    }
                }
                if(notBeautiful[j]!="-1") {
                    notBeautiful[j]=String.valueOf(eachL);
                }if(p!=0) {
                    System.out.println(notBeautiful[j]);
                }
            }else {
                if(eachL[0]!=98 && eachL[0]!=99) {
                    eachL[0]=97;
                }else if(eachL[0]!=97 && eachL[0]!=99) {
                    eachL[0]=98;
                }else {
                    eachL[0]=99;
                }
                System.out.print(eachL[0]);
            }
            System.out.println();
        }
    }
}
