
package situacion.pkg1;


public class Camioneta extends VehiculoCarga implements Alquiler{

    

    public Camioneta(float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
    }

    @Override
    public void precioAlquiler() {
        
        float totalalquiler;
        if(super.getKilometraje()>=50){
            totalalquiler=super.getKilometraje()*20;
        }
        else{
            totalalquiler=super.getPrecioalquiler();
        }
        
        System.out.println("El precio de alquiler de la camioneta por dia es de: "+totalalquiler);
        
    }
    
    
}
