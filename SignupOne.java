
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author Achyutha Rao
 */
public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField; 
    JButton next;
    JRadioButton male,female,transegender,married,single,others;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        Random ran =new Random();
        random = Math.abs(ran.nextLong() % 9000L) + 1000L;
        
        JLabel formno = new JLabel("APPLICATION FORM No."+ random);
        formno.setFont(new Font("Times new roman",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
        JLabel personalDetails = new JLabel("PAGE-1:PERSONAL DEATILS");
        personalDetails.setFont(new Font("Times new roman",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("NAME:");
        name.setFont(new Font("Times new roman",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel("FATHER'S NAME:");
        fname.setFont(new Font("Times new roman",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
       
        
        JLabel dob = new JLabel("DATE OF BIRTH:");
        dob.setFont(new Font("Times new roman",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("GENDER:");
        gender.setFont(new Font("Times new roman",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("MALE");
        male.setBounds(300,290,110,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("FEMALE");
        female.setBounds(420,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        transegender=new JRadioButton("TRANSEGENDER");
        transegender.setBounds(530,290,150,30);
        transegender.setBackground(Color.WHITE);
        add(transegender);
        
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(transegender);
        
        
        JLabel email = new JLabel("EMAIL ADDRESS:");
        email.setFont(new Font("Times new roman",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("MARITAL STATUS:");
        marital.setFont(new Font("Times new roman",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married=new JRadioButton("MARRIED");
        married.setBounds(300,390,110,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        single=new JRadioButton("SINGLE");
        single.setBounds(420,390,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        
        others=new JRadioButton("OTHERS");
        others.setBounds(530,390,150,30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(single);
        maritalgroup.add(others);
        
        
        
        JLabel address = new JLabel("ADDRESS:");
        address.setFont(new Font("Times new roman",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("CITY:");
        city.setFont(new Font("Times new roman",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("STATE:");
        state.setFont(new Font("Times new roman",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("PIN CODE:");
        pincode.setFont(new Font("Times new roman",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        
        
        next= new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Times new roman",Font.BOLD,14));
        next.setBounds(400,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno = "" +random;
        String name = nameTextField.getText();
        String fname =fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender = "Female";
        }else if(transegender.isSelected()){
            gender = "Transegender";
        }
        
        String email = emailTextField.getText();
        String marital =null;
        if(single.isSelected()){
            marital="Single";
        }else if(married.isSelected()){
            marital="Married";
        }else if(others.isSelected()){
            marital="Others";
        }
        String address =addressTextField.getText();
        String city =cityTextField.getText();
        String state=stateTextField.getText();
        String pin =pincodeTextField.getText();
        
    
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                Conn c=new Conn();
                String query = "insert into signup value('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
        try{
            if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
        try{
            if(dob.equals("")){
                JOptionPane.showMessageDialog(null, " Date Of Birth Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
          try{
            if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
          
          try{
            if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
                
          try{
            if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
          
          try{
            if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
          
          try{
            if(pin.equals("")){
                JOptionPane.showMessageDialog(null, " Pincode Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
          
              try{
            if(gender.equals("")){
                JOptionPane.showMessageDialog(null, " Gender Field is Required");
            }
        } catch (Exception e){
            System.out.println(e);
        }
              
              
               
                
              
    }
    public static void main(String args[]){
        new SignupOne();
    }
}
