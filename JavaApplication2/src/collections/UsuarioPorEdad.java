/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;

/**
 *
 * @author T-107
 */
public class UsuarioPorEdad implements Comparator<Usuario>{

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return (o1.getEdad().compareTo(o2.getEdad()));
    }
    
}
