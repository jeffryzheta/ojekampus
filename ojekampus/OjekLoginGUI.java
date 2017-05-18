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


public class OjekLoginGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel label1;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textfield3;
    private JTextField textfield4;
    private Ojek nOjek;
    private JLabel copyright;
    private boolean diproses = false;
    private boolean ada = false;
    private static JFrame pesanframe = new JFrame();
    private JLabel jam;
    private JButton kembali;
    //Constructor 
    public OjekLoginGUI(){

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
                 new OjekGUI();
            }
        });
        
        
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
        
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(204,204,255));


        button7 = new JButton();
        button7.setBounds(330,90,110,40);
        button7.setBackground(new Color(153,255,153));
        button7.setForeground(new Color(0,0,0));
        button7.setEnabled(true);
        button7.setFont(new Font("SansSerif",0,14));
        button7.setText("Enter");
        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String inID = textfield3.getText();
                int id = Integer.parseInt(inID);
                nOjek = DatabaseUser.getUserOjek(id);
                if(nOjek != null){
                    JOptionPane myIO = new JOptionPane();
                    myIO.showMessageDialog(null, "Ojek Ditemukan");
                }
            }
        });
        button7.setVisible(true);

        button8 = new JButton();
        button8.setBounds(160,280,100,40);
        button8.setBackground(new Color(153,255,153));
        button8.setForeground(new Color(0,0,0));
        button8.setEnabled(true);
        button8.setFont(new Font("SansSerif",0,14));
        button8.setText("Accept");
        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(diproses == false ){ 
                String inID = textfield3.getText();
                int id = Integer.parseInt(inID);
                nOjek = DatabaseUser.getUserOjek(id);
                Pelanggan nCustomer = Pesanan.getPelanggan();
                Pesanan pesan = DatabasePesanan.getPesanan(nCustomer);
                Administrasi.ojekAmbilPesanan(pesan , nOjek);
                if ( Ojek.getStatus() != StatusOjek.Idle) {
                    textfield4.setText("Menjemput");
                }
            }
            }
        });
        button8.setVisible(true);

        button9 = new JButton();
        button9.setBounds(290,280,100,40);
        button9.setBackground(new Color(153,255,153));
        button9.setForeground(new Color(0,0,0));
        button9.setEnabled(true);
        button9.setFont(new Font("sansserif",0,12));
        button9.setText("Decline");
        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Administrasi.ojekLepasPesanan(nOjek);
            }
        });
        button9.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(200,30,200,40);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,22));
        label1.setText("Ojek Log-In");
        label1.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(20,90,90,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,14));
        label6.setText("ID");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(75,90,90,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText(":");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(200,180,150,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("SansSerif",0,16));
        label8.setText("Informasi Pesanan");
        label8.setVisible(true);

        textfield3 = new JTextField();
        textfield3.setBounds(90,90,200,40);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("sansserif",0,12));
        textfield3.setText("No ID");
        textfield3.setVisible(true);
        textfield3.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield3.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        textfield4 = new JTextField();
        textfield4.setBounds(190,220,150,40);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("sansserif",0,12));
        textfield4.setText("Status");
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
        
        copyright = new JLabel();
        copyright.setBounds(158,360,200,35);
        copyright.setBackground(new Color(214,217,223));
        copyright.setEnabled(true);
        copyright.setFont(new Font("timesnewroman",0,12));
        copyright.setText("Copyright @2017 - Jeffry K Zheta");
        copyright.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(button7);
        contentPane.add(button8);
        contentPane.add(button9);
        contentPane.add(label1);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(label8);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
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