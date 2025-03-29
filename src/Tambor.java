class Tambor extends InstrumentoMusical {
    public Tambor(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Tambor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void tocar() {
        System.out.println(nombre + " está tocando un ritmo en el tambor.");
    }
}