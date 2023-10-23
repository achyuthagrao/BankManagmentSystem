
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel l1=new JLabel("PAGE-3 ACCOUNT DETAILS");
        l1.setFont(new Font("Times new roman",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
     
        
        JLabel type=new JLabel("ACCOUNT TYPE:");
        type.setFont(new Font("Times new roman",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("SAVING ACCOUNT");
        r1.setFont(new Font("Times new roman",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,200,20);
        add(r1);
        
        
        r2=new JRadioButton("FD ACCOUNT");
        r2.setFont(new Font("Times new roman",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,200,20);
        add(r2);
        
        r3=new JRadioButton("CURRENT ACCOUNT");
        r3.setFont(new Font("Times new roman",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3);
        
        r4=new JRadioButton("RECURRING ACCOUNT");
        r4.setFont(new Font("Times new roman",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        
        ButtonGroup groupaccount =new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        
        JLabel card=new JLabel("CARD NUMBER:");
        card.setFont(new Font("Times new roman",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4175");
        number.setFont(new Font("Times new roman",Font.BOLD,22));
        number.setBounds(300,300,300,30);
        add(number);
        
        
        JLabel carddetail=new JLabel("YOUR 16-DIGIT CARD NUMBER");
        carddetail.setFont(new Font("Times new roman",Font.BOLD,10));
        carddetail.setBounds(100,330,400,30);
        add(carddetail);
        
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Times new roman",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        
        
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Times new roman",Font.BOLD,22));
        pnumber.setBounds(300,370,300,30);
        add(pnumber);
        
        
        JLabel pinno=new JLabel("THIS IS YOUR 4-DIGIT PIN NUMBER");
        pinno.setFont(new Font("Times new roman",Font.BOLD,10));
        pinno.setBounds(100,400,500,30);
        add(pinno);
        
        
        JLabel service=new JLabel("SERVICES REQUIRED:");
        service.setFont(new Font("Times new roman",Font.BOLD,22));
        service.setBounds(100,450,250,30);
        add(service);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Times new roman",Font.BOLD,18));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Times new roman",Font.BOLD,18));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Times new roman",Font.BOLD,18));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL | SMS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Times new roman",Font.BOLD,18));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Times new roman",Font.BOLD,18));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Times new roman",Font.BOLD,18));
        c6.setBounds(100,550,200,30);
        add(c6);
        
        c7=new JCheckBox("The hearby declares that the aboue entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Times new roman",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Times new roman",Font.BOLD,14));
        submit.setBounds(600,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel = new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Times new roman",Font.BOLD,14));
        cancel.setBounds(100,720,100,30);
        cancel.addActionListener(this);
        add( cancel);
        
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
        getContentPane().setBackground(Color.lightGray);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="SAVING ACCOUNT";
            } else if(r2.isSelected()){
                accountType="FIXED ACCOUNT"; 
            }else if(r3.isSelected()){
                accountType="CURRENT ACCOUNT";
            }else if(r4.isSelected()){
                accountType="RECCURING DEPOSITE ACCOUNT";
                
            }
            
            Random random=new Random();
            String cardnumber ="" + Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
            String pinnumber =""+ Math.abs((random.nextLong() % 9000L) +1000L);
            
            String facility ="";
            if(c1.isSelected()){
                facility =facility + "ATM CARD";
                
            }else if(c2.isSelected()){
                facility =facility + "INTERNET BANKING";
                
            }else if(c3.isSelected()){
                facility =facility +"MOBILE BANKING";
            }else if(c4.isSelected()){
                facility= facility + "EMAIL | SMS";
                
            }else if(c5.isSelected()){
                facility=facility + "CHEQUE BOOK";
                
            }else if(c6.isSelected()){
                facility=facility+" E-STATEMENT";
            }
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else {
                    Conn conn = new Conn();
                    String query1="insert into signupthree value('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2="insert into login value('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card number:" + cardnumber +"\n Pin:"+ pinnumber);
                    
                    setVisible(false);
                    
                    new Deposit(pinnumber).setVisible(false);
                }
            } catch(Exception e){
                System.out.println(e);
            }
        }else if (ae.getSource()== cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
    
}
