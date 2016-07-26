public class Persona {
    //Atributos
    String nombre;
    String apellidos;
    int edad;
    String estadoCivil;
    String Sexo;
    //Constructores
    //Métodos
    public String obtenerNombreCompleto() {
        return this.nombre+" "+this.apellidos;
    } 
    public void preguntarNombre(Persona p){
        System.out.println("Mi nombre es "+p.obtenerNombreCompleto());
    }
}