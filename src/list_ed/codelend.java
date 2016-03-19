 
package list_ed; 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static list_ed.cnn.DBhave;
import static list_ed.cnn.Sql;

public class codelend {
    
    //เมื่อยืม เช็คว่ามีรหัสนี้ไหม ถ้ามีเพิ่มข้อมูลเบิก และ อัพเดทสถานะอุปกรถูกยืม
    //รหัสครุภัณฑ์  ,  ชื่อผู้เบิก , แผนกที่อยู่ , เลขห้อง , รายละเอียด
    static String lend(String durable_id , String name_lend , String dap_id , String room_id,String about){ 
        if(!DBhave("durable","da_id",durable_id))
        return "ไม่พบรหัสครุภัณฑ์" ; 
        if(DBhave("SELECT * FROM `durable` WHERE `da_status` = 'ถูกยืม' "))
        return "ถูกยืมไปก่อนแล้ว"; 
        String date =  getDateTime() ;//"2016-03-18 01:04:06";
        Sql("INSERT INTO  `lend`  VALUES (NULL  , '"+durable_id+"','"+name_lend+"', '"+dap_id+"', '"+room_id+"', '"+about+"', '"+date+"');");     
        Sql("UPDATE `durable` SET `da_status` = 'ถูกยืม' WHERE  `da_id` = '"+durable_id+"';");     
        return "OK";
    }
    
    public static void main(String[] args) {
        //Sql("INSERT INTO `durable_articles`.`lend` (`l_id`, `l_da`, `l_name`, `l_dep`, `l_room`, `l_about`, `l_date`) VALUES (NULL, '1', 'อ.หนึ่ง', '464259130', '408', 'กิจกรรม', '2016-03-18 01:04:06');");
        System.out.println(lend("1","อ.ยืม","วิศวะ","409","รายละเอียด")); //  ถ้ามี 1 return 0;
        //System.out.println(getDateTime());
    }
    
    static String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dat = new Date();
        return  dateFormat.format(dat);
    }
    
}
