import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
private String nome;
private int limiteCarros;
private List<Carro> carros;


public Estacionamento(String nome){
    this.nome=nome;
    this.limiteCarros=limiteCarros;
    this.carros=new ArrayList<>();
}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getLimiteCarros() {
        return limiteCarros;
    }

    public void setLimiteCarros(int limiteCarros) {
        this.limiteCarros = limiteCarros;
    }
public void estacionar(Carro carro){
    this.carros.add(carro);
    System.out.println("Carro " + carro.getModelo() +
    "(" + carro.getPlaca() + ")" + carro.getCor() + "estacionando");

}
public void sair (String placa){
    for (Carro carroTemp : carros) {
        if(carroTemp.getPlaca().equals(placa)){
            carros.remove(carroTemp);
            System.out.println("Carro " + carroTemp.getModelo() + 
            "(" +  carroTemp.getPlaca() + ")" + carroTemp.getCor() + "Saiu");
            return;
        }
    }
    System.out.println("\nCarro com a placa: " + placa + "não foi localizado...");
}

public int getQntCarrosEstacionados(){
    return carros.size();
}
public boolean haCarrosEstacionados(){
    return !carros.isEmpty();
}

public 
}
