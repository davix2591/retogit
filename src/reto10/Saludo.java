public class Saludo {
    private String nombre;

    public Saludo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void saludo(){
        System.out.println("Hola "+nombre);
    }

}
