public class VideoDigital extends ItemBibliotecaDigital {
    public VideoDigital(String Titulo, String Autor){
        super(Titulo, Autor);
    }

    @Override
    public void visualizar() {
        System.out.println("visualizando " + this.getTitulo());
    }

    public String descricao() {
        return "Esse video digital se chama " + this.getTitulo() + " feito por " + this.getAutor();
    }

    public void baixar() {
        System.out.println("baixando " + this.getTitulo());
    }
}