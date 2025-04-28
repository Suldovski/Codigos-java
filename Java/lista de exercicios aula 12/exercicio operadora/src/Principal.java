public class Principal {
public static void main(String[] args) {
    Operadora o1 = new Operadora("Vivo", 1);
    Telefone t1 = new Telefone("(41) 99227-5464 ", "Iphone 11", o1);

    System.out.println(t1.toString());
}
}
