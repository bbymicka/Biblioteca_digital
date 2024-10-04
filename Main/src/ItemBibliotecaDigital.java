public abstract class ItemBibliotecaDigital implements Baixavel, Visualizavel {
    private String Titulo;
    private String Autor;

    public ItemBibliotecaDigital(String titulo, String autor){
        this.Titulo = titulo;
        this.Autor = autor;
    }

    public abstract String descricao();

    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    @Override
    public void visualizar() {
        System.out.println("O item nao pode ser visualizado");
    }
}
