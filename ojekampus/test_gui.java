/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * Write a description of class test_gui here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test_gui extends JFrame
{
    // instance variables - replace the example below with your own
  
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textfield1;
    private JTextField textfield2;


    /**
     * Constructor for objects of class test_gui
     */
    public test_gui()
    {
        // initialise instance variables
       this.setTitle("Test GUI");
        this.setSize(400,300);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));
        
        button1 = new JButton();
        button1.setBounds(307,231,90,35);
        button1.setBackground(new Color(200,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("timesnewroman",0,11));
        button1.setText("Output");
        button1.setVisible(true);
        button1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
            {
            String input = textfield1.getText();
            textfield2.setText(input);
            }
        });
         label1 = new JLabel();
        label1.setBounds(138,55,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("timesnewroman",0,12));
        label1.setText("INPUT");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(136,96,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("OUTPUT");
        label2.setVisible(true);
        
        textfield1 = new JTextField();
        textfield1.setBounds(210,56,135,29);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(211,97,134,28);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);
        
        contentPane.add(button1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args){
        //System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new test_gui();
            }
        });
    }
}
