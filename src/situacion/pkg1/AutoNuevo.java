
package situacion.pkg1;


public class AutoNuevo extends Auto implements Venta{


    
    public AutoNuevo(float preciobase, String aire, String levantacritales, String alarma, float precioalquiler, String patente, String marca) {
        super(preciobase, aire, levantacritales, alarma, precioalquiler, patente, marca);
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
        utilidad=super.getPreciobase()*0.50;
        
        preciototal=super.getPreciobase()+poralarma+poraire+porcristales+utilidad;
        System.out.println("precio total de la venta: "+preciototal);        
    }
    
    public void mostrarAuto(){
        System.out.println("marca: "+super.getMarca());
    }
    
}
