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
public class CaracterExcepcion extends Exception{
    public CaracterExcepcion(){
        super("Te pasaste del rango de los caracteres!!,no se puede"+"registrar lo que apuntaste");
    }
    }