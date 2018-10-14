
package situacion.pkg1;


public class AutoNuevo extends Auto implements Venta{


    
    public AutoNuevo(float preciobase, String aire, String levantacritales, String alarma, String patente, String marca, String condicion) {
        super(preciobase, aire, levantacritales, alarma, patente, marca, condicion);
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
        System.out.println("precio total auto 0KM : "+preciototal);        
    }
    public String toString(){
        return "auto"+ " " + "Precio base: " + super.getPreciobase()+ " "+"patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca()+ " "+ "condicion: " + super.getCondicion();
            
    }
   
    
}
