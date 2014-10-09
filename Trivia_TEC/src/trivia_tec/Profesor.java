

package trivia_tec;

import java.util.Vector;

//Controla los cursos, aceptando estudiantes nuevos asi como regulando tanto los temas como las preguntas. Heredan de Persona.
public class Profesor extends Persona{
    private Vector cursos;//lista

    public Profesor() {
    }

    public Profesor(String nombre, String cedula, String correo, String contraseña, String fRegistro) {
        super(nombre, cedula, correo, contraseña, fRegistro);
    }  

    public Vector getCursos() {
        return cursos;
    }

    public void setCursos(Vector cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" + "cursos=" + cursos + '}';
    }
    
   
    
}
