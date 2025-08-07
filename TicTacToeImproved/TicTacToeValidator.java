package TicTacToeImproved;

public class TicTacToeValidator {
    Grid grid;

    public TicTacToeValidator(Grid grid){
        this.grid=grid;
    }
    public boolean isGridFull(){

        for(int i=0;i<grid.getSize();i++){
            for(int j=0;j< grid.getSize();j++){
                if(grid.getCell(i,j)==null){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(int row,int column){
        if(!(row>=0 && row<grid.size && column>=0 && column<grid.size) || grid.getCell(row,column)!=null){
            return false;
        }
        return true;
    }
}
