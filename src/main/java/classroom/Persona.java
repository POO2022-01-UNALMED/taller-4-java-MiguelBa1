package classroom;

public class Persona {

    long cedula = 1;
//  final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
//        cedula = 3;
    }
    
// AGREGADO
    Persona() {
        this.nombre = "";
        this.cedula = 0;
        totalPersonas++;
    }
    
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    // Modificado cedula
    Persona(String nombre) {
        this.nombre = "";
//        this.cedula = 1;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
