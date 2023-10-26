public class Tratador extends Funcionario {

    public Tratador(String nome, int idade, double saldoInicial) {
        super(nome, idade, saldoInicial);
    }


    @Override
    public void trabalhar() {
        System.out.println("Tratador começou a trabalhar");
    }
    public void limparJaula(Jaula jaula){
        System.out.println("Tratador começou a limpar a" + jaula);
    }
    public void alimentarAnimais(){
        System.out.printf("Tratador %s esta alimentando os animais.",nome);
    }
    public void observar(){
        System.out.printf(" O tratador %s esta observando possiveis fecundaçoes que podem ocorrer",nome);
    }
    public void darBanho(){
        System.out.printf(" O tratador %s esta dando banho nos animais",nome);
    }
}
