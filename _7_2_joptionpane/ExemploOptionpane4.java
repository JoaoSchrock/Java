package _7_2_joptionpane;

import javax.swing.*;

public class ExemploOptionpane4 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] possibilidades = {"Masculino", "Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null,"Selecione Sexo","SENAI",JOptionPane.PLAIN_MESSAGE,
                null,possibilidades,possibilidades[0]);


        System.out.println("Sexo Selecionado: " + sexo);

        String nome = (String) JOptionPane.showInputDialog(null,"Digite seu nome","SENAI",
                JOptionPane.PLAIN_MESSAGE,null,null,null);
        System.out.println("Seu nome é: " + nome);
    }
}
