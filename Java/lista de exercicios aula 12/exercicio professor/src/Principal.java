public class Principal {
public static void main(String[] args) {
    Departamento d1 = new Departamento("Ciencias", "Laboratorio");
    Professor p1 = new Professor("Jorge", "didatica", "Jorgeciencias@gmail.com", d1);

    System.out.println(p1.toString());
}
}
