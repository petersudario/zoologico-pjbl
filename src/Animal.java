public abstract class Animal implements Acoes{
    protected String nome;
    protected int idade;
    protected String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public void fazer_barulho(){
        System.out.println("Animal fez barulho");
    }
    public void comer(String alimento){
        System.out.printf("Animal comeu %s", alimento);
    }
    public void andar(){
        System.out.println("Animal andou");
    }
    public void dormir(){
        System.out.println("Animal dormiu");
    }
}

