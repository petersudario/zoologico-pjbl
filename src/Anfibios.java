public class Anfibios extends Animal{
    public Anfibios(String nome, int idade, String especie,String tipoPele,Boolean calda) { super(nome, idade, especie);}
    String tipoPele;
    Boolean calda;


    @Override
    public void fazer_barulho() {
        System.out.println("sapo coaxando urebeti");

    }

    @Override
    public void comer(String a) {
        System.out.println( "anfibio comendo " + a);

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
