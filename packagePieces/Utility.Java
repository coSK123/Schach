package packagePieces;
public class Utility{
    

    public static Boolean isMoveValid(int changeX, int changeY, Piece movingPiece){
        if((movingPiece.position_x+changeX <0 || movingPiece.position_x+changeX > 7)||(movingPiece.position_y+changeY <0 || movingPiece.position_y+changeY > 7))
        {
            return false;
  
        }
        else if(movingPiece.position_x == changeX && movingPiece.position_y == changeY)
        {
            return false;
        }
        else if(movingPiece.name == "Rook")
        {
            if(movingPiece.position_x != changeX && movingPiece.position_y != changeY){
                return false;
            } 
        } 
        else if(movingPiece.name == "Knight")
        {
            if((movingPiece.position_x-changeX != 1 || movingPiece.position_x-changeX != -1) && (movingPiece.position_y-changeY != 2 || movingPiece.position_y-changeY != -2)){
                if((movingPiece.position_x-changeX != 2 || movingPiece.position_x-changeX != -2) && (movingPiece.position_y-changeY != 1 || movingPiece.position_y-changeY != -1))
                {
                    return false;
                }
            }
        } 
        else if(movingPiece.name == "Bishop")
        {
            if(movingPiece.position_x-changeX != movingPiece.position_y-changeY && movingPiece.position_x-changeX != -(movingPiece.position_y-changeY)){
                return false;
            }
        }    
        else if(movingPiece.name == "King"){
            if((movingPiece.position_x-changeX != 1 ||movingPiece.position_x-changeX != 0 || movingPiece.position_x-changeX != -1)&&
            (movingPiece.position_y-changeY != 1 ||movingPiece.position_y-changeY != 1 ||movingPiece.position_y-changeY != -1))
            {
                return false;
            }
        }
        else if(movingPiece.name == "Pawn"){
            if(true){
                //Add slightly complicated logic for pawns
                return false;
            }
        }
        else
        {
            return true ;
        }
        return null;
    }

    public static void main(String[] args)
    {
    }
}