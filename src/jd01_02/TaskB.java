package jd01_02;

import java.util.Scanner;

public class TaskB {
    Scanner g = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//        step1();
//        System.out.println("Vvedite nomer mesyaca\n");
//        int h = cin.nextInt();
//        step2(h);
        System.out.println("Vvedite chisla kvadratnogo yravneniya");
        double a = cin.nextInt();
        double b = cin.nextInt();
        double c = cin.nextInt();
        step3(a, b, c);
    }

    static void step1() {
        int mas[][] = new int[5][5];
        int h = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = h + 1;
                h += 1;
            }

        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void step2(int month) {
        String monthString;
        switch (month) {
            case 1:
                monthString = "январь";
                System.out.println(monthString);
                break;
            case 2:
                monthString = "февраль";
                System.out.println(monthString);
                break;
            case 3:
                monthString = "март";
                System.out.println(monthString);
                break;
            case 4:
                monthString = "апрель";
                System.out.println(monthString);
                break;
            case 5:
                monthString = "май";
                System.out.println(monthString);
                break;
            case 6:
                monthString = "июнь";
                System.out.println(monthString);
                break;
            case 7:
                monthString = "июль";
                System.out.println(monthString);
                break;
            case 8:
                monthString = "август";
                System.out.println(monthString);
                break;
            case 9:
                monthString = "сентябрь";
                System.out.println(monthString);
                break;
            case 10:
                monthString = "октябрь";
                System.out.println(monthString);
                break;
            case 11:
                monthString = "ноябрь";
                System.out.println(monthString);
                break;
            case 12:
                monthString = "декабрь";
                System.out.println(monthString);
                break;
            default:
                System.out.println("нет такого месяца");

        }
    }

    static void step3(double a, double b, double c) {
        double x1;
        double x2;
        double discriminant = (b * b - 4 * a * c);
        double koren = Math.sqrt(discriminant);
        if (koren < 0) {
            System.out.println("корней нет");
        } else {
            x1 = (b * (-1) + koren) / (2 * a);
            x2 = (b * (-1) - koren) / (2 * a);
            System.out.println("Первый корень равен " + x1 + "Второй корень равен " + x2);
        }
    }
}
