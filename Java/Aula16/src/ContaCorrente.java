public class ContaCorrente extends Conta {

    private float chequeEspecial;
    private float saldoReal;

    public ContaCorrente(String nomeCliente, int numeroConta, float saldo, float chequeEspecial) {
        super(nomeCliente, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
        saldoReal = saldo + chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public float getSaldoReal() {
        return saldoReal;
    }
    public void setSaldoReal(float saldoReal) {
        this.saldoReal = saldoReal;
    }
    @Override
    public void sacar(float valor) {
        if (valor > saldoReal) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        } 
            saldo -= valor;
            atualizarSaldoReal();
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    @Override
    public void depositar(float valor) {
        saldo += valor;
        atualizarSaldoReal();
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
    private void atualizarSaldoReal() {
        saldoReal = saldo + chequeEspecial;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nCheque Especial: R$" + chequeEspecial +
                "\nSaldo Real: R$" + saldoReal;
    }

}
