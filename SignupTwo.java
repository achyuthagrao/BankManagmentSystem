
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Achyutha Rao
 */
    public class SignupTwo extends JFrame implements ActionListener {
    JComboBox relegion,catagory,incom,educetion,occ;
    JTextField  pannTextField,AaadharTextField ; 
    JButton next;
    JRadioButton syes,sno,eno,eyes;
    String formno;
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE-2 ");
        JLabel additionalDetails = new JLabel("PAGE-1:ADDITIONAL DEATILS");
        additionalDetails.setFont(new Font("Times new roman",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("RELIGION:");
        religion.setFont(new Font("Times new roman",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[] = {"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
        relegion = new JComboBox(valReligion);
        relegion.setBounds(300, 140, 400, 30);
        relegion.setBackground(Color.WHITE);
        add(relegion);
        
        
        JLabel category = new JLabel("CATEGORY:");
        category.setFont(new Font("Times new roman",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valcategory[] = {"GENERAL","OBC","SC","ST","OTHER"};
        catagory =new JComboBox(valcategory);
        catagory.setBounds(300,190,400,30);
        catagory.setBackground(Color.WHITE);
        add(catagory);
       
        
        JLabel income = new JLabel("INCOME:");
        income.setFont(new Font("Times new roman",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        
        String incomecategory[] = {"NULL","< 1,50,000","<2,50,000","<5,00,000","UPTO 10,00,000"};
        incom =new JComboBox(incomecategory);
        incom.setBounds(300,240,400,30);
        incom.setBackground(Color.WHITE);
        add(incom);
        
        
        JLabel education = new JLabel("EDUCATIONAL");
        education.setFont(new Font("Times new roman",Font.BOLD,20));
        education.setBounds(100,290,200,30);
        add(education);
     
        
        JLabel qulification = new JLabel("QUALIFICATION:");
        qulification.setFont(new Font("Times new roman",Font.BOLD,20));
        qulification.setBounds(100,315,200,30);
        add(qulification);
        
        
        String educationvalues[] = {"NON GRADUATION","GRADUATE","POST GRADUATION","DOCTRATE","OTHERS"};
        educetion =new JComboBox(educationvalues);
        educetion.setBounds(300,315,400,30);
        educetion.setBackground(Color.WHITE);
        add(educetion);
        
        
        
        JLabel occupation = new JLabel("OCCUPATION:");
        occupation.setFont(new Font("Times new roman",Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        
        
        String occupationvalues[] = {"SALARIED","SELF EMPLOYED","BUSSINESS","STUDENT","RETIRED","OTHERS"};
        occ =new JComboBox(occupationvalues);
        occ.setBounds(300,390,400,30);
        occ.setBackground(Color.WHITE);
        add(occ);
        
        
        
        JLabel panno = new JLabel("PAN-NUMBER:");
        panno.setFont(new Font("Times new roman",Font.BOLD,20));
        panno.setBounds(100,440,200,30);
        add(panno);
        
        pannTextField = new JTextField();
        pannTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        pannTextField.setBounds(300,440,400,30);
        add(pannTextField);
        
        JLabel aadharno = new JLabel("AADHAR NUMBER:");
        aadharno.setFont(new Font("Times new roman",Font.BOLD,20));
        aadharno.setBounds(100,490,200,30);
        add(aadharno);
        
        AaadharTextField = new JTextField();
        AaadharTextField.setFont(new Font("Times new roman",Font.BOLD,14));
        AaadharTextField.setBounds(300,490,400,30);
        add(AaadharTextField);
        
        JLabel senior = new JLabel("S CITIZEN:");
        senior.setFont(new Font("Times new roman",Font.BOLD,20));
        senior.setBounds(100,540,200,30);
        add(senior);
        
        syes=new JRadioButton("YES");
        syes.setBounds(300,540,110,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("NO");
        sno.setBounds(420,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
     
        
        
        JLabel exisitingacc = new JLabel("EXI ACCOUNT:");
        exisitingacc.setFont(new Font("Times new roman",Font.BOLD,20));
        exisitingacc.setBounds(100,590,200,30);
        add(exisitingacc);
       
        eyes=new JRadioButton("YES");
        eyes.setBounds(300,590,110,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("NO");
        eno.setBounds(420,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup exisitinggroup = new ButtonGroup();
        exisitinggroup.add(syes);
        exisitinggroup.add(sno);
        
        
        
        
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
        String sreligion = (String)relegion.getSelectedItem();
        String scategory = (String)catagory.getSelectedItem();
        String sincome=(String)incom.getSelectedItem();
        String seducation=(String)educetion.getSelectedItem();
        String soccuption=(String)occ.getSelectedItem();        ;
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen="YES";
        }else if(sno.isSelected()){
            seniorcitizen = "NO";
        }
       
        String existingaccount =null;
        if(eyes.isSelected()){
            existingaccount="YES";
        }else if(eno.isSelected()){
            existingaccount="NO";
        }
        String spann =pannTextField.getText();
        String sadhar =AaadharTextField.getText();
        
        
    
        try{
                Conn c=new Conn();
                String query = "insert into signuptwo value('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccuption+"','"+seniorcitizen+"','"+existingaccount+"','"+spann+"','"+sadhar+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String args[]){
        new SignupTwo("");
    }
}

