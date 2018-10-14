
package situacion.pkg1;

import java.util.ArrayList;


public class Situacion1 {


    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();//vectores
        
        
        AutoNuevo A = new AutoNuevo ((float) 200000,"si","si","si","AC 380 KK","Peugeot","nuevo");       
        A.precioVenta();
        System.out.println("");
        lista.add(A);
        
        AutoNuevo D =new AutoNuevo ((float)210000,"no","no","si","ABC 777 BT","Fiat","nuevo");
        D.precioVenta();
        System.out.println("");
        lista.add(D);
        
        AutoNuevo F =new AutoNuevo ((float) 30000,"no","si","si","DCF 423 YR","Volkswagen","nuevo");
        F.precioVenta();
        System.out.println("");
        lista.add(F);
        
        AutoUsado B= new AutoUsado((float)150000,"si","no","si",0,"GDF 434","Fiat","usado");
        B.precioVenta();
        System.out.println("");
        lista.add(B);
        
        Camion C=new Camion(300,"ASD 321","mercedez benz",45);        
        C.precioAlquiler();
        System.out.println("");
        lista.add(C);
        
        Camion Z=new Camion(300,"REA 222","mercedez benz",100);        
        Z.precioAlquiler();
        System.out.println("");
        lista.add(Z);
        
        Camion R=new Camion(300,"MFA 666","mercedez benz",55);        
        R.precioAlquiler();
        System.out.println("");
        lista.add(R);
        
        Camioneta Ca=new Camioneta(300,"YUT 379","Toyota",62);        
        Ca.precioAlquiler();
        System.out.println("");
        lista.add(Ca);
        
        Camioneta Co=new Camioneta(300,"AVC 987","Toyota",50);        
        Co.precioAlquiler();
        System.out.println("");
        lista.add(Co);
                
        MiniBus Mini = new MiniBus(200,"GFD 423","Audi");
        Mini.precioAlquiler();
        System.out.println("");
        lista.add(Mini);
                
        AutoUsado auto =new AutoUsado(150,"OOD 654","BMW", "usado");
        auto.precioAlquiler();
        System.out.println("");
        lista.add(auto);
        
        for (Object Object : lista) {
            System.out.println(Object);
        }
    }
    
}
