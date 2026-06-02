/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Composición de la clase Dueño, indica la ubicación del usuario. 
 * 
 */
public class Dirección {
    private String calle;
    private String ciudad;
    private String region;
    private int numero;

    /**
     * Constructor clase Dirección
     * 
     * @param calle nombre de la calle de residencia del dueño.
     * @param ciudad ciudad de residencia del dueño.
     * @param region región de residencia del dueño.
     * @param numero número de la direccion de residencia del dueño.
     */
    
    public Dirección(String calle, String ciudad, String region, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.numero = numero;
    }
    
    /**
     * 
     * @return Dirección texto.
     */
    
    public String direcciónDueño(){
        String info = calle + " " + numero + ", " + ciudad + ". " + "Región de " + region + ".";
        return info;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    
}
