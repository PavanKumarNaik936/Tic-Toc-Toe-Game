import java.util.Scanner;
class LaunchGame{
    public static void main(String[]args){
        System.out.println("-----TIC TOC TOE-----\nWelcome to the Tic-Toc-Toe Game");
        System.out.println("Look at Positions in the Board Once Carefully...");
        for(int i=0;i<3;i++){
            System.out.println("-------------------");
            System.out.print("|");
            for(int j=0;j<3;j++){    
                System.out.print("("+i+","+j+")"+"|");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        play();
    }
    static void play(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Start the Game -- All the Best..");
        System.out.println("Select Mode to Play:\nEnter 1 -to play Human vs Human ");
        System.out.println("Enter 2 -to play Human vs Computer");
        TicTocToe t=new TicTocToe();
        String player1=null;
        String player2=null;
        HumanPlayer p1=new HumanPlayer(player1,'X');
        HumanPlayer p2=new HumanPlayer(player2,'O');
        ComputerPlayer p=new ComputerPlayer("Computer",'O');
        int choice=scan.nextInt();
        if(choice==1){
            System.out.println("***Welcome to Human vs Human Mode***");
            System.out.print("Enter name of the player 1: ");
            player1=scan.next();
            p1.setname(player1);
            System.out.print("\nEnter name of the player 2: ");
            player2=scan.next();
            p2.setname(player2);
        }
        else if(choice==2){
            System.out.println("***Welcome to Human vs Computer Mode***");
            System.out.print("Enter name of the player : ");
            player1=scan.next();
            p1.setname(player1);
        }
        else{
            System.out.println("Invalid Input ...Please select from ('1'/'2')");
            play();
        }
        Player cp;
        cp=p1;
        while(true){
            System.out.println(cp.name +"'s Turn :");
            cp.makeMove();
            t.display();
            if(t.checkColWin()||t.checkRowWin()||t.checkDiagonalWin()){
                System.out.println(cp.name +" has Won...");
                System.out.print("Do you want to play again(YES/NO)");
                String opt=scan.next();
                if(opt.equals("YES"))
                    play();
                else 
                    break;
            }
            else if(t.checkDraw()){
                System.out.println("....Game DRAW....");
                System.out.print("Do you want to play again(YES/NO)");
                String opt=scan.next();
                if(opt.equals("YES"))
                   play();
                else 
                    break;
            }
            else{
                switch(choice){
                    case 1:{
                        if(cp==p1)
                            cp=p2;
                        else cp=p1;
                        break;
                    }
                    case 2:{
                        if(cp==p)
                            cp=p1;
                        else cp=p;
                        break;
                    }
                    default: System.out.println("Select Mode Again...");
                }
            }
                
        }     
    }
}