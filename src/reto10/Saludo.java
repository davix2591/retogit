public class Saludo {
    private String nombre;
    private int edad;

    public Saludo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad= edad;
    }
    
    public void saludo(){
        System.out.println("Hola "+nombre+ ", tengo " +edad+ " años");
    }

}
