package TicTacToeImproved;

public class Grid {
    int size;
    Symbol[][] grid;

    public Grid(int size){
        this.size=size;
        this.grid=new Symbol[size][size];
    }

    public int getSize() {
        return size;
    }

    public Symbol[][] getGrid() {
        return grid;
    }

    public Symbol getCell(int row,int column){
        return this.grid[row][column];
    }
    public void setCell(int row,int column,Symbol symbol){
        this.grid[row][column]=symbol;
    }
}
