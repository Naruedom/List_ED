 
package list_ed;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

 
public class Connect {
    
    
     Connection con;
    
    
    public Connect(){
      
        try{
           
           String host = "jdbc:mysql://localhost/operationslist_ed_packaging?useUnicode=true&characterEncoding=UTF-8";
           
           
           con = DriverManager.getConnection(host,"root","564259131"); 

       }catch(SQLException e){System.err.println(e);}
    }
}
