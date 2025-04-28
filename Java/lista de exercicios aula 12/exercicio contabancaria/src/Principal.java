public class Principal {
public static void main(String[] args) {
    Cliente c1 = new Cliente("Luan", "13016738970");
    ContaBancaria cb1 = new ContaBancaria("123", 300.00, c1);

    System.out.println(cb1.toString());
}
}
