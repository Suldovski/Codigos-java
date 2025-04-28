public class Principal {

    public static void main(String[] args) {
        Carro cr1 = new Carro ("Ford KA", "ABC-1234","Vermelho");
        Cliente cl1 = new Cliente ("Fulano da Silva", "(41)99999-8888", cr1);
        
        Carro cr2 = new Carro();
        
        cr2.setModelo("Nissan Versa");
        cr2.setPlaca("VER-5432");
        cr2.setCor("Preto");

        Cliente cl2 = new Cliente();

        cl2.setNome("Beltrano Souza");
        cl2.setTelefone("(41)3456-7890");
        cl2.setCarro(cr2);

        Cliente cl3 = new Cliente("Ciclano Oliveira","(41)98786-5678",
        new Carro("Chevrolet Celta", "ASQ-3456","Prata"));

        System.out.println("Carro cr1: " + cr1.toString());
        System.out.println("Carro cr2: " + cr2.toString());
        System.out.println("\n--------------------------------------\n");

        System.out.println("Cliente cl1: \n" + cl1.toString());
        System.out.println("Cliente cl2: \n" + cl2.toString());
        System.out.println("Cliente cl3: \n" + cl3.toString());

        Carro cr3 = cl3.getCarro();

        cr3.setCor("Branco");
        System.out.println("Cor do cr3: " + cr3.toString());
        System.out.println("Cliente cl3: " + cl3.toString());
    }

}
