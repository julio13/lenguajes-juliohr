/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author T-107
 */
public class ProbarEncapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Usuario u1=new Usuario();
       u1.setEdad(21);
        System.out.println("Tu edad es:"+u1.getEdad());
    }
    
}
