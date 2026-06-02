/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase principal, recopila información sobre las mascotas de PetLovers.
 * 
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private String informaciónDueño;

    /**
     * 
     * @param nombre Nombre de la mascota.
     * @param especie Especie de la mascota.
     * @param edad Edad de la mascota.
     */
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

/**
 * Información mascota en texto.
 */
    
    public void informaciónMascota(){
        System.out.println("Mascota Petlovers");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
