public class Tratador extends Funcionario {
    private String responsabilidades;

    public Tratador(String nome, int idade,String responsabilidades) {
        super(nome, idade);
        this.responsabilidades = responsabilidades;
    }

    @Override
    public void trabalhar() {
        System.out.println("Tratador começou a trabalhar");
    }
    public void limparJaula(Jaula jaula){
        System.out.println("Tratador começou a limpar a" + jaula);
    }
}
