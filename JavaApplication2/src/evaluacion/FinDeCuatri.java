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
public class FinDeCuatri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MenorDeCien{
        // Creamos un objeto de tipo Examen parcial
        ExamenParcial eParcial= new ExamenParcial();
        eParcial.setCalificacion(10);
        eParcial.setPorcentaje(0.8f);
        ExamenFinal eFinal =new ExamenFinal();
        eFinal.setCalificacion(10);
        eFinal.setPorcentaje(0.7f);
        //creamos modelo 
        ModeloEvaluacion modelo=new ModeloEvaluacion();
        System.out.println(modelo.evaluar(eParcial,eFinal));
    }
    
}
