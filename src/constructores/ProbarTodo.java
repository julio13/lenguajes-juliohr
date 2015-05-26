/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-107
 */
public class ProbarTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //en el metodo main los constructores ya se usan ejem;"5"
        
        Test1 objeto1=new Test1(5);
        //   REFERENCIA  | INSTANCIA CON LA PALABRA #NEW" ES UN CONNSTRUCTOR 
        Test1 objeto2=new Test1();
        
        
        JFrame ventana=new JFrame("mi primer ve ntanita");   //crear una ventana visual "JFrame"
        ventana.setSize(400, 400);            //tamaño de la ventana
        ventana.setVisible(true);
        
        
    }
    
}
