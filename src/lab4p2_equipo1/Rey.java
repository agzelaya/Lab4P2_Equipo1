package lab4p2_equipo1;

public class Rey extends Pieza {

    public Rey(boolean color) {
        super(color);
    }

    public boolean Mover(int x1, int y1, int x2, int y2, Object[][] tablero) {
        boolean canMove = false;

        if (color == false) {
            if (x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7) {
                canMove = false;
            } else {
                if (x2 == x1 + 1 || x2 == x1 - 1 && tablero[x2][y2] == " ") {
                    canMove = true;
                } else if (y2 == y1 + 1 || y2 == y2 - 1 && tablero[x2][y2] == " ") {
                    canMove = true;
                } else if ((y2 == y1 + 1 && x2 == x1 + 1 || y2 == y1 + 1 && x2 == x1 - 1
                        || y2 == y1 - 1 && x2 == x1 + 1 || y2 == y1 - 1 && x2 == x1 - 1) && tablero[x2][y2] == " ") {
                    canMove = true;

                    //metodos para comer
                } else if (x2 == x1 + 1 || x2 == x1 - 1 && ((Pieza) tablero[x2][y2]).color) {
                    canMove = true;
                } else if (y2 == y1 + 1 || y2 == y2 - 1 && ((Pieza) tablero[x2][y2]).color) {
                    canMove = true;
                } else if ((y2 == y1 + 1 && x2 == x1 + 1 || y2 == y1 + 1 && x2 == x1 - 1
                        || y2 == y1 - 1 && x2 == x1 + 1 || y2 == y1 - 1 && x2 == x1 - 1) && ((Pieza) tablero[x2][y2]).color) {
                    canMove = true;
                }
//                return canMove;
            }
        } else if (color) {
            if (x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7) {
                canMove = false;
            } else {
                if (x2 == x1 + 1 || x2 == x1 - 1 && tablero[x2][y2] == " ") {
                    canMove = true;
                } else if (y2 == y1 + 1 || y2 == y2 - 1 && tablero[x2][y2] == " ") {
                    canMove = true;
                } else if ((y2 == y1 + 1 && x2 == x1 + 1 || y2 == y1 + 1 && x2 == x1 - 1
                        || y2 == y1 - 1 && x2 == x1 + 1 || y2 == y1 - 1 && x2 == x1 - 1) && tablero[x2][y2] == " ") {
                    canMove = true;

                    //metodos para comer
                } else if (x2 == x1 + 1 || x2 == x1 - 1 && ((Pieza) tablero[x2][y2]).color == false) {
                    canMove = true;
                } else if (y2 == y1 + 1 || y2 == y2 - 1 && ((Pieza) tablero[x2][y2]).color == false) {
                    canMove = true;
                } else if ((y2 == y1 + 1 && x2 == x1 + 1 || y2 == y1 + 1 && x2 == x1 - 1
                        || y2 == y1 - 1 && x2 == x1 + 1 || y2 == y1 - 1 && x2 == x1 - 1) && ((Pieza) tablero[x2][y2]).color == false) {
                    canMove = true;
                }
            }
//            return canMove;
        }
        return canMove;
    }

    @Override
    public String toString() {
        if (this.color == true) {
            return "K";
        } else {
            return "k";
        }
    }

}
