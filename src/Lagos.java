import java.util.ArrayList;

public class Lagos{
    protected String nome;
    protected Double espaco;
    protected ArrayList<Peixes> animais;

    public Lagos(String nome, Double espaco){
        this.nome = nome;
        this.espaco = espaco;
        animais = new ArrayList<>();
    }
    public void adicionarAnimal(Animal animal){
        animais.add((Peixes)animal);
    }
    public int size(){
        return animais.size();
    }


}