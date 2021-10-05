package com.gdstruc.module3;

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
queue[back]= player;
back++;



        }
    }
}
