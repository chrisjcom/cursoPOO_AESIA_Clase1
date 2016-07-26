public class Persona {
    //Atributos
    static int personas;
    private String nombre;
    private String apellidos;
    private int edad;
    private String estadoCivil;
    private String Sexo;
    //Constructores
    public Persona() {
        personas++;
    }

    public Persona(String nombre, String apellidos) {
        setNombre(nombre);
        setApellidos(apellidos);
        this.personas++;
    }
    //Métodos
    /* Getters y Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setEdad(int edad) {
        if(edad > 0) {
            this.edad = edad;
        }
    }
    public int getEdad(){
        return this.edad;
    }
    /* Crear otros setters y getters */
    public String obtenerNombreCompleto() {
        String nombreCompleto;
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNombre())
          .append(" ")
          .append(this.getApellidos());
        nombreCompleto = sb.toString();
        return nombreCompleto;
    } 
    public void preguntarNombre(Persona p) {
        System.out.println("Mi nombre es "+p.obtenerNombreCompleto());
    }
}