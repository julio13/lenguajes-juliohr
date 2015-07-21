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
public class ModeloPersistenciaAnimal {
    public void guardar(Animal animal)throws Exception {
        //paso 1 crear el archivo donde se guardara el animal
        File file=new File("C:\\Users\\T101\\Documents\\animalitos.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream ous=new ObjectOutputStream(fos);
        ous.writeObject(animal);
            System.out.println("Animalitos con exito");
    }
}
