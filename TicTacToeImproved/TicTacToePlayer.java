package TicTacToeImproved;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToePlayer {
    ArrayList<Player> players;
    Grid grid;
    TicTacToePrinter ticTacToePrinter;
    TicTacToeValidator ticTacToeValidator;
    Scanner sc=new Scanner(System.in);
    int index=0;
    public TicTacToePlayer(ArrayList<Player> players,Grid grid,TicTacToePrinter ticTacToePrinter,TicTacToeValidator ticTacToeValidator){
        this.players=players;
        this.grid=grid;
        this.ticTacToePrinter=ticTacToePrinter;
        this.ticTacToeValidator=ticTacToeValidator;
    }

    public void letsPlay(){
        while(true){

            System.out.println("Please provide your indices");
            int[] indices=new int[2];
            indices[0]=sc.nextInt();
            indices[1]=sc.nextInt();
            Symbol symbol=players.get(index % players.size()).symbol;
            if(ticTacToeValidator.isValid(indices[0],indices[1]) && !ticTacToeValidator.isGridFull()){
                grid.setCell(indices[0],indices[1],symbol);
                ticTacToePrinter.print();
                boolean isRowValid=true;
                boolean isColumnValid=true;
                boolean isDiagnol1Valid=true;
                boolean isDiagnol2Valid=true;

                for(int i=0;i< grid.getSize();i++){
                    boolean rowValid=true;
                    for(int j=0;j< grid.getSize();j++){
                        if(grid.getCell(i,j)==null || grid.getCell(i,j)!=symbol){
                            rowValid=false;
                            break;
                        }
                    }
                    if(rowValid){
                        System.out.println("Game end");
                        return;
                    }
                }

                for(int j=0;j< grid.getSize();j++){
                    boolean colValid=true;
                    for(int i=0;i<grid.getSize();i++){
                        if(grid.getCell(i,j)==null || grid.getCell(i,j)!=symbol){
                            colValid=false;
                            break;
                        }
                    }
                    if(colValid){
                        System.out.println("Game end");
                        return;
                    }
                }
                index++;
            }
            else{
                System.out.println("Hey wrong input either occupied or out of bounds, kindly try again");
                continue;
            }
        }
    }
}
