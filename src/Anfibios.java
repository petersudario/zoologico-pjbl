public class Anfibios extends Animal{
    public Anfibios(String nome, int idade, String especie,String tipoPele) {
        super(nome, idade, especie);
    }
    String tipoPele;

    @Override
    public void fazer_barulho() {
        System.out.println("sapo coaxando urebeti");

    }

    @Override
    public void comer(String alimento) {
        System.out.println( "anfibio comendo nhami nhami" + alimento);

    }

    @Override
    public void andar() {
        System.out.println(" anfibio dando passos...");

    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzzzzzzz");

    }
    public void metamorfosear(){
        System.out.println("Transformar");

    }

}
