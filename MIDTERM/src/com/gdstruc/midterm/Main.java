package com.gdstruc.midterm;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       lnklst hand = new lnklst();
        lnklst deck = new lnklst( );
        deck pile = new deck( 30);


        hand.push(new class1(1,"Blaster Blade"));
        deck.push(new class1(2,"Pongal"));
        deck.push(new class1(3,"Jewel KNigh, Salome"));
        deck.push(new class1(4,"Blaster Blade Spirit"));
        deck.push(new class1(5,"Miru Biru"));
        deck.push(new class1(6,"Tick Tock Worker"));
        deck.push(new class1(7,"Chronojet Dragpon"));
        deck.push(new class1(8,"Spectral Duke Dragon"));
        deck.push(new class1(9,"Prominence Core"));
        deck.push(new class1(10,"Promincince Glare"));
        deck.push(new class1(11,"Kheidn"));
        deck.push(new class1(12,"Coel"));
        deck.push(new class1(13,"Hoel"));
        deck.push(new class1(14,"Blaster Blade"));
        deck.push(new class1(15,"Blaster Blade"));
        deck.push(new class1(16,"Blaster Blade"));
        deck.push(new class1(17,"Spectral Duke Dragon"));
        deck.push(new class1(18,"Spectral Duke Dragon"));
        deck.push(new class1(19,"Kheidn"));
        deck.push(new class1(20,"Kheidn"));
        deck.push(new class1(21,"Kheidn"));
        deck.push(new class1(22,"Promincince Glare"));
        deck.push(new class1(23,"Promincince Glare"));
        deck.push(new class1(24,"Promincince Glare"));
        deck.push(new class1(25,"Prominence Core"));
        deck.push(new class1(26,"Prominence Core"));
        deck.push(new class1(27,"Prominence Core"));
        deck.push(new class1(28,"Pongal"));
        deck.push(new class1(29,"Pongal"));
        deck.push(new class1(30,"vPongal"));
        System.out.println("Lets begin");
        for (int i = 1; i>=1;i++)
        {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int rand2 = random.nextInt(3) +1;
            int rand = random.nextInt(5)+1;

            System.out.println("Round " + i);
if(rand2 == 1)
{

    hand.push(deck.pop());
}

   if (rand2 == 2)
   { pile.push(hand.pop());}

       if (rand2== 3)

            { hand.push(pile.pop());}


        System.out.println("Here is what is in your hand");
       scanner.nextLine();
        hand.printStack();
         System.out.println("Here is what is in your deck");
            scanner.nextLine();

deck.printStack();
         System.out.println("Here is what is in your drop zone");
            scanner.nextLine();
pile.printstack();

        }

    }

    }
