import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static DefaultListModel<Pessoa> listaModel;
    private static JList<Pessoa> lista;
    private static List<Pessoa> pessoas;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                criarGUI();
            }
        });
    }

    public static void criarGUI() {
        // Cria a janela
        JFrame janela = new JFrame("Cadastro de Pessoas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);

        // Cria um painel para organizar os componentes
        JPanel painel = new JPanel();
        janela.add(painel);

        // Adiciona rótulos e campos de entrada
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField(3);

        JLabel saldoLabel = new JLabel("Saldo Inicial:");
        JTextField saldoField = new JTextField(10);

        JButton criarBotao = new JButton("Criar Pessoa");
        listaModel = new DefaultListModel<>();
        lista = new JList<>(listaModel);
        pessoas = new ArrayList<>();

        // Adiciona um ouvinte de ação ao botão
        criarBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém os valores dos campos de entrada
                String nome = nomeField.getText();
                int idade = Integer.parseInt(idadeField.getText());
                double saldoInicial = Double.parseDouble(saldoField.getText());

                // Create an instance of Visitante and assign it to a variable of type Pessoa
                Pessoa pessoa = new Visitante(nome, idade, saldoInicial);

                // Adiciona o objeto à lista e exibe as informações
                listaModel.addElement(pessoa);
                pessoas.add(pessoa);

                // Salva os dados em um arquivo CSV
                salvarParaCSV(pessoas);
            }
        });

        // Carrega os dados do arquivo CSV
        carregarDoCSV();

        // Adiciona os componentes ao painel
        painel.add(nomeLabel);
        painel.add(nomeField);
        painel.add(idadeLabel);
        painel.add(idadeField);
        painel.add(saldoLabel);
        painel.add(saldoField);
        painel.add(criarBotao);

        // Cria um painel de rolagem para a lista
        JScrollPane scrollPane = new JScrollPane(lista);
        painel.add(scrollPane);

        // Exibe a janela
        janela.setVisible(true);
    }

    // Salvar a lista de pessoas em um arquivo CSV
    public static void salvarParaCSV(List<Pessoa> pessoas) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("pessoas.csv"))) {
            for (Pessoa pessoa : pessoas) {
                String[] data = {pessoa.nome, Integer.toString(pessoa.idade), Double.toString(pessoa.saldoInicial)};
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Carregar a lista de pessoas de um arquivo CSV
    public static void carregarDoCSV() {
        try (CSVReader reader = new CSVReader(new FileReader("pessoas.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String nome = nextLine[0];
                int idade = Integer.parseInt(nextLine[1]);
                double saldoInicial = Double.parseDouble(nextLine[2]);
                Pessoa pessoa = new Visitante(nome, idade, saldoInicial);
                listaModel.addElement(pessoa);
                pessoas.add(pessoa);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
