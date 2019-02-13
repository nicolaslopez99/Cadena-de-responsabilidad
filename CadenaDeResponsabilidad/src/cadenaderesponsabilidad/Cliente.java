/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;


import java.util.Scanner;
/**
 *
 * @author Guest
 */
public class Cliente {
    public static void main(String[] args){
        Manejador m = new Manejador();
        System.out.println("Que autor desea buscar?");
        Scanner i = new Scanner(System.in);
        String consulta1 = i.nextLine();
        m.consulta(consulta1); 
    }
    
}
