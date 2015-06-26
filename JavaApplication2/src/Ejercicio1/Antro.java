/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author T-107
 */
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion d1=new Direccion(55138,"Ecatepunk");
        
        Usuario u=new Usuario("juan",42,"jcampos@gmail.com", d1);
        System.out.println(u.getDireccion().getMunicipio());
                Bebida bebida=new Bebida();
               bebida.setTipo("alcoholicas");
                String[]reco=bebida.obtenerRecomendaciones();
                for(String be:reco){
                    System.out.println("Bebida:"+be);
                }
                
    }
    
}
