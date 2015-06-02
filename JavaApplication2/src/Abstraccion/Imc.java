/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
    private float peso;
   private float altura;
   public Imc(){
     
   }
  
   public Imc(float p, float a){
   peso=p;
   altura=a;
            }
   public String calcular(){
       float imc=peso/(altura*altura);
     return  "tu pewso es:"+imc;
   }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
