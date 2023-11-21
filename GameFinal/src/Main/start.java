package Main;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Resources.Music;
import gamestate.GameState;
import gamestate.GameStateManager;
import gamestate.MenuState;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;


public class start {


	public static BufferedImage buffer;


	public static void main(String[] args) {
		

		
		JFrame frame = new JFrame();
		frame.setBounds(50, 50, 1000, 600);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		//ImageIcon cross = new ImageIcon("imagenes/imagenes/");
        
        JButton btnCross = new JButton();
        URL imageUrl4 = start.class.getResource("red_cross.png");

		if (imageUrl4 != null) {
		    ImageIcon icon4 = new ImageIcon(imageUrl4);
		    Image crossimg1 = icon4.getImage();
	        Image scaledCross = crossimg1.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	        ImageIcon scaledImgCross = new ImageIcon(scaledCross);
		    btnCross.setIcon(scaledImgCross);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
        btnCross.setOpaque(false);
        btnCross.setBounds(650, 50, 40, 40);
        btnCross.setContentAreaFilled(false);
        btnCross.setBorderPainted(false);
        btnCross.setVisible(false);
		panel.add(btnCross);
        
		
		//ImageIcon imag = new ImageIcon("imagenes/imagenes/Ninja_x.png");
        
        JLabel labelInfo = new JLabel();
        URL imageUrl5 = start.class.getResource("Ninja_x.png");

		if (imageUrl5 != null) {
		    ImageIcon icon5 = new ImageIcon(imageUrl5);
		    Image imag3 = icon5.getImage();
	        Image scaled3 = imag3.getScaledInstance(350, 470, Image.SCALE_SMOOTH);
	        ImageIcon scaledImg3 = new ImageIcon(scaled3);
	        labelInfo.setIcon(scaledImg3);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
        labelInfo.setBounds(350, 40, 350, 470);
        labelInfo.setVisible(false);
		panel.add(labelInfo);
		
		JLabel labelOscuro = new JLabel();
        labelOscuro.setBounds(0, 0, 1000, 600);
        labelOscuro.setOpaque(true);
        labelOscuro.setBackground(new Color(0, 0, 0, 150)); // Color negro con una opacidad de 150
        labelOscuro.setVisible(false); // Inicialmente, el label oscuro está oculto
        panel.add(labelOscuro);
        
        
        
        
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				niveles.main(args);
				frame.setVisible(false);
			}
		});
		URL imageUrl2 = start.class.getResource("Jugar.png");

		if (imageUrl2 != null) {
		    ImageIcon icon2 = new ImageIcon(imageUrl2);
		    btnNewButton.setIcon(icon2);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton.setOpaque(false); // Hace que el fondo sea transparente
		btnNewButton.setContentAreaFilled(false); // Hace que el área de contenido sea transparente
		btnNewButton.setBorderPainted(false); 
		btnNewButton.setBounds(403, 367, 230, 49);
		panel.add(btnNewButton);
		
		
		//ImageIcon image = new ImageIcon("imagenes/imagenes/salir.png");
        
		
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		URL imageUrl3 = start.class.getResource("salir.png");

		if (imageUrl2 != null) {
		    ImageIcon icon3 = new ImageIcon(imageUrl3);
		    Image imageIcon = icon3.getImage();
	        Image scaledImage = imageIcon.getScaledInstance(225, 55, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon = new ImageIcon(scaledImage);
		    btnNewButton_1.setIcon(scaledIcon);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(403, 450, 230, 49);
		panel.add(btnNewButton_1);

		
		//ImageIcon image2 = new ImageIcon("imagenes/imagenes/info.png");
     
        
		JButton btnNewButton_2 = new JButton("");
		URL imageUrl6 = start.class.getResource("info.png");

		if (imageUrl6 != null) {
		    ImageIcon icon4 = new ImageIcon(imageUrl6);
		    Image imageIcon4 = icon4.getImage();
	        Image scaledImage4 = imageIcon4.getScaledInstance(41, 41, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
	        btnNewButton_2.setIcon(scaledIcon4);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		//btnNewButton_2.setIcon(scaledIcon2);
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelOscuro.setVisible(true); // Hace visible el label oscuro al hacer clic en el botón
                labelInfo.setVisible(true);
                btnCross.setVisible(true);
            }
        });
		//btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false); // Hace que el área de contenido sea transparente
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(930, 20, 41, 41);
		panel.add(btnNewButton_2);

		btnCross.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelInfo.setVisible(false);
                labelOscuro.setVisible(false);
                btnCross.setVisible(false);
            }
        });
		
		JLabel lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setIcon(new ImageIcon("imagenes/imagenes/NinjaX.png"));
		URL imageUrl7 = start.class.getResource("NinjaX.png");

		if (imageUrl7 != null) {
		    ImageIcon icon8 = new ImageIcon(imageUrl7);
		    lblNewLabel_1.setIcon(icon8);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		lblNewLabel_1.setBounds(316, 121, 424, 138);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		URL imageUrl = start.class.getResource("anime.gif");

		if (imageUrl != null) {
		    ImageIcon icon = new ImageIcon(imageUrl);
		    lblNewLabel.setIcon(icon);
		} else {
		    System.err.println("Resource not found: anime.gif");
		}
		lblNewLabel.setBounds(0, 0, 1184, 600);
		panel.add(lblNewLabel);
		
		
		
		frame.setVisible(true);

	}
	
	
}
