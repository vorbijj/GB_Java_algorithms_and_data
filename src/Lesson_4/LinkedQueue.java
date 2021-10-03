package Lesson_4;

public class LinkedQueue<T> {
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void insert(T item) {
        list.insertLast(item);
    }

    public T remove() {
        return list.removeFirst();
    }

    public T peekFront() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public int indexOf(T item) {
        return list.indexOf(item);
    }

}
