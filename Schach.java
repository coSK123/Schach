import packagePieces.*;

public class Schach{
    static Piece [] [] Board = new Piece[8][8];
 
    public static void Initialize(){
        for(int i = 0; i<8; i++)
        {
            for(int b = 0; b<8;b++)
            {
                if(i==1 || i==6){
                    Board[i][b] = new Piece("Pawn", true,0,b,i);
                }
                else if(i ==0 || i==7)
                {
                    Board[i] [0]= new Piece("Rook", true,0,b,i);
                    Board[i] [1]= new Piece("Knight", true,0,b,i);
                    Board[i] [2]= new Piece("Bishop", true,0,b,i);
                    Board[i] [3]= new Piece("King", true,0,b,i);
                    Board[i] [4]= new Piece("Queen", true,0,b,i);
                    Board[i] [5]= new Piece("Bishop", true,0,b,i);
                    Board[i] [6]= new Piece("Knight", true,0,b,i);
                    Board[i] [7]= new Piece("Rook", true,0,b,i);
                }
                else
                {
                    Board[i][b] = new Piece("x", true,0,b,i);
                }
            }
        }
    }
public static void printBoard()
{
    for(int i = 0; i<8; i++)
    {   
        System.out.print("|");
        for(int b = 0; b<8;b++)
        {
            if(Board[i][b].name != "x"){
                System.out.print(Board[i][b].name);
                for(int f = 8- Board[i][b].name.length();f>0;f-- ){
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            else{
              System.out.print("xxxxxxxx|");
            }
            
        }
        System.out.println("");
    }
}

public static void main(String[] args){
    Initialize();
    printBoard();
}
}
