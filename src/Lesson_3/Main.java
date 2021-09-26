package Lesson_3;

public class Main {
    public static void main(String[] args) {

        MyDeque<Integer> deque = new MyDeque<>();

        deque.insertRear(3);
        deque.insertRear(2);
        deque.removeRear();
        deque.insertRear(6);
        deque.insertFront(7);
        deque.insertFront(4);
        deque.insertRear(9);
        deque.removeFront();
        deque.insertRear(9);
        deque.insertRear(9);
        deque.insertRear(9);
        deque.insertRear(9);
        deque.insertRear(9);
        deque.insertRear(12);

        int x = deque.size();

        System.out.println("Первый в deque, " + deque.peekFront());
        System.out.println("Последний в deque, " + deque.peekRear());

        for (int i = 0; i < x; i++) {
            System.out.println(deque.removeRear());
        }

    }
}
