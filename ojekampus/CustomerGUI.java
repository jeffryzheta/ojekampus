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
import java.util.Date;
import java.text.DateFormat;

public class CustomerGUI extends JFrame {

    private JMenuBar menuBar;
    private JLabel Customer;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel copyright;
    private static JFrame pesanframe = new JFrame();
    private JLabel jam;
    private JButton kembali;
    //Constructor 
    /**
  * CustomerGUI Constructor
  *
  */
 public CustomerGUI(){

        this.setTitle("Customer GUI");
        this.setSize(200,100);
        
        //menu generate method
        
        
        
        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(204,204,255));
        
        jam = new JLabel();
        jam.setHorizontalAlignment(JLabel.RIGHT);
        jam.setFont(UIManager.getFont("timesnewroman"));
        jam.setBounds(90,-190,400,400);
        jam.setVisible(true);
        jam_mulai();
        add(jam);

         Timer hitung = new Timer(500, new ActionListener() 
         {
           @Override
           public void actionPerformed(ActionEvent e) 
             {
                jam_mulai();
             }
         });
         
        hitung.setRepeats(true);
        hitung.setCoalesce(true);
        hitung.setInitialDelay(0);
        hitung.start();

       
        Customer = new JLabel();
        Customer.setBounds(110,-80,300,300);
        Customer.setBackground(new Color(214,217,223));
        Customer.setForeground(new Color(0,0,0));
        Customer.setEnabled(true);
        Customer.setFont(new Font("timesnewroman",0,50));
        Customer.setText("CUSTOMER");
        Customer.setVisible(true);

        button1 = new JButton();
        button1.setBounds(182,147,120,40);
        button1.setBackground(new Color(153,255,153));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("timesnewroman",0,16));
        button1.setText("Registrasi");
        button1.setVisible(true);
        button1.addActionListener(new ActionListener()
        { 
            
            public void actionPerformed(ActionEvent e) { 
                dispose();
              new RegistGUI();
              }
          });
          
        kembali = new JButton();
        kembali.setBounds(5,5,90,30);
        kembali.setBackground(new Color(255,255,255));
        kembali.setEnabled(true);
        kembali.setFont(new Font("Raleway",0,12));
        kembali.setText("Kembali");
        kembali.setActionCommand("Kembali");
        kembali.setVisible(true);
        kembali.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent klik) 
            {
               dispose();
               new Menu();
            }
        });

        button2 = new JButton();
        button2.setBounds(182,204,120,40);
        button2.setBackground(new Color(153,255,153));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("timesnewroman",0,16));
        button2.setText("Pemesanan");
        button2.setVisible(true);
        button2.addActionListener(new ActionListener()
        { 
            
            public void actionPerformed(ActionEvent e) { 
                  dispose();
              new PesananGUI();
              }
          });

        button3 = new JButton();
        button3.setBounds(182,262,120,40);
        button3.setBackground(new Color(153,255,153));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("timesnewroman",0,16));
        button3.setText("Menunggu");
        button3.setVisible(true);
        button3.addActionListener(new ActionListener()
        { 
            
            public void actionPerformed(ActionEvent e) { 
                  dispose();
              new TungguGUI();
              }
          });

        copyright = new JLabel();
        copyright.setBounds(158,360,200,35);
        copyright.setBackground(new Color(214,217,223));
        copyright.setEnabled(true);
        copyright.setFont(new Font("timesnewroman",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);
        
        //adding components to contentPane panel
        contentPane.add(Customer);
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(copyright);
        contentPane.add(kembali);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    
    public void jam_mulai() 
    {
       jam.setText(DateFormat.getDateTimeInstance().format(new Date()));
    } 

}