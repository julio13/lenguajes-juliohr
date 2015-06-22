/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaExcepcion;

/**
 *
 * @author Miguel
 */
public class ValidarCaracteres {
    public static void validar(char caracter)throws CaracterExcepcion {
        if(caracter<10)throw new CaracterExcepcion();
        
    }
    
    
}
