public class Main {
    public static void main(String[] args) {
    ItemBibliotecaDigital Ebook1 = new Ebook("One piece ", "Micka");
    ItemBibliotecaDigital Video1 = new VideoDigital("Naruto da nata", "Super mickaell");

    System.out.println(Ebook1.descricao());
    System.out.println(Video1.descricao());

    Ebook1.baixar();
    Ebook1.visualizar();


    }
}