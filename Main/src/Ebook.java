public class Ebook extends ItemBibliotecaDigital {
    public Ebook(String Titulo, String Autor){
        super(Titulo, Autor);
    }

    @Override
    public void baixar() {
        System.out.printf("baixado " + this.getTitulo() );
    }

    @Override
    public String descricao() {
        return "Ebook " + this.getTitulo() + "por " + this.getAutor();
    }
}
