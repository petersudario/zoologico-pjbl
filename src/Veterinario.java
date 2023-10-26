public class Veterinario extends Funcionario {
      public Veterinario(String nome, int idade, double saldoInicial) {
            super(nome, idade, saldoInicial);
      }

      @Override
      protected void trabalhar(){
            System.out.printf("Veterinario %s está cuidando dos animais", nome);
      }

      protected void vacinar(Animal animal){
            System.out.printf("Veterinario %s esta vacinando animal %s", nome, animal.nome );
      }

      protected void examinar(Animal animal){
            System.out.printf("Veterinario %s esta diagnosticando e examinando o animal %s", nome, animal.nome);
      }
      protected void tratarFeridas(Animal animal){
            System.out.printf("Veterinario %s esta tratando feridas no animal %s",nome, animal.nome);
      }
}
