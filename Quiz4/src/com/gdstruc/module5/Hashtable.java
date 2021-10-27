package com.gdstruc.module5;

import java.util.NoSuchElementException;

public class Hashtable {
    private storedplayer[] hashtable;
    public Hashtable()
    {
hashtable = new storedplayer[20];

    }
    private int hashkey(String key)
    {
        return key.length()%hashtable.length;
    }
public void put(String key, PLayer value)
{

    int hashedkey = hashkey(key);
    if (isOccupied(hashedkey))
    {
int stopindex = hashedkey;
if (hashedkey== hashtable.length-1)
{
    hashedkey = 0;
}
else
{hashedkey++;}
while (isOccupied(hashedkey) && hashedkey != stopindex)
{
hashedkey = (hashedkey + 1) % hashtable.length;
}
    }
    if (isOccupied(hashedkey))
    {
        System.out.println("There is already someone at " + hashedkey);
    }
    else
    {
        hashtable[hashedkey] = new storedplayer(key,value);
    }

}
public PLayer get(String key)
{
    int hashedkey = findkey(key);
    if(hashedkey == -1)
    {
        return null;
    }
    return hashtable[hashedkey].value;
}
private int findkey(String key)
{
int hashedkey = hashkey(key);
if (hashtable[hashedkey] != null&& hashtable[hashedkey].key.equals(key))
{
return  hashedkey;
}

    int stopindex = hashedkey;
    if (hashedkey == hashtable.length - 1) {
        hashedkey = 0;
    } else {
        hashedkey++;
    }
    while (hashedkey != stopindex && hashtable[hashedkey] != null && !hashtable[hashedkey].key.equals(key)) {
        hashedkey = (hashedkey + 1) % hashtable.length;
    }
if (hashtable[hashedkey] != null && hashtable[hashedkey].key.equals(key))
{
return  hashedkey;
}
return  -1;
}
private boolean isOccupied(int index)
{
return  hashtable[index] != null;
}
public PLayer revove(String key)
{
    int hashedkey = findkey(key);
    if(hashedkey == -1)
    {

    }
    else {
        hashtable[hashedkey] = null;
    }
return null;

}

public void printtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            if (hashtable[i] != null) {
                System.out.println("Element " + i + " " + hashtable[i].value );
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }
}

