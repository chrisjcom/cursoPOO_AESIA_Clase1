public class Portero extends Persona {
    private String posicion;
    private int atajar;
    private int reflejos;
    private int paseCorto;
    private int paseLargo;
    private int resistencia;
    private Equipo eq;

    public Portero() {

    }
    public Portero(String nombre, String apellidos, int edad, String sexo, 
    String posicion, int atajar, int reflejos, int paseCorto, int paseLargo, 
    int resistencia, Equipo eq){
        super(nombre,apellidos,edad,sexo);
        setPosicion(posicion);
        setAtajar(atajar);
        setPaseCorto(paseCorto);
        setPaseLargo(paseLargo);
        setReflejos(reflejos);
        setResistencia(resistencia);
        setEq(eq);
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPosicion() {
        return this.posicion;
    }
    public void setAtajar(int atajar) {
        this.atajar = atajar;
    }
    public int getAtajar() {
        return this.atajar;
    }
    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }
    public int getReflejos() {
        return this.reflejos;
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
        sb.append(super.getNombre())
          .append(" ")
          .append(super.getApellidos())
          .append(" y juego en ")
          .append(this.getEq().getNombre());;
        nombreCompleto = sb.toString();
        return nombreCompleto;
    }    
}