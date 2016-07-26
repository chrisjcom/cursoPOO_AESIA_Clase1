public class JugadorDeCampo extends Persona {
    private String posicion;
    private int marcaje;
    private int potenciaTiro;
    private int paseCorto;
    private int paseLargo;
    private int resistencia;
    private Equipo eq;

    public JugadorDeCampo() {

    }
    public JugadorDeCampo(String nombre, String apellidos, int edad, String sexo, 
    String posicion, int marcaje, int potenciaTiro, int paseCorto, int paseLargo, int resistencia, 
    Equipo eq){
        super(nombre,apellidos,edad,sexo);
        setPosicion(posicion);
        setMarcaje(marcaje);
        setPaseCorto(paseCorto);
        setPaseLargo(paseLargo);
        setPotenciaTiro(potenciaTiro);
        setResistencia(resistencia);
        setEq(eq);
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPosicion() {
        return this.posicion;
    }
    public void setMarcaje(int marcaje) {
        this.marcaje = marcaje;
    }
    public int getMarcaje() {
        return this.marcaje;
    }
    public void setPotenciaTiro(int potenciaTiro) {
        this.potenciaTiro = potenciaTiro;
    }
    public int getPotenciaTiro() {
        return this.potenciaTiro;
    }
    public void setPaseCorto(int paseCorto) {
        this.paseCorto = paseCorto;
    }
    public int getPaseCorto() {
        return this.paseCorto;
    }
    public void setPaseLargo(int paseLargo) {
        this.paseLargo = paseLargo;
    }
    public int getPaseLargo() {
        return this.paseLargo;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public int getResistencia() {
        return this.resistencia;
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
          .append(" y juego en ")
          .append(this.getEq().getNombre());
        nombreCompleto = sb.toString();
        return nombreCompleto;
    }    
}