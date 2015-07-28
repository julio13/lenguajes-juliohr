/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class ProbarThreads {
    public static void main(String[] args) {
        //paso 1 creamos el thread
        PrimerThread t1=new PrimerThread();
        SegundoThread t2= new SegundoThread();
        TercerThread t3=new TercerThread();
        //Paso 2 lo ponemos en estado inicializado
        t1.start();
        t2.start();
        t3.start();
        //paso 3 y 4 vienen dados por metodo run
    }
}
