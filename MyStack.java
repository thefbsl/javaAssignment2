package com.company;

public class MyStack<T> {
    MyLinkedList<T> stack = new MyLinkedList<T>();

    private class MyNode<T>{
        T data;
        MyNode<T> next;

        MyNode() {
            this.data = data;
        }
    }

    MyNode top;

    MyStack(){
        this.top = null;
    }

    public T push(T item){
        MyNode temp = new MyNode();
        temp.data = item;
        temp.next = top;
        top = temp;
        return (T)top;
    }

    public T pop(){
        MyNode temp = top;
        top = top.next;
        return (T)temp;
    }

    public T peek(){
        return (T)top.data;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }

    public int size(){
        int count = 0;
        MyNode temp = top;
        while(temp != null){
            count++;
            temp = temp.next;
        };
        return count;
    }

    /*public int size(){
        return stack.size();
    }*/
}

