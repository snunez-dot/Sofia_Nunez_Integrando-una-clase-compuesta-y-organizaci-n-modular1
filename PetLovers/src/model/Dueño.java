/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase identifica a dueños de mascotas de PetLovers
 * 
 */
public class Dueño {
    private String nombre;
    private int numeroTelefono;
    
    private Dirección direcciónDueño;

/**
 * 
 * @param nombre Nombre del dueño.
 * @param numeroTelefono Número de teléfono del dueño.
 * @param direcciónDueño Dirección residencia del dueño.
 */
    
    public Dueño(String nombre, int numeroTelefono, Dirección direcciónDueño) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.direcciónDueño = direcciónDueño;
    }
    
    public void informaciónDueño(){
        System.out.println("Tutor Petlovers");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + "+56 " + numeroTelefono);
        System.out.println("Dirección: " + direcciónDueño.direcciónDueño());
        
    }

    public String getNombre() {
        System.out.println("Tutor Petlovers");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + "+56 " + numeroTelefono);
        System.out.println("Dirección: " + direcciónDueño.direcciónDueño());
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Dirección getDirecciónDueño() {
        return direcciónDueño;
    }

    public void setDirecciónDueño(Dirección direcciónDueño) {
        this.direcciónDueño = direcciónDueño;
    }
    
    
}
