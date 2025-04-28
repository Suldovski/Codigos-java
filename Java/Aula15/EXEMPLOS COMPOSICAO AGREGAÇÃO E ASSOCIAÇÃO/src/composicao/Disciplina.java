package composicao;

public class Disciplina {

    private String nome;
    private Professor professor;
    
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }
    public void lecionar() {
        System.out.println("A disciplina " + nome + " está sendo lecionada por " + professor.getNome());
    }
}
