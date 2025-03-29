public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("Gibson Les Paul");
        Tambor tambor = new Tambor("Batería Pearl");

        guitarra.afinar();
        guitarra.tocar();

        tambor.tocar();
    }
}
