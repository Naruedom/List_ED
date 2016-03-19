package list_ed; 
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;    
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cnn  { 
     
     static String host = "jdbc:mysql://localhost/durable_articles?useUnicode=true&characterEncoding=UTF-8";  
     public static Statement  cn() throws SQLException {  
            Connection cnn = DriverManager.getConnection(host,"root",""); 
            Statement stmt = cnn.createStatement();  return stmt; }  
       
     public static  boolean Sql(String x) {
        try {  cn().executeUpdate(x); return true; } catch (Exception ex) { return false;} }    
       
     public static  ResultSet Select(String x) throws SQLException { return cn().executeQuery(x); }
     ///////////////////////////////////////////////////////////////////////////////////////////////
     
     
     // dAp FUNCTION
     //ถ้า Table , col มี value นี้ จะ return true;
     public static boolean DBhave(String Table,String col,String value){
          //System.out.println("SELECT * FROM "+Table+"whare"+col+"="+value); 
          try {  
            ResultSet rs = cn().executeQuery("SELECT * FROM "+Table+" where "+col+" = "+value);  
            if(rs.next()) return true;  else  return false;
        } catch (Exception ex) { System.err.println("DBerror conect.");  return false;}        
        
     }
     
       //ถ้า select เจอจะ return true;
       public static boolean DBhave(String select){  
          try {  
            ResultSet rs = cn().executeQuery(select); 
            if(rs.next()) return true;  else  return false;
        } catch (Exception ex) { System.err.println("DBerror conect.");  return false;}        
        
     }
          //แสดงจำนวนแถว
          public static int DBnum(String select){  //"SELECT COUNT(*) FROM durable;"
          try {  
            ResultSet rs = cn().executeQuery(select); 
            if(rs.next()) return rs.getInt("COUNT(*)"); 
            else return 0;
        } catch (Exception ex) { System.err.println("DBerror conect.");  return 0;}     
          } 
          
          public static int DBnum(String table,String col,String value){  // ตาราง,คอลัม,ค่าที่กำหนด
          try {  
            ResultSet rs = cn().executeQuery("SELECT COUNT(*) FROM "+table+" where "+col+" = "+value); 
            if(rs.next()) return rs.getInt("COUNT(*)"); 
            else return 0;
        } catch (Exception ex) { System.err.println("DBerror conect.");  return 0;}     
          }
            
        //--------------------------//-----------------//--------//----//--//
          public static void main(String[] a) throws SQLException{ 
             
              String str = "";
        //str = "num : "+DBnum("durable", "da_r_number", "401");
        //str = "num : "+DBnum("SELECT COUNT(*) FROM durable");
        //str = DBhave("lend","l_id","14");
        System.out.println(str);
         
        }     
}
 
 //  Sql3("UPDATE `staff` SET `Sf_name` = '1', `Sf_address` = '1', `Sf_status` = '5', `sf_pass` = '1' WHERE  `Sf_id` = '1';");
       /*try {  
            ResultSet rs = root().executeQuery("SELECT * FROM durable");  
            while (rs.next()) {
                String name = rs.getString("da_name"); 
                System.out.println(name+"-" ); 
             } 
        } catch (Exception ex) { System.err.println("error conect."); }    
        */


