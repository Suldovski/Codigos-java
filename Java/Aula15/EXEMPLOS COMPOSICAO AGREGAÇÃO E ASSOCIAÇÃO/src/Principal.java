import agregacao.Aluno;
import agregacao.Turma;
import associacao.Carro;
import associacao.Pessoa;
import composicao.Disciplina;
import composicao.Professor;
import heranca.Coordenador;
import heranca.CoordenadorAdjunto;
import heranca.Docente;

public class Principal {

    public static void main(String[] args) {
       /*  na associação, pode ocorrer relacionamento entre objetos, mas eles não são dependentes entre si. 
        Por exemplo, um carro pode ser dirigido por várias pessoas, e uma pessoa pode dirigir vários carros. 
        Isso é conhecido como agregação. Abaixo está um exemplo de como isso pode ser implementado em Java. */

        System.out.println("Exemplo de agregação:");
        Carro c = new Carro("Ford Fiesta");
        Carro c2 = new Carro ("Nissan Sentra");
        Pessoa p = new Pessoa("Zé Carlos");


        p.dirigir(c);
        p.dirigir(c2);         
        
        /*Na agregagação, o relacionamento entre os objetos é mais forte. Elas ainda podem existir independentemente,
        porém sem ocorrer o relacionamento, uma das classes "perde" seu propósito. No exemplo abaixo, aluno pode existir 
        de forma independente, sem nunca ser adicionado a uma turma. Mas se no objeto "turma" não houver alunos,
        a turma não faz sentido, pois não há alunos para serem ensinados. */

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        
        Turma t1 = new Turma();

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);
        
        System.out.println("Exemplo de agregação:");
        System.out.println("Alunos da turma:");
        t1.mostrarAlunos();
        

    /*Na composição, o relacionamento entre os objetos é ainda mais forte do que na agregação. 
    Nesse caso, os objetos dependem completamente um do outro para existir. Se o objeto "pai" 
    for destruído, os objetos "filhos" também serão destruídos, pois eles não fazem sentido sem o objeto principal.
    Por exemplo, considere a relação entre um Professor e as Disciplinas que ele ministra. Um professor 
    pode ministrar várias disciplinas, mas as disciplinas só existem enquanto estiverem associadas a um professor 
    específico. Se o professor for removido, as disciplinas que ele ministra também deixam de existir. */

    Professor professor = new Professor("Dr. Silva");
    Disciplina disciplina1 = new Disciplina("Matemática", professor);
    
    System.out.println("Exemplo de composição:");
    disciplina1.lecionar();
        
 

/*     resumo:

    Associação: um se relaciona com o outro, mas não depende do outro e podem existir sem se relacionar. Exemplo: Carro e Pessoa.
    Agregação: um faz parte do outro, mas ainda pode existir sem se relacionar, embora uma das partes perderá o sentido de existir. Exemplo: Aluno e Turma.
    Composição: um faz parte do outro e não pode existir sem o outro, pois há uma dependencia forte para uma ou ambas as partes existirem. Exemplo: Professor e Disciplina. */


    /* ############################################################################################## */

/*     herança: uma relação de hierarquia entre classes, onde temos uma classe pai (superclasse), que detem atributos e métodos comuns a outras classes,
    e as classes filhas (subclasses), que herdam todos os dados (atributos, métodos e construtores) da superclasse, alem de possuirem atributos e métodos específicos delas.
    o objetivo principal da herança é reduzir a quantidade de código repetido e otimizar o desenvolvimento, agrupando dados comuns em uma unica classe que poderá ser herdada
    por outra. 
    No exemplo abaixo, vamos criar um docente e um coordenador, ambos herdam os atributos e métodos da superclasse Funcionario, compartilhando assim os seus atributos, metodos
    e construtores. */


    Docente d1 = new Docente("Maria", 1234, "Matematica");

    Coordenador c1 = new Coordenador("João", 5678, "Física");
    
    CoordenadorAdjunto ca1 = new CoordenadorAdjunto("Carlos", 9101, "Química", "Responsável por coordenar as atividades do curso");

  
    System.out.println("\nExemplo de herança:");
    System.out.println("Dados do Docente: " + d1);
    System.out.println("\nDados do Coordenador: " + c1);
    System.out.println("\nDados do Coordenador Adjunto: " + ca1);

    
    
}
} 