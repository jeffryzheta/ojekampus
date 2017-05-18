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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.regex.*;

public class EmailValidator
{
  private static JTextField field = new JTextField(10);
  private static JLabel errorMsg = new JLabel("Invalid input");
  private static String pattern = "\\d+\\.\\d{4}";
  private static JFrame frame = new JFrame();
  private static JPanel panel = new JPanel();


  public static void main(String[] args)
  {
    errorMsg.setForeground(Color.RED);
    panel.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(5, 0, 0, 5);
    c.gridx = 1;
    c.gridy = 0;
    c.anchor = GridBagConstraints.SOUTH;
    panel.add(errorMsg, c);

    c.gridx = 1;
    c.gridy = 1;
    c.anchor = GridBagConstraints.CENTER;
    panel.add(field, c);

    frame.getContentPane().add(panel);
    field.getDocument().addDocumentListener(new DocumentListener()
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

    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  private static void validateEmail()
  {
    String text = field.getText();
    Pattern r = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    Matcher m = r.matcher(text);
    if (m.matches())
    {
      errorMsg.setForeground(frame.getBackground());
    }
    else
    {
      errorMsg.setForeground(Color.RED);
    }
  }
}
