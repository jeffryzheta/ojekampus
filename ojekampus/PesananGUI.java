import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.Date;
import java.text.DateFormat;


/**
 * Write a description of class PesananGUI here.
 * 
 * @author Jeffry Kurniawan Zheta
 * @version 
 */

public class PesananGUI extends JFrame {
    private JButton enter;
    private JButton pesan;
    private JLabel biaya;
    private JLabel id;
    private JLabel labelpesanan; 
    private JLabel labellokakhir;
    private JLabel labellokawal; 
    private JLabel labelnamaakhir; 
    private JLabel labelnamaawal; 
    private JLabel tipeLayanan;
   
    private JTextField textid; 
    private JTextField korxawal;
    private JTextField koryawal; 
    private JTextField korxakhir;
    private JTextField koryakhir;
    private JTextField lokAwal; 
    private JTextField lokAkhir;
    private JTextField ketlokawal;
    private JTextField ketlokakhir;
    private JTextField textnamaawal;
    private JTextField textnamaakhir;
    private JTextField textbiaya;
    private JComboBox pilihTipeLayanan;
    private JLabel copyright;
    private JLabel jam;
    private JButton kembali;

    public PesananGUI()
    {
        this.setTitle("Pesanan GUI");
        this.setSize(497,428);
        
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
        
        kembali = new JButton();
        kembali.setBounds(5,5,80,20);
        kembali.setBackground(new Color(255,255,255));
        kembali.setEnabled(true);
        kembali.setFont(new Font("Raleway",0,11));
        kembali.setText("Kembali");
        kembali.setActionCommand("Kembali");
        kembali.setVisible(true);
        kembali.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent klik) 
            {
                 dispose();
                 new RegistGUI();
            }
        });
        
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(497,428));
        contentPane.setBackground(new Color(204,204,255));

        labelpesanan = new JLabel();
        labelpesanan.setBounds(43,8,430,76);
        labelpesanan.setBackground(new Color(255,255,255));
        labelpesanan.setForeground(new Color(0,0,0));
        labelpesanan.setEnabled(true);
        labelpesanan.setFont(new Font("timesnewroman",0,34));
        labelpesanan.setText("PEMESANAN CUSTOMER");
        labelpesanan.setVisible(true);
        
        biaya = new JLabel();
        biaya.setBounds(18,322,90,35);
        biaya.setBackground(new Color(255,255,255));
        biaya.setForeground(new Color(0,0,0));
        biaya.setEnabled(true);
        biaya.setFont(new Font("timesnewroman",0,12));
        biaya.setText("Biaya");
        biaya.setVisible(true);

        enter = new JButton();
        enter.setBounds(387,68,90,35);
        enter.setBackground(new Color(153,255,153));
        enter.setForeground(new Color(0,0,0));
        enter.setEnabled(true);
        enter.setFont(new Font("timesnewroman",0,12));
        enter.setText("Enter");
        enter.setVisible(true);
        enter.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent e)
            {  String IDtext = textid.getText();
                int ID = Integer.parseInt(IDtext);
               Pelanggan pelanggan_now = DatabaseUser.getUserPelanggan(ID);
                if (pelanggan_now!=null) { 
                    JOptionPane myIO = new JOptionPane();
                    myIO.showMessageDialog(null, "Pelanggan Ditemukan");
                }
            }
        });

        id = new JLabel();
        id.setBounds(20,68,120,35);
        id.setBackground(new Color(255,255,255));
        id.setForeground(new Color(0,0,0));
        id.setEnabled(true);
        id.setFont(new Font("timesnewroman",0,12));
        id.setText("ID                    :");
        id.setVisible(true);

        textid = new JTextField();
        textid.setBounds(125,68,250,35);
        textid.setBackground(new Color(255,255,255));
        textid.setForeground(new Color(0,0,0));
        textid.setEnabled(true);
        textid.setFont(new Font("timesnewroman",0,12));
        textid.setText("");
        textid.setVisible(true);
        textid.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textid.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        tipeLayanan = new JLabel();
        tipeLayanan.setBounds(20,110,120,35);
        tipeLayanan.setBackground(new Color(255,255,255));
        tipeLayanan.setForeground(new Color(0,0,0));
        tipeLayanan.setEnabled(true);
        tipeLayanan.setFont(new Font("timesnewroman",0,12));
        tipeLayanan.setText("Tipe Layanan   :");
        tipeLayanan.setVisible(true);
        
        JComboBox<TipeLayanan> pilihTipeLayanan = new JComboBox<>();
        pilihTipeLayanan.setModel(new DefaultComboBoxModel<>(TipeLayanan.values()));
        pilihTipeLayanan.setBounds(125,110,250,35);
        pilihTipeLayanan.setBackground(new Color(255,255,255));
        pilihTipeLayanan.setForeground(new Color(0,0,0));
        pilihTipeLayanan.setEnabled(true);
        pilihTipeLayanan.setFont(new Font("timesnewroman",0,12));
        pilihTipeLayanan.setVisible(true);
        
        labellokakhir = new JLabel();
        labellokakhir.setBounds(20,194,120,35);
        labellokakhir.setBackground(new Color(255,255,255));
        labellokakhir.setForeground(new Color(0,0,0));
        labellokakhir.setEnabled(true);
        labellokakhir.setFont(new Font("timesnewroman",0,12));
        labellokakhir.setText("Lokasi akhir     :");
        labellokakhir.setVisible(true);

        labellokawal = new JLabel();
        labellokawal.setBounds(20,151,120,35);
        labellokawal.setBackground(new Color(255,255,255));
        labellokawal.setForeground(new Color(0,0,0));
        labellokawal.setEnabled(true);
        labellokawal.setFont(new Font("timesnewroman",0,12));
        labellokawal.setText("Lokasi awal");
        labellokawal.setVisible(true);

        labelnamaakhir = new JLabel();
        labelnamaakhir.setBounds(20,278,120,35);
        labelnamaakhir.setBackground(new Color(255,255,255));
        labelnamaakhir.setForeground(new Color(0,0,0));
        labelnamaakhir.setEnabled(true);
        labelnamaakhir.setFont(new Font("timesnewroman",0,12));
        labelnamaakhir.setText("NP Akhir");
        labelnamaakhir.setVisible(true);

        labelnamaawal = new JLabel();
        labelnamaawal.setBounds(20,236,120,35);
        labelnamaawal.setBackground(new Color(255,255,255));
        labelnamaawal.setForeground(new Color(0,0,0));
        labelnamaawal.setEnabled(true);
        labelnamaawal.setFont(new Font("timesnewroman",0,12));
        labelnamaawal.setText("NP Awal");
        labelnamaawal.setVisible(true);

        korxawal = new JTextField();
        korxawal.setBounds(125,151,50,35);
        korxawal.setBackground(new Color(255,255,255));
        korxawal.setForeground(new Color(0,0,0));
        korxawal.setEnabled(true);
        korxawal.setFont(new Font("timesnewroman",0,12));
        korxawal.setText("x");
        korxawal.setVisible(true);
        korxawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                korxawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        koryawal = new JTextField();
        koryawal.setBounds(180,151,50,35);
        koryawal.setBackground(new Color(255,255,255));
        koryawal.setForeground(new Color(0,0,0));
        koryawal.setEnabled(true);
        koryawal.setFont(new Font("timesnewroman",0,12));
        koryawal.setText("y");
        koryawal.setVisible(true);
        koryawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                koryawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        lokAwal = new JTextField();
        lokAwal.setBounds(235,151,140,35);
        lokAwal.setBackground(new Color(255,255,255));
        lokAwal.setForeground(new Color(0,0,0));
        lokAwal.setEnabled(true);
        lokAwal.setFont(new Font("timesnewroman",0,12));
        lokAwal.setText("Nama Lokasi");
        lokAwal.setVisible(true);
        lokAwal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                lokAwal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        ketlokawal = new JTextField();
        ketlokawal.setBounds(380,151,90,35);
        ketlokawal.setBackground(new Color(255,255,255));
        ketlokawal.setForeground(new Color(0,0,0));
        ketlokawal.setEnabled(true);
        ketlokawal.setFont(new Font("timesnewroman",0,12));
        ketlokawal.setText("Keterangan");
        ketlokawal.setVisible(true);
        ketlokawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                ketlokawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        korxakhir = new JTextField();
        korxakhir.setBounds(125,194,50,35);
        korxakhir.setBackground(new Color(255,255,255));
        korxakhir.setForeground(new Color(0,0,0));
        korxakhir.setEnabled(true);
        korxakhir.setFont(new Font("timesnewroman",0,12));
        korxakhir.setText("x");
        korxakhir.setVisible(true);
        korxakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                korxakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        koryakhir = new JTextField();
        koryakhir.setBounds(180,194,50,35);
        koryakhir.setBackground(new Color(255,255,255));
        koryakhir.setForeground(new Color(0,0,0));
        koryakhir.setEnabled(true);
        koryakhir.setFont(new Font("timesnewroman",0,12));
        koryakhir.setText("y");
        koryakhir.setVisible(true);
        koryakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                koryakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        lokAkhir = new JTextField();
        lokAkhir.setBounds(235,194,140,35);
        lokAkhir.setBackground(new Color(255,255,255));
        lokAkhir.setForeground(new Color(0,0,0));
        lokAkhir.setEnabled(true);
        lokAkhir.setFont(new Font("timesnewroman",0,12));
        lokAkhir.setText("Nama Lokasi");
        lokAkhir.setVisible(true);
        lokAkhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                lokAkhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        ketlokakhir = new JTextField();
        ketlokakhir.setBounds(380,194,90,35);
        ketlokakhir.setBackground(new Color(255,255,255));
        ketlokakhir.setForeground(new Color(0,0,0));
        ketlokakhir.setEnabled(true);
        ketlokakhir.setFont(new Font("timesnewroman",0,12));
        ketlokakhir.setText("Keterangan");
        ketlokakhir.setVisible(true);
        ketlokakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                ketlokakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        
        textnamaawal = new JTextField();
        textnamaawal.setBounds(125, 236, 250, 35);
        textnamaawal.setBackground(new Color(255,255,255));
        textnamaawal.setForeground(new Color(0,0,0));
        textnamaawal.setEnabled(true);
        textnamaawal.setFont(new Font("timesnewroman",0,12));
        textnamaawal.setText("Nama Pengguna Awal");
        textnamaawal.setVisible(true);
        textnamaawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textnamaawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        textnamaakhir = new JTextField();
        textnamaakhir.setBounds(125, 278, 250, 35);
        textnamaakhir.setBackground(new Color(255,255,255));
        textnamaakhir.setForeground(new Color(0,0,0));
        textnamaakhir.setEnabled(true);
        textnamaakhir.setFont(new Font("timesnewroman",0,12));
        textnamaakhir.setText("Nama Pengguna Akhir");
        textnamaakhir.setVisible(true);
        textnamaakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textnamaakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        textbiaya = new JTextField();
        textbiaya.setBounds(125, 320, 250, 35);
        textbiaya.setBackground(new Color(255,255,255));
        textbiaya.setForeground(new Color(0,0,0));
        textbiaya.setEnabled(true);
        textbiaya.setFont(new Font("timesnewroman",0,12));
        textbiaya.setText("Biaya");
        textbiaya.setVisible(true);
        textbiaya.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textbiaya.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });
        
        pesan = new JButton();
        pesan.setBounds(380,362,90,35);
        pesan.setBackground(new Color(153,255,153));
        pesan.setForeground(new Color(0,0,0));
        pesan.setEnabled(true);
        pesan.setFont(new Font("timesnewroman",0,13));
        pesan.setText("Pesan");
        pesan.setVisible(true);
        pesan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                try
                {
                    int y = Integer.parseInt(koryawal.getText());
                    DatabasePesanan.addPesanan(new Pesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(textid.getText())), (TipeLayanan)pilihTipeLayanan.getSelectedItem(), new Lokasi(lokAwal.getText(), Integer.parseInt(korxawal.getText()), y, ketlokawal.getText()), new Lokasi(lokAkhir.getText(), Integer.parseInt(korxakhir.getText()), Integer.parseInt(koryakhir.getText()), ketlokakhir.getText()), textnamaawal.getText(), textnamaakhir.getText(), Integer.parseInt(textbiaya.getText())));
                    Administrasi.printPesananDatabase();
                    
                }
                catch(PesananSudahAdaException sudah_ada)
                {
                    System.out.println(sudah_ada.getMessage());
                }
            }
        });
        
        copyright = new JLabel();
        copyright.setBounds(158,360,200,35);
        copyright.setBackground(new Color(214,217,223));
        copyright.setEnabled(true);
        copyright.setFont(new Font("timesnewroman",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);
      

        contentPane.add(biaya);
        contentPane.add(enter);
        contentPane.add(id);
        contentPane.add(textid);
        contentPane.add(labelpesanan);
        contentPane.add(labellokakhir);
        contentPane.add(labellokawal);
        contentPane.add(labelnamaakhir);
        contentPane.add(labelnamaawal);
        contentPane.add(pilihTipeLayanan);
        contentPane.add(korxawal);
        contentPane.add(koryawal);
        contentPane.add(lokAwal);
        contentPane.add(ketlokawal);
        contentPane.add(korxakhir);
        contentPane.add(koryakhir);
        contentPane.add(lokAkhir);
        contentPane.add(ketlokakhir);
        contentPane.add(textnamaawal);
        contentPane.add(textnamaakhir);
        contentPane.add(textbiaya);        
        contentPane.add(tipeLayanan);
        contentPane.add(pesan);
        contentPane.add(copyright);
        contentPane.add(kembali);
       
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
                new PesananGUI();
            }
        });
    }

}