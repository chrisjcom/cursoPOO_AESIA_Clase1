public class Prueba {
    public static void main(String[] args) {
        Equipo club = new Equipo("En tercera es más fácil", "El Salvador", 1);
        DirectorTecnico dt = new DirectorTecnico("Carlo","Ancelotti",56,"Masculino",91,15,club,"4-4-2");
        System.out.println(dt.obtenerNombreCompleto());
        Portero gk = new Portero("Benji","Price",24,"Masculino","Portero",90,96,87,80,90,club);
        System.out.println(gk.obtenerNombreCompleto());
        //System.out.println(Persona.personas);
    }
}