package lab4p2_equipo1;

public class Dama extends Pieza {


    public Dama(boolean color) {
        super(color);
    }

    
    @Override
    public boolean Mover(int x1, int y1, int x2, int y2, Object[][] tablero) {
       
        boolean valido = true;
        
        if(super.color == true){
            if(x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7){
                
                valido = false;
                
            } else if(y1 == y2 && x2 > x1 + 1 ){
                valido = false;
            } else if(y1 == y2 && x2 < x1 - 1){
                valido = false;
            } else if(x1 == x2 && y2 > y1 + 1){
                valido = false;
            } else if(x1 == x2 && y2 < y1 + 1){
                valido = false;
            } else if(tablero [y2][x2] instanceof Pieza && ((Pieza)tablero[y2][x2]).color == true){
                
            } else{
                valido = true;
            }
            
            
            
        } else if (super.color == false){
            if(x2 > 7 || x1 > 7 || y1 > 7 || y2 > 7){
                
                valido = false;
                
            } else if(y1 == y2 && x2 > x1 + 1 ){
                valido = false;
            } else if(y1 == y2 && x2 < x1 - 1){
                valido = false;
            } else if(x1 == x2 && y2 > y1 + 1){
                valido = false;
            } else if(x1 == x2 && y2 < y1 + 1){
                valido = false;
            } else if(tablero [y2][x2] instanceof Pieza && ((Pieza)tablero[y2][x2]).color == false){
                valido = false;
            } else{
                valido = true;
            }
        }
        
        return valido;
        
    }

    @Override
    public String toString() {
        if(super.color == true){
            return "D";
        } else{
           return "d" ;
        }
    }

   
}
