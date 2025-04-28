public class ContaBancaria {
private String numeroConta;
private Double saldo;
private Cliente cliente;


public ContaBancaria(String numeroConta, Double saldo, Cliente cliente) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
    this.cliente = cliente;
}
public String getNumeroConta() {
    return numeroConta;
}
public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
}
public Double getSaldo() {
    return saldo;
}
public void setSaldo(Double saldo) {
    this.saldo = saldo;
}
public Cliente getCliente() {
    return cliente;
}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

    @Override
    public String toString() {
        String dados = "-------------------- Conta bancaria ------------------ \n" +
                       "\nNumero da conta: " + numeroConta +
                       "\nSaldo: " + saldo +
                         "\n" + cliente.toString();
        return dados;
    }


}
