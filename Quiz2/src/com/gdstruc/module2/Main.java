package com.gdstruc.module2;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<linklist> playerList = new ArrayList<>();
        playerList.add(new linklist(1,"Kirito", 100 ));
        playerList.add(new linklist(2,"Asuna", 69 ));
        playerList.add(new linklist(3,"Klein", 59 ));
        playerList.add(new linklist(4,"Leafa", 60 ));
        for (linklist p : playerList)
        {
            System.out.println(p);
        }
         playerList.remove(0);
        System.out.print("Here is the list with the removed variable" +
                "");
        for (linklist p : playerList)
        {

            System.out.println(p);
        }
int count = playerList.size();
        System.out.print("The number of players are "+count+
                "" +
                "        ");

        System.out.println(playerList.contains(new linklist(4,"Leafa",60) ));
        System.out.println(playerList.indexOf(new linklist(1, "Kirito",100)));


    }
}
