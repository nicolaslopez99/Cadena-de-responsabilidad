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
public class Manejador3 implements Manejador0{
    private Manejador0 next; 

    public void setNext(Manejador0 m) {
        next = m;
    }

    
    public void consulta(String consulta) {
        if(consulta.equals("paul verlaine")){
            System.out.println("Tenemos los libros de paul verlaine en la sede 3");
        } else{
            System.out.println("No tenemos ningun libro de ese autor en ninguna de nuestra librerias");
        }
    }
  
    
}
