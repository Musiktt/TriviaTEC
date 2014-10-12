

package trivia_tec;

//Tipo de pregunta con dos únicas opciones. Hereda de Pregunta.
public class PreguntaFV extends Pregunta {
    private String opc1;
    private String opc2;
    private String respuesta;

    public PreguntaFV() {
    }

    public PreguntaFV(String opc1, String opc2, String respuesta, String contenido, int dificultad) {
        super(contenido, dificultad);
        this.opc1 = opc1;
        this.opc2 = opc2;
        this.respuesta = respuesta;
    }

    

    public String getOpc1() {
        return opc1;
    }

    public void setOpc1(String opc1) {
        this.opc1 = opc1;
    }

    public String getOpc2() {
        return opc2;
    }

    public void setOpc2(String opc2) {
        this.opc2 = opc2;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "PreguntaFV{" + "opc1=" + opc1 + ", opc2=" + opc2 + ", respuesta=" + respuesta + '}';
    }
    
    
}
