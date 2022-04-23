package com.company;

public class MyQueue<T> {
    MyArrayList<T> arr = new MyArrayList<>();
    private int length = 0;
    private int front = 0;
    private int back = 0;

    public T enqueue(T item){
        arr.add(item);
        back++;
        length++;
        return (T)arr;
    }

    public T dequeue(){
        arr.remove(front);
        back--;
        length--;
        return (T)arr;
    }

    public T peek(){
        return arr.get(back);
    }

    public int size(){
        return back - front;
    }

    public boolean isEmpty(){
        if(back == front){
            return true;
        }
        return false;
    }
}
