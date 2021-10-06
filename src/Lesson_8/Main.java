package Lesson_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        map.put(2, "two");
        map.put(10, "ten");
        map.put(33, "thirty-three");

        System.out.println(map.contains(2));
        System.out.println(map.get(2));
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            map.put(random.nextInt(100), "");
        }

        System.out.println(map);
        System.out.println("Размер map равен " + map.size());
        System.out.println(map.remove(2));
        System.out.println(map.remove(-1));
        System.out.println(map.remove(33));
        System.out.println(map);
        System.out.println("Размер map после удаления элемента(-ов) равен " + map.size());

    }
}
