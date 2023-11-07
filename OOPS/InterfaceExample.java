public class InterfaceExample {

    public static void main(String args[]){

        Queen q= new Queen();
        q.moves();


    }

    interface ChessPlayer{
        void moves();
    }

    class Queen implements ChessPlayer{
        public void moves(){
            System.out.println("up, down, left, right, diagonal (In all 4 directions)");
        }
    }

    class Rook implements ChessPlayer{
        public void moves(){
            System.out.println("up, down, left, right");
        }
    }

    class King implements ChessPlayer{
        public void moves(){
            System.out.println("Up, down, left, right (By one step)");
        }

    }
    
}
