
package situacion.pkg1;


public class MiniBus extends VehiculoPasajeros implements Alquiler{
    
    private Integer plazas;

   

    public MiniBus(float precioalquiler, String patente, String marca, Integer plazas) {
        super(precioalquiler, patente, marca);
        this.plazas=plazas;
    }


    
  
    @Override
    public void precioAlquiler() {
        
        float alquilerdia;
        
        alquilerdia=super.getPrecioalquiler()+(250*plazas) ;
        
        
        System.out.println("El precio para alquilar por dia un minibus es :"+alquilerdia);
        
    }
    
    public String toString(){
        return "mini bus" + " " + "precio alquiler: "+ super.getPrecioalquiler()+ " " + "patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca();
            
    }



    
}
