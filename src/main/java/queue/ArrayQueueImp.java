package queue;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayQueueImp<T> {

    private T[] queue;
    private int front;
    private int back;

    public ArrayQueueImp(int capacity) {
        queue = (T[])new Object[capacity];
    }

    public void add(T obj){
        if(queue.length == back){
            System.out.println("Increasing size to: "+queue.length*2);
            T[] newQueue = (T[])new Object[queue.length*2];
            System.arraycopy(queue,0,newQueue,0,queue.length);
            queue = newQueue;
        }
        queue[back++]= obj;
        System.out.println("Added Data to Queue");
    }

    public T remove() {
        if(size()==0) throw new NoSuchElementException();

        T data = queue[front];
        queue[front++] = null;

        if(size()==0){
            front=0;
            back=0;
        }
        return data;
    }

    public T peek() {
        if(size()==0) throw new EmptyStackException();

        return queue[front];
    }

    public boolean isEmpty(){
        return back ==0;
    }

    public int size(){
        return back-front;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", front=" + front +
                ", back=" + back +
                '}';
    }

    public static void main(String[] args) {
        ArrayQueueImp<String> aq = new ArrayQueueImp<>(1);
        aq.add("Hello");
        aq.add("World");
        aq.add("!!");
        aq.add("How");
        aq.add("Are");
        aq.add("You");
        aq.add("?");

        System.out.println(aq);

        System.out.println(aq.remove());

        System.out.println("After Remove: "+aq);

        System.out.println(aq.peek());

        System.out.println("After Peek: "+aq);

        System.out.println(aq.remove());

        System.out.println("After Remove: "+aq);

        System.out.println("Array Queue size: "+aq.size());
    }
}
