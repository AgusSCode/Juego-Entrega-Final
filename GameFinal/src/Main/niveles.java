package Main;
import gamestate.MenuState;
import java.awt.Font;
import java.awt.Image;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Resources.Music;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class niveles {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setBounds(50, 50, 1000, 600);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//ImageIcon image = new ImageIcon("imagenes/Niveles.png");
		
		JLabel lblNewLabel_1 = new JLabel("");
		URL imageUrl = start.class.getResource("Niveles.png");

		if (imageUrl != null) {
		    ImageIcon icon = new ImageIcon(imageUrl);
		    Image imageIcon1 = icon.getImage();
	        Image scaledImage1 = imageIcon1.getScaledInstance(273, 69, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
	        lblNewLabel_1.setIcon(scaledIcon1);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		lblNewLabel_1.setBounds(390, 40, 273, 69);
		panel.add(lblNewLabel_1);
        
        JButton btn = new JButton();
        btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		start.main(args);
        		frame.setVisible(false);
        		
        	}
        });
        URL imageUrl2 = start.class.getResource("home.png");

		if (imageUrl2 != null) {
		    ImageIcon icon2 = new ImageIcon(imageUrl2);
		    Image imageIcon2 = icon2.getImage();
	        Image scaledImage2 = imageIcon2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
	        btn.setIcon(scaledIcon2);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btn.setIcon(scaledImag);
		btn.setOpaque(false);
		btn.setFont(new Font("Dialog", Font.PLAIN, 40));
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);
		btn.setBounds(930, 20, 30, 30);
		panel.add(btn);
		
        
        JButton btnNewButton = new JButton();
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuState.currentSelection=0;
        		Game.main(args);
        		frame.setVisible(false);
        		
        	}
        });
        URL imageUrl3 = start.class.getResource("boton1.png");

		if (imageUrl3 != null) {
		    ImageIcon icon3 = new ImageIcon(imageUrl3);
		    Image imageIcon4 = icon3.getImage();
	        Image scaledImage4 = imageIcon4.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
	        btnNewButton.setIcon(scaledIcon4);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton.setIcon(scaledIcon3);
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(309, 294, 60, 60);
		panel.add(btnNewButton);

        
        JButton btnNewButton1 = new JButton();
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuState.currentSelection=1;
        		Game.main(args);
        		frame.setVisible(false);
        		
        	}
        });
        URL imageUrl4 = start.class.getResource("boton2.png");

		if (imageUrl4 != null) {
		    ImageIcon icon4 = new ImageIcon(imageUrl4);
		    Image imageIcon5 = icon4.getImage();
	        Image scaledImage5 = imageIcon5.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
	        btnNewButton1.setIcon(scaledIcon5);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton1.setIcon(scaledIcon4);
		btnNewButton1.setOpaque(false);
		btnNewButton1.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton1.setContentAreaFilled(false);
		btnNewButton1.setBorderPainted(false);
		btnNewButton1.setBounds(399, 294, 60, 60);
		panel.add(btnNewButton1);
        
        JButton btnNewButton2 = new JButton();
        btnNewButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuState.currentSelection=2;
        		Game.main(args);
        		frame.setVisible(false);
        		
        	}
        });
        URL imageUrl5= start.class.getResource("boton3.png");

		if (imageUrl5 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl5);
		    Image imageIcon6 = icon5.getImage();
	        Image scaledImag6 = imageIcon6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon6 = new ImageIcon(scaledImag6);
	        btnNewButton2.setIcon(scaledIcon6);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
//		btnNewButton2.setIcon(scaledIcon6);
		btnNewButton2.setOpaque(false);
		btnNewButton2.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton2.setContentAreaFilled(false);
		btnNewButton2.setBorderPainted(false);
		btnNewButton2.setBounds(484, 294, 60, 60);
		panel.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton();
        btnNewButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuState.currentSelection=3;
        		Game.main(args);
        		frame.setVisible(false);
        		
        	}
        });
        URL imageUrl6= start.class.getResource("boton4.png");

		if (imageUrl6 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl6);
		    Image imageIcon6 = icon5.getImage();
	        Image scaledImag6 = imageIcon6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon6 = new ImageIcon(scaledImag6);
	        btnNewButton3.setIcon(scaledIcon6);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton3.setIcon(scaledIcon7);
		btnNewButton3.setOpaque(false);
		btnNewButton3.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton3.setContentAreaFilled(false);
		btnNewButton3.setBorderPainted(false);
		btnNewButton3.setBounds(569, 294, 60, 60);
		panel.add(btnNewButton3);
        
        JButton btnNewButton4 = new JButton();
        btnNewButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuState.currentSelection=4;
        		Game.main(args);
        		frame.setVisible(false);
        		
        	}
        });
        
        URL imageUrl7= start.class.getResource("boton5.png");

		if (imageUrl7 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl7);
		    Image imageIcon6 = icon5.getImage();
	        Image scaledImag6 = imageIcon6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon6 = new ImageIcon(scaledImag6);
	        btnNewButton4.setIcon(scaledIcon6);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton4.setIcon(scaledIcon8);
		btnNewButton4.setOpaque(false);
		btnNewButton4.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton4.setContentAreaFilled(false);
		btnNewButton4.setBorderPainted(false);
		btnNewButton4.setBounds(654, 294, 60, 60);
		panel.add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton();
		URL imageUrl8= start.class.getResource("boton6.png");

		if (imageUrl8 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl8);
		    Image imageIcon6 = icon5.getImage();
	        Image scaledImag6 = imageIcon6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon6 = new ImageIcon(scaledImag6);
	        btnNewButton5.setIcon(scaledIcon6);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton5.setIcon(scaledIcon9);
		btnNewButton5.setOpaque(false);
		btnNewButton5.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton5.setContentAreaFilled(false);
		btnNewButton5.setBorderPainted(false);
		btnNewButton5.setBounds(309, 377, 60, 60);
		panel.add(btnNewButton5);
		
        JButton btnNewButton6 = new JButton();
        URL imageUrl9= start.class.getResource("boton7.png");

		if (imageUrl9 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl9);
		    Image imageIcon6 = icon5.getImage();
	        Image scaledImag6 = imageIcon6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon6 = new ImageIcon(scaledImag6);
	        btnNewButton6.setIcon(scaledIcon6);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton6.setIcon(scaledIcon10);
		btnNewButton6.setOpaque(false);
		btnNewButton6.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton6.setContentAreaFilled(false);
		btnNewButton6.setBorderPainted(false);
		btnNewButton6.setBounds(399, 377, 60, 60);
		panel.add(btnNewButton6);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		URL imageUrl10= start.class.getResource("SelectFondo.png");

		if (imageUrl10 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl10);
		    Image imageIcon6 = icon5.getImage();
	        Image scaledImag6 = imageIcon6.getScaledInstance(800, 395, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon6 = new ImageIcon(scaledImag6);
	        lblNewLabel_2.setIcon(scaledIcon6);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//lblNewLabel_2.setIcon(scaledIcon2);
		lblNewLabel_2.setBounds(119, 164, 800, 395);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		URL imageUrl11= start.class.getResource("city.gif");

		if (imageUrl11 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl11);
		    lblNewLabel.setIcon(icon5);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//lblNewLabel.setIcon(new ImageIcon("imagenes/city.gif"));
		lblNewLabel.setBounds(0, 0, 1184, 600);
		panel.add(lblNewLabel);
		
		
		
		
		frame.setVisible(true);
	}
}
