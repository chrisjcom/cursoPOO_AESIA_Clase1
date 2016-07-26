public class Persona {
    //Atributos
    String nombre;
    String apellidos;
    int edad;
    String estadoCivil;
    String Sexo;
    //Constructores
    //Métodos
    public void adivinarEdad(Persona p,int edad){
        if(p.edad == edad) {
            System.out.println("Adivinaste!!!");
        } else {
            System.out.println("Te has equivocado");
        }
    }
}