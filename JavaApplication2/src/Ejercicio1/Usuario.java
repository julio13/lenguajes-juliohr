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
public class Usuario {
    private String nombre;
    private int edad;
    private String email;
 private Direccion direccion;
 
 public Usuario(){
     //CONSTRUCTOR POR DEFECTO
 }
 
 public Usuario(String nombre, int edad, String email, Direccion direccion){
     this.edad=edad;
     this.nombre=nombre;
     this.email=email;
     this.direccion=direccion;
 //Constructor para inicializar todos los atributos    
 }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
 
}
    