package entidade;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.Painel;
import main.TeclasManipulador;

public class Jogador extends Entidade{
	
	Painel gp;
	TeclasManipulador tecla;
	
	public Jogador(Painel gp, TeclasManipulador tecla) {
		this.gp = gp;
		this.tecla = tecla;
		setDefaultValues();
		getJogadorImage();
	}
	
	public void setDefaultValues() {		
		x = 100;
		y = 100;
		speed = 4;
		direction = "down"; //inicial
	}
	
	public void getJogadorImage() {
		try {
			
			up1 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_up_1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_up_2.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_down_1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_down_2.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_left_1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_left_2.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_right_1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/jogador/boy_right_2.png"));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Atualiza posição do jogador
	public void update() {
    	
		if(tecla.upPressed == true || tecla.downPressed == true || tecla.leftPressed == true || tecla.rightPressed == true) {
			if(tecla.upPressed == true) {
				direction = "up";
	    		y -= speed;
	    	}
	    	else if(tecla.downPressed == true) {
	    		direction = "down";
	    		y += speed;
	    	}
	    	else if(tecla.leftPressed == true) {
	    		direction = "left";
	    		x -= speed;
	    	}
	    	else if(tecla.rightPressed == true) {
	    		direction = "right";
	    		x += speed;
	    	}
			
			spriteCounter++;
			if(spriteCounter > 12) {
				if(spriteNum == 1) {
					spriteNum = 2;
				}
				else if(spriteNum==2) {
					spriteNum =1;
				}
				spriteCounter = 0;
			}
		}
	}
	
	public void draw(Graphics2D g2) {
	
//		g2.setColor(Color.white);
//    	g2.fillRect(x, y, gp.tamanhoTile, gp.tamanhoTile);
    	
		BufferedImage image = null;
		
		switch(direction) {
			case "up":
				if(spriteNum == 1) {
					image = up1;
				}
				if(spriteNum == 2) {
					image = up2;
				}	
				break;
			case "down":
				if(spriteNum == 1) {
					image = down1;
				}
				if(spriteNum == 2) {
					image = down2;
				}
				break;
			case "left":
				if(spriteNum == 1) {
					image = left1;
				}
				if(spriteNum == 2) {
					image = left2;
				}
				break;
			case "right":
				if(spriteNum == 1) {
					image = right1;
				}
				if(spriteNum == 2) {
					image = right2;
				}
				break;
			}

		//Desenha a imagem do jogador na posição (x, y)		
		g2.drawImage(image, x, y, gp.tamanhoTile, gp.tamanhoTile, null);
		
	}
}
