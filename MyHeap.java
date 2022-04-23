package com.company;

public class MyHeap<T extends Comparable<T>> {
    MyArrayList<T> arr = new MyArrayList<>();
    private int parent = 0;
    private int child = 0;
    private int left = 0;
    private int right = 0;
    private T root;

    MyHeap(){
        this.root = arr.get(parent);
    }

    public void add(T item){
        arr.add(item);
        if(item.compareTo(root) > 0){
            right = 2 * arr.indexOf(root) + 1;
            item = arr.get(right);
        }else{
            left = 2 * arr.indexOf(root);
            item = arr.get(left);
        }
    }

    public T removeRoot(){
        if(arr.get(left).compareTo(arr.get(right)) > 0){
            root = arr.get(left);
        }
        else{
            root = arr.get(right);
        }

        return root;
    }

    public boolean remove(T item){
        if(arr.remove(item) == true){
            return true;
        }else {
            return false;
        }
    }

    private void heapify(){
        T x = arr.get(left);
        while(root.compareTo(x) < 0){
            T temp = arr.get(left);
            x = root;
            root = temp;

            x = root;
        }
    }

}
