public class ContaPoupanca extends Conta {
    
    private float rendimento;
    private int tempoRendimento;

    public ContaPoupanca(String nomeCliente, int numeroConta, float saldo, float rendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.rendimento = rendimento;
        this.tempoRendimento = 0;
    }

    public float getRendimento() {
        return rendimento;
    }
    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    public int getTempoRendimento() {
        return tempoRendimento;
    }
    public void setTempoRendimento(int tempoRendimento) {
        this.tempoRendimento = tempoRendimento;
        recalcularSaldo();
    }
    private void recalcularSaldo() {
        saldo = saldo + ((saldo * rendimento) * tempoRendimento);
    }
    @Override
    public void sacar(float valor) {
        System.out.println("Saque de R$" + valor + " solicitado.");
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        } 
            saldo -= valor;
            setTempoRendimento(0);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
        @Override
        public void depositar(float valor) {
            super.depositar(valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            setTempoRendimento(0);
            System.out.println("Saldo atualizado: R$" + saldo);
        }
    @Override
    public String toString() {
        return super.toString() +
                "\nRendimento mensal: R$" + rendimento + "%" +
                "\nTempo de Rendimento: " + tempoRendimento + " meses";
    }


}
