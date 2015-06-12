/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal raro= new Animal();
        //raro.setEdad(2);
        //raro.setNombre("Rareza");
     Pollo p1=new Pollo();
     p1.setNombre("pollito pio");
     
     Leon l1=new Leon();
     l1.setNombre("simba");
     
     Leon l2=new Leon();
     l2.setNombre("no lo se");
     
     Delfin d1= new Delfin();
     d1.setNombre("flipper");
     
     Tortuga t=new Tortuga();
     t.setNombre("juan");
     
     ComportamientoRuido animales[]=new ComportamientoRuido[4];
     animales[0]=p1;
     animales[1]=l1;
     animales[2]=l2;
     animales[3]=d1;
     
     
     for(ComportamientoRuido algo:animales ){
         System.out.println(  algo.hacerRuido());
         
        
     }
         
   
    }
    
}
