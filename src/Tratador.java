public class Tratador extends Funcionario {

    protected double horasTrabalhadas=0;

    public Tratador(String nome, int idade, double saldoInicial, double horasTrabalhadas) {
        super(nome, idade, saldoInicial);
        this.horasTrabalhadas = horasTrabalhadas;

    }



    public void limparJaula(Jaula jaula, ContaBancaria contaBancaria){
        System.out.println("Tratador está limpando a jaula "+ jaula);
        horasTrabalhadas += 2.5;
        contaBancaria.depositar(130);

    }

    public void alimentarAnimais(ContaBancaria contaBancaria){
        System.out.println("Tratador está alimentando os animais.");
        horasTrabalhadas += 3;
        contaBancaria.depositar(125);
    }

    public void escovarAnimal(Animal animal,ContaBancaria contaBancaria){
        System.out.println("Tratador está escovando "+ animal);
        horasTrabalhadas += 1;
        contaBancaria.depositar(100);
    }
    public void cuidarDoAnimal (Animal animal, ContaBancaria contaBancaria){
        System.out.println("Tratador está aplicando medicamento no "+ animal);
        horasTrabalhadas += 1;
        contaBancaria.depositar(100);

    }
}
