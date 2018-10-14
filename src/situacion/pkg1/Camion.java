
package situacion.pkg1;


public class Camion extends VehiculoCarga implements Alquiler{

    
    
    public Camion(float precioalquiler, String patente, String marca, Integer kilometraje/*, float dia*/) {
        super(precioalquiler, patente, marca, kilometraje/*, dia*/);
    }

   
    
  

    @Override
    public void precioAlquiler() {
        float totalalquiler;
        if(super.getKilometraje()>50){
            totalalquiler=super.getPrecioalquiler()+200;
        }
        else{
            totalalquiler=super.getPrecioalquiler();
        }
        
        System.out.println("El precio de alquiler del camion por dia es de: "+totalalquiler);
        
    }
    
    public String toString(){
        return "camion" + " " + "precio alquiler: "+ super.getPrecioalquiler()+ " " + "patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca();
            
    }

    
}
