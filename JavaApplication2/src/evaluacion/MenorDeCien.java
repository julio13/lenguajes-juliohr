/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author T-107
 */
public class MenorDeCien extends Exception{
    public MenorDeCien(){
        super("Superas el 100% checa el prcentaje"+"vuelve a imgresar el porcentaje");
    }
}
