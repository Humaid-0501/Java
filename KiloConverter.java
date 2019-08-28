/**
 *
 * @author Humaid Desai
 */
import javax.swing.*;
import java.awt.event.*;

public class KiloConverter1 extends JFrame{
    
    private JPanel panel;
    private JLabel label;
    private JTextField textfield;
    private JButton bt;

    public KiloConverter1(){
        setTitle("Kilo to miles conveter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        bt.addActionListener(new MyListener());
        
        setVisible(true);
        
        
        
        
}
    private void buildPanel(){
        
        label = new JLabel("Enter distance in kilometers");
        textfield = new JTextField(10);
        bt = new JButton("Calculate");
        
        panel = new JPanel();
        
        panel.add(label);
        panel.add(textfield);
        panel.add(bt);
        
        
    }
    
    private class MyListener implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            String cal = textfield.getText();
            
            double res = Double.parseDouble(cal);
            res=res*0.621;
            
            JOptionPane.showMessageDialog(null,"The distance in miles is: "+res);
            
            
        
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new KiloConverter1();
    }
    
}
