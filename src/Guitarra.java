class Guitarra extends InstrumentoMusical implements Afinable {
    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void tocar() {
        System.out.println(nombre + " está tocando un solo de guitarra.");
    }

    @Override
    public void afinar() {
        System.out.println(nombre + " está afinando la guitarra.");
    }
}