
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.regex.*;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.util.Date;
import java.text.DateFormat;

/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 */
public class RegistGUI extends JFrame {
    private JMenuBar menuBar;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textfield1;
    private static JTextField textfield2;
    private static JTextField textfield3;
    private static JTextField textfield4;
    private static JLabel salah;
    private static JLabel benar;
    private static JLabel salah1;
    private static JLabel benar1;
    private static JTextField textfield5;
    private static JTextField textfield6;
    private JLabel jam;
    private JLabel copyright;
    private JButton kembali;
    
    
 
    //Constructor 
    public RegistGUI(){

        this.setTitle("RegistGUI");
        this.setSize(400,300);
        
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
                 new CustomerGUI();
            }
        });
        
        jam = new JLabel();
        jam.setHorizontalAlignment(JLabel.RIGHT);
        jam.setFont(UIManager.getFont("Raleway"));
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
    
        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(204,204,255));


        button1 = new JButton();
        button1.setBounds(307,251,90,35);
        button1.setBackground(new Color(153,255,153));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("timesnewroman",0,11));
        button1.setText("Registrasi");
        button1.setVisible(true);
        button1.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent e)
            {
                String email = textfield3.getText();
                String telp = textfield2.getText();
                String nama = textfield1.getText();
                
                int DoB1 = Integer.parseInt(textfield4.getText());
                int DoB2 = Integer.parseInt(textfield5.getText());
                int DoB3 = Integer.parseInt(textfield6.getText());
                User.setDOB(DoB1, DoB2, DoB3);
                Pelanggan input = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), nama, telp, email, User.getDOB());
                
                DatabaseUser.addPelanggan(input);
                Pelanggan input1 = new Pelanggan(input.getID(), nama, telp, email, User.getDOB());
                Cloud.addPelanggan(input1);
        //                  if(User.setEmail(email)==true){
        //                     JOptionPane myIO = new JOptionPane();
        //                     myIO.showMessageDialog(null, "Email Tepat");
        //                 }
              
               Administrasi.printAllDatabase();
            }
        });

        label1 = new JLabel();
        label1.setBounds(138,75,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("timesnewroman",0,14));
        label1.setText("Nama");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(136,116,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("timesnewroman",0,14));
        label2.setText("Telp");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(135,154,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("timesnewroman",0,14));
        label3.setText("Email");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(136,196,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("timesnewroman",0,14));
        label4.setText("DoB");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(72,0,400,98);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("timesnewroman",0,30));
        label5.setText("REGISTRASI CUSTOMER");
        label5.setVisible(true);
        
        salah = new JLabel();
        benar = new JLabel();
       
        salah1 = new JLabel();
        benar1 = new JLabel();
  
        textfield1 = new JTextField();
        textfield1.setBounds(210,76,135,29);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("timesnewroman",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(210,116,135,29);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("timesnewroman",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);
        textfield2.getDocument().addDocumentListener(new DocumentListener()
        {
      @Override
      public void removeUpdate(DocumentEvent e)
      {
        validateNoHP();
      }

      @Override
      public void insertUpdate(DocumentEvent e)
      {
        validateNoHP();
      }
      
      @Override
      public void changedUpdate(DocumentEvent e) {} // Not needed for plain-text fields
  });

        textfield3 = new JTextField();
        textfield3.setBounds(210,156,135,29);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("timesnewroman",0,12));
        textfield3.setText("");
        textfield3.setVisible(true);
        textfield3.getDocument().addDocumentListener(new DocumentListener()
    {
      @Override
      public void removeUpdate(DocumentEvent e)
      {
        validateEmail();
      }

      @Override
      public void insertUpdate(DocumentEvent e)
      {
        validateEmail();
      }
      
      @Override
      public void changedUpdate(DocumentEvent e) {} // Not needed for plain-text fields
  });

      
        textfield4 = new JTextField();
        textfield4.setBounds(210,198,50,29);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("timesnewroman",0,12));
        textfield4.setText("DD");
        textfield4.setVisible(true);
        textfield4.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield4.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        textfield5 = new JTextField();
        textfield5.setBounds(270,198,50,29);
        textfield5.setBackground(new Color(255,255,255));
        textfield5.setForeground(new Color(0,0,0));
        textfield5.setEnabled(true);
        textfield5.setFont(new Font("timesnewroman",0,12));
        textfield5.setText("MM");
        textfield5.setVisible(true);
        textfield5.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield5.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        textfield6 = new JTextField();
        textfield6.setBounds(330,198,70,29);
        textfield6.setBackground(new Color(255,255,255));
        textfield6.setForeground(new Color(0,0,0));
        textfield6.setEnabled(true);
        textfield6.setFont(new Font("timesnewroman",0,12));
        textfield6.setText("YYYY");
        textfield6.setVisible(true);
        textfield6.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield6.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
   
        copyright = new JLabel();
        copyright.setBounds(158,360,200,35);
        copyright.setBackground(new Color(214,217,223));
        copyright.setEnabled(true);
        copyright.setFont(new Font("timesnewroman",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);
        
        //adding components to contentPane contentPane
        contentPane.add(button1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(salah);
        contentPane.add(benar);
        contentPane.add(salah1);
        contentPane.add(benar1);
      
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
        contentPane.add(textfield5);
        contentPane.add(textfield6);
        contentPane.add(copyright);
        contentPane.add(kembali);

        //adding contentPane to JFrame and seting of window position and close operation
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
                new RegistGUI();
            }
        });
    }

   private static void validateEmail()
  {
    String text = textfield3.getText();
    
    if (User.setEmail(text)==true)
    {
        benar.setBounds(350,154,100,35);
        benar.setBackground(new Color(214,217,223));
        benar.setForeground(new Color(0,0,0));
        benar.setEnabled(true);
        benar.setFont(new Font("timesnewroman",0,12));
        benar.setText("Email benar");             
        benar.setVisible(true);
        salah.setVisible(false);
    }
    else
    {
        salah.setBounds(350,154,100,35);
        salah.setBackground(new Color(214,217,223));
        salah.setForeground(new Color(0,0,0));
        salah.setEnabled(true);
        salah.setFont(new Font("timesnewroman",0,12));
        salah.setText("Email salah");            
        salah.setVisible(true);
        benar.setVisible(false);
    }
    
  }
  
   /**
     * Method ini digunakan untuk menset jam yang sesuai dengan keadaan sebenarnya (real-time)
     * 
     */
    public void jam_mulai() 
    {
       jam.setText(DateFormat.getDateTimeInstance().format(new Date()));
    } 
    
  
  private static void validateNoHP()
  {
    String noHP = textfield2.getText();
    if (User.setTelefon(noHP)==true)
    {
        benar1.setBounds(350,116,100,35);
        benar1.setBackground(new Color(214,217,223));
        benar1.setForeground(new Color(0,0,0));
        benar1.setEnabled(true);
        benar1.setFont(new Font("timesnewroman",0,12));
        benar1.setText("No HP benar");             
        benar1.setVisible(true);
        salah1.setVisible(false);
    }
    else
    {
        salah1.setBounds(350, 116,100,35);
        salah1.setBackground(new Color(214,217,223));
        salah1.setForeground(new Color(0,0,0));
        salah1.setEnabled(true);
        salah1.setFont(new Font("timesnewroman",0,12));
        salah1.setText("No HP salah");            
        salah1.setVisible(true);
        benar1.setVisible(false);
    }
  }
  
 
}