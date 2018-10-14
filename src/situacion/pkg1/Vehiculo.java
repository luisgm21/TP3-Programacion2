
package situacion.pkg1;

public abstract class Vehiculo {
    
    private float precioalquiler;
    private String patente;
    private String marca;

    public Vehiculo(float precioalquiler, String patente, String marca) {
        this.precioalquiler = precioalquiler;
        this.patente = patente;
        this.marca = marca;
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
