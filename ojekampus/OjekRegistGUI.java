
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
*Text genereted by Simple GUI Extension for BlueJ
*/

public class OjekRegistGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textfield1;
    private static JTextField textfield2;
    private static JTextField textfield3;
    private JTextField textfield4;
    private static JTextField textfield5;
    private JTextField textfield6;
    private JTextField textfield7;
    private JTextField textfield8;
    private JTextField textfield9;
    private JLabel copyright;
    private static JLabel salah;
    private static JLabel benar;
    private static JLabel salah1;
    private static JLabel benar1;
    private static JLabel salah2;
    private static JLabel benar2;
    private static JTextField textfield10;
    private static JTextField textfield11;
    private JLabel jam;
    private JButton kembali;

    //Constructor 
    public OjekRegistGUI(){

        this.setTitle("OjekRegistGUI");
        this.setSize(500,400);
        
        kembali = new JButton();
        kembali.setBounds(5,5,90,30);
        kembali.setBackground(new Color(255,255,255));
        kembali.setEnabled(true);
        kembali.setFont(new Font("Raleway",0,14));
        kembali.setText("Kembali");
        kembali.setActionCommand("Kembali");
        kembali.setVisible(true);
        kembali.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent klik) 
            {
                 dispose();
                 new OjekGUI();
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
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(100,145,100));

        salah = new JLabel();
        benar = new JLabel();
       
        salah1 = new JLabel();
        benar1 = new JLabel();
        
        salah2 = new JLabel();
        benar2 = new JLabel();

        button1 = new JButton();
        button1.setBounds(134,339,100,35);
        button1.setBackground(new Color(153,255,153));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("timesnewroman",0,14));
        button1.setText("Registrasi");
        button1.setVisible(true);
        button1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
            {
                String nama = textfield1.getText();
                String telp = textfield2.getText();
                String email = textfield3.getText();
                int dob1 = Integer.parseInt(textfield4.getText());
                int dob2 = Integer.parseInt(textfield10.getText());
                int dob3 = Integer.parseInt(textfield11.getText());
                User.setDOB(dob1,dob2,dob3);
                String plat = textfield5.getText();
                Ojek.setNoPlat(plat);
                String x1 = textfield6.getText();
                int x = Integer.parseInt(x1);
                String y1 = textfield7.getText();
                int y = Integer.parseInt(y1);
                String namalokasi = textfield8.getText();
                String keterangan = textfield9.getText();
                Lokasi newlokasi = new Lokasi( namalokasi, x, y, keterangan);
                Ojek.setPosisi(newlokasi);
                Ojek newOjek= new Ojek (DatabaseUser.getIDOjekTerakhir(), nama, telp, email, plat, User.getDOB());
                DatabaseUser.addOjek(newOjek);
                Ojek newOjek1= new Ojek(newOjek.getID(), nama, telp, email, plat, User.getDOB());
                Cloud.addOjek(newOjek1);
                User.setDOB(Integer.parseInt(textfield4.getText()), Integer.parseInt(textfield10.getText()), Integer.parseInt(textfield11.getText()));
               Administrasi.printAllDatabase();
            }
  });
        label1 = new JLabel();
        label1.setBounds(95,-10,317,87);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("timesnewroman",0,35));
        label1.setText("REGISTRASI OJEK");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(35,60,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("timesnewroman",0,14));
        label2.setText("Nama");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(35,100,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("timesnewroman",0,14));
        label3.setText("Telepon");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(35,140,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("timesnewroman",0,14));
        label4.setText("Email");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(35,260,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("timesnewroman",0,14));
        label5.setText("Lokasi");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(35,180,90,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("timesnewroman",0,14));
        label6.setText("DoB");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(35,220,90,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("timesnewroman",0,14));
        label7.setText("Plat");
        label7.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(134,60,190,30);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("timesnewroman",0,14));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(134,100,190,30);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("timesnewroman",0,14));
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
        textfield3.setBounds(134,140,190,30);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("timesnewroman",0,14));
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
        textfield4.setBounds(134,180,50,30);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("timesnewroman",0,14));
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
        
        textfield10 = new JTextField();
        textfield10.setBounds(194,180,50,29);
        textfield10.setBackground(new Color(255,255,255));
        textfield10.setForeground(new Color(0,0,0));
        textfield10.setEnabled(true);
        textfield10.setFont(new Font("timesnewroman",0,14));
        textfield10.setText("MM");
        textfield10.setVisible(true);
        textfield10.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield10.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        textfield11 = new JTextField();
        textfield11.setBounds(254,180,70,29);
        textfield11.setBackground(new Color(255,255,255));
        textfield11.setForeground(new Color(0,0,0));
        textfield11.setEnabled(true);
        textfield11.setFont(new Font("timesnewroman",0,14));
        textfield11.setText("YYYY");
        textfield11.setVisible(true);
        textfield11.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield11.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        textfield5 = new JTextField();
        textfield5.setBounds(134,220,190,30);
        textfield5.setBackground(new Color(255,255,255));
        textfield5.setForeground(new Color(0,0,0));
        textfield5.setEnabled(true);
        textfield5.setFont(new Font("timesnewroman",0,14));
        textfield5.setText("A143 B");
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
        textfield5.getDocument().addDocumentListener(new DocumentListener()
        {
      @Override
      public void removeUpdate(DocumentEvent e)
      {
         validatePlat();
      }

      @Override
      public void insertUpdate(DocumentEvent e)
      {
          validatePlat();
      }
      
      @Override
      public void changedUpdate(DocumentEvent e) {} // Not needed for plain-text fields
  });


        textfield6 = new JTextField();
        textfield6.setBounds(134,260,60,30);
        textfield6.setBackground(new Color(255,255,255));
        textfield6.setForeground(new Color(0,0,0));
        textfield6.setEnabled(true);
        textfield6.setFont(new Font("timesnewroman",0,14));
        textfield6.setText("");
        textfield6.setVisible(true);

        textfield7 = new JTextField();
        textfield7.setBounds(210,260,60,30);
        textfield7.setBackground(new Color(255,255,255));
        textfield7.setForeground(new Color(0,0,0));
        textfield7.setEnabled(true);
        textfield7.setFont(new Font("timesnewroman",0,14));
        textfield7.setText("");
        textfield7.setVisible(true);

        textfield8 = new JTextField();
        textfield8.setBounds(134,300,90,30);
        textfield8.setBackground(new Color(255,255,255));
        textfield8.setForeground(new Color(0,0,0));
        textfield8.setEnabled(true);
        textfield8.setFont(new Font("timesnewroman",0,14));
        textfield8.setText("");
        textfield8.setVisible(true);

        textfield9 = new JTextField();
        textfield9.setBounds(237,300,90,30);
        textfield9.setBackground(new Color(255,255,255));
        textfield9.setForeground(new Color(0,0,0));
        textfield9.setEnabled(true);
        textfield9.setFont(new Font("timesnewroman",0,14));
        textfield9.setText("");
        textfield9.setVisible(true);

        copyright = new JLabel();
        copyright.setBounds(158,365,200,35);
        copyright.setBackground(new Color(214,217,223));
        copyright.setEnabled(true);
        copyright.setFont(new Font("Raleway",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);
        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
        contentPane.add(textfield5);
        contentPane.add(textfield6);
        contentPane.add(textfield7);
        contentPane.add(textfield8);
        contentPane.add(textfield9);
        contentPane.add(textfield10);
        contentPane.add(textfield11);
        contentPane.add(copyright);
        contentPane.add(salah);
        contentPane.add(benar);
        contentPane.add(salah1);
        contentPane.add(benar1);
        contentPane.add(salah2);
        contentPane.add(benar2);
        contentPane.add(kembali);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }

     private static void validateEmail()
  {
    String text = textfield3.getText();
    
    if (User.setEmail(text)==true)
    {
        benar.setBounds(350,140,100,35);
        benar.setBackground(new Color(214,217,223));
        benar.setForeground(new Color(0,0,0));
        benar.setEnabled(true);
        benar.setFont(new Font("timesnewroman",0,14));
        benar.setText("Email benar");             
        benar.setVisible(true);
        salah.setVisible(false);
    }
    else
    {
        salah.setBounds(350,140,100,35);
        salah.setBackground(new Color(214,217,223));
        salah.setForeground(new Color(0,0,0));
        salah.setEnabled(true);
        salah.setFont(new Font("timesnewroman",0,14));
        salah.setText("Email salah");            
        salah.setVisible(true);
        benar.setVisible(false);
    }
  }
  
  private static void validateNoHP()
  {
    String noHP = textfield2.getText();
    if (User.setTelefon(noHP)==true)
    {
        benar1.setBounds(350,100,100,35);
        benar1.setBackground(new Color(214,217,223));
        benar1.setForeground(new Color(0,0,0));
        benar1.setEnabled(true);
        benar1.setFont(new Font("timesnewroman",0,14));
        benar1.setText("No HP benar");             
        benar1.setVisible(true);
        salah1.setVisible(false);
    }
    else
    {
        salah1.setBounds(350,100,100,35);
        salah1.setBackground(new Color(214,217,223));
        salah1.setForeground(new Color(0,0,0));
        salah1.setEnabled(true);
        salah1.setFont(new Font("timesnewroman",0,14));
        salah1.setText("No HP salah");            
        salah1.setVisible(true);
        benar1.setVisible(false);
    }
  }

  private static void validatePlat()
  {
    String plat = textfield5.getText();
    if (Ojek.setNoPlat(plat)==true)
    {
        benar2.setBounds(350,220,100,35);
        benar2.setBackground(new Color(214,217,223));
        benar2.setForeground(new Color(0,0,0));
        benar2.setEnabled(true);
        benar2.setFont(new Font("timesnewroman",0,14));
        benar2.setText("No Plat benar");             
        benar2.setVisible(true);
        salah2.setVisible(false);
    }
    else
    {
        salah2.setBounds(350,220,100,35);
        salah2.setBackground(new Color(214,217,223));
        salah2.setForeground(new Color(0,0,0));
        salah2.setEnabled(true);
        salah2.setFont(new Font("timesnewroman",0,14));
        salah2.setText("No Plat salah");            
        salah2.setVisible(true);
        benar2.setVisible(false);
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
  
     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new OjekRegistGUI();
            }
        });
    }

}