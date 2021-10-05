package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.ListIterator;

public class lnklst {
    private LinkedList<card> stack;
    public lnklst()
    {
       stack = new LinkedList<card>() ;
    }
    public void push(card player)
    {
        stack.push(player);
    }
    public boolean isEmpty()
    {

        return stack.isEmpty();
    }
    public card pop()
    {
      return stack.pop();
    }
        public card peek()
        {
            return stack.peek();
        }
        public void printStack()
{

    ListIterator<card> iterator= stack.listIterator();
    while (iterator.hasNext())
    {
        System.out.println(iterator.next());
    }
}
}

