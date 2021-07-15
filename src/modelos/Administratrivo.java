/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 50578
 */
public class Administratrivo extends Empleado{
    private int facultad;

    public Administratrivo() {
    }

    public Administratrivo(int facultad, String antiguedad, String apellidos, int codigo, String nombres, float salario) {
        super(antiguedad, apellidos, codigo, nombres, salario);
        this.facultad = facultad;
    }

    public int getFacultad() {
        return facultad;
    }

    public void setFacultad(int facultad) {
        this.facultad = facultad;
    }
    
}
