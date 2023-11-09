import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class VisitanteForm extends JFrame implements Serializable {

    private JTextField nomeField;
    private JTextField idadeField;
    private JTextField saldoField;
    protected Pessoa visitante;
    private JList<String> list;

    public VisitanteForm() {
        visitante = new Visitante();

        nomeField = new JTextField(20);
        idadeField = new JTextField(20);
        saldoField = new JTextField(20);
        list = new JList<>(new DefaultListModel<>());

        JButton saveButton = new JButton("Save Visitante");
        JButton loadButton = new JButton("Load Visitante");

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visitante.setNome(nomeField.getText());
                visitante.setIdade(Integer.parseInt(idadeField.getText()));
                visitante.setSaldoInicial(Double.parseDouble(saldoField.getText()));

                DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
                model.addElement(visitante.toString());

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("visitante.p"))) {
                    oos.writeObject(model);
                    JOptionPane.showMessageDialog(null, "Visitante saved to visitante.p");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> model = new DefaultListModel<>();
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("visitante.p"))) {
                    model = (DefaultListModel<String>) ois.readObject();
                    JOptionPane.showMessageDialog(null, "Visitante loaded from visitante.p");
                } catch (IOException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
                list.setModel(model);
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Nome: "));
        panel.add(nomeField);
        panel.add(new JLabel("Idade: "));
        panel.add(idadeField);
        panel.add(new JLabel("Saldo Inicial: "));
        panel.add(saldoField);
        panel.add(saveButton);
        panel.add(loadButton);

        this.add(panel, BorderLayout.NORTH);
        this.add(new JScrollPane(list), BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
