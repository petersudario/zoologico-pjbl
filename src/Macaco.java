public class Macaco extends Mamifero{
    public Macaco(String nome, int idade, String especie, String tipoPelo, int qtdPatas) {
        super(nome, idade, especie, tipoPelo, qtdPatas);
    }
    public void comerBanana(){
        System.out.println("macaco comeu banana...");
    }
    public void interagirComVisitante(){
        System.out.println("macaco brincou com visitante");
    }
}
