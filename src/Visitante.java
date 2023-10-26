public class Visitante extends Pessoa{

    protected float dinheiro;

    public Visitante(String nome, int idade, float dinheiro){
        super(nome, idade);

        this.dinheiro = dinheiro;
    }

}
