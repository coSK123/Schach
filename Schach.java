public class Schach{
    static int [] [] Board = { {1,2,3,4,5,6,7,8}, {1,2,3,4,5,6,7,8}};

    public static void Initialize(){
        Board [0] [0] = 10;
    }
  

public static void main(String[] args){
    Initialize();
    System.out.println(Board[0][0]);
}
}
