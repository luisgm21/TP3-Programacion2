
package situacion.pkg1;

import java.util.ArrayList;


public class Auto extends VehiculoPasajeros {
    
    ArrayList componentes = new ArrayList();
    private float preciobase;
    private String condicion;
   
   

    public Auto(float preciobase,String patente, String marca, String condicion) {
        super(patente, marca);
        this.preciobase = preciobase;
        this.condicion = condicion;
    }
    
   
    
    public Auto(float preciobase, float precioalquiler, String patente, String marca, String condicion) {
        super(precioalquiler, patente, marca);
        this.preciobase = preciobase;
        this.condicion = condicion;
    }
    

    public float getPreciobase() {
        return preciobase;
    }

    
     
    public String getCondicion() {
        return condicion;
    }

    public void getComponentes(){
        for(Object componentes : componentes){
            System.out.println(componentes);
        }
    }
    

    public void setComponentes(Object componentes) {
        this.componentes.add(componentes);
    }


}
