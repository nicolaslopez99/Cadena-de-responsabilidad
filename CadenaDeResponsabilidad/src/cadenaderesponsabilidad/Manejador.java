/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

/**
 *
 * @author Guest
 */
import java.util.Scanner;
public class Manejador implements Manejador0{

    private Manejador0 next; 

    public void setNext(Manejador0 m) {
        next = m;
    }
    
    public void consulta(String consulta) {
        
        Manejador1 m1 = new Manejador1();
        this.setNext(m1);
        
        Manejador2 m2 = new Manejador2();
        m1.setNext(m2);
        
        Manejador3 m3 = new Manejador3();
        m2.setNext(m3);
        
        next.consulta(consulta);
    }
  
    
}
