/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;
import java.util.Calendar;
/**
 *
 * @author Miguel
 */
public class relojitoMejorado {
    public static void main(String[] args) {
        
        /*aqui veremos la forma de crear un Thread usando la vieja tecnica
        *
        */
        
       Thread t1=new Thread(new Runnable(){

           @Override
           public void run() {
               
                while(true){
        try{
            Thread.sleep(1000);
            //Vamos a crear un relojito chafa2
            Calendar cal=Calendar.getInstance();
            int hora=cal.get(Calendar.HOUR);
            int minutos=cal.get(Calendar.MINUTE);
            int segundos=cal.get(Calendar.SECOND);
            int dia=cal.get(Calendar.DATE);
            String horaa=(hora+":"+minutos+":"+segundos);
            System.out.println(horaa);
        }catch(Exception e){
        }
        }
           }
           
       });
       t1.start();
    }
}