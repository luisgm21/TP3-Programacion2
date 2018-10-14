
package situacion.pkg1;


public class Situacion1 {


    public static void main(String[] args) {
        //    public Auto(float preciobase, String aire, String levantacritales, String alarma, String patente, String marca) {

        AutoNuevo A = new AutoNuevo ((float) 200000,"si","si","si",0,"AC 380 KK","Peugeot");
        A.mostrarAuto();
        A.precioVenta();
        
        
        AutoUsado B= new AutoUsado((float)150000,"si","no","si",0,"GDF 434","Fiat");
        B.precioVenta();
        
        
    }
    
}
