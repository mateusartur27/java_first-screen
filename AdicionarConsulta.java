import javax.swing.*;
import java.awt.*;
import java.text.ParseException;

public class AdicionarConsulta extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblData;
    private JFormattedTextField txtData;
    private JLabel lblHora;
    private JFormattedTextField txtHora;
    private JButton btnSalvar;
    private JButton btnCancelar;

    public AdicionarConsulta() {
        setTitle("Adicionar Consulta");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        Container ctn = getContentPane();
        ctn.setLayout(null);

        lblNome = new JLabel("Nome do Paciente:");
        lblNome.setBounds(20, 20, 120, 25);
        ctn.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(150, 20, 160, 25);
        ctn.add(txtNome);

        lblData = new JLabel("Data:");
        lblData.setBounds(20, 60, 120, 25);
        ctn.add(lblData);

        try {
            txtData = new JFormattedTextField(new javax.swing.text.MaskFormatter("##/##/####"));
            txtData.setToolTipText("dd/MM/yyyy");
        } catch (ParseException e) {
            txtData = new JFormattedTextField();
        }
        txtData.setBounds(150, 60, 80, 25);
        ctn.add(txtData);

        lblHora = new JLabel("Hora:");
        lblHora.setBounds(20, 100, 120, 25);
        ctn.add(lblHora);

        try {
            txtHora = new JFormattedTextField(new javax.swing.text.MaskFormatter("##:##"));
            txtHora.setToolTipText("HH:mm");
        } catch (ParseException e) {
            txtHora = new JFormattedTextField();
        }
        txtHora.setBounds(150, 100, 80, 25);
        ctn.add(txtHora);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(70, 150, 90, 30);
        ctn.add(btnSalvar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(180, 150, 90, 30);
        btnCancelar.addActionListener(e -> dispose());
        ctn.add(btnCancelar);

        setVisible(true);
    }
}