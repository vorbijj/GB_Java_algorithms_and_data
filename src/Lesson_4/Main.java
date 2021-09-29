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

        lq.insert(6);
        lq.insert(10);
        lq.insert(5);
        lq.insert(89);
        lq.insert(34);
        lq.insert(42);
        lq.insert(56);

        System.out.println(lq);
        System.out.println("Индекс элемента 6 равен [" + lq.indexOf(6) + "]");
        System.out.println("Индекс элемента 89 равен [" + lq.indexOf(89) + "]");
        System.out.println("Индекс элемента 42 равен [" + lq.indexOf(42) + "]");
        System.out.println("Индекс элемента 57 равен [" + lq.indexOf(57) + "]");


        LinkedQueue<Integer> lq2 = new LinkedQueue<>();
        System.out.println("Второй LinkedQueue " + lq2);
        System.out.println("У второго LinkedQueue индекс элемента 42 равен [" + lq2.indexOf(42) + "]");

    }
}
