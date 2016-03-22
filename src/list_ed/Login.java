
package list_ed;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static list_ed.cnn.cn;

public class Login { 
     
    String id   = "1";
    String user = "user1"; 
    String name = "ผู้ใช้"; 
    Boolean check = false;
      
    public   Login(String user ,  String pass)  {
         
      try {   
        ResultSet  rs = cn().executeQuery("SELECT * FROM user where u_user = '"+user+"' and u_pass = '"+pass+"'" );
             if (rs.next()) 
               {
                this.user= user;
                name = rs.getString("u_name");  
                id   = rs.getString("u_id");  
                 check = true;
               }   
             else 
                 check = false;
        } catch (SQLException ex) {  check = false; }
       
    }

    public Boolean getCheck() {
        return check;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }
      
    //วิธีใช้
    public static void main(String[] args) {
        
        Login login1 = new Login("user_a", "1234");
        if(!login1.getCheck()){ System.err.println("เข้าสู่ระบบไม่ได้"); return;} //เช็คlogin fale กรณี user pass ไม่ตรง หรือ db เชื่อมต่อไม่ได้
        
        System.out.println( "เข้าสู่ระบบสำเร็จ สวัสดี -->" + login1.getName() );
    }
   
}


