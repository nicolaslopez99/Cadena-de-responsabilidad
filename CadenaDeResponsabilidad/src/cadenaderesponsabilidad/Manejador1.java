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
public class Manejador1 implements Manejador0{
    private Manejador0 next;

    public void setNext(Manejador0 m) {
        next = m;
    }

    public void consulta(String consulta) {
        if(consulta.equals("agatha christie")){
            System.out.println("Tenemos los libros de agatha christie en la sede 1");
        } else{
            next.consulta(consulta);
        }
    }   
}
