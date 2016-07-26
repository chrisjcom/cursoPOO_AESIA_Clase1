public class Persona extends Object{
    //Atributos
    static int personas;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String sexo;
    //Constructores
    public Persona() {
        this.personas++;
    }

    public Persona(String nombre, String apellidos, int edad, String sexo) {
        this.personas++;
        setNombre(nombre);
        setApellidos(apellidos);  
        setEdad(edad);
        setSexo(sexo);      
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
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return this.sexo;
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