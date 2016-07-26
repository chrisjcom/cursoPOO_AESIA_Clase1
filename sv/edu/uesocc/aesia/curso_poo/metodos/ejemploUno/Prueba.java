public class Prueba {
    public static void main(String[] args) {
        Persona pablo = new Persona(); //Instancia de la clase persona
        pablo.nombre = "Pablo";
        pablo.apellidos = "Palacios";
        pablo.edad = 22;
        System.out.println(pablo.obtenerNombreCompleto()+" tiene "+pablo.edad+" años");
    }
}