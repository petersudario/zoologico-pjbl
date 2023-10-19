public class Main {
    public static void main(String[] args) {
        Anfibios anfibios = new Anfibios("jeferson",14,"salambra","lisa",true);
        anfibios.metamorfosear();
        anfibios.andar();
        anfibios.dormir();
        anfibios.comer("inseto");
        anfibios.fazer_barulho();

        Pessoa Pedro = new Funcionario("Pedro", 18, 3000.0);

        Pedro.trabalhar();

        Pedro.conta.dados();

    }
}