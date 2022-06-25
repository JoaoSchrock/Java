package _7_2_joptionpane;

import javax.swing.*;
import java.net.URL;

public class ExemploJOptionPane2 {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

//        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");

//        JOptionPane.showMessageDialog(null, "Atenção - e-mail não informado. ", "Atenção", JOptionPane.WARNING_MESSAGE);

//        JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro",
//                JOptionPane.ERROR_MESSAGE);

//        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

        URL url = ExemploJOptionPane2.class.getResource("teste.png");
        Icon icon = new ImageIcon(url);

        JOptionPane.showMessageDialog(null, "Obrigado por escolher o SENAI","SENAI",
                JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
