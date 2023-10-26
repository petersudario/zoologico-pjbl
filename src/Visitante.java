public class Visitante extends Pessoa {

    public Visitante(String nome, int idade, double saldoInicial) {
        super(nome, idade, saldoInicial);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Saldo Inicial: " + saldoInicial;
    }

    @Override
    void trabalhar() {
        // Implement the behavior for working, if needed
    }
}
