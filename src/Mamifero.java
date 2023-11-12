
public class Mamifero extends Animal{
    protected String tipoPelo;
    protected int qtdPatas;

    public Mamifero(String nome, int idade, String especie,String tipoPelo, int qtdPatas) {
        super(nome, idade, especie);
        this.tipoPelo = tipoPelo;
        this.qtdPatas= qtdPatas;

        try {
            if(idade > 120){
                throw new Exception("Idade anormal");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        

    public void amamentar(){
        System.out.println("Amamentando...");
        
    }
}
