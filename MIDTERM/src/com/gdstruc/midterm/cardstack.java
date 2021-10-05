package com.gdstruc.midterm;
import java.util.Random;
import java.util.EmptyStackException;

public class cardstack {
    private card[] stack;
    private int top;

    public cardstack(int cpacity)
    {
        stack = new card[cpacity];
    }
    public void push(card player)
    {
        if (top == stack.length)
        {
            card[] newstack = new card[2 * stack.length];

            System.arraycopy(stack, 0,newstack, 0,stack.length);
            stack = newstack;
        }
        stack[top++] = player;
    }
    public card pop()
    {
if(isEmpty())
{
    throw new EmptyStackException();
}
card poppedPlayer = stack[--top];
stack[top] = null;
return poppedPlayer;
    }
    public card peek()
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
