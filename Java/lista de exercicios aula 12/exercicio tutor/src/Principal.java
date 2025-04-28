public class Principal {
public static void main(String[] args) {
    Animal a1 = new Animal("Jack", "Burro", 18);
    Tutor t1 = new Tutor("Luan", "(41)992275464", a1);
    System.out.println(t1.toString());
}
}
