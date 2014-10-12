

package trivia_tec;

import java.util.Vector;

//Tipo de pregunta que posee varias opciones y varias respuestas correctas.
public class PreguntaSM extends Pregunta{
    private Vector opciones = new Vector();//lista tipo vector.
    private Vector respuestas = new Vector();//lista tipo vector

    public PreguntaSM() {
    }

    public PreguntaSM(String contenido, int dificultad) {
        super(contenido, dificultad);
    }


    public Vector getOpciones() {
        return opciones;
    }

    public void setOpciones(Vector opciones) {
        this.opciones = opciones;
    }

    public Vector getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Vector respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "PreguntaSM{" + "opciones=" + opciones + ", respuestas=" + respuestas + '}';
    }
    
    
}
