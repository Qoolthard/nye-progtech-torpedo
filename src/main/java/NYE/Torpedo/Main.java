package NYE.Torpedo;

import NYE.Torpedo.Services.Player;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please add Player Name:");
    Player player = new Player(scanner.nextLine());
    System.out.println("Player Name: " + player.getPlayerName());




}



}
