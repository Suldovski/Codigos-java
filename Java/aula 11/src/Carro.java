public class Carro {
    private String modelo;
    private String placa;
    private String cor;
    
    public Carro(){}

        public Carro(String modelo, String placa  , String cor ){
            this.modelo=modelo;
            this.placa=placa;
            this.cor=cor;  
        }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        String dados = "\nCarro: " +
                        "\nModelo: " + modelo + 
                        "\nPlaca: " + placa + 
                        "\nCor: " + cor;
        return dados;
    }

    

}
