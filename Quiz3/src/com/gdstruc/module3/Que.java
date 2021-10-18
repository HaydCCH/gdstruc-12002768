package com.gdstruc.module3;

import java.util.NoSuchElementException;

public class Que {
    private PLayer[] queue;
    private int front;
    private int back;


    public Que(int capacity)
    {
        queue = new PLayer[capacity];

    }
    public void add(PLayer player)
    {
        if (back == queue.length)
        {
            PLayer[] newarray = new PLayer[queue.length * 2];
System.arraycopy(queue,0,newarray,0,queue.length);
queue= newarray;


        }
        queue[back]= player;
        back++;
    }
    public PLayer remove()
    {
if (size() == 0)
{
    throw new  NoSuchElementException();
}
PLayer removedplayer = queue[front];
queue[front]= null;
front++;
if (size() == 0)
{
    front= 0;
    back=0;
}
return removedplayer;
    }
    public PLayer peek()
    {
        if (size()==0)
        {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size()
    {
        return back-front;
    }
    public void printquueue()
    {
        for (int i = front;i< back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}
