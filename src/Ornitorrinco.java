public class Ornitorrinco extends Mamifero{
    public Ornitorrinco(String nome, int idade, String especie, String tipoPelo, int qtdPatas) {
        super(nome, idade, especie, tipoPelo, qtdPatas);
    }

    public void botarOvos(){
        System.out.println("Ornitorrinco botou ovos..");
    }

    public void envenenar(){
        System.out.println("Ornitorrinco envenenou...");
    }

}
