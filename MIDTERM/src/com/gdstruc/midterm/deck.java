package com.gdstruc.midterm;

import java.util.EmptyStackException;

public class deck {
    private class1[] stack;
    private int top;
    public deck(int cpacity)
    {
        stack = new class1[cpacity];
    }
    public void push(class1 player)
    {
        if (top == stack.length)
        {
            class1[] newstack = new class1[2 * stack.length];
            System.arraycopy(stack, 0,newstack, 0,stack.length);
            stack = newstack;
        }
        stack[top++] = player;
    }
    public class1 pop()
    {
if(isEmpty())
{
    throw new EmptyStackException();
}
class1 poppedPlayer = stack[--top];
stack[top] = null;
return poppedPlayer;
    }
    public class1 peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public  boolean isEmpty()
    {
        return top ==0;
    }
    public void printstack()
    {

        for (int i = top-1; i>= 0; i--)
        {

System.out.println(stack[i]);
        }
    }
}
