import java.awt.Container;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class PrimeiraTela extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblEndereco;
    private JTextField txtEndereco;

    private JLabel lblTel;
    private JFormattedTextField txtTel;

    private JLabel lblCPF;
    private JFormattedTextField txtCPF;

    private JLabel lblTipo;
    private JComboBox cmbTipo;
    private final String[] TipoSanguineo = { "A", "B", "AB", "O" };

    private JLabel lblFator;
    private JComboBox cmbFator;
    private final String[] FatorRH = { "+", "-" };

    private JLabel lblContatoEmergencia;
    private JTextField txtContatoEmergencia;

    private JLabel lblTel2;
    private JFormattedTextField txtTel2;

    private JLabel lblCurso;
    private JComboBox cmbCurso;
    private final String[] CursosUsuarios = { "Engenharia de Software", "Ciência da Computação" };

    private JButton btnOK;

    private JButton btnCancel;

    private Container ctn;

    public PrimeiraTela() {
        setSize(400, 500);
        setTitle("Sistema de Cadastro");
        ctn = getContentPane();
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();

        lblEndereco = new JLabel("Endereço");
        txtEndereco = new JTextField();

        lblTel = new JLabel("Telefone");
        try {
            txtTel = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        lblCPF = new JLabel("CPF");
        try {
            txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        lblTipo = new JLabel("Tipo sanguíneo");
        cmbTipo = new JComboBox(TipoSanguineo);

        lblFator = new JLabel("Fator RH");
        cmbFator = new JComboBox(FatorRH);

        lblContatoEmergencia = new JLabel("Contato Emergencial");
        txtContatoEmergencia = new JTextField();

        lblTel2 = new JLabel("Tefone");
        try {
            txtTel2 = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        lblCurso = new JLabel("Curso");
        cmbCurso = new JComboBox(CursosUsuarios);
        btnOK = new JButton("Inserir");
        btnCancel = new JButton("Cancelar");
        ctn.setLayout(null);
        lblNome.setBounds(20, 0, 100, 25);
        txtNome.setBounds(150, 0, 210, 25);

        lblEndereco.setBounds(20, 50, 100, 25);
        txtEndereco.setBounds(150, 50, 210, 25);

        lblTel.setBounds(20, 100, 100, 25);
        txtTel.setBounds(150, 100, 210, 25);

        lblCPF.setBounds(20, 150, 100, 25);
        txtCPF.setBounds(150, 150, 210, 25);

        lblTipo.setBounds(20, 200, 200, 25);
        cmbTipo.setBounds(150, 200, 40, 25);

        lblFator.setBounds(260, 200, 200, 25);
        cmbFator.setBounds(320, 200, 40, 25);

        lblCurso.setBounds(20, 250, 200, 25);
        cmbCurso.setBounds(150, 250, 210, 25);

        lblContatoEmergencia.setBounds(20, 300, 200, 25);
        txtContatoEmergencia.setBounds(150, 300, 210, 25);

        lblTel2.setBounds(20, 350, 100, 25);
        txtTel2.setBounds(150, 350, 210, 25);

        btnOK.setBounds(150, 400, 105, 50);
        btnCancel.setBounds(255, 400, 105, 50);

        ctn.add(lblNome);
        ctn.add(txtNome);

        ctn.add(lblEndereco);
        ctn.add(txtEndereco);

        ctn.add(lblTel);
        ctn.add(txtTel);

        ctn.add(lblCPF);
        ctn.add(txtCPF);

        ctn.add(lblTipo);
        ctn.add(cmbTipo);

        ctn.add(lblFator);
        ctn.add(cmbFator);

        ctn.add(lblCurso);
        ctn.add(cmbCurso);

        ctn.add(lblContatoEmergencia);
        ctn.add(txtContatoEmergencia);

        ctn.add(lblTel2);
        ctn.add(txtTel2);

        ctn.add(btnOK);

        ctn.add(btnCancel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PrimeiraTela t1 = new PrimeiraTela();
    }
}
