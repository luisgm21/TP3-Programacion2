
package situacion.pkg1;


public class Situacion1 {


    public static void main(String[] args) {
        
        AutoNuevo A = new AutoNuevo ((float) 200000,"si","si","si","AC 380 KK","Peugeot");       
        A.precioVenta();
        System.out.println("");
        
        AutoNuevo D =new AutoNuevo ((float)210000,"no","no","si","ABC 777 BT","Fiat");
        D.precioVenta();
        System.out.println("");
        
        AutoNuevo F =new AutoNuevo ((float) 30000,"no","si","si","DCF 423 YR","Volkswagen");
        F.precioVenta();
        System.out.println("");
        
        AutoUsado B= new AutoUsado((float)150000,"si","no","si",0,"GDF 434","Fiat");
        B.precioVenta();
        System.out.println("");
        
        Camion C=new Camion(300,"ASD 321","mercedez benz",45);        
        C.precioAlquiler();
        System.out.println("");
                
        MiniBus Mini = new MiniBus(200,"GFD 423","Audi");
        Mini.precioAlquiler();
        System.out.println("");
                
        AutoUsado auto =new AutoUsado(150,"OOD 654","BMW");
        auto.precioAlquiler();
        System.out.println("");
    }
    
}
