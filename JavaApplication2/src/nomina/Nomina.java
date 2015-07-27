/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author Miguel
 */
import java.io.*;
public class Nomina implements Serializable {
    private Usuario usuario;
    private float sueldobase;
    private int horaslaboradas;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }

    public int getHoraslaboradas() {
        return horaslaboradas;
    }

    public void setHoraslaboradas(int horaslaboradas) {
        this.horaslaboradas = horaslaboradas;
    }
    
}
