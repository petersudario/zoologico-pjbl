public class Visitante extends Pessoa{


    public Visitante(String nome, int idade, double saldoInicial) {
        super(nome, idade, saldoInicial);
    }

    @Override
    void trabalhar() {

    }
    void tirarFoto(){
        System.out.printf("Visitante $s esta tirando foto dos animais !",nome);
    }
    void darComida(){
        System.out.printf("O visitante %s esta dando petiscos para os animais !",nome);
    }
    void seAlimentar(){
        System.out.printf("O visitante %s tirou uma pausa pra se alimentar", nome);
    }
}
