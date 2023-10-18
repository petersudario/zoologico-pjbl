public class Veterinario extends Funcionario {

      private int experiencia;

      public Veterinario(String nome, int idade, int experiencia) {
            super(nome, idade);
            this.experiencia = experiencia;
      }
      public void examinarAnimal( Animal animal){
            System.out.println("Veterinário está examinando o animal");

      }
      public void receitarMedicamento(Animal animal){
      System.out.println("Receitando medicamentos");

      }
      public void vacinar(Animal animal){
            System.out.println("Aplicando vacina");

      }


      @Override
      public void trabalhar() {
            System.out.printf("Veterinário começou a trabalhar");

      }
}
