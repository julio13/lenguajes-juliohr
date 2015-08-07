/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardarImagen;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.ArrayList;
public class PersistenciaGaleria {
    ArrayList<Galeria>galeria=new ArrayList<Galeria>();
    public void guardar(Galeria g)throws Exception{
        File f=new File("galeria");
        if(f.exists()){
            galeria=leerTodas();
            }
        FileOutputStream f0s=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(f0s);
        galeria.add(g);
        oos.writeObject(galeria);
        //aqui termina el metodo guardar
        System.out.println("Datos guardados exitosamente");
    }
    public ArrayList<Galeria>leerTodas()throws Exception{
        File f=new File("galeria");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        galeria=(ArrayList<Galeria>)ois.readObject();
        return galeria;
    }
}
