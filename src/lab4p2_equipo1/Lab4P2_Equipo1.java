/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo1;

import java.util.Scanner;

/**
 *
 * @author luiscarlomendoza, andrea zelaya
 */
public class Lab4P2_Equipo1 {

   public static Object[][] TableroMatrix() {

        Object[][] tablero = new Object[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = " ";

            }
        }
        
        tablero [7][0] = new Torre(true);
        tablero [7][1] = new Caballo(true);
        tablero [7][2] = new Alfil(true);
        tablero [7][3] = new Dama(true);
        tablero [7][4] = new Rey(true);
        tablero [7][5] = new Alfil(true);
        tablero [7][6] = new Caballo(true);
        tablero [7][7] = new Torre(true);
        
        tablero [6][0] = new Peon(true);
        tablero [6][1] = new Peon(true);
        tablero [6][2] = new Peon(true);
        tablero [6][3] = new Peon(true);
        tablero [6][4] = new Peon(true);
        tablero [6][5] = new Peon(true);
        tablero [6][6] = new Peon(true);
        tablero [6][7] = new Peon(true);
        
        tablero [0][0] = new Torre(false);
        tablero [0][1] = new Caballo(false);
        tablero [0][2] = new Alfil(false);
        tablero [0][3] = new Dama(false);
        tablero [0][4] = new Rey(false);
        tablero [0][5] = new Alfil(false);
        tablero [0][6] = new Caballo(false);
        tablero [0][7] = new Torre(false);
        
        tablero [1][0] = new Peon(false);
        tablero [1][1] = new Peon(false);
        tablero [1][2] = new Peon(false);
        tablero [1][3] = new Peon(false);
        tablero [1][4] = new Peon(false);
        tablero [1][5] = new Peon(false);
        tablero [1][6] = new Peon(false);
        tablero [1][7] = new Peon(false);
        

        return tablero;
    }

    public static void ImprimirMatrix(Object[][] matrix) {

        for (int i = 0; i < matrix.length; i++) { //Fila
            for (int j = 0; j < matrix[i].length; j++) { //Columna
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void Move(){
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ImprimirMatrix(TableroMatrix());
        
        Object [][] tablero = TableroMatrix();

        System.out.println("Bienvenido a Chess.com");

        while (true) {
            
            System.out.println("Juegan blancas");
            
            System.out.println("Elija las coordenadas del eje x de la pieza que desea mover");
            int bx1 = entrada.nextInt();
            System.out.println("Elija las coordenadas del eje y de la pieza que desea mover");
            int by1 = entrada.nextInt();

            System.out.println("Elija las coordenadas del eje x de la nueva casilla");
            int bx2 = entrada.nextInt();
            System.out.println("Elija las coordenadas del eje y de la nueva casilla");
            int by2 = entrada.nextInt();
            
            if(((Pieza)tablero[by1][bx2]).Mover(bx1, by1, bx2, by2, tablero)){
                tablero[by2][bx2] = tablero[by1][bx1];
                tablero[by1][bx1] = " ";
                
                ImprimirMatrix(tablero);
                
                break;
                
            } else{
                System.out.println("Movimiento no valido, intententelo nuevamente");
            }
            
           
        }
        
        while(true){
            System.out.println("Juegan negras");
            
            System.out.println("Elija las coordenadas del eje x de la pieza que desea mover");
            int nx1 = entrada.nextInt();
            System.out.println("Elija las coordenadas del eje y de la pieza que desea mover");
            int ny1 = entrada.nextInt();

            System.out.println("Elija las coordenadas del eje x de la nueva casilla");
            int nx2 = entrada.nextInt();
            System.out.println("Elija las coordenadas del eje y de la nueva casilla");
            int ny2 = entrada.nextInt();
            
            if(((Pieza)tablero[ny1][nx2]).Mover(nx1, ny1, nx2, ny2, tablero)){
                tablero[ny2][nx2] = tablero[ny1][nx1];
                tablero[ny1][nx1] = " ";
                
                ImprimirMatrix(tablero);
                
                break;
                
            } else{
                System.out.println("Movimiento no valido, intententelo nuevamente");
            }
        }
        

    }



}
