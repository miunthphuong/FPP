package Prob1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields
    public ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public ArrayQueueImpl(int capacity) {
        arr = new Integer[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[front];
    }

    public void enqueue(int obj){
        if (size == arr.length) {
            resize();
        }
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }
        Integer obj = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return obj;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private void resize(){
        Integer[] newArr = new Integer[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }

    /* Return data in this format, each element separated by comma with in [ ] eg: [10, 20, 30, 40, 50, 60 ]*/
    public String toString(){
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += arr[(front + i) % arr.length];
            if (i < size - 1)
                result += ", ";
        }
        result += " ]";
        return result;
    }
}
