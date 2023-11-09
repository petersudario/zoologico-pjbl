import java.util.ArrayList;

public class Jaula {
    protected String nome;
    protected Double espaco;
    protected ArrayList<Mamifero> animais;

    public Jaula(String nome, Double espaco){
        this.nome = nome;
        this.espaco = espaco;
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add((Mamifero) animal);
    }

    public int size(){
        return animais.size();
    }

}
