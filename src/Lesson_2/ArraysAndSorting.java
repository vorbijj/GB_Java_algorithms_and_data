package Lesson_2;

import java.util.Arrays;
import java.util.Random;

public class ArraysAndSorting {
    public static Random random = new Random();

    public static void main(String[] args) {
        int size = 100_000;
        int n = 100;
        int[] arrayMaster = new int[size];

        for (int i = 0; i < arrayMaster.length; i++) {
            arrayMaster[i] = random.nextInt(n);
        }
//        System.out.println(Arrays.toString(arrayMaster));

        printTimeSortBubble(arrayMaster);
        printTimeSortChoice(arrayMaster);
        printTimeSortInsert(arrayMaster);
    }

    private static void printTimeSortBubble(int[] arrayMaster) {
        long timeStartBubble;
        long timeEndBubble;
        int[] arrayBubble = Arrays.copyOf(arrayMaster, arrayMaster.length);

        //Пузырьковая сортировка
        timeStartBubble = System.currentTimeMillis();
        for (int i = arrayBubble.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayBubble[j] > arrayBubble[j + 1]) {
                    int tmp = arrayBubble[j];
                    arrayBubble[j] = arrayBubble[j + 1];
                    arrayBubble[j + 1] = tmp;
                }
            }
        }
        timeEndBubble = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arrayBubble));
        System.out.println("Пузырьковая сортировка, время работы, мс: " + (timeEndBubble - timeStartBubble));
    }

    private static void printTimeSortChoice(int[] arrayMaster) {
        long timeStartChoice;
        long timeEndChoice;
        int[] arrayChoice = Arrays.copyOf(arrayMaster, arrayMaster.length);

        //Сортировка методом выбора
        timeStartChoice = System.currentTimeMillis();
        for (int i = 0; i < arrayChoice.length; i++) {
            int mark = i;
            for (int j = i + 1; j < arrayChoice.length; j++) {
                if (arrayChoice[j] < arrayChoice[mark]) {
                    mark = j;
                }
            }
            int tmp = arrayChoice[i];
            arrayChoice[i] = arrayChoice[mark];
            arrayChoice[mark] = tmp;
        }
        timeEndChoice = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arrayChoice));
        System.out.println("Сортировка методом выбора, время работы, мс: " + (timeEndChoice - timeStartChoice));
    }

    private static void printTimeSortInsert(int[] arrayMaster) {
        long timeStartInsert;
        long timeEndInsert;
        int[] arrayInsert = Arrays.copyOf(arrayMaster, arrayMaster.length);

        //Сортировка методом вставки
        timeStartInsert = System.currentTimeMillis();
        for (int i = 1; i < arrayInsert.length; i++) {
            int tmp = arrayInsert[i];
            int j = i;
            while (j > 0 && arrayInsert[j - 1] >= tmp) {
                arrayInsert[j] = arrayInsert[j - 1];
                --j;
            }
            arrayInsert[j] = tmp;
        }
        timeEndInsert = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arrayInsert));
        System.out.println("Сортировка методом вставки, время работы, мс: " + (timeEndInsert - timeStartInsert));
    }
}
