import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import GUI.bitcoinWindow;


public class Main extends JFrame{


	
	public static void main(String[] args) {
		
		// create the frame for the application
		bitcoinWindow Frame = new bitcoinWindow() ;
		// set default setting and attributes 
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		Frame.setTitle("Bitcoin Converter");
		Frame.setLocationRelativeTo(null) ;
		Frame.setSize(480, 400);
		Frame.setResizable(false); 	
		Frame.setVisible(true);
		
	}
	

}
