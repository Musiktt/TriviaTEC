

package trivia_tec;

//Clase madre que reune características comunes entre estudiantes y profesores.
public class Persona {
    private String nombre;
    private String cedula;
    private String correo;
    private String contraseña;
    private String fRegistro;

    public Persona() {
    }

    public Persona(String nombre, String cedula, String correo, String contraseña, String fRegistro) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fRegistro = fRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(String fRegistro) {
        this.fRegistro = fRegistro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", fRegistro=" + fRegistro + '}';
    }
    
    
}
