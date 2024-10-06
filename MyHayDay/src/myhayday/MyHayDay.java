/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myhayday;

import modelos.Trigo;

/**
 *
 * @author Cristian Alex Torres Velásquez
 */
public class MyHayDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test de constructor paramétrico
        Trigo trigoParametrico = new Trigo("aun no tiene", 10, 5, 2, 1);
        
        // Test de constructor por defecto
        Trigo trigoDefecto = new Trigo();
        
        // Test de constructor copia
        Trigo trigoCopia = new Trigo(trigoParametrico);
        
        // Test getters de trigo paramétrico
        System.out.println("Trigo paramétrico:\n------------------\nIcono: " + trigoParametrico.getIcono()
        + "\nDuración producción: " + trigoParametrico.getDuracionProduccion()
        + "\nExperiencia de recolección: " + trigoParametrico.getExperienciaRecolecta()
        + "\nPrecio de venta: " + trigoParametrico.getExperienciaRecolecta()
        + "\nRiego: " + trigoParametrico.getRiego());
        
        // Test getters de trigo por defecto
        System.out.println("\nTrigo por defecto:\n------------------\nIcono: " + trigoDefecto.getIcono()
        + "\nDuración producción: " + trigoDefecto.getDuracionProduccion()
        + "\nExperiencia de recolección: " + trigoDefecto.getExperienciaRecolecta()
        + "\nPrecio de venta: " + trigoDefecto.getExperienciaRecolecta()
        + "\nRiego: " + trigoDefecto.getRiego());
        
        // Test getters de trigoCopia
        System.out.println("\nTrigo copia :\n-------------\nIcono: " + trigoCopia.getIcono()
        + "\nDuración producción: " + trigoCopia.getDuracionProduccion()
        + "\nExperiencia de recolección: " + trigoCopia.getExperienciaRecolecta()
        + "\nPrecio de venta: " + trigoCopia.getExperienciaRecolecta()
        + "\nRiego: " + trigoCopia.getRiego());
        
    }
    
}
