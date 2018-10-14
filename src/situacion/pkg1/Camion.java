
package situacion.pkg1;


public class Camion extends VehiculoCarga implements Alquiler{

    
    
    
    
    
    
    
    
    
    
    
    
    public Camion(float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
    }

    @Override
    public void precioAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
