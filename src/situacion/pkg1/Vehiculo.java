
package situacion.pkg1;

public abstract class Vehiculo {
    
    private float precioalquiler;
    private String patente;
    private String marca;
    private Integer kilometraje;
   
    
    public Vehiculo( String patente, String marca) {        
        this.patente = patente;
        this.marca = marca;
    }

    public Vehiculo(float precioalquiler, String patente, String marca) {
        this.precioalquiler = precioalquiler;
        this.patente = patente;
        this.marca = marca;
    }

    public Vehiculo(float precioalquiler, String patente, String marca, Integer kilometraje/*, float dia*/) {
        this.precioalquiler = precioalquiler;
        this.patente = patente;
        this.marca = marca;
        this.kilometraje = kilometraje;
        //this.dia = dia;
    }

    public float getKilometraje() {
        return kilometraje;
    }

  

    
    public float getPrecioalquiler() {
        return precioalquiler;
    }


    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }
    
    
    
    
    
    
}
