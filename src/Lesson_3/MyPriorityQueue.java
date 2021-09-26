package Lesson_3;

import java.util.EmptyStackException;

public class MyPriorityQueue<T extends Comparable<T>> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int increaseCapacity = DEFAULT_CAPACITY;

    public MyPriorityQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Comparable[capacity];
    }

    public MyPriorityQueue() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public void insert(T item) {
        if (isFull()) {
            reCapacity();
        }
        list[size] = item;
        size++;
        int i = size - 1;
        while (i > 0 && list[i].compareTo(list[i - 1]) > 0) {
            swap(i, i - 1);
            i--;
        }
    }

    public T remove() {
        T temp = peek();
        size--;
        list[size] = null;
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

    private void reCapacity() {
        increaseCapacity *= 2;
        T[] temp = (T[]) new Comparable[increaseCapacity];
        System.arraycopy(list, 0, temp, 0, size);
        list = temp;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
}
