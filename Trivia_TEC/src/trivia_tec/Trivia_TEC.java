//Métodos: ( * = ya implementado en)
/*
+ registrar(Persona p) * (Partida)
+ registrar(Curso c) * (Trivia)
+ topTenEstudiantesConMasUsoComodines() * (Partida)
+ topTenEstudiantesConMasMonedas() * (Partida)
+ verificarCupo() * (Curso)
+ iniciarPartida()    (sería igual a setPartida?)
+ crearPregunta(Pregunta p)
+ topTenEstudiantesConMasPreguntasFormuladas() * (Partida)
+ formularPregunta(Pregunta p)
+ solicitarMatricula(Curso c)
+ mostrarCursosDelProfesor()
+ aprobarMatricula(Estudiante e)
+ asociarPregunta(Pregunta p, Tema t) * (Curso)
+ asociarTema( Tema t, Curso c)
+ editarPregunta(Pregunta p) * (Tema)
+ desabilitarPregunta(Pregunta p) * (Tema)
+ crearTema(Tema t) * (curso)
+ editarTema(Tema t) * (Curso)
+ desabilitarTema(Tema t) * (Curso)
+ agregarEstudiante(Estudiante e, Curso c) * (Trivia)
+ cambiarTema(Tema t) // cambiarTema(String nombreTema) esto aplica para los casos en que pueda recibir un objeto o un string
+ seleccionarTema(Tema t)
+ ganarDominio(Tema t) * (Jugador)
+ pasarPregunta()
+ usarComodin(Pregunta p)
+ responderPregunta(Tema t, Pregunta p, String respuesta)
+ mostrarRespuestaCorrecta(Pregunta p)
+ mostrarTema(Curso c)
+ mostrarPreguntaAleatoria(Tema t)
+ cambiarJugador()
+ finalizarPartida()
+ generarEstadisticasGenerales()
+ verificarCantidadMinimaParticipante() * (Partida)
+ verificarCantidadMaximaParticipante(Curso c) * (Partida)
+ controlarTiempoRespuesta()
+ topTenEstudiantesMasAciertosNivel5()
+ topTenEstudiantesMasFallosNivel1()
+ topTenPreguntasMasAcertadasPorNivel()
*/

package trivia_tec;

import java.util.Vector;

public class Trivia_TEC {

    public static Trivia juego = new Trivia();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PreguntaFV nuevo = new PreguntaFV();
        Vector temp = new Vector();
        temp.add(nuevo);
        Object temp2 = temp.get(0);
        String clase = temp2.getClass().getName();
        if(clase.equalsIgnoreCase("trivia_tec.PreguntaFV")){
            System.out.println(temp2.getClass().getName());
        }
        else{
            System.out.println("no");
        }
        
        
        
        
    }
    
}
