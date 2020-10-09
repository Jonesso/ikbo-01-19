package ru.mirea.pr11;

public interface MyQueue<T> {
    T element();
    T poll();
    T peek();
    boolean offer(T element);
}
