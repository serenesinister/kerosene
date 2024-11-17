package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import entidade.Jogador;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Painel extends JPanel implements Runnable {

    //Configurações de Tela
    final int tamanhoTileOriginal = 16; //tile 16x16 (quadrado retro)
    final int escala = 4; //escala
            
    public final int tamanhoTile = tamanhoTileOriginal * escala; //tile 48x48
    final int maximoColunasTela = 16;
    final int maximoLinhasTela = 12;
    final int larguraTela = tamanhoTile * maximoColunasTela; //768 pixels
    final int alturaTela = tamanhoTile * maximoLinhasTela; //576 pixels

    //FPS
    int FPS = 60;
    
    TeclasManipulador tecla = new TeclasManipulador();    
    Thread threadJogo;
    Jogador jogador = new Jogador(this,tecla);
    
    //Player Default Position   
    int jogadorX = 100;
    int jogadorY = 100;
    int jogadorSpeed = 4; //pixels

    public Painel() {
        
        // Configurações Painel de Jogo
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(tecla);
        this.setFocusable(true);
    }
    
    public void iniciarThreadJogo() {
        
        threadJogo = new Thread(this);
        threadJogo.start();
    }
    
    @Override
    
    public void run() {
    	double drawInterval = 1000000000/FPS;
    	double delta = 0;
    	long lastTime = System.nanoTime();
    	long currentTime;
    	long timer = 0;
    	int drawCount = 0;
    	
    	while (threadJogo != null) {

    		//System.out.println("Kerosene");
    		
    		currentTime = System.nanoTime();
    		
    		delta += (currentTime - lastTime) / drawInterval;
    		
    		timer += (currentTime - lastTime);
    		
    		lastTime = currentTime;
    		
    		if(delta >= 1) {
        		update();
        		repaint();
        		delta--;
        		drawCount++;
    		}	
    		
    		if(timer >= 1000000000) {
    			System.out.println("FPS:" + drawCount);
    			drawCount = 0;
    			timer = 0;
    		}
    	}
    }
    
    public void update() {
    	
    	jogador.update();

    }
    
    public void paintComponent(Graphics g) {
    	
    	super.paintComponent(g);
    	
    	Graphics2D g2 = (Graphics2D)g;
    
    	jogador.draw(g2);
    	
    	g2.dispose();
    }
        
}
