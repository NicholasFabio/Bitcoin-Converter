package GUI;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bitcoinWindow extends JFrame{

	public bitcoinWindow() 
	{
		JLabel background = new JLabel(new ImageIcon("res/dark.jpg"));
		SurfacePanel panel = new SurfacePanel();
		//setContentPane(background);
		add(panel) ;
		
		
	}

}
