package TicTacToeImproved;

public class TicTacToePrinter {
    Grid grid;

    public TicTacToePrinter(Grid grid){
        this.grid=grid;
    }

    public void print(){
        for(int i=0;i<this.grid.getSize();i++){
            for(int j=0;j<this.grid.getSize();j++){
                if(grid.getCell(i,j)==null){
                    System.out.print("_");
                }
                else {
                    System.out.print(grid.getCell(i,j));
                }
            }
            System.out.println("");
        }
    }
}
