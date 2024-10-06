package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alex Torres Velasquez 
 */
public class Trigo {
    //-------------------------------------------------
    // Atributos
    //-------------------------------------------------
    
    public static final String ICONO = "./img/icono.png";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA = 1;
    public static final int PRECIO_VENTA = 2;
    public static final int RIEGO = 10;
    
    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int riego;

    // Constructor con todos los parametros
    public Trigo(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int riego) {
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.riego = riego;
    }

    // Constructor por defecto
    public Trigo() {
        this(ICONO, DURACION, EXPERIENCIA, PRECIO_VENTA, RIEGO);
    }

    //Constructor copia
    public Trigo(Trigo otro){
        this(otro.icono, otro.duracionProduccion, otro.experienciaRecolecta, otro.precioVenta, otro.riego);
    }
    
    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public int getDuracionProduccion() {
        return duracionProduccion;
    }

    public void setDuracionProduccion(int duracionProduccion) {
        this.duracionProduccion = duracionProduccion;
    }

    public int getExperienciaRecolecta() {
        return experienciaRecolecta;
    }

    public void setExperienciaRecolecta(int experienciaRecolecta) {
        this.experienciaRecolecta = experienciaRecolecta;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }
    
    
}
