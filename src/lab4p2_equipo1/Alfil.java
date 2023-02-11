package lab4p2_equipo1;

/**
 *
 * @author luiscarlomendoza
 */
public class Alfil extends Pieza {

    @Override
    public boolean Mover(int x1, int y1, int x2, int y2, Object[][] tablero) {
        boolean canMove = false;
        if (x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7) {
            canMove = false;
        } else {
            if (color == false) {
                if (tablero[x2][y2] == " " && y2 - y1 == x2 - x1) {
                    canMove = true;
                } else if (((Pieza) tablero[x2][y2]).color && y2 - y1 == x2 - x1) {
                    canMove = true;
                }
            }else if (color){
                if (tablero[x2][y2] == " " && y2 - y1 == x2 - x1) {
                    canMove = true;
                } else if (((Pieza) tablero[x2][y2]).color == false && y2 - y1 == x2 - x1) {
                    canMove = true;
                }
            }

        }

        return canMove;
    }
    
     @Override
    public String toString() {
        if (this.color == true) {
            return "B";
        } else {
            return "b";
        }
    }

}
