public abstract class Pessoa {

    protected String nome;

    protected int idade;

    protected double saldoInicial;

    protected ContaBancaria conta;


    public Pessoa(String nome, int idade, double saldoInicial) {
        this.nome = nome;
        this.idade = idade;
        this.saldoInicial = saldoInicial;
        this.conta = new ContaBancaria(nome, saldoInicial);
    }

    public Pessoa() {

    }


    abstract void trabalhar();

    public void andar(){
        System.out.printf("%s está andando", this.nome);
    }

    public void dormir(){
        System.out.printf("%s começou a dormir", this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }


}
