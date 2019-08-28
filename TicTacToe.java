/**
 *
 * @author Humaid Desai
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    JButton bt1 = new JButton();
    JButton bt2 = new JButton();
    JButton bt3 = new JButton();
    JButton bt4 = new JButton();
    JButton bt5 = new JButton();
    JButton bt6 = new JButton();
    JButton bt7 = new JButton();
    JButton bt8 = new JButton();
    JButton bt9 = new JButton();
    int turn=0;

    public TicTacToe(){
        setSize(500,400);
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        
        bt1.addActionListener(new ButtonListener());
        bt2.addActionListener(new ButtonListener());
        bt3.addActionListener(new ButtonListener());
        bt4.addActionListener(new ButtonListener());
        bt5.addActionListener(new ButtonListener());
        bt6.addActionListener(new ButtonListener());
        bt7.addActionListener(new ButtonListener());
        bt8.addActionListener(new ButtonListener());
        bt9.addActionListener(new ButtonListener());
        
        
        setVisible(true);
    }
    
    private class ButtonListener implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            
            JButton b = (JButton)e.getSource();
            
            
            if(turn%2==0)
            {
                if(b.getText().equals(""))
                {
                    b.setText("X");
                    turn++;
                }
               
            }
            else
            {
                if(b.getText().equals(""))
                {
                    b.setText("O");
                    turn++;
                }
               
            }
            
            if(CheckForWin()==true)
            {
                if(b.getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null,"Player 1 wins!");
                }
                else
                    JOptionPane.showMessageDialog(null,"Player 2 wins!");
                
                
            }
        }
        
        public boolean CheckForWin()
        {
            if(CheckAdjacent(bt1,bt2) && CheckAdjacent(bt2,bt3))
                return true;
            else if(CheckAdjacent(bt4,bt5) && CheckAdjacent(bt5,bt6))
                return true;
            else if(CheckAdjacent(bt7,bt8) && CheckAdjacent(bt8,bt9))
                return true;
            
            
            else if(CheckAdjacent(bt1,bt4) && CheckAdjacent(bt4,bt7))
                return true;
            else if(CheckAdjacent(bt2,bt5) && CheckAdjacent(bt5,bt8))
                return true;
            else if(CheckAdjacent(bt3,bt6) && CheckAdjacent(bt6,bt9))
                return true;
            
            
            else if(CheckAdjacent(bt1,bt5) && CheckAdjacent(bt5,bt9))
                return true;
            else if(CheckAdjacent(bt3,bt5) && CheckAdjacent(bt5,bt7))
                return true;
            else
                return false;
        }
        
        public boolean CheckAdjacent(JButton a, JButton b)
        {
            if(a.getText().equals(b.getText()) && !a.getText().equals(""))
                return true;
            else
                return false;
            
        }
        
    }
    
    public static void main(String[] args) {
        new TicTacToe();
        // TODO code application logic here
    }
   
    
}
