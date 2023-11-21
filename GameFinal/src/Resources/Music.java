package Resources;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;



public class Music {
	
	public static  Clip Win;
	public static  Clip Lose;
	public static  Clip Nivel1;
	public static  Clip Nivel2;
	public static  Clip Nivel3;
	public static  Clip Nivel4;
	public static  Clip Nivel5;
	public static  Clip Menu;
	public static  Clip Jump;
	public static  Clip Walk;

	
	
	
	public Music() {
		
		
		
try {
        	
            File ArchivoSonidoWin = new File("res/Music/GameWin.wav");
            File ArchivoSonidoLose = new File("res/Music/GameOver.wav");
            File ArchivoSonidoNivel1 = new File("res/Music/lvl1.wav");
            File ArchivoSonidoNivel2 = new File("res/Music/lvl2.wav");
            File ArchivoSonidoNivel3 = new File("res/Music/lvl3.wav");
            File ArchivoSonidoNivel4 = new File("res/Music/lvl4.wav");
            File ArchivoSonidoNivel5 = new File("res/Music/lvl5.wav");
            File ArchivoSonidoMenu = new File("res/Music/Menu.wav");
            File ArchivoSonidoWalk = new File("res/Music/walk.wav");
            File ArchivoSonidoJump = new File("res/Music/Jump.wav");
            
            
            
          
         
            AudioInputStream SonidoWin = AudioSystem.getAudioInputStream(ArchivoSonidoWin);
            AudioInputStream SonidoLose = AudioSystem.getAudioInputStream(ArchivoSonidoLose);
            AudioInputStream SonidoLVL1 = AudioSystem.getAudioInputStream(ArchivoSonidoNivel1);
            AudioInputStream SonidoLVL2 = AudioSystem.getAudioInputStream(ArchivoSonidoNivel2);
            AudioInputStream SonidoLVL3 = AudioSystem.getAudioInputStream(ArchivoSonidoNivel3);
            AudioInputStream SonidoLVL4 = AudioSystem.getAudioInputStream(ArchivoSonidoNivel4);
            AudioInputStream SonidoLVL5 = AudioSystem.getAudioInputStream(ArchivoSonidoNivel5);
            AudioInputStream SonidoMenu = AudioSystem.getAudioInputStream(ArchivoSonidoMenu);
            AudioInputStream SonidoWalk = AudioSystem.getAudioInputStream(ArchivoSonidoWalk);
            AudioInputStream SonidoJump = AudioSystem.getAudioInputStream(ArchivoSonidoJump);
            
     
            
            
           
            Win = AudioSystem.getClip();
            Win.open(SonidoWin);
            
            Lose = AudioSystem.getClip();
            Lose.open(SonidoLose);
            
            Nivel1 = AudioSystem.getClip();
            Nivel1.open(SonidoLVL1);
            
            Nivel2 = AudioSystem.getClip();
            Nivel2.open(SonidoLVL2);
            
            Nivel3 = AudioSystem.getClip();
            Nivel3.open(SonidoLVL3);
        
            Nivel4 = AudioSystem.getClip();
            Nivel4.open(SonidoLVL4);
            
            Nivel5 = AudioSystem.getClip();
            Nivel5.open(SonidoLVL5);
            
            Menu = AudioSystem.getClip();
            Menu.open(SonidoMenu);
        
            Jump = AudioSystem.getClip();
            Jump.open(SonidoJump);
            
            Walk = AudioSystem.getClip();
            Walk.open(SonidoWalk);
            
            
         

            
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace(); 
        }



		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	 

}