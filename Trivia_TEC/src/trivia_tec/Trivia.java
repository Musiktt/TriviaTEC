

package trivia_tec;

//Instancia del juego. Empieza las partidas que se jugarán.

import java.util.Vector;

public class Trivia {
    private Partida partida;
    private Vector cursos = new Vector();
    public Vector profesores = new Vector();

    public Trivia(Partida partida, Vector cursos, Vector profesores) {
        this.partida = partida;
        this.cursos = cursos;
        this.profesores = profesores;
    }
    
    public Trivia() {
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Vector getCursos() {
        return cursos;
    }

    public void setCursos(Vector cursos) {
        this.cursos = cursos;
    }
    
    public void registrar(Curso c){
        cursos.add(c);
    }

    public Vector getProfesores() {
        return profesores;
    }

    public void setProfesores(Vector profesores) {
        this.profesores = profesores;
    }
    
    
    
    @Override
    public String toString() {
        return "Trivia{" + "partida=" + partida + '}';
    }
    
    public void agregarEstudiante(Estudiante e, Curso c){
        for(int i = 0; i < cursos.size(); i++){
           Curso actual = (Curso) cursos.get(i);
           if(actual == c)
               (actual.getEstMatriculados()).add(e);
       }
    }
    
    public boolean verificarProfesor(String ced, String con){
        Profesor actual;
        for(int i = 0; i < profesores.size(); i++){
            actual = (Profesor) profesores.get(i);
            if((actual.getCedula().equalsIgnoreCase(ced)) || (actual.getContraseña().equalsIgnoreCase(con)))
                return true;
        }
        return false;
    }
    public boolean verificarCurso(String c){
        Curso actual;
        for(int i = 0; i < cursos.size(); i++){
            actual = (Curso) cursos.get(i);
            if(actual.getCodigo().equalsIgnoreCase(c))
                return true;
        }
        return false;
    }
    
    public Curso buscarCurso(String c){
        for(int i = 0; i < cursos.size(); i++){
            Curso actual = (Curso) cursos.get(i);
            if(actual.getCodigo().equalsIgnoreCase(c)){
                return actual;
            }
        }
        return null;
    }
    
    public Profesor buscarProfesor(String ced){
        for(int i = 0; i < profesores.size(); i++){
            Profesor actual = (Profesor) profesores.get(i);
            if(actual.getCedula().equalsIgnoreCase(ced))
                return actual;
        }
        return null;
    }
    
    public void agregarProfesor(Profesor p){
        profesores.add(p);
        
    }
    
    public void agregarCurso(Curso c){
        cursos.add(c);
    }
}
