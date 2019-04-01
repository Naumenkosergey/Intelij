package jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        step1(n);
        System.out.println(step1(n));


    }

    public static int[][] step1(int n) {
        int mas[][] = new int[n][n];
        int col=0;
        Random random = new Random();
        while (true) {
            col++;
            boolean min = false;
            boolean max = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mas[i][j] = random.nextInt()%(2*n)-n;
                    System.out.print(mas[i][j] + " ");
                    if (mas[i][j]==n)
                        max=true;
                    if (mas[i][j]==-n)
                        min=true;
                }
                System.out.println();
            }
            if (min&&max)
                break;

        }
        System.out.println(col);
        return mas;
    }
}
