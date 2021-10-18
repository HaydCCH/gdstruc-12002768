package com.gdstruc.module3;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
Que queue = new Que(70);
        queue.add(new PLayer(1, "Gina ",12));
        queue.add(new PLayer(2,"Jake",20));
        queue.add(new PLayer(3, "Rosa",25));
        queue.add(new PLayer(4,"Terry",25));
        queue.add(new PLayer(5,"Charles",13));
        queue.add(new PLayer(6,"Amy",13));
        queue.add(new PLayer(7,"Holt",30));
        queue.add(new PLayer(8, "JIm ",12));
        queue.add(new PLayer(9,"Claire",20));
        queue.add(new PLayer(10, "Toby",25));
        queue.add(new PLayer(11,"Blinky",25));
        queue.add(new PLayer(12,"AAARRRGHH",13));
        queue.add(new PLayer(13,"Walt",13));
        queue.add(new PLayer(14,"Bular",30));
        queue.add(new PLayer(15, "Abed ",12));
        queue.add(new PLayer(16,"Troy",20));
        queue.add(new PLayer(17, "Winger",25));
        queue.add(new PLayer(18,"Britta",25));
        queue.add(new PLayer(19,"Shirley",13));

        queue.add(new PLayer(20,"Dean",13));
        queue.add(new PLayer(21,"Chang",30));
        queue.add(new PLayer(22, "Mario ",12));
        queue.add(new PLayer(23,"Luigi",20));
        queue.add(new PLayer(24, "Bowser",25));
        queue.add(new PLayer(25,"Sora",25));
        queue.add(new PLayer(26,"Samus",13));
        queue.add(new PLayer(27,"Steve",13));
        queue.add(new PLayer(28,"Inkling",30));
        queue.add(new PLayer(29, "Yoshi ",12));
        queue.add(new PLayer(30,"Roy",20));
        queue.add(new PLayer(31, "Marth",25));
        queue.add(new PLayer(32,"Joker",25));
        queue.add(new PLayer(33,"Byleth",13));
        queue.add(new PLayer(34,"Min-Min",13));
        queue.add(new PLayer(36,"GUnner",30));
        queue.add(new PLayer(37, "Fighter ",12));
        queue.add(new PLayer(38,"Sword",20));
        queue.add(new PLayer(39, "Kazuya",25));
        queue.add(new PLayer(40,"Kirby",25));
        queue.add(new PLayer(41,"Sephiroth",13));
        queue.add(new PLayer(42,"Captain Falcon",13));
        queue.add(new PLayer(43,"Robin",30));
        queue.add(new PLayer(44,"Lucina",20));
        queue.add(new PLayer(45, "Chrom",25));
        queue.add(new PLayer(46,"BOwser Jr.",25));
        queue.add(new PLayer(47,"Mythra",13));
        queue.add(new PLayer(48,"Pyra",13));
        queue.add(new PLayer(49,"Ryu",30));
        queue.add(new PLayer(50, "Ken ",12));
        queue.add(new PLayer(51,"Banjo & Kazooie",20));
        queue.add(new PLayer(52, "Wolf",25));
        queue.add(new PLayer(53,"Falco",25));
        queue.add(new PLayer(54,"Fox",13));
        queue.add(new PLayer(55,"Bayonetta",13));
        queue.add(new PLayer(56,"Lucas",30));
        queue.add(new PLayer(57, "Ness ",12));
        queue.add(new PLayer(58,"Charizard",20));
        queue.add(new PLayer(59, "Ivysaur",25));
        queue.add(new PLayer(60,"Squirtle",25));
        queue.add(new PLayer(61,"Toon Link",13));
        queue.add(new PLayer(62,"YOung link",13));
        queue.add(new PLayer(63,"Ganon",30));
        queue.add(new PLayer(64,"Shiek",13));
        queue.add(new PLayer(65,"Zelda",13));
        queue.add(new PLayer(66,"Lnk",30));
        queue.add(new PLayer(67, "Incineroar ",12));
        queue.add(new PLayer(68,"Greninja",20));
        queue.add(new PLayer(69, "Richter",25));
        queue.add(new PLayer(70,"Simon",13));


int i ;
for (i =1; i <=10;i++)
{
    System.out.println("Round"+i);
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int rand = random.nextInt(7)+1;


for (rand = 5; rand <7;rand++)
{
    System.out.println("The after removing"+queue.remove());

System.out.println("Current player list is");
scanner.nextLine();
queue.printquueue();

}


if(i == 10)
{
    System.out.println("Game is over thanks for playing");
    System.out.println("Here is the remaining players who didnt get to play:");
    queue.printquueue();
}
}

    }
}
