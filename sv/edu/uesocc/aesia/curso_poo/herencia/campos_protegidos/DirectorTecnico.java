public class DirectorTecnico extends Persona {    
    private int tactica;    
    private int nivelTecnico;
    private String formacionPreferida;    
    private Equipo eq;

    public DirectorTecnico() {

    }
    public DirectorTecnico(String nombre, String apellidos, int edad, String sexo, 
    int tactica, int nivelTecnico, Equipo eq, String formacionPreferida){
        super(nombre,apellidos,edad,sexo);
        setFormacionPreferida(formacionPreferida);
        setTactica(tactica);
        setNivelTecnico(nivelTecnico);        
        setEq(eq);
    }
    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }
    public String getFormacionPreferida() {
        return this.formacionPreferida;
    }
    public void setTactica(int tactica) {
        this.tactica = tactica;
    }
    public int getTactica() {
        return this.tactica;
    }
    public void setNivelTecnico(int nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }
    public int getNivelTecnico() {
        return this.nivelTecnico;
    }    
    public void setEq(Equipo eq) {
        this.eq = eq;
    }
    public Equipo getEq() {
        return this.eq;
    }    

    @Override
    public String obtenerNombreCompleto(){
        String nombreCompleto;
        StringBuilder sb = new StringBuilder();
        sb.append(getNombre())
          .append(" ")
          .append(getApellidos())
          .append(" y soy DT de ")
          .append(this.getEq().getNombre());
        nombreCompleto = sb.toString();
        return nombreCompleto;
    }
}