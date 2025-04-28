
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
       
            Scanner leitor = new Scanner(System.in);
            int op;
        do { 
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Exemplo Conta Corrente");
            System.out.println("2 - Exemplo Conta Poupança");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
              op = leitor.nextInt();

            switch (op) {
                case 1:
                    exemploCC();
                    break;
                case 2:
                    exemploCP();
                    break;
                case 3:
                    System.out.println("Sistema encerrado...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op!= 3);
        leitor.close();

    }

    public static void exemploCC() {
        ContaCorrente cc1 = new ContaCorrente("João", 12345, 500, 500);

        System.out.println(cc1);
        cc1.sacar(1200);

        cc1.sacar(600);

        cc1.sacar(500);

        cc1.sacar(1);

        System.out.println(cc1);

        cc1.depositar(750);

        System.out.println(cc1);

    }

    public static void exemploCP() {
        ContaPoupanca cp1 = new ContaPoupanca("Maria", 54321, 10000, 0.006f);

        System.out.println(cp1);

        cp1.setTempoRendimento(10);

        System.out.println(cp1);

        cp1.sacar(20000);

        cp1.sacar(1200);

        System.out.println(cp1);

    }



}
