package packagePieces;
public class Piece {
    public String name;
    Boolean black;
    int id;
    Boolean threatened;
    int position_x;
    int position_y;
    public Piece(String name, Boolean black, int id, int position_x,
    int position_y)
    {
        this.name = name;
        this.black = black;
        this.id = id;
    }

    public static void main(String[] args)
    {
        Piece King = new Piece("King", true, 1,0,0);
        System.out.println(King.name);
    }
}
