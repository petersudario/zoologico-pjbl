import java.util.ArrayList;

public class Zoologico {
    private String nome;
    private String endereco;
    Jaula jaula;
    Lagos lagos;
    protected ArrayList<Mamifero> HabitMamifero;

    public Zoologico(String nome, String endereco, Jaula jaula, Lagos lagos) {
        this.nome = nome;
        this.endereco = endereco;
        this.jaula = jaula;
        this.lagos = lagos;
        HabitMamifero = new ArrayList<>();
    }

    public void adicionarHabitat(Animal animal) {
        HabitMamifero.add((Mamifero) animal);
    }

    public int size() {
        return HabitMamifero.size();
    }

    public void abrir() {
        System.out.println("Zoológico aberto");
    }

    public void fechar() {
        System.out.println("Zoológico fechou");
    }
}
