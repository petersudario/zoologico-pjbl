public class Veterinario extends Funcionario {
      public Veterinario(String nome, int idade, double saldoInicial) {
            super(nome, idade, saldoInicial);
      }

      @Override
      protected void trabalhar(){
            System.out.printf("Veterinário %s está cuidando dos animais", nome);
      }

      protected void vacinar(Animal animal){
            System.out.printf("Veterinario %s está vacinando animal %s", nome, animal.nome );
      }

      protected void analisar(Animal animal){
            System.out.printf("Veterinário %s está analisando o animal %s", nome, animal.nome);
      }
}
