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
public class Usuario {
    //primer regla del encapsulamiento
   private String nombre;
    private int edad;
    
    public void setNombre(String x){
        nombre=x;
    }
    public void setEdad(int e){
        edad=e;
    }
    
    public String getNombre(){        //imprimir en pantalla
        return nombre;
    }
    public int getEdad(){             //imprimir en pantalla
        return edad;
    }
}
