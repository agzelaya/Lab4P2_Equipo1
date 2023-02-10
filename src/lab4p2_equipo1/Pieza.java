/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo1;

/**
 *
 * @author luiscarlomendoza
 */
public abstract class Pieza {
    
    protected String name;
    
    //Posición Inicial
    protected int x1;
    protected int y1;
    
    //Posición Final
    protected int x2;
    protected int y2;
    
    // Piezas Negras o Blancas
    protected boolean color;

    public Pieza() {
    }

    public Pieza(String name, int x1, int y1, int x2, int y2, boolean color) {
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    
    
    
    
    public abstract boolean Mover(int x1, int y1, int x2, int y2, boolean color, Object [][] tablero);
    
}
