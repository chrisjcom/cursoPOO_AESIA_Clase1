public class Prueba {
    public static void main(String[] args) {
        Persona pablo = new Persona(); //Instancia de la clase persona
        Persona david = new Persona(); //Otra instancia de la clase persona
        /* Asignación de valores a pablo */
        pablo.nombre = "Pablo";
        pablo.apellidos = "Palacios";
        pablo.edad = 22;
        /* David intenta adivinar la edad de Pablo */
        david.adivinarEdad(pablo, 18);
    }
}