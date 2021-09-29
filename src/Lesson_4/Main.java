package Lesson_4;

public class Main {
    public static void main(String[] args) {

        LinkedQueue<Integer> lq = new LinkedQueue<>();

        lq.insert(5);
        lq.insert(6);
        lq.insert(78);
        lq.insert(89);
        lq.insert(101);

        System.out.println(lq);
        System.out.println("Удалили " + lq.remove());
        System.out.println("Удалили " + lq.remove());

        lq.insert(207);

        System.out.println(lq);
        System.out.println("Размер " + lq.size());
        System.out.println("Первый элемент " + lq.peekFront());

    }
}
