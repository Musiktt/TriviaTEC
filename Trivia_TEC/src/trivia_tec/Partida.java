

package trivia_tec;

import java.util.Vector;

//En esta clase se implementan los jugadores en una instancia del juego, se ajusta la dificultad y se cuenta la cantidad de participantes.
public class Partida {
    private String nombre;
    private Vector participantes = new Vector();// Lista tipo vector
    private int cantParticipantes;
    private int dificultad; //De 1 a 5.

    public Partida() {
    }

    public Partida(String nombre, int cantParticipantes, int dificultad) {
        this.nombre = nombre;
        this.cantParticipantes = cantParticipantes;
        this.dificultad = dificultad;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Vector participantes) {
        this.participantes = participantes;
    }

    public int getCantParticipantes() {
        return cantParticipantes;
    }

    public void setCantParticipantes(int cantParticipantes) {
        this.cantParticipantes = cantParticipantes;
    }

    public int getDificultad() { 
        return dificultad;
    }
    
    //Se debe validar que la dificultad esté entre 1 y 5.
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
            
    }
    
    
    @Override
    public String toString() {
        return "Partida{" + "nombre=" + nombre + ", participantes=" + participantes + ", cantParticipantes=" + cantParticipantes + ", dificultad=" + dificultad + '}';
    }
    
    public void registrar(Jugador jugador){
        participantes.add(jugador);
    }
    
    public Jugador topTenEstudiantesConMasUsoComodines(){
        Jugador mayor = null;
        for(int i = 0; i < participantes.size(); i++){
            Jugador actual = (Jugador) participantes.get(i);
            if(mayor == null)
                mayor = actual;
            else{
                if(actual.getComodinesUsados()> mayor.getComodinesUsados())
                    mayor = actual;
            }
        }
        return mayor;
    }
    
    public Jugador topTenEstudiantesConMasMonedas(){
        Jugador mayor = null;
        for(int i = 0; i < participantes.size(); i++){
            Jugador actual = (Jugador) participantes.get(i);
            if(mayor == null)
                mayor = actual;
            else{
                if(actual.getMonedas()> mayor.getMonedas())
                    mayor = actual;
            }
        }
        return mayor;
    }
    
    public Jugador topTenEstudiantesConMasPreguntasFormuladas(){
        Jugador mayor = null;
        for(int i = 0; i < participantes.size(); i++){
            Jugador actual = (Jugador) participantes.get(i);
            if(mayor == null)
                mayor = actual;
            else{
                int x = (actual.getEstudiante()).getPregFormuladas();
                int y = (mayor.getEstudiante()).getPregFormuladas();
                if(x > y)
                    mayor = actual;
            }
        }
        return mayor;
    }
    
    public boolean verificarCantidadMinimaParticipante(){
        if(participantes.size() > 2)
            return true;
        return false;
    }
    
    public boolean verificarCantidadMaximaParticipante(Curso c){
        if(participantes.size() <= c.getCupo())
            return true;
        return false;
    }
    
    
}
