

package trivia_tec;

import java.util.Vector;

//Instancia del programa que permite el registro tanto de temas como de estudiantes, así como un profesor asignado.
public class Curso {
    private String nombre;
    private String codigo;
    private int cupo;
    private int semestre;
    private int año;
    private Vector temas = new Vector();//lista
    private Vector estMatriculados = new Vector();//lista
    private Profesor profesor;

    public Curso() {
    }

    public Curso(String nombre, String codigo, int cupo, int semestre, int año, Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cupo = cupo;
        this.semestre = semestre;
        this.año = año;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Vector getTemas() {
        return temas;
    }

    public void setTemas(Vector temas) {
        this.temas = temas;
    }

    public Vector getEstMatriculados() {
        return estMatriculados;
    }

    public void setEstMatriculados(Vector estMatriculados) {
        this.estMatriculados = estMatriculados;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", codigo=" + codigo + ", cupo=" + cupo + ", semestre=" + semestre + ", a\u00f1o=" + año + ", temas=" + temas + ", estMatriculados=" + estMatriculados + ", profesor=" + profesor + '}';
    }
    
    public boolean verificarCupo(){
        if((estMatriculados.size())<cupo)
            return true;
        else
            return false;
    }
    
    public void asociarPregunta(Pregunta p, Tema t){
       for(int i = 0; i < temas.size(); i++){
           Tema actual = (Tema) temas.get(i);
           if(actual == t)
               (actual.getPreguntas()).add(p);
       }
   }
    
    public void crearTema(Tema t){
        temas.add(t);
    }
    
    public void editarTema(Tema t, String editado){
      //wut?
        for(int i = 0; i < temas.size(); i++){
            Tema actual = (Tema) temas.get(i);
            if(actual == t){
                actual.setNombre(editado);
            }
        }
    }
    
    public void desabilitarTema(Tema t){
        temas.remove(t);
    }
    
    public boolean verificarTema(String n){
        Tema actual;
        for(int i = 0; i<temas.size(); i++){
            actual = (Tema) temas.get(i);
            if(actual.getNombre().equalsIgnoreCase(n)){
                return true;
            }
        }
        return false;
    }
    
    public Tema buscarTema(String n){
        Tema actual;
        for(int i = 0; i<temas.size(); i++){
            actual = (Tema) temas.get(i);
            if(actual.getNombre().equalsIgnoreCase(n)){
                return actual;
            }
        }
        return null;
    }
    
    
    
    public boolean responderPregunta(Tema t, Object p, String r){
       return true; 
    }
}
