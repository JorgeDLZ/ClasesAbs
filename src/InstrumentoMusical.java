abstract class InstrumentoMusical {
    protected String nombre;

    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public abstract void tocar();

}
// Interfaz
interface Afinable {
    void afinar();
}
