public class Principal {
public static void main(String[] args) {
    int op;
    Estacionamento estacionamento = new Estacionamento("Parkar");

    do { 
        System.out.println("\nEstacionamento " + estacionamento.getNome());
        System.out.println("1) Estacionar carro ");
        System.out.println("2) liberar carro");
        System.out.println("0) sair");
        System.out.println("Selecione uma opção: ");
        op = Console.lerInt();
       
        switch (op) {
       
        case 1: 
            System.out.println("Informe os dados do carro para estacionar: ");
            System.out.println("Modelo: ");
            String modelo = Console.lerString();
            System.out.println("Placa: ");
            String placa = Console.lerString();
            System.out.println("Cor: ");
            String cor = Console.lerString();

            estacionamento.estacionar(new Carro(modelo, placa, cor));
        break;
        case 2: 
            System.out.println("Informe a placa do carro para liberar: ");
            String pesquisa = Console.lerString();
            
            estacionamento.sair(pesquisa);

        break;
        case 0: 
        System.out.println("\nO sistema foi finalizado...");
        break;
        default:
        System.out.println("\nOpção invalida, tente novamente!");
} 
    } while (op != 0);

}
}

