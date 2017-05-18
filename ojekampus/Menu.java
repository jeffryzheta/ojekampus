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

/**
 * Write a description of class Menu here.
 * 
 * @author Jeffry Kurniawan Zheta
 * @version 29 April 2017
 */
public class Menu extends JFrame 
{
    private JButton button2;
    private JButton buttonpelanggan;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel copyright;
    private static JFrame pesanframe = new JFrame();
    private JLabel jam;
    private JButton exit;

   /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        Initiation.mainInit();
        while (DatabaseUser.getPelangganDatabase()==null || DatabaseUser.getOjekDatabase()==null){OjeKampus.StartSistemPengawas(100);
        OjeKampus.MenungguSistem(300);
    }
        OjeKampus.sistem.exit();
        while (DatabasePesanan.getDatabase()==null){
        OjeKampus.MenungguSistem(15);
    }
        this.setTitle("Selamat Datang!");
        this.setSize(525,403);
        
        jam = new JLabel();
        jam.setHorizontalAlignment(JLabel.RIGHT);
        jam.setFont(UIManager.getFont("Raleway"));
        jam.setBounds(115,-190,400,400);
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

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(525,403));
        contentPane.setBackground(new Color(10,125,125));

        button2 = new JButton();
        button2.setBounds(276,232,143,70);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("Raleway",0,22));
        button2.setText("Customer");
        button2.setVisible(true);
        button2.addMouseListener(new MouseAdapter() 
     {
         public void mouseClicked(MouseEvent klik) 
         {
             dispose();
             new CustomerGUI();
         }
     });
     
        exit = new JButton();
        exit.setBounds(5,5,90,30);
        exit.setBackground(new Color(255,255,255));
        exit.setEnabled(true);
        exit.setFont(new Font("Raleway",0,12));
        exit.setText("Keluar");
        exit.setVisible(true);
        exit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent klik) 
            {
              int pilih = JOptionPane.showConfirmDialog(pesanframe, "Apakah Anda ingin menutup aplikasi?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
              if (pilih == JOptionPane.YES_OPTION)
              {
                  System.exit(0);
              }
            }
        });


        buttonpelanggan = new JButton();
        buttonpelanggan.setBounds(93,232,143,70);
        buttonpelanggan.setBackground(new Color(214,217,223));
        buttonpelanggan.setForeground(new Color(0,0,0));
        buttonpelanggan.setEnabled(true);
        buttonpelanggan.setFont(new Font("Raleway",0,20));
        buttonpelanggan.setText("Ojek");
        buttonpelanggan.setVisible(true);
     buttonpelanggan.addMouseListener(new MouseAdapter() 
     {
         public void mouseClicked(MouseEvent klik) 
         {
              dispose();
             new OjekGUI();
         }
     });


        label1 = new JLabel();
        label1.setBounds(137,6,263,56);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("Raleway",0,25));
        label1.setText("       Welcome to    ");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(26,19,494,122);
        label2.setBackground(new Color(255,153,153));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("timesnewroman",0,35));
        label2.setText("         Aplikasi OjeKampus");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(64,96,422,81);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("Papyrus",0,18));
        label3.setText("Kami siap memberikan layanan terbaik untuk Anda!");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(158,163,251,64);
        label4.setBackground(new Color(255,153,153));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("Raleway",0,14));
        label4.setText("Saya ingin masuk sebagai ...");
        label4.setVisible(true);
        
        copyright = new JLabel();
        copyright.setBounds(158,360,200,35);
        copyright.setBackground(new Color(214,217,223));
        copyright.setEnabled(true);
        copyright.setFont(new Font("Raleway",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);
        
        contentPane.add(button2);
        contentPane.add(buttonpelanggan);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(copyright);
        contentPane.add(exit);


        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
  
     /**
     * Method ini digunakan untuk menset jam yang sesuai dengan keadaan sebenarnya (real-time)
     * 
     */
    public void jam_mulai() 
    {
       jam.setText(DateFormat.getDateTimeInstance().format(new Date()));
    } 
    
    public static void main(String[] args)
    {
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Menu();  
              
            }
        });
    }
}

