public class Utility(){
    public String currentPiece;

    public static Boolean isMoveValid(int position_x, int position_y,int changeX, int changeY){
        if((position_x+changeX <0 || position_x+changeX > 7)or (position_y+changeY <0 || position_y+changeY > 7)){
            return false
        }       
        else{
            return true 
        }
    }
}