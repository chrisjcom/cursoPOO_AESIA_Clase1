public class Persona {
    //Atributos
    String nombre;
    String apellidos;
    int edad;
    String estadoCivil;
    String Sexo;
    //Constructores
    //Métodos
    public String obtenerNombreCompleto(){
        String nombreCompleto;
        nombreCompleto = this.nombre+" "+this.apellidos;
        return nombreCompleto;
    }
}