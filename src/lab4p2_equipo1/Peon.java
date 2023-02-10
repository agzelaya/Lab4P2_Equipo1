package lab4p2_equipo1;

public class Peon extends Pieza {

    public Peon(boolean color) {
        super.color = color;
    }
    
    
    
    //tablero[6][0] = new Peon(false);
    @Override
    public boolean Mover(int x1, int y1, int x2, int y2, boolean color, Object[][] tablero) {
        boolean canMove = false;

        if (color = false) {
            if (y1 == 1) {
                if (y2 == y1 + 1 || y2 == y1 + 2 && (tablero[x1][y1 + 1] == " " ||tablero[x1][y1 + 2] == " ")) {
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    canMove = true;
                } else if (tablero[x1 + 1][y1 + 1] != " " || tablero[x1 - 1][y1 + 1] != " "){
                    x1 = x2;
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    tablero[x2][y2] = " ";
                    canMove = true;
                }
            } else {
                if (y2 == y1 + 1 && (tablero[x1][y1 + 1] == " ")) {
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    canMove = true;
                } else if (tablero[x1 + 1][y1 + 1] != " " ||tablero[x1 - 1][y1 + 1] != " "){
                    x1 = x2;
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    tablero[x2][y2] = " ";
                    canMove = true;
                }
            }
        }else if (color == true){
            if (y1 == 6) {
                if (y2 == y1 - 1 || y2 == y1 - 2 && (tablero[x1][y1 - 1] == " " ||tablero[x1][y1 - 2] == " ")) {
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    canMove = true;
                } else if (tablero[x1 + 1][y1 - 1] != " " ||tablero[x1 - 1][y1 - 1] != " "){
                    x1 = x2;
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    tablero[x2][y2] = " ";
                    canMove = true;
                }
            } else {
                if (y2 == y1 - 1 && (tablero[x1][y1 - 1] == " ")) {
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    canMove = true;
                } else if (tablero[x1 + 1][y1 - 1] != " " ||tablero[x1 - 1][y1 - 1] != " "){
                    x1 = x2;
                    y1 = y2;
                    tablero[x1][y1] = " ";
                    tablero[x2][y2] = " ";
                    canMove = true;
                }
            }
        }

        return canMove;
    }

    @Override
    public String toString() {
        if(color == true){
            return "P";
        }else{
            return "p";
        }
    }
    
    

}
