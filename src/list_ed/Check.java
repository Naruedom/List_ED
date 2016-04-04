package list_ed;
   
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static list_ed.cnn.DBselect;
import static list_ed.cnn.Select;


public class Check extends javax.swing.JPanel {
 
ArrayList<String[]> data  =new ArrayList<String[]>();
ArrayList<String> dataF =new ArrayList<String>();

    public Check() {
         initComponents();   
         updatetable();  
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            click(row,col);
        }
    }
});
   
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(660, 520));
        setPreferredSize(new java.awt.Dimension(860, 573));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BcodeKeyTyped(evt);
            }
        });
        add(Bcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Serial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 390));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("ตรวจสอบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 110, 40));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 82, 540, 390));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("ล้าง");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 80, 40));

        jButton4.setText("PDF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 70, 40));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 30, 100, 20));

        jRadioButton1.setText("ไม่ระบุห้อง");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jRadioButton2.setText("ระบุห้อง");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        scanadd();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       output();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        data.clear();
        dataF.clear();
        updatetable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcodeKeyTyped
           if(Bcode.getText().length()>=20) 
             scanadd();  
    }//GEN-LAST:event_BcodeKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
        void click(int row,int col){  // Delete ROW
       //ystem.out.println( jTable1.getValueAt( jTable1.getSelectedRow(), 0).toString() );  
       //System.out.println(jTable1.getSelectedRow());
        
        //data.get(row) 
        //String[] a =  {data.get(row)[0]};
        
        //dataF.remove(a);
        //System.out.print( dataF .indexOf(data.get(row)));
        data.remove(row);
       
        updatetable();
        output();
         
        System.out.println("------------");
        for (int i = 0; i < dataF.size(); i++) {
			System.out.println(dataF.get(i));
		} 
    }
    
    void add(String a){ // if havanot add data 
         
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i)[0].equals(a)) return;
        }
         
        String[] aro = {a};
        data.add( aro );
    }
    
    
        public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {  System.out.println("BarCode");
        } else {  System.out.println("no Code");  }
    }
   void updatetable(){ // left TB update from listDATA
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
         model.setRowCount(0);  
         for (int i = 0; i < data.size() ; i++) {
            addrow( data.get(i) );
        }
         
    }
   
       void addrow(String[] Row){
      String[] row = Row;
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
      model.addRow(row);    
    }
      
   void scanadd(){
        
        add(Bcode.getText());
        Bcode.setText("");
        updatetable();
        output();
   } 
   
    void output(){
         jPanel1.removeAll(); 
         dataF.clear();
        x = fx;
        y = fx;
        w = 100;
        h = 30;
     
        ArrayList<String>   Grup =new ArrayList<String>(); //keep  1/1/1 2/2/2
        //AddDayGrup.add(data.get(0)[0]);
        
        for (int i = 0; i < data.size(); i++) {  // loop datalist
                String str = "SELECT * FROM `durable` where  da_serial  = '"+data.get(i)[0]+"'" ;
                if(!DBselect(str).get(0).equals("ok"))
                {
                    dataF.add(data.get(i)[0]);
                }else
                {
                String keepday = DBselect(str).get(3);  //หาห้องเพิ่ม  
             if( ! Grup.contains(keepday))  //ถ้าใน grup ไม่มี
                   Grup.add(keepday);            //เพิ่ม 
                }
        } 
        for (int i = 0; i <  Grup.size(); i++) {
             createoutput( Grup.get(i));
         }
         
        if(dataF.size()>0)
            creatFail();
    }
    
    void creatFail(){ 
     x=fx;   
     jPanel1.add(new JLabel("รายการที่ไม่มีข้อมูล-------------") , new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y));
     y+=ly; 
     for (int i = 0; i < dataF.size(); i++) { 
    jPanel1.add(new JLabel("  "+dataF.get(i)) , new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y));
      y+=ly;  
        } 
    }
    
    void createoutput(String Grup){  
         int a = 0 , b = 0;
         String str = "SELECT * FROM `durable` where  da_r_number = '"+Grup+"'" ;
          x=fx; 
          
       jPanel1.add(new JLabel("  ห้อง : "+DBselect(str).get(3) )  , new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y));
       //+"                                        วัน - เวลาที่เพิ่มครุภัณฑ์ : "+addDay)); 
           y+=20; newline = 0; x=fx; //setlocol for button one
        try {  
            ResultSet rs = Select(str); 
            while (rs.next()) { a++;
                String name    = rs.getString("da_id"); 
                String da_code = rs.getString("da_serial");
                boolean have = false;
                 
          
                for (int i = 0; i < data.size(); i++) { 
                    if(da_code.equals(data.get(i)[0]))
                    {
                         addBTt(da_code);
                         have = true;
                         b++; 
                    }  
                } 
                if(!have)
                    addBTf(da_code); 
                
             } 
        } catch (Exception ex) { System.err.println("รูปแบบไม่ถูกต้อง"); } 
          y+=ly;
          x=fx;
          JLabel la = new JLabel("<html> ครุภัณฑ์ของห้องมี <font color='BLACK'>"+a+"</font> ชิ้น   จากการตรวจสอบพบ <font color='BLACK'>"+b+"</font> ชิ้น   </html>");
          la.setForeground(Color.LIGHT_GRAY);
          jPanel1.add(la, new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y));
         
          y+=68;
    }
    
    
    void addBTt(String x){ 
      JButton  bt =   new JButton(x);
      setbt(bt);
      //bt.setBackground(Color.decode("#C6DCFF")); 
    }
    
    
    
    void addBTf(String x){
      JButton  bt =   new JButton(x);
      setbt(bt);
      bt.setBackground(Color.decode("#FFA18B")); 
    }    
    
     final int fx = 4;
     final int ly = 34;
     
     int x = fx;
     int y = fx;
     int w = 100;
     int h = 30;
     
     int newline = 0;
     
    void setbt(final JButton bt){
      if(newline>=5){
          y+=ly; newline = 0;
          x=fx;
      }
      jPanel1.add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y,w,h)); 
      x+=105; 
      newline++;
      
      bt.setBorderPainted(false);
      bt.setPreferredSize(new Dimension(50,30));
      bt.addActionListener(new ActionListener()
              
              
    {
  public void actionPerformed(ActionEvent e) { 
       
      try {
        ResultSet    rs2 = Select("SELECT * FROM `durable` WHERE  da_serial = '"+bt.getText()+"'");
      
            if(rs2.next()) {  
             // String name        = rs2.getString("da_id"); 
              String da_serial   = rs2.getString("da_serial");  
              String da_r_number = rs2.getString("da_r_number"); 
              String da_name     = rs2.getString("da_name"); 
              String da_band     = rs2.getString("da_band"); 
              String da_code     = rs2.getString("da_code"); 
              Box( da_name + " "+ da_band +
                               "\n เลขครุภัณฑ์ : "+da_code+
                               "\n อยู่ห้อง     : "+da_r_number + 
                               "\n Serial   : "+da_serial, "ข้อมูลครุภัณฑ์" );
            }
   //   } catch (Exception e) {  }
       } catch (SQLException ex) { Box("เชื่อมต่อฐานข้อมูลไม่ได้","แจ้งเตือน");  } 
      
      } });
      
         
    }
    
    public static void  Box(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage,titleBar, JOptionPane.CLOSED_OPTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bcode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

 
}

