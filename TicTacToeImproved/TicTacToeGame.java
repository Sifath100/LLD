package TicTacToeImproved;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Grid grid;
    ArrayList<Player> players;
    Scanner sc=new Scanner(System.in);
    TicTacToePlayer ticTacToePlayer;
    TicTacToeValidator ticTacToeValidator;
    TicTacToePrinter ticTacToePrinter;

    public void initializeGame(){
        players=new ArrayList<>();
        Player p1=new Player("Player1",Symbol.X);
        Player p2=new Player("Player2",Symbol.O);
        players.add(p1);
        players.add(p2);

        System.out.println("Please print grid size");
        int size=sc.nextInt();
        grid=new Grid(size);
        //use a validator class and printer class and a gamePlayer class
        ticTacToePrinter=new TicTacToePrinter(grid);
        ticTacToeValidator=new TicTacToeValidator(grid);
        ticTacToePlayer=new TicTacToePlayer(players,grid,ticTacToePrinter,ticTacToeValidator);
        ticTacToePlayer.letsPlay();
    }

}
