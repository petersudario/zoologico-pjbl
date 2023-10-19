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


    abstract void trabalhar();

    public void andar(){
        System.out.printf("%s está andando", this.nome);
    }

    public void entrarAquario(){
        System.out.printf("%s entrou no Aquario", this.nome);
    }

    public void dormir(){
        System.out.printf("%s começou a dormir", this.nome);
    }

}
