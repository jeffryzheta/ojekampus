/**
*Text genereted by Simple GUI Extension for BlueJ
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
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.util.Date;
import java.text.DateFormat;

public class TungguGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JTextField textfield1;
    private JTextField textfield2;
    private boolean diproses = false;
    private boolean ada = false;
    private Pelanggan nPelanggan;
    private JLabel copyright;
    private JLabel jam;
    private JButton kembali;

    //Constructor 
    public TungguGUI(){

        this.setTitle("GUI_project");
        this.setSize(500,400);
        
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
                 new PesananGUI();
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
        contentPane.setBackground(new Color(204,204,255));


        button1 = new JButton();
        button1.setBounds(300,80,90,40);
        button1.setBackground(new Color(153,255,153));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("timesnewroman",0,12));
        button1.setText("Enter");
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String inID = textfield1.getText();
                int id = Integer.parseInt(inID);
                nPelanggan = DatabaseUser.getUserPelanggan(id);
                if(nPelanggan != null){
                    JOptionPane myIO = new JOptionPane();
                    myIO.showMessageDialog(null, "Pelanggan Ditemukan");
                    if(DatabasePesanan.getPesanan(nPelanggan).getStatusDiproses() == true){
                        if(DatabasePesanan.getPesanan(nPelanggan).getStatusSelesai() == true){
                            textfield2.setText("Pesanan Selesai");
                            ada = true;
                        }
                        else{
                            textfield2.setText("Pesanan Diproses");
                            diproses = true;
                        }
                    }
                    else{
                        textfield2.setText("Pesanan Belum proses");
                    }
                }
            }
        });
        button1.setVisible(true);

        button2 = new JButton();
        button2.setBounds(135,255,90,40);
        button2.setBackground(new Color(153,255,153));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("timesnewroman",0,12));
        button2.setText("Accept");
        button2.setVisible(true);
         button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(diproses == true){
                    Administrasi.pesananDibatalkan(nPelanggan);
                }
            }
        });
        
        button3 = new JButton();
        button3.setBounds(260,255,90,40);
        button3.setBackground(new Color(153,255,153));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("timesnewroman",0,12));
        button3.setText("Decline");
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(diproses == true){
                    Administrasi.pesananDibatalkan(nPelanggan);
                }
            }
        });
        button3.setVisible(true);

        button4 = new JButton();
        button4.setBounds(200,315,90,40);
        button4.setBackground(new Color(153,255,153));
        button4.setForeground(new Color(0,0,0));
        button4.setEnabled(true);
        button4.setFont(new Font("timesnewroman",0,12));
        button4.setText("Delete");
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ada == true){
                    try{
                        DatabasePesanan.hapusPesanan(nPelanggan);
                    }catch(PesananOlehPelangganDitemukanException a){
                        a.getMessage();
                    }
                }
            }
        });
        button4.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(150,10,200,40);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("timesnewroman",0,20));
        label1.setText("Customer Menunggu");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(20,75,90,40);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("timesnewroman",0,14));
        label2.setText("ID");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(80,80,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("timesnewroman",0,12));
        label3.setText(":");
        label3.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(170,160,150,40);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("timesnewroman",0,14));
        label5.setText("Informasi Pesanan");
        label5.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(100,80,180,40);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("timesnewroman",0,12));
        textfield1.setText("No ID");
        textfield1.setVisible(true);
        textfield1.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield1.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        textfield2 = new JTextField();
        textfield2.setBounds(165,200,150,40);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("timesnewroman",0,12));
        textfield2.setText("Status");
        textfield2.setVisible(true);
        textfield2.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield2.setText("");
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
        copyright.setFont(new Font("Raleway",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);
        

        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label5);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(copyright);
        contentPane.add(kembali);
        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

}