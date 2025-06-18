import javax.swing.*;
import java.awt.event.*;

public class InterfaceSimples implements ActionListener{
    JButton botao;
    public static void main(String[] args){
        InterfaceSimples gui = new InterfaceSimples();
        gui.go();
    }

    public void go(){
        JFrame quadro = new JFrame();
        botao = new JButton("Clique aqui");
        botao.addActionListener(this);
        

        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quadro.getContentPane().add(botao);
        quadro.setSize(300, 300);
        quadro.setVisible(true);
    }

    public void actionPerformed(ActionEvent Event){
        botao.setText("Mudei pois fui clicado");
    }
}