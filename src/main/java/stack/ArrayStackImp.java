package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStackImp<T> {

    private T[] stack;
    private int top;

    public ArrayStackImp(int capacity) {
        stack = (T[])new Object[capacity];
    }

    public void push(T obj){
        if(stack.length == top){
            System.out.println("Increasing size to: "+stack.length*2);
            T[] newStack = (T[])new Object[stack.length*2];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;
        }
        stack[top++]= obj;
        System.out.println("Added Data to stack");
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();

        T data = stack[--top];
        stack[top] = null;

        return data;
    }

    public T peek() {
        if(isEmpty()) throw new EmptyStackException();

        return stack[top-1];
    }

    public boolean isEmpty(){
        return top ==0;
    }

    public int size(){
        return top;
    }

    public static void main(String[] args) {
        ArrayStackImp<String> as = new ArrayStackImp<>(1);
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

        System.out.println("Array Stack size: "+as.size());
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
