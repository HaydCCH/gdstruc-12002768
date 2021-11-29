package com.gdstruc.module5;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PLayer coulson = new PLayer(1, "Coulson", 6);
        PLayer may = new PLayer(2, "May", 9);
        PLayer Daisy = new PLayer(3, "Quake", 6);
        PLayer elena = new PLayer(4, "YoYo", 6);
        PLayer fitz = new PLayer(5, "Fitz", 6);
        PLayer simmons = new PLayer(6, "Simmons", 6);
        Hashtable hashtable= new Hashtable();
        hashtable.put(coulson.getName(), coulson);
        hashtable.put(may.getName(), may);
        hashtable.put(Daisy.getName(), Daisy);
        hashtable.put(elena.getName(), elena);
        hashtable.put(fitz.getName(), fitz);
        hashtable.put(simmons.getName(), simmons);
        hashtable.printtable();
     hashtable.revove("Simmons");
     System.out.println("Here is the list with out Simmons");
     hashtable.printtable();
      
    }
}
