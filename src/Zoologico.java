public class Zoologico {
    private String nome;
    private String endereco;
    Jaula jaula;
    Lagos lagos;

    public Zoologico(String nome, String endereco, Jaula jaula, Lagos lagos) {
        this.nome = nome;
        this.endereco = endereco;
        this.jaula = jaula;
        this.lagos = lagos;
    }
    public void abrir(){
        System.out.println("Zoológico aberto");
    }
    public void fechar(){
        System.out.println("Zoológico fechou");
    }
}
