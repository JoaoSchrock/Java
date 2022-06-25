package _7_2_joptionpane;

import javax.swing.*;

public class ExemploJOptionPane3 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

    Object[] opcoes = {"Sim","Nao","com email"};

    int opcao = JOptionPane.showOptionDialog(null,"Voce gostaria de finalizar o cadastro?",
            "Confirmacao",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes);

        System.out.println("Opcao Selecionada: " + opcao);

        if(opcao == 1){

        }
    }
}
