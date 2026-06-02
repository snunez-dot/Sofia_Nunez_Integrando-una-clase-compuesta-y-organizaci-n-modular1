/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.Dueño;
import model.Dirección;
import model.Mascota;
import util.Validador;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota(
        "Nico",
        "Canino",
        13);
        
        Dirección direcciónDueño  = new Dirección(
                "Vial",
                "Concepción", 
                "Biobio",
                 2790);
        
        Dueño dueño1 = new Dueño(
        "Camila Rodriguez",
        965782394,
        direcciónDueño);
        
        System.out.println("==INFORMACIÓN CLIENTE==");
        mascota1.informaciónMascota();
        dueño1.informaciónDueño();
        
    }
    
}
