
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import situacion.pkg1.Aire;
import situacion.pkg1.Alarma;
import situacion.pkg1.AutoNuevo;
import situacion.pkg1.LevantaCristales;

public class Pruebas {
    
    public Pruebas() {
    }    
    @BeforeClass
    public static void setUpClass() {
    }    
    @AfterClass
    public static void tearDownClass() {
    }    
    @Before
    public void setUp() {
    }   
    @After
    public void tearDown() {
    }
    
    @Test
     public void precioVenta() {
        float resultadop;
        AutoNuevo A = new AutoNuevo ((float)200000,"AC 380 KK","Peugeot","nuevo");            
        LevantaCristales Si = new LevantaCristales();
        Aire S = new Aire();
        Alarma X = new Alarma();
        A.setComponentes(Si);
        A.setComponentes(S);
        A.setComponentes(X);
        resultadop=A.precioVenta();
        float resultado=(float)316000.0;
        assertEquals(resultadop,resultado);        
     }
}
