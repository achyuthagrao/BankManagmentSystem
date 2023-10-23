
package bank.management.system;

/**
 *
 * @author Achyutha Rao
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;



public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,withdraw,fastcash,ministatement,pinchange,balance,exit;
    String pinnumber;
    
    FastCash(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text =new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(280,310,700,35);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Times new roman",Font.BOLD,16));
        image.add (text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(215,406,150,23);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        withdraw = new JButton("Rs 500");
        withdraw.setBounds(395,406,150,23);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(215,433,150,23);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Rs 2000");
        ministatement.setBounds(395,433,150,23);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        
        pinchange = new JButton("Rs 5000");
        pinchange .setBounds(215,460,150,23);
        pinchange.addActionListener(this);
        image.add(pinchange );
        
        
        balance = new JButton("Rs 10000");
        balance .setBounds(395,460,150,23);
        balance.addActionListener(this);
        image.add(balance );
        
        
        exit = new JButton("BACK");
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
            setVisible(false);
            new Transcation(pinnumber).setVisible(true);
            
        }else{
            String amount =((JButton) ae.getSource()).getText().substring(3);
            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficent Balance");
                    return;
                }
                
                Date date = new Date();
                String query ="insert into bank values('"+pinnumber+"', '"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs"+amount+"Debited Successfully");
                
                setVisible(false);
                new Transcation(pinnumber).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String args[]){
        new FastCash("");
        
    
    }
        
 }
    

