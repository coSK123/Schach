import packagePieces.*;
public class Schach{
    static String [] [] Board;

    public static void Initialize(){
        Board [0] [0] = "Rook";
        Board [0] [1] = "Knight";
        Board [0] [2] = "Bishop";
        Board [0] [3] = "Queen";
        Board [0] [4] = "King";
        Board [0] [5] = "Bishop";
        Board [0] [6] = "Knight";
        Board [0] [7] = "Rook";
    }
  

public static void main(String[] args){
    Initialize();
    System.out.println(Board[0][0]);
    Piece King = new Piece("King", true, 1,0,0);
    System.out.println(King.name);
}
}
