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
public class Manejador2 implements Manejador0{
    private Manejador0 next; 

    public void setNext(Manejador0 m) {
        next = m;
    }
    
    public void consulta(String consulta) {
        if(consulta.equals("santiago posteguillo")){
            System.out.println("Tenemos los libros de santiago posteguillo en la sede 2");
        } else{
            next.consulta(consulta);
        }
    }
    
}
