class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andrés");

        System.out.println("Iniciamos el método main");
        System.out.println("Persona = " + persona.leerNombre());

        System.out.println("Antes de llamar el método test");
        test(persona);
        System.out.println("Después de llamar el método test");
        System.out.println("Persona nombre = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos modificados");
        
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }

}