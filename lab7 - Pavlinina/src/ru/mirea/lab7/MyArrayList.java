package ru.mirea.lab7;

import java.util.*;


public class MyArrayList<T> {
    private Object[] data;
    private int size = 0;
    final private int DEFAULT_SIZE = 16;

    public MyArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalStateException("Размер массива не может быть меньше 0.");
        }
        data = (initialCapacity == 0) ? new Object[DEFAULT_SIZE] : new Object[initialCapacity];
    }

    public MyArrayList(Collection<? extends T> existed) {
        data = existed.toArray();
        size = data.length;
    }

    public MyArrayList(Object[] array) {
        data = array;
        size = data.length;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        checkCapacity();
        data[size++] = element;
    }

    public void add(int index, T element) {
        checkCapacity();
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    public void addAll(MyArrayList<? extends T> list) {
        Object[] addList = list.toArray();
        int numNew = addList.length;
        expandArray(size + numNew);
        System.arraycopy(addList, 0, data, size, numNew);
        size += numNew;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public void remove(int index) {
        if (size - index >= 0) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }
        data[--size] = null;
    }

    private void checkCapacity() {
        if (size >= data.length - 1) {
            expandArray(data.length + DEFAULT_SIZE);
        }
    }

    private void expandArray(int len) {
        Object[] temp = new Object[len];
        System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }

    public Object[] toArray() {
        return Arrays.copyOf(data, size);
    }

    @SafeVarargs
    public static <T> MyArrayList<T> of(T... elements) {
        return new MyArrayList<T>(Arrays.stream(elements).toArray());
    }

    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.stream(data)
                        .filter(Objects::nonNull)
                        .toArray());
    }
}

