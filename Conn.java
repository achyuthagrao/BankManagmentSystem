
package bank.management.system;

/**
 *
 * @author Achyutha Rao
 */
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {
        
            c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Ac171201!");
            s= c.createStatement();
            
        }catch (Exception e){
                    System.out.println(e);
                    
                    }
        }
    }

