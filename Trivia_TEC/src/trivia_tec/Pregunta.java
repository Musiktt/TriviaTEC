

package trivia_tec;

//Clase madre que reune características comunes de preguntas de Falso/Verdadero, Selección Múltiple y Selección Única.
public class Pregunta {
    private String contenido;
    private int dificultad;
    private int vecesAcertada;

    public Pregunta() {
    }

    public Pregunta(String contenido, int dificultad) {
        this.contenido = contenido;
        this.dificultad = dificultad;
        this.vecesAcertada = 0;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getVecesAcertada() {
        return vecesAcertada;
    }

    public void setVecesAcertada(int vecesAcertada) {
        this.vecesAcertada = vecesAcertada;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "contenido=" + contenido + ", dificultad=" + dificultad + ", vecesAcertada=" + vecesAcertada + '}';
    }
    
    
}
