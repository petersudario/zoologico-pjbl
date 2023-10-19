public class Avestruz extends Aves{
    Boolean tipoPena;
    public Avestruz(String nome, int idade, String especie) {
        super(nome, idade, especie );
    }
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }
    public void botandoOvo(){
        System.out.println("Botando ovo...");;
    }
}
