/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.ArrayList;
public class ModeloPersistenciaAnimal {
    String ruta="C:\\Users\\T101\\Documents//animalitos.xxx";
    ArrayList<Animal> animales;
        public ModeloPersistenciaAnimal(){
            animales=new ArrayList<Animal>();
        }
    public void guardar(Animal animal)throws Exception {
        
        File file=new File(ruta);
        if(file.exists()){
            animales=buscarTodos();
        }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream ous=new ObjectOutputStream(fos);
        animales.add(animal);
        ous.writeObject(animales);
            System.out.println("Animalitos con exito");
    }
    public ArrayList<Animal> buscarTodos() throws Exception{
        Animal a=new Animal();
     File f=new File(ruta);
     FileInputStream fis=new FileInputStream(f);
     ObjectInputStream ois=new ObjectInputStream(fis);
             animales=(ArrayList<Animal>)ois.readObject();
             return animales;
    }
}
