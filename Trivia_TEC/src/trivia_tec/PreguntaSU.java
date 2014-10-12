

package trivia_tec;

import java.util.Vector;

//Tipo de pregunta con varias opciones y una sola respuesta. Hereda de Pregunta.
public class PreguntaSU extends Pregunta{
    private Vector opciones = new Vector();//lista tipo vector.
    private String respuesta;

    public PreguntaSU() {
    }

    public PreguntaSU(String respuesta, String contenido, int dificultad, int vecesAcertada) {
        super(contenido, dificultad, vecesAcertada);
        this.respuesta = respuesta;
    }

    

    public Vector getOpciones() {
        return opciones;
    }

    public void setOpciones(Vector opciones) {
        this.opciones = opciones;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "PreguntaSU{" + "opciones=" + opciones + ", respuesta=" + respuesta + '}';
    }
    
    
}
