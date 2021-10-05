package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.ListIterator;

public class lnklst {
    private LinkedList<class1> stack;
    public lnklst()
    {
       stack = new LinkedList<class1>() ;
    }
    public void push(class1 player)
    {
        stack.push(player);
    }
    public boolean isEmpty()
    {

        return stack.isEmpty();
    }
    public class1 pop()
    {
      return stack.pop();
    }
        public class1 peek()
        {
            return stack.peek();
        }
        public void printStack()
{

    ListIterator<class1> iterator= stack.listIterator();
    while (iterator.hasNext())
    {
        System.out.println(iterator.next());
    }
}
}

