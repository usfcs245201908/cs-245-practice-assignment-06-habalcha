import java.util.*;
public class ArrayStack<T> implements Stack<T>{
    protected int top;
    protected T[] a;
    protected T hold;

    public void push (T item){
        if (a.length-1 == top){
            growArray();
        }
        a[++top] = item;
    }

    public T pop(){
        if (empty()) {
            new Exception("Stack is empty.");
        }
        return a[top--];
    }

    public T peek(){
        if (empty()){
            new Exception("Stack is empty.");
        }
        return a[top];
    }

    public boolean empty(){
        if(top == -1) {
            return true;
        }
        return false;
    }

    public void growArray(){
        ArrayStack<T> duplicate = new ArrayStack<T>();
        T[] new_a = (T[]) new Object[a.length*2];
        new_a = Arrays.copyOfRange(a, 0, a.length, new_a);
        a = new_a;
    }
}
