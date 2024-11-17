package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        //criação da janela principal
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha o programa ao encerrar a janela
        janela.setResizable(false); //impede redimensionamento
        janela.setTitle("Kerosene"); //título da janela
        
        //adiciona o painel do jogo à janela
        Painel painelJogo = new Painel();
        janela.add(painelJogo);
        
        //ajusta o tamanho da janela e a centraliza na tela
        janela.pack();
        janela.setLocationRelativeTo(null);
        
        //jorna a janela visível
        janela.setVisible(true);
        
        //inicia a thread do jogo
        painelJogo.iniciarThreadJogo();
    }
}
