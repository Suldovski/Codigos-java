package heranca;

public class Docente extends Funcionario {

    private String nomeDisciplina;

    public Docente(String nome, int matricula, String nomeDisciplina) {
        super(nome, matricula);
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDisciplina() {
        return nomeDisciplina;
    }

    public void setDisciplina(String disciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public String toString() {
        return super.toString() + 
                " \ndisciplina que leciona: " + nomeDisciplina;
    }



}
