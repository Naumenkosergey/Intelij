package jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Vvedite chislo\n");
            mas[i] = g.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);
    }

    static void step1(int[] mas) {
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }


        }
        System.out.println(min + " " + max);
    }

    static void step2(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];

        }
        double sr = (double) sum / mas.length;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < sr) {
                System.out.println(mas[i]);
            }
        }
    }

    static void step3(int[] mas) {
        int men = mas[0];
        int ind=0;
        for (int i = mas.length-1; i >= 0; i--) {
            if (mas[i] <= men) {
                men=mas[i];
                ind=i;
                System.out.print(ind+" ");
            }

        }


    }

}
