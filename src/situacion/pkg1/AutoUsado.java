
package situacion.pkg1;


public class AutoUsado extends Auto implements Venta,Alquiler{

    public AutoUsado(float preciobase, String aire, String levantacritales, String alarma, float precioalquiler, String patente, String marca) {
        super(preciobase, aire, levantacritales, alarma, precioalquiler, patente, marca);
    }

    public AutoUsado( float precioalquiler, String patente, String marca) {
        super(precioalquiler, patente, marca);
    }

  
    @Override
    public void precioVenta() {
        double preciototal,utilidad=0;
        double poraire=0,porcristales=0,poralarma=0;
        if(super.getAire()=="si"){
            poraire=super.getPreciobase()*0.02;
        }
        if(super.getLevantacritales()=="si"){
            porcristales=super.getPreciobase()*0.05;
        }
        if(super.getAlarma()=="si"){
            poralarma=super.getPreciobase()*0.01;
        }
        utilidad=super.getPreciobase()*0.35;
        preciototal=super.getPreciobase()+poralarma+poraire+porcristales+utilidad;
        System.out.println("precio total de la venta: "+preciototal); 
    }

    @Override
    public void precioAlquiler() {
        
        float alquilerdia;
        alquilerdia=super.getPrecioalquiler()+50;
        
        System.out.println("El precio de alquiler de un auto por dia es: "+alquilerdia);
        
    }

}
