public class Operadora {
    private String nome;
    private int codigoarea;

    public Operadora(String nome, int codigoarea) {
        this.nome = nome;
        this.codigoarea = codigoarea;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoarea() {
        return codigoarea;
    }

    public void setCodigoarea(int codigoarea) {
        this.codigoarea = codigoarea;
    }

    @Override
    public String toString() {
        String dados = "------------------------------- Operadora -----------------------------\n " +
                       "Nome: " + nome +
                       "\nCodigo da área: " + codigoarea;
        return dados;
    }
    
    

}
