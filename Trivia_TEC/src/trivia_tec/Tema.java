

package trivia_tec;

import java.util.Vector;

//Esta clase agrupa las preguntas segun su contenido, y son el objetivo a alcanzar de los jugadores(Dominar temas).
public class Tema {
    private String nombre;
    private int duracion;//En semanas
    private Vector preguntas = new Vector();//lista tipo vector.

    public Tema() {
    }

    public Tema(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Vector getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Vector preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Tema{" + "nombre=" + nombre + ", duracion=" + duracion + ", preguntas=" + preguntas + '}';
    }
    
    public void editarPregunta(Pregunta p, String nuevoContenido){
        for(int i = 0; i < preguntas.size(); i++){
            Pregunta actual = (Pregunta) preguntas.get(i);
            if(actual == p){
                actual.setContenido(nuevoContenido);
            }
        }
    }
    
    public void desabilitarPregunta(Pregunta p){
        preguntas.remove(p);
    }
    
    public void crearPregunta(Pregunta p){
        preguntas.add(p);
    }
}
