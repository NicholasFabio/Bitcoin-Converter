package GUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SurfacePanel extends JPanel{
	
	private JLabel btcPrice = new JLabel("Bitcoin Price (ZAR): ");
    private JLabel bitcoins = new JLabel("Amount of Bitcoin(s): ");
    private JTextField txtBtcPrice = new JTextField(20);
    private JTextField txtBitcoins = new JTextField(20);
    private JButton btnConvertToZAR = new JButton("Convert to ZAR");
    
    private JLabel btcPrice2 = new JLabel("Bitcoin Price (ZAR): ");
    private JLabel ZARToSpend = new JLabel("Spend Value (ZAR): ");
    private JTextField txtBtcPrice2 = new JTextField(20);
    private JTextField txtSpendValue = new JTextField(20);
    private JButton btnCovertToBitcoin = new JButton("Convert to Bitcoin");
	public BufferedImage b;
	
	public SurfacePanel(){
		
		// create a new panel with GridBagLayout manager
        final JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout()); 
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        GridBagConstraints constraintsP2 = new GridBagConstraints();
        constraintsP2.anchor = GridBagConstraints.WEST;
        constraintsP2.insets = new Insets(10, 10, 10, 10);
        
        
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        panel1.add(btcPrice, constraints);
        
        constraintsP2.gridx = 5;
        constraintsP2.gridy = 0;     
        panel2.add(btcPrice2, constraints);
 
        constraints.gridx = 1;
        panel1.add(txtBtcPrice, constraints);
        
        constraintsP2.gridx = 6;
        panel2.add(txtBtcPrice2, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        panel1.add(bitcoins, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        panel2.add(ZARToSpend, constraints);
        
        constraints.gridx = 1;
        panel1.add(txtBitcoins, constraints);
        
        constraintsP2.gridx = 6;
        panel2.add(txtSpendValue, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel1.add(btnConvertToZAR, constraints);
        
        constraintsP2.gridx = 5;
        constraintsP2.gridy = 2;
        constraintsP2.gridwidth = 2;
        constraintsP2.anchor = GridBagConstraints.CENTER;
        panel2.add(btnCovertToBitcoin, constraints);
        
        
        btnConvertToZAR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double b ;
				int a ;
				b = Double.parseDouble(txtBitcoins.getText().toString());
				a = Integer.parseInt(txtBtcPrice.getText().toString()) ;
				
				JOptionPane.showMessageDialog(panel1, "ZAR : " + convertToRands(b, a));
			}
		});
        
        btnCovertToBitcoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double b ;
				int a ;
				a = Integer.parseInt(txtBtcPrice2.getText().toString()) ;
				b = Double.parseDouble(txtSpendValue.getText().toString());
				
				JOptionPane.showMessageDialog(panel1, "ZAR : " +convertToBitcoin(a, b));
			}
		});
         
        // set border for the panel
        panel1.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "BTC - ZAR"));
        panel2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "ZAR - BTC"));
        add(panel1);
        add(panel2);
		
	}
		
	
	public static double convertToBitcoin(int coinCost, double randsForbitcoin){
		double returnValue= 0.0;
		
		returnValue = randsForbitcoin / coinCost ;
		
		return returnValue;
		
	}
	
	public static double convertToRands(double bitcoins, Integer coinCost){
		double returnValue= 0.0;
		
		returnValue = bitcoins * coinCost ;
		
		return returnValue;
		
	}

	
}
