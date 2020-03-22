/**
 *
 * @author Carlos Albero Raxtum 
 * Carnet 19721
 */

package hoja7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssociationTest {
    
    public AssociationTest() {
    }
    @Test
    public void testGetValor() {
        System.out.println("INSERTAR y BUSCAR ASOCIACIÓN");
        Association instance = new Association(); //Instanciación
        Object key ="Casa"; //Palabra español
        Object valor = "House";  //Traducción ingles
        instance.addAsociation(key, valor);
        
        Object expResult = "House"; //La palabra esperada en ingles 
        Object result = instance.getValor();
        
        assertEquals(expResult, result); //Comparación

    }
    
}
