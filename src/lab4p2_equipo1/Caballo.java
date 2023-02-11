package lab4p2_equipo1;

public class Caballo extends Pieza  {

    public Caballo(boolean color) {
        super(color);
    }

    @Override
    public boolean Mover(int x1, int y1, int x2, int y2, Object[][] tablero) {
        boolean valido =true;
        
        if(super.color == true){
            if(x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7 ||tablero [y2][x2] instanceof Pieza && ((Pieza)tablero[y2][x2]).color == false){
                
                valido = false;
                
            } else if(y2 == y1 + 2 && x2 == x1 + 1){
                valido = true;
            } else if(y2 == y1 + 1 && x2 == x1 + 2){
                valido = true;
            } else if(y2 == y1 -1 && x2 == x1 + 2){
                valido = true;
            } else if(y2 == y1 -2 && x2 == x1 + 1 ){
                valido = true;
            } else if(y2 == y1 - 2 && x2 == x1 - 1){
                valido = true;
            } else if(y2 == y1 -1 && x2 == x1 - 2){
                valido = true;
            } else if(y2 == y1 + 1 && x2 == x1 - 2 ){
                valido = true;
            } else if (y2 == y1 + 2 && x2 == x1 - 1){
                valido = true;
            } else if(tablero [y2][x2] instanceof Pieza && ((Pieza)tablero[y2][x2]).color == true){
                valido = false;
            } else{
                valido = false;
            }
            
            
        } else if(super.color == false){
            if(x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7){
                
                valido = false;
                
            } else if(y2 == y1 + 2 && x2 == x1 + 1){
                valido = true;
            } else if(y2 == y1 + 1 && x2 == x1 + 2){
                valido = true;
            } else if(y2 == y1 -1 && x2 == x1 + 2){
                valido = true;
            } else if(y2 == y1 -2 && x2 == x1 + 1 ){
                valido = true;
            } else if(y2 == y1 - 2 && x2 == x1 - 1){
                valido = true;
            } else if(y2 == y1 -1 && x2 == x1 - 2){
                valido = true;
            } else if(y2 == y1 + 1 && x2 == x1 - 2 ){
                valido = true;
            } else if (y2 == y1 + 2 && x2 == x1 - 1){
                valido = true;
            } else if(tablero [y2][x2] instanceof Pieza && ((Pieza)tablero[y2][x2]).color == false){
                valido = false;
            } else{
                valido = false;
            }
            
            
        }
       
        
        
        return valido;
    }

    @Override
    public String toString() {
        if(super.color == true){
            return "C";
        } else{
            return "c";
        }
    }
    
    
}
