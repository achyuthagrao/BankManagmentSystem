
package bank.management.system;

/**
 *
 * @author Achyutha Rao
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transcation extends JFrame implements ActionListener{
    
    JButton deposit,withdraw,fastcash,ministatement,pinchange,balance,exit;
    String pinnumber;
    
    Transcation(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text =new JLabel("please select your Trnascation");
        text.setBounds(280,310,700,35);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Times new roman",Font.BOLD,16));
        image.add (text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(215,406,150,23);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        withdraw = new JButton("Withdrawl");
        withdraw.setBounds(395,406,150,23);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(215,433,150,23);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(395,433,150,23);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        
        pinchange = new JButton("PIN Change");
        pinchange .setBounds(215,460,150,23);
        pinchange.addActionListener(this);
        image.add(pinchange );
        
        
        balance = new JButton("Balance Enq");
        balance .setBounds(395,460,150,23);
        balance.addActionListener(this);
        image.add(balance );
        
        
        exit = new JButton("Exit");
        exit.setBounds(215,486,150,23);
        exit.addActionListener(this);
        image.add(exit );
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            System.exit(0);
            
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()== withdraw){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balance){
            setVisible(false);
            new Balanceenquire(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Transcation("");
        
    
    }
        
 }
    

