public class ContaBancaria {
    private Pessoa nome;
    private double saldo;

    public ContaBancaria(Pessoa nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void dados() {
        System.out.println("Titular: " + nome.getNome());
        System.out.println("Idade do Titular: " + nome.getIdade());
        System.out.println("Saldo: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

}