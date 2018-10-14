
package situacion.pkg1;


public class Camioneta extends VehiculoCarga implements Alquiler{

    

    public Camioneta(float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
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
    
    
}
