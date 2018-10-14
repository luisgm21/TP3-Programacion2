
package situacion.pkg1;


public class Auto extends VehiculoPasajeros {
    private float preciobase;
    private String aire;
    private String levantacritales;
    private String alarma;
   

    public Auto(float preciobase, String aire, String levantacritales, String alarma, String patente, String marca) {
        super(patente, marca);
        this.preciobase = preciobase;
        this.aire = aire;
        this.levantacritales = levantacritales;
        this.alarma = alarma;        
    }
    
    public Auto(float preciobase, String aire, String levantacritales, String alarma, float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
        this.preciobase = preciobase;
        this.aire = aire;
        this.levantacritales = levantacritales;
        this.alarma = alarma;
        
    }
    
    public Auto(float preciobase, float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
        this.preciobase = preciobase;
    }
    public Auto( float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);       
    }

    public float getPreciobase() {
        return preciobase;
    }

    public String getAire() {
        return aire;
    }

    public String getLevantacritales() {
        return levantacritales;
    }

    public String getAlarma() {
        return alarma;
    }
  


}
