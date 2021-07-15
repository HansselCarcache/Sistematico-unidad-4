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
public class Docente extends Empleado {
    private String titulo;

    public Docente() {
    }

    public Docente(String titulo, String antiguedad, String apellidos, int codigo, String nombres, float salario) {
        super(antiguedad, apellidos, codigo, nombres, salario);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
