package Lesson_3;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int increaseCapacity = DEFAULT_CAPACITY;
    private int begin;
    private int end;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) {
        return (list.length + (index - 1)) % list.length;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque isEmpty");
        }

        return list[begin];
    }

    public T peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque isEmpty");
        }

        return list[end];
    }

    public void insertFront(T item) {
        if (isFull()) {
            reCapacity();
        }
        if (isEmpty()) {
            size++;
            list[begin] = item;
        } else {
            size++;
            begin = previousIndex(begin);
            list[begin] = item;
        }
    }

    public void insertRear(T item) {
        if (isFull()) {
            reCapacity();
        }
        if (isEmpty()) {
            size++;
            list[end] = item;
        } else {
            size++;
            end = nextIndex(end);
            list[end] = item;
        }
    }

    public T removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque isEmpty");
        }
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque isEmpty");
        }
        T temp = peekRear();
        size--;
        list[end] = null;
        end = previousIndex(end);
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void reCapacity(){
        increaseCapacity *= 2;
        int r = size - begin;
        T[] temp = (T[]) new Object[increaseCapacity];
        System.arraycopy(list, begin, temp, 0, r);
        System.arraycopy(list, 0, temp, r, begin);
        list = temp;
        begin = 0;
        end = size - 1;
    }

}
