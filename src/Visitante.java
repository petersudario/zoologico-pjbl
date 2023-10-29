import java.io.Serializable;

public class Visitante extends Pessoa implements Serializable {

    public Visitante(String nome, int idade, double saldoInicial) {
        super(nome, idade, saldoInicial);
    }
    public Visitante(){
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Saldo Inicial: " + saldoInicial;
    }

    @Override
    void trabalhar() {
        // Implement the behavior for working, if needed
    }void tirarFoto(){
        System.out.printf("Visitante $s está tirando foto dos animais !",nome);
    }
    void darComida(){
        System.out.printf("O visitante %s está dando petiscos para os animais !",nome);
    }
    void seAlimentar(){
        System.out.printf("O visitante %s tirou uma pausa pra se alimentar", nome);
    }
}
