package Lesson_3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String strInput = in.nextLine();
        String strOut = getReverseString(strInput);
        System.out.println();
        System.out.println("Перевернутая строка:");
        System.out.println(strOut);

        in.close();
    }

    public static String getReverseString(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        return strBuilder.reverse().toString();
    }
}
