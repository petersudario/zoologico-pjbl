public class Funcionario extends Pessoa{

    public Funcionario(String nome, int idade, double saldoInicial) {
        super(nome, idade, saldoInicial);
    }

    @Override
    protected void trabalhar(){
        System.out.printf("Funcionário %s trabalhando\n", this.nome);
    }

}
