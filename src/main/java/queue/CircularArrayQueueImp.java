package queue;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class CircularArrayQueueImp<T> {

    private T[] queue;
    private int front;
    private int back;

    public CircularArrayQueueImp(int capacity) {
        queue = (T[])new Object[capacity];
    }

    public void add(T obj){
        if(size() == queue.length-1){
            int numItem = size();

            System.out.println("Increasing size to: "+queue.length*2);
            T[] newQueue = (T[])new Object[queue.length*2];
            System.arraycopy(queue,front,newQueue,0,queue.length-front);
            System.arraycopy(queue,0,newQueue,queue.length-front,back);
            queue = newQueue;

            front=0;
            back=numItem;
        }
        queue[back]= obj;
        if(back< queue.length-1){
            back++;
        }
        else back=0;

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
        else if(front==queue.length){
            front=0;
        }
        return data;
    }

    public T peek() {
        if(size()==0) throw new EmptyStackException();

        return queue[front];
    }

    public boolean isEmpty(){
        return back ==0 && front ==0;
    }

    public int size(){
        if(front<=back){
            return back-front;
        }
        return back-front+ queue.length;
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
        CircularArrayQueueImp<String> aq = new CircularArrayQueueImp<>(2);
        aq.add("Hello");
        System.out.println(aq);
        aq.add("World");
        aq.remove();
        System.out.println(aq);
        aq.add("!!");
        aq.remove();
        System.out.println(aq);
        aq.add("How");
        System.out.println(aq.isEmpty());
        System.out.println(aq);
        aq.add("Are");
        aq.remove();
        System.out.println(aq);
        aq.add("You");
        aq.remove();
        System.out.println(aq);
        aq.add("?");
        System.out.println(aq);
        aq.remove();
        System.out.println(aq);

        System.out.println(aq);
    }
}
