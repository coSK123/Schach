package packagePieces;
public class Piece {
    public String name;
    public Boolean black;
    public int id;
    public Boolean threatened;
    public int position_x;
    public int position_y;
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
