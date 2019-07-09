package lib;

import java.util.ArrayList;

/**
 * Created by Tianshu on 11/5/17.
 * Implement Stack using Array
 */
public class Stack<T> {
    private ArrayList<T> list;
    private int size = 0;

    public Stack()
    {
        this.size = 0;
        this.list = new ArrayList();
    }

    public void Push(T element){
        list.add(element);
        size++;
    }

    public void Pop()
    {
        if(!IsEmpty())
        {
            list.remove(size-1);
            size--;
        }
        else
        {
            System.out.println("Stack has 0 element.");
        }
    }

    public T Top()
    {
        if(!IsEmpty())
        {
            return list.get(size-1);
        }
        else
        {
            throw new IllegalArgumentException("Stack has 0 element.");
        }

    }

    public int GetSize(){
        return this.size;
    }

    public boolean IsEmpty(){
        return size == 0;
    }
}
