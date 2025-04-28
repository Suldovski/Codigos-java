public class Livro {
    private String titulo;
    private String editora;
    private int numeropaginas;
    private Autor autor;
    
    public Livro(String titulo, String editora, int numeropaginas, Autor autor) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeropaginas = numeropaginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getNumeropaginas() {
        return numeropaginas;
    }
    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        String dados = "-------------------------------- Livro ------------------------------------\n " +
                       "Titulo: " + titulo +
                       "\nEditora: " + editora +
                       "\nNumero de páginas: " + numeropaginas +
                       "\n" + autor.toString();
        return dados;
    }
    


    
}
