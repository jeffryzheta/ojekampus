/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 */
import java.awt.*;
import javax.swing.*;


public class CustomerGUI extends JFrame {

	private JMenuBar menuBar;
	private JLabel Customer;
	private JButton button1;
	private JButton button2;
	private JButton button3;

	//Constructor 
	public CustomerGUI(){

		this.setTitle("Customer GUI");
		this.setSize(400,300);
		//menu generate method
		
		

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(192,192,192));


		Customer = new JLabel();
		Customer.setBounds(176,18,90,35);
		Customer.setBackground(new Color(214,217,223));
		Customer.setForeground(new Color(0,0,0));
		Customer.setEnabled(true);
		Customer.setFont(new Font("timesnewroman",0,12));
		Customer.setText("Customer");
		Customer.setVisible(true);

		button1 = new JButton();
		button1.setBounds(163,57,117,33);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("timesnewroman",0,12));
		button1.setText("Registrasi");
		button1.setVisible(true);

		button2 = new JButton();
		button2.setBounds(164,102,115,35);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("timesnewroman",0,12));
		button2.setText("Pemensanan");
		button2.setVisible(true);

		button3 = new JButton();
		button3.setBounds(166,153,113,34);
		button3.setBackground(new Color(214,217,223));
		button3.setForeground(new Color(0,0,0));
		button3.setEnabled(true);
		button3.setFont(new Font("timesnewroman",0,12));
		button3.setText("Menunggu");
		button3.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(Customer);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
	 public static void main(String[] args){
		//System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerGUI();
			}
		});
	}

}