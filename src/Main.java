import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new VisitanteForm();
//            }
//        });

        Animal macaco = new Macaco("Beto Richa", 3, "Babuino", "Preto", 4);
        Animal macaco2 = new Macaco("Luiz Inacio Lula da Silva", 3, "Macaco Prego", "Preto", 4);

        Jaula jaula1 = new Jaula("Jaula 1", 500.00);

        jaula1.adicionarAnimal(macaco);
        jaula1.adicionarAnimal(macaco2);
        
        Mamifero mamifero = new Mamifero("afonso",140,"marssupial","liso",2);


        for(int i = 0; i < jaula1.size(); i++){
            System.out.println(jaula1.animais.get(i));
        }

        Mamifero m = new Macaco("Cezar",10,"Gorila","liso",2);
        m.comer("Banana");
        m = new Ornitorrinco("Zé",4,"Australiano","liso",4);
        m.comer("camarao");

    }
}
