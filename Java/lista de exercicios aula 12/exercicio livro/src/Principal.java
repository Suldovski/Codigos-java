public class Principal {
    public static void main(String[] args) {
        Autor a1 = new Autor("Luan", "Brasil");
        
        Livro l1 = new Livro("ff", "1234", 5000, a1);
        
        System.out.println(l1.toString());
    }
}
