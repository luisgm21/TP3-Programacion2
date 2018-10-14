
package situacion.pkg1;


public class Camioneta extends VehiculoCarga implements Alquiler{

    

    public Camioneta(float precioalquiler, String patente, String marca, Integer kilometraje) {
        super(precioalquiler, patente, marca, kilometraje);
    }

    @Override
    public void precioAlquiler() {
        
        float totalalquiler;
        float auxiliar; 
        if(super.getKilometraje()>50){
            auxiliar=(super.getKilometraje()-50)*20;
            totalalquiler=super.getPrecioalquiler()+auxiliar ;
        }
        else{
            totalalquiler=super.getPrecioalquiler();
        }
        
        System.out.println("El precio de alquiler de la camioneta por dia es de: "+totalalquiler);
        
    }
    
    public String toString(){
        return "camioneta" + " " + "precio alquiler: "+ super.getPrecioalquiler()+ " " + "patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca();
            
    }

    
    
}
