public class Mamifero extends Animal{
    protected String tipoPelo;
    protected int qtdPatas;

    public Mamifero(String nome, int idade, String especie,String tipoPelo, int qtdPatas) {
        super(nome, idade, especie);
        this.tipoPelo = tipoPelo;
        this.qtdPatas= qtdPatas;
    }

    public void amamentar(){
        System.out.println("Amamentando...");
    }
}
