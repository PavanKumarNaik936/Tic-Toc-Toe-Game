import java.util.Random;
class ComputerPlayer extends Player{
    ComputerPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }
    void makeMove(){
        int row;
        int col;
        Random r=new Random();
        do
        {   
            row=r.nextInt(3);
            col=r.nextInt(3);
        }while(!isValidMove(row,col));
        TicTocToe.markPosition(row,col,mark);
    }
    
}