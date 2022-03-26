package stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListStack<T> {

    private LinkedList<T> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(T obj){
        stack.push(obj);
        System.out.println("Added Data to stack");
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        LinkedListStack<String> as = new LinkedListStack<>();
        as.push("Hello");
        as.push("World");
        as.push("!!");
        as.push("How");
        as.push("Are");
        as.push("You");
        as.push("?");

        System.out.println(as);

        System.out.println(as.pop());

        System.out.println("After Pop: "+as);

        System.out.println(as.peek());

        System.out.println("After Peek: "+as);

        System.out.println("LinkedList Stack size: "+as.size());
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "stack=" + stack +
                '}';
    }
}
