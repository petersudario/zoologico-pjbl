public class Main {
    public static void main(String[] args) {
        Anfibios anfibios = new Anfibios("jeferson",14,"salamandra","lisa",true);
        anfibios.metamorfosear();
        anfibios.andar();
        anfibios.dormir();
        anfibios.comer("inseto");
        anfibios.fazer_barulho();



        Pessoa Pedro = new Funcionario("Pedro", 18, 3000.0);
        Tratador laura = new Tratador("Laura",18,1.890,0);

        Pedro.trabalhar();

        Pedro.conta.dados();

    }
}