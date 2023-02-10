/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo1;

/**
 *
 * @author luiscarlomendoza, andrea zelaya
 */
public class Lab4P2_Equipo1 {

    public static Object[][] TableroMatrix() {

        Object[][] tablero = new Object[9][9];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = ' ';

            }
        }
        
        

        

        return tablero;
    }

    public static void ImprimirMatrix(char[][] matrix) {

        for (int i = 0; i < matrix.length; i++) { //Fila
            for (int j = 0; j < matrix[i].length; j++) { //Columna
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

    }

}
