

package trivia_tec;

//Instancia de los participantes de una única partida.

import java.util.Vector;

public class Jugador {
    private Estudiante estudiante;
    private Vector temasDom = new Vector();
    private int comodinesUsados;
    private int monedas; //Empieza con 50 monedas.
    private int vidas; //Empieza con 3 vidas.  
    private int tiempo; //Dispone de 30 segundos en cada pregunta.

    public Jugador() {
    }

    public Jugador(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.comodinesUsados = 0;
        this.monedas = 50;
        this.vidas = 3;
        this.tiempo = 30;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getComodinesUsados() {
        return comodinesUsados;
    }

    public void setComodinesUsados(int comodinesUsados) {
        this.comodinesUsados = comodinesUsados;
    }

    public Vector getTemasDom() {
        return temasDom;
    }

    public void setTemasDom(Vector temasDom) {
        this.temasDom = temasDom;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "estudiante=" + estudiante + ", comodinesUsados=" + comodinesUsados + ", monedas=" + monedas + ", vidas=" + vidas + ", tiempo=" + tiempo + '}';
    }
    
    public void ganarDominio(Tema t){
        temasDom.add(t);
    }   
}
