
package situacion.pkg1;


public class MiniBus extends VehiculoPasajeros implements Alquiler{

   

    public MiniBus(float precioalquiler, String patente, String marca/*, Integer kilometraje*/) {
        super(precioalquiler, patente, marca/*, kilometraje*/);
    }


    
  
    @Override
    public void precioAlquiler() {
        
        float alquilerdia;
        
        alquilerdia=super.getPrecioalquiler()+250;
        
        
        System.out.println("El precio para alquilar por dia un minibus es :"+alquilerdia);
        
    }
    
    public String toString(){
        return "mini bus" + " " + "precio alquiler: "+ super.getPrecioalquiler()+ " " + "patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca();
            
    }



    
}
