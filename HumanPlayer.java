import java.util.Scanner;
class HumanPlayer extends Player{
    HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }
    public void setname(String name){
        this.name=name;
    }
    void makeMove(){
        int row;
        int col;
        do
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter position to mark(row,col) :");
            row=scan.nextInt();
            col=scan.nextInt();
        }while(!isValidMove(row,col));
        TicTocToe.markPosition(row,col,mark);
    }
}