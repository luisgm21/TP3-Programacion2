
package situacion.pkg1;

import java.util.ArrayList;

public class ParqueAutomotor {
    
    
    public ParqueAutomotor(){
        
    }
    
    public ArrayList IngresarVehiculos(){
        
        ArrayList lista = new ArrayList();//vectores
        
        
        AutoNuevo A = new AutoNuevo ((float) 200000,"AC 380 KK","Peugeot","nuevo");       
        System.out.println("");
        LevantaCristales Si = new LevantaCristales();
        Aire S = new Aire();
        Alarma X = new Alarma();
        A.setComponentes(Si);
        A.setComponentes(S);
        A.setComponentes(X);
        A.precioVenta();
        lista.add(A);
        
        AutoNuevo D =new AutoNuevo ((float)210000,"ABC 777 BT","Fiat","nuevo");
        System.out.println("");
        LevantaCristales Si1 = new LevantaCristales();
        Alarma X1 = new Alarma();
        D.setComponentes(Si1);
        D.setComponentes(X1);
        D.precioVenta();
        lista.add(D);
        
        AutoNuevo F =new AutoNuevo ((float) 30000,"DCF 423 YR","Volkswagen","nuevo");
        System.out.println("");
        LevantaCristales Si2 = new LevantaCristales();
        F.setComponentes(Si2);
        F.precioVenta();
        lista.add(F);
        
        AutoUsado B= new AutoUsado((float)150000,(float)0,"GDF 434","Fiat","usado");
        System.out.println("");
        LevantaCristales Si3 = new LevantaCristales();
        Aire S3 = new Aire();
        Alarma X3 = new Alarma();
        B.setComponentes(Si3);
        B.setComponentes(S3);
        B.setComponentes(X3);
        B.precioVenta();
        lista.add(B);
        
        Camion C=new Camion(300,"ASD 321","mercedez benz",45);        
        
        System.out.println("");
        C.precioAlquiler();
        lista.add(C);
        
        Camion Z=new Camion(300,"REA 222","mercedez benz",100);        
        
        System.out.println("");
        Z.precioAlquiler();
        lista.add(Z);
        
        Camion R=new Camion(300,"MFA 666","mercedez benz",55);        
        
        System.out.println("");
        R.precioAlquiler();
        lista.add(R);
        
        Camioneta Ca=new Camioneta(300,"YUT 379","Toyota",62);        
        
        System.out.println("");
        Ca.precioAlquiler();
        lista.add(Ca);
        
        Camioneta Co=new Camioneta(300,"AVC 987","Toyota",50);        
        
        System.out.println("");
        Co.precioAlquiler();
        lista.add(Co);
                
        MiniBus Mini = new MiniBus(200,"GFD 423","Audi",12);
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
        return (lista);
    }   
    
     
     
   
}
    
  

