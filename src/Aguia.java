public class Aguia extends Aves{
    Boolean bicoCurvo;
    Boolean garrasAfiadas;
    public Aguia(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    public void voar(){
        System.out.println("planando...");
    }
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }
}
