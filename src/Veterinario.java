public class Veterinario extends Pessoa {

      private int experiencia;

      public Veterinario(String nome, int idade, int experiencia) {
            super(nome, idade);
            this.experiencia = experiencia;
      }
      public void examinarAnimal( Animal animal){

      }
      public void receitarMedicamento(Animal animal){

      }


      @Override
      public void trabalhar() {
            System.out.printf("Veterinário começou a trabalhar");

      }
}
