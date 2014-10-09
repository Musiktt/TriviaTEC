

package trivia_tec;

import java.util.Vector;

//Instancia que permite guardar la información de los jugadores, así como permitirles ser parte del juego y de varios cursos. Hereda de Persona.
public class Estudiante extends Persona{
    private int carne;
    private Vector cursos;
    private Vector pregCorrectas;
    private Vector pregIncorrectas;
    private int comodinesUsados;
    private int pregFormuladas;

    public Estudiante() {
    }

    public Estudiante(int carne, String nombre, String cedula, String correo, String contraseña, String fRegistro) {
        super(nombre, cedula, correo, contraseña, fRegistro);
        this.carne = carne;
        this.comodinesUsados = 0;
        this.pregFormuladas = 0;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public Vector getCursos() {
        return cursos;
    }

    public void setCursos(Vector cursos) {
        this.cursos = cursos;
    }

    public Vector getPregCorrectas() {
        return pregCorrectas;
    }

    public void setPregCorrectas(Vector pregCorrectas) {
        this.pregCorrectas = pregCorrectas;
    }

    public Vector getPregIncorrectas() {
        return pregIncorrectas;
    }

    public void setPregIncorrectas(Vector pregIncorrectas) {
        this.pregIncorrectas = pregIncorrectas;
    }

    public int getComodinesUsados() {
        return comodinesUsados;
    }

    public void setComodinesUsados(int comodinesUsados) {
        this.comodinesUsados = comodinesUsados;
    }

    public int getPregFormuladas() {
        return pregFormuladas;
    }

    public void setPregFormuladas(int pregFormuladas) {
        this.pregFormuladas = pregFormuladas;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "carne=" + carne + ", cursos=" + cursos + ", pregCorrectas=" + pregCorrectas + ", pregIncorrectas=" + pregIncorrectas + ", comodinesUsados=" + comodinesUsados + '}';
    }
    
    public void formularPregunta(Pregunta p){
        
    }
    
}
