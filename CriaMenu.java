import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class CriaMenu
{
    JLabel texto;

    public JMenuBar criaMenu()
    {
        JMenuBar barraMenu = new JMenuBar();

        // Menu principal
        JMenu menu = new JMenu("Menu");

        // Item Cadastro
        JMenuItem menuItem = new JMenuItem("Cadastro", KeyEvent.VK_I);
        menuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou em Cadastro");
                PrimeiraTela tela = new PrimeiraTela();
                tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        menu.add(menuItem);

        // Item Adicionar Consulta
        menuItem = new JMenuItem("Adicionar Consulta", KeyEvent.VK_T);
        menuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou em Consulta");
                new AdicionarConsulta();
            }
        });
        menu.add(menuItem);

        barraMenu.add(menu);

        // Menu Ajuda
        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem itemSobre = new JMenuItem("Sobre");
        itemSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                    "Sistema de Saúde\nAutores: Mateus Artur\nJoão Pedro\nVersão: 1.0",
                    "Sobre", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        menuAjuda.add(itemSobre);
        barraMenu.add(menuAjuda);

        return barraMenu;
    }

    public Container criaPainel()
    {
        JPanel painel = new JPanel(new BorderLayout());
        painel.setOpaque(true);
        texto = new JLabel("Você cliquou no item:");
        painel.add(texto, BorderLayout.PAGE_END);
        return painel;
    }

    public static void criaGUI()
    {
        JFrame formulario = new JFrame("Sistema de Saúde");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CriaMenu menu = new CriaMenu();
        formulario.setJMenuBar(menu.criaMenu());
        formulario.setContentPane(menu.criaPainel());
        formulario.setSize(400, 300);
        formulario.setVisible(true);
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                criaGUI();
            }
        });
    }
}
