abstract class Player{
    String name;
    char mark;
    boolean isValidMove(int row,int col){
        if(row>=0 && row<=2 && col<=2 && col>=0){
            if(TicTocToe.Board[row][col]==' ')
                return true;
        }
        return false;
    }
    abstract void makeMove();
}