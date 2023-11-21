package Main;
import java. awt. BorderLayout;
import javax.swing.*;
public class Game {
	//clase main, simplemente ejecuta el GamePanel

	public static JFrame frame;
	
	public static void main(String[] args) { 
		
		frame = new JFrame ("Platformer");
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.add(new GamePanel(),BorderLayout.CENTER);
		frame.pack();
		
		//frame.setLocationRelativeTo(0,0);
		frame.setLocation(50, 50);
		frame.setVisible(true);
		

	}
	
	
	
	
	
}
