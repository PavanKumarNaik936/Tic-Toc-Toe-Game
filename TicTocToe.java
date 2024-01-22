class TicTocToe{
    static char[][]Board;
    public TicTocToe(){
        Board=new char[3][3];
        initiliaze();
    }

    void initiliaze(){
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board[i].length;j++){
                Board[i][j]=' ';
            }
        }
    }
    static void display(){
        for(int i=0;i<Board.length;i++){
            System.out.println("-------------");
            System.out.print("| ");
            for(int j=0;j<Board[i].length;j++){    
                System.out.print(Board[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
    static void markPosition(int row,int col,char ch){
        if(isValid(row,col)){
            Board[row][col]=ch;
        }

    }
    public static boolean isValid(int row,int col){
        if(row>=0 && row<=2 && col<=2 && col>=0){
            if(Board[row][col]==' ')
                return true;
        }
        return false;
    }
    public static boolean checkRowWin(){
        for(int i=0;i<Board.length;i++){
            if(Board[i][0]!=' ' && Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2])
                return true;
        }
        return false;
    }
    public static boolean checkColWin(){
        for(int i=0;i<Board.length;i++){
            if(Board[0][i]!=' ' && Board[0][i]==Board[1][i] && Board[1][i]==Board[2][i])
                return true;
        }
        return false;
    }
    public static boolean checkDiagonalWin(){
        if((Board[0][0]!=' ' && Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2])||(Board[0][2]!=' ' && Board[0][2]==Board[1][1] && Board[1][1]==Board[2][0]))
                return true;
        return false;
    }
    public boolean checkDraw(){
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board.length;j++){
                if(Board[i][j]==' ')
                    return false;
            }
        }
        return true;
    }

}