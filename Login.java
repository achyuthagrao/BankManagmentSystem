/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


/**
 *
 * @author Achyutha Rao
 */
public class Login extends JFrame implements ActionListener {
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text =new JLabel("Welcome to ATM");
        text.setFont(new Font("Times New Roman",Font.BOLD,40));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno =new JLabel("Card Number");
        cardno.setFont(new Font("Times New Roman",Font.BOLD,20));
        cardno.setBounds(150,150,400,40);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
        
        JLabel pin =new JLabel("User Pin");
        pin.setFont(new Font("Times New Roman",Font.BOLD,20));
        pin.setBounds(150,200,400,40);
        add(pin);
        
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,200,250,30);
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        
        clear = new JButton("CLEAR");
        clear.setBounds(300,400,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        
        signup = new JButton("SIGNUP");
        signup.setBounds(300,350,100,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
       
        
        getContentPane().setBackground(Color.lightGray);
        setSize(800,480);
        setVisible(true); /* A new window will be visible when this Visible code is written*/
        setLocation(350,200);/* window opening location*/
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() ==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if (ae.getSource()==login){
            Conn conn =new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber =pinTextField.getText();
            String query ="select * from  login where cardnumber = '"+cardnumber+"' and pin='"+pinnumber+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transcation(pinnumber).setVisible((true));
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }catch (Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[]args){
        new Login();
    }
    
}
