
package situacion.pkg1;


public class AutoUsado extends Auto implements Venta,Alquiler{

    public AutoUsado(float preciobase, float precioalquiler, String patente, String marca, String condicion) {
        super(preciobase, precioalquiler, patente, marca, condicion);
    }

    public AutoUsado( float precioalquiler, String patente, String marca, String condicion) {
        super(precioalquiler, patente, marca, condicion);
    }

  
    @Override
    public void precioVenta() {
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
            System.out.println(componentes.getClass());
            
        }
        utilidad=super.getPreciobase()*0.35;
        preciototal=super.getPreciobase()+poralarma+poraire+porcristales+utilidad;
        System.out.println("precio total auto usado: "+preciototal); 
    }

    @Override
    public void precioAlquiler() {
        
        float alquilerdia;
        alquilerdia=super.getPrecioalquiler()+50;
        
        System.out.println("El precio de alquiler de un auto por dia es: "+alquilerdia);
        
    }
    
    
    public String toString(){
        return "auto"+ " " + "Precio base: " + super.getPreciobase()+ " "+ "precio alquiler: "+ super.getPrecioalquiler()+ " " + "patente: "+ super.getPatente()+ " " + "marca: "+ super.getMarca()+ " "+ "condicion: " + super.getCondicion();
            
    }

}
