package Lesson_5;

import java.util.Scanner;

public class NumberDegree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число x которое будем возводить в степень:");
        System.out.print("x=");
        int num = in.nextInt();
        System.out.println("В какую степень n будем возводить:");
        System.out.print("n=");
        int degree = in.nextInt();

        int x = getNumberDegree(num, degree);
        System.out.println("Число " + num + " в степени " + degree + " равно " + x);

        in.close();
    }

    private static int getNumberDegree(int num, int degree) {
        if (degree == 0) {
            return 1;
        }
        return num * getNumberDegree(num, degree - 1);
    }
}
