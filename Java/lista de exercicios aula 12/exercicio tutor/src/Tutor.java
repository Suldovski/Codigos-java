public class Tutor {
    private String nome;
    private String telefone;
    private Animal animal;
   
    public Tutor(String nome, String telefone, Animal animal) {
        this.nome = nome;
        this.telefone = telefone;
        this.animal = animal;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        String dados = "----------------------------------- Tutor ---------------------------- \n" +
                        "\nNome: " + nome +
                        "\nTelefone: " + telefone + 
                        "\n" + animal.toString();
        return dados;
    }

    
}
