/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;

import edu.cecar.controladores.ControladorEmpleado;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author 1099965188
 */
public class TestControladorEmpleado {
    
    //public TestControladorEmpleado() {
    //}
    
   @Test
 public void testConexionBaseDatos(){
 
     try {
         ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
         
         System.out.println("Conexion exitosa");
     } catch (Exception ex) {
         
         fail("Error de Conexion");
         
         Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE, null,ex);
     }
 
 }
    }
    
   
    
    /*@BeforeClass
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
 */
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

