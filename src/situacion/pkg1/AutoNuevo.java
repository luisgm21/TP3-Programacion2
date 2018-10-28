
package situacion.pkg1;

public class AutoNuevo extends Auto implements Venta{

    public AutoNuevo(float preciobase,String patente, String marca, String condicion) {
        super(preciobase,patente, marca, condicion);
    }

    @Override
    public float precioVenta() {
        double preciototal,utilidad=0;
        double poraire=0,porcristales=0,poralarma=0;
        
        for(Object componentes :componentes){
            if(componentes.getClass()== LevantaCristales.class){
                 porcristales=super.getPreciobase()*0.05;
            }
            if(componentes.getClass()== Aire.class){
                poraire=super.getPreciobase()*0.02;
            }
            if(componentes.getClass()==Alarma.class){
                 poralarma=super.getPreciobase()*0.01;
            }
       
        }        
        utilidad=super.getPreciobase()*0.50;       
        preciototal=super.getPreciobase()+poralarma+poraire+porcristales+utilidad;
        System.out.println("precio total auto 0KM : "+preciototal); 
        return (float)preciototal;
    }
    
    public String toString(){
        return "auto"+ " " + "Precio base: " + super.getPreciobase()+ " "+"patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca()+ " "+ "condicion: " + super.getCondicion();            
    }
   
    
}
