package lab4p2_equipo1;

public class Peon extends Pieza {

    public Peon(boolean color) {
        super(color);
    }

    @Override
    public boolean Mover(int x1, int y1, int x2, int y2, Object[][] tablero) {
        boolean canMove = false;

        if (x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7) {
            canMove = false;
        } else {
            if (color = false) {
                if (y1 == 1) {
                    if (y2 == y1 + 1 || y2 == y1 + 2 && (tablero[x1][y1 + 1] == " " || tablero[x1][y1 + 2] == " ")) {

                        canMove = true;
                    } else if ((tablero[x1 + 1][y1 + 1] != " " || tablero[x1 - 1][y1 + 1] != " ") && ((Pieza) tablero[x2][y2]).color) {

                        canMove = true;
                    }
                } else {
                    if (y2 == y1 + 1 && (tablero[x1][y1 + 1] == " ")) {
                        canMove = true;
                    } else if ((tablero[x1 + 1][y1 + 1] != " " || tablero[x1 - 1][y1 + 1] != " ") && ((Pieza) tablero[x2][y2]).color) {

                        canMove = true;
                    }
                }
            } else if (color == true) {
                if (y1 == 6) {
                    if (y2 == y1 - 1 || y2 == y1 - 2 && (tablero[x1][y1 - 1] == " " || tablero[x1][y1 - 2] == " ")) {
                        canMove = true;
                    } else if ((tablero[x1 + 1][y1 - 1] != " " || tablero[x1 - 1][y1 - 1] != " ") && ((Pieza) tablero[x2][y2]).color == false) {

                        canMove = true;
                    }
                } else {
                    if (y2 == y1 - 1 && (tablero[x1][y1 - 1] == " ")) {
                        canMove = true;
                    } else if ((tablero[x1 + 1][y1 - 1] != " " || tablero[x1 - 1][y1 - 1] != " ") && ((Pieza) tablero[x2][y2]).color == false) {

                        canMove = true;
                    }
                }
            }
        }

        return canMove;
    }

    @Override
    public String toString() {
        if (this.color == true) {
            return "P";
        } else {
            return "p";
        }
    }

}
