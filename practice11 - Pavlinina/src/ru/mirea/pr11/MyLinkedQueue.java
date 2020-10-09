package ru.mirea.pr11;

import java.util.LinkedList;

public class MyLinkedQueue<T> extends MyAbstractQueue<T> {

    public MyLinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public T poll() {
        if (queue == null)
            return null;
        T element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public T peek() {
        return queue == null ? null : queue.get(0);
    }

    @Override
    public boolean offer(T element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }
}