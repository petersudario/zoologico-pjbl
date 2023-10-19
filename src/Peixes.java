public class Peixes extends Animal{
    public Peixes(String nome, int idade, String especie,Boolean escamas, Boolean nadadeiras,String corDaEscama) { super(nome, idade, especie); }
    Boolean escamas;
    Boolean nadadeiras;
    String corDaEscama;
    public void soltarBolhas(){
        System.out.println("Blu...Blu...Blu");
    }
}
