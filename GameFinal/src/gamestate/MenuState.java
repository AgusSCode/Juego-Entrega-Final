package gamestate;

// Toda esta clase maneja el menu
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.sound.sampled.*;


import Main.GamePanel;
import Main.start;
import Resources.Music;
public class MenuState extends GameState{
	
	private String[] options= {"Start","Help","Quit","Four","Five"};
	public static int currentSelection=0;
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
		Music music = new Music(); // necesario para que tome la referencia estatica a la clase Music
		
		System.out.println(currentSelection);
		
		
		
	}

	
	public void init() {	}

	
	public void tick() {}

	
	public void draw(Graphics g) {
		//dibuja el String options definido mas arriba conn su fuente , tamaño y posicionamiento en el frame
		
		//g.setColor(new Color(50,150,200));
		//g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		/*(int i=0;i<options.length;i++) {
			if(i== currentSelection) {g.setColor(Color.GREEN);}else
			{g.setColor(Color.WHITE);}
			
			
			g.setFont(new Font("Arial",Font.PLAIN,72));
			
			g.drawString(options[i],GamePanel.WIDTH/2-75, 150+i*150);
			
		}*/
		
	
		
		if(currentSelection==0) {
			//start
			gsm.states.push(new Level1State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/City.gif");
			GamePanel.fondoImagen =img.getImage();
			
			
			if (Music.Nivel1 != null) {
			    Music.Nivel1.setFramePosition(0);
			    Music.Nivel1.start();
			    Music.Nivel1.loop(Clip.LOOP_CONTINUOUSLY);
			}
			
			
			//Nivel1.loop(Clip.LOOP_CONTINUOUSLY);
			
		}else if(currentSelection==1) {
			gsm.states.push(new Level2State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/2.gif");
			GamePanel.fondoImagen =img.getImage();
			
			if (Music.Nivel2 != null) {
			    Music.Nivel2.setFramePosition(0);
			    Music.Nivel2.start();
			    Music.Nivel2.loop(Clip.LOOP_CONTINUOUSLY);
			}
			
		}else if(currentSelection==2) {
			
			gsm.states.push(new Level3State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/7.gif");
			GamePanel.fondoImagen =img.getImage();
			
			
			if (Music.Nivel3 != null) {
			    Music.Nivel3.setFramePosition(0);
			    Music.Nivel3.start();
			    Music.Nivel3.loop(Clip.LOOP_CONTINUOUSLY);
			}
		
		}else if(currentSelection==3) {
			gsm.states.push(new Level4State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/16.gif");
			GamePanel.fondoImagen =img.getImage();
			
			
			if (Music.Nivel4 != null) {
			    Music.Nivel4.setFramePosition(0);
			    Music.Nivel4.start();
			    Music.Nivel4.loop(Clip.LOOP_CONTINUOUSLY);
			}
			
			
		}else if(currentSelection==4) {
			gsm.states.push(new Level5State(gsm));
			ImageIcon img = new ImageIcon("res/Blocks/17.gif");
			GamePanel.fondoImagen =img.getImage();
			
			if (Music.Nivel5 != null) {
			    Music.Nivel5.setFramePosition(0);
			    Music.Nivel5.start();
			    Music.Nivel5.loop(Clip.LOOP_CONTINUOUSLY);
			}
			
		}
		
	}

	// Entrada de datos para elegir entre las opciones
	public void keyPressed(int k) {
		/*if(k==KeyEvent.VK_DOWN) {
			currentSelection++;
			if(currentSelection>=options.length) {
				currentSelection=0;}
		}
		else if(k==KeyEvent.VK_UP) { 
			currentSelection--;
		if(currentSelection<0) {currentSelection = options.length-1;}
		}
		
		*/
		//if(k==KeyEvent.VK_ENTER) {
		/*	if(currentSelection==0) {
				//start
				gsm.states.push(new Level1State(gsm));
				
				ImageIcon img = new ImageIcon("res/Blocks/City.gif");
				GamePanel.fondoImagen =img.getImage();
				
				
				if (Music.Nivel1 != null) {
				    Music.Nivel1.setFramePosition(0);
				    Music.Nivel1.start();
				    Music.Nivel1.loop(Clip.LOOP_CONTINUOUSLY);
				}
				
				
				//Nivel1.loop(Clip.LOOP_CONTINUOUSLY);
				
			}
			
		else if(currentSelection==1) {
			gsm.states.push(new Level2State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/City2.gif");
			GamePanel.fondoImagen =img.getImage();
			
			if (Music.Nivel2 != null) {
			    Music.Nivel2.setFramePosition(0);
			    Music.Nivel2.start();
			    Music.Nivel2.loop(Clip.LOOP_CONTINUOUSLY);
			}
			
		}else if(currentSelection==2) {
			
			gsm.states.push(new Level3State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/City2.gif");
			GamePanel.fondoImagen =img.getImage();
			
			if (Music.Nivel3 != null) {
			    Music.Nivel3.setFramePosition(0);
			    Music.Nivel3.start();
			    Music.Nivel3.loop(Clip.LOOP_CONTINUOUSLY);
			}
		
		}else if(currentSelection==3) {
			gsm.states.push(new Level4State(gsm));
			
			ImageIcon img = new ImageIcon("res/Blocks/City2.gif");
			GamePanel.fondoImagen =img.getImage();
			
		}else if(currentSelection==4) {
			gsm.states.push(new Level5State(gsm));
			ImageIcon img = new ImageIcon("res/Blocks/City2.gif");
			GamePanel.fondoImagen =img.getImage();
		}
			
			*/
		
	//}
		
		
		
		
		
	}

	
	public void keyReleased(int k) {
		
		
	}

}
