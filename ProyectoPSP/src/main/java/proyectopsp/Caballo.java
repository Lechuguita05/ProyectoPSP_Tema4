/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopsp;

/**
 *
 * @author Diurno
 */
public class Caballo {
    protected String nombre;
    protected int numero;
    protected final int VELOCIDAD = 5;
    protected int ejeX;
    protected int ejeY;

    public Caballo(String nombre, int numero, int ejeX, int ejeY) {
        this.nombre = nombre;
        this.numero = numero;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }
    
}
