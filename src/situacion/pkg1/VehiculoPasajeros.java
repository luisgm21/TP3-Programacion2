
package situacion.pkg1;


public class VehiculoPasajeros extends Vehiculo{

    public VehiculoPasajeros(float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
    }

    public VehiculoPasajeros(float precioalquiler, String patente, String marca, Integer kilometraje) {
        super(precioalquiler, patente, marca, kilometraje);
    }

    public VehiculoPasajeros( String patente, String marca) {
        super(patente, marca);
    }
    
}
