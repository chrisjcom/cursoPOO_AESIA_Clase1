public class Prueba {
    public static void main(String[] args) {
        Persona pablo = new Persona(); //Instancia de la clase persona
        Persona david = new Persona(); //Otra instancia de la clase persona
        /* Asignación de valores a pablo */
        pablo.setNombre("Pablo");
        pablo.setApellidos("Palacios");
        pablo.setEdad(22);
        /* David pregunta el nombre de la persona que se encontró(Pablo) */
        david.preguntarNombre(pablo);
    }
}