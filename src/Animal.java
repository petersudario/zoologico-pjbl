public abstract class Animal{
    private String nome;
    private int idade;
    private String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public abstract void fazer_barulho();{

    }
    public abstract void comer(String alimento);{

    }
    public abstract void andar();{

    }
    public abstract void dormir();{

    }
}

