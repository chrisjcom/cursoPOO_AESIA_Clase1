public class Equipo {
    private String nombre;
    private String pais;
    private int division;

    public Equipo() {

    }

    public Equipo(String nombre, String pais, int division) {
        setNombre(nombre);
        setPais(pais);
        setDivision(division);
    }

    public void setNombre(String nombre) {
        this.nombre =  nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return this.pais;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getDivision() {
        return this.division;
    }
}