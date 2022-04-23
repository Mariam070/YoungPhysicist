import java.util.Scanner;
public class Main{

    public String main(int i, double[][] test) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int [] []a = new int[x][3];
        int sumX = 0;
        int sumY = 0;
        int sumZ =0;

        for (i =0 ;i< x ;i++ ) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (i =0;i < x ;i++ ) {
            sumX += a[i][0];
        }
        for (i =0;i<x ;i++ ) {
            sumY += a[i][1];
        }
        for (i =0;i< x ;i++ ) {
            sumZ += a[i][2];
        }
        if (sumX==0 && sumY==0 && sumZ ==0){
            return "YES";
        }
        else {
           return "NO";
        }}

}
