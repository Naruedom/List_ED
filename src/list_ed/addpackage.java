package list_ed;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import static list_ed.cnn.Select;
import static list_ed.cnn.Sql;
import static list_ed.codelend.getDateTime;


public class addpackage extends javax.swing.JPanel {

    DefaultTableModel model = new DefaultTableModel(); 
    ArrayList<String> list = new ArrayList<String>();
    Connect conn = new Connect();
    Statement stm;
    ResultSet rs;
    JButton thickButton = new JButton();
    
    public addpackage() {
        initComponents();
     //  ((DefaultEditor) pnum.getEditor()).getTextField().setEditable(false);
      selectcombobox();
  //  pnum.enable(false);
   
    model.addColumn("รหัสครุภัณฑ์");
    model.addColumn("Serial");
    
    jTable1.setModel(model);
    setVisible(true);
    
    
     
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        num = new javax.swing.JLabel();
        serial = new javax.swing.JLabel();
        pnum = new javax.swing.JSpinner();
        num2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pcode = new javax.swing.JTextField();
        resetnum = new javax.swing.JButton();
        pserial = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        pband = new javax.swing.JComboBox();
        person = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        pperson = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        proom = new javax.swing.JComboBox();
        band = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(870, 592));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        num.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/num.png"))); // NOI18N
        num.setText("           จำนวน :");
        jPanel1.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        serial.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        serial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/serial.png"))); // NOI18N
        serial.setText("  เลขผลิตภัณฑ์ :");
        jPanel1.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, -1));

        pnum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pnumStateChanged(evt);
            }
        });
        jPanel1.add(pnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, 30));
        jPanel1.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 165, 90, 20));

        jButton2.setText("Next");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 30));

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/code.png"))); // NOI18N
        jLabel3.setText("  รหัสครุภัณฑ์ :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        pcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcodeActionPerformed(evt);
            }
        });
        pcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pcodeKeyTyped(evt);
            }
        });
        jPanel1.add(pcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 170, 30));

        resetnum.setText("Reset");
        resetnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetnumActionPerformed(evt);
            }
        });
        jPanel1.add(resetnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 20, 70, 30));
        jPanel1.add(pserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 170, 30));

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 402));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("TH Charm of AU", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("เพิ่มครุภัณฑ์");

        room.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/classroom.png"))); // NOI18N
        room.setText("            ห้อง :");

        pband.setEditable(true);
        pband.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbandActionPerformed(evt);
            }
        });

        person.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        person.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/person.png"))); // NOI18N
        person.setText("ผู้รับผิดชอบ :");

        name.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/name_1.png"))); // NOI18N
        name.setText("    ชื่อครุณฑ์ :");

        pperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppersonActionPerformed(evt);
            }
        });
        pperson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ppersonKeyReleased(evt);
            }
        });

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnameKeyReleased(evt);
            }
        });

        proom.setEditable(true);
        proom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "401", "402", "403", "404", "405", "406", "407", "408", "409", "410", "411", "412" }));

        band.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        band.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/band.png"))); // NOI18N
        band.setText("            ยี่ห้อ :");

        add.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/ok.png"))); // NOI18N
        add.setText("Add");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/refresh.png"))); // NOI18N
        reset.setText("Reset");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addGap(18, 18, 18)
                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(person)
                                    .addComponent(band)
                                    .addComponent(room))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(pperson, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pband, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(proom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(person)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pperson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(band)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pband, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room)
                            .addComponent(proom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        
       
        
        
       String person = pperson.getText();
       String name = pname.getText();
      // String type = ptype.getSelectedItem().toString();
       String band = pband.getSelectedItem().toString();
       //int number = (int) pnum.getValue();
       //String[] Arr =  pcode.getText().split("#"); 

      // String status = "เบิกได้";
       String add = new Login().getId();
     //  String dep = pdep.getSelectedItem().toString();
       String room = proom.getSelectedItem().toString();
       String time = getDateTime();
       
       boolean cando =true; 
       
        for (int i = 0; i < list.size(); i++) {
             
             String[] Arr =  list.get(i).split("#"); 
             String serial = Arr[1];
             String code = Arr[0] ; 
              if(!Sql("insert into durable(da_d_id,da_r_number,da_serial,da_name,da_band,da_u_id,da_date,da_code)VALUES('"+
       person+"','"+room+"','"+serial+"','"+name+"','"+band+"','"+add+"','"+time+"','"+code+"')"))
        
             {
                 
             JOptionPane.showMessageDialog(null,"error 2 ");
             cando =false;
             return;
              }
            
        }
        if (cando)
        JOptionPane.showMessageDialog(null,"บันทึกข้อมูล");  
       
       // System.out.println(Arr[1]);
      
       
        
        
        
       
      
       
       
         
        
         
    }//GEN-LAST:event_addActionPerformed

    private void pnumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pnumStateChanged
        Num = (int) pnum.getValue();
        
        // num2.setText(String.valueOf(pnum.getValue().toString()));
        num2.setText(Num+"");
    }//GEN-LAST:event_pnumStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       
      
               
      
       String serial = pserial.getText();
       String code = pcode.getText();
       String str = code+"#"+serial;
       
       list.add(str);
        if(pcode == null && pserial == null && str == "#" ){
            JOptionPane.showMessageDialog(null,"กรุณากรอกข้อมูล"); System.out.println(pserial.getText()+pcode.getText()); return;  } 
        
        for(int i =0;i<list.size();i++) {   
           
            System.err.println(list.get(i)); 
        }
        System.out.println("--------------");
       pserial.setText(null);
       pcode.setText(null);
       
      String[] Arr =  list.get(list.size()-1).split("#"); 
       model.addRow(new Object[]{Arr[0],Arr[1]});
       
    Num--;
        num2.setText(Num+""); 
         pnum.setEnabled(false);
         
       if(Num<1){
           
           num2.hide();
           jButton2.hide();
       pserial.disable();
       pcode.disable();
       pserial.setText(null);
       pcode.setText(null);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

    }//GEN-LAST:event_resetActionPerformed

    private void resetnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetnumActionPerformed
         pnum.setEnabled(true);
        num2.show();
        jButton2.show();
        pserial.enable();
        pcode.enable();
        pserial.setText(null);
        pcode.setText(null);
               System.err.println(model.getRowCount() +"<---");
               if(list.size() <= 0 ){  return;  } 
               
        for (int i = 0; i < model.getRowCount(); i++) 
        {
        model.removeRow(i);
            System.out.println("remove :"+i );
        }
        
        System.out.println(list.get(0));
        list.clear();
       
        
    }//GEN-LAST:event_resetnumActionPerformed

    private void pcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcodeKeyTyped
            num(pcode);
    }//GEN-LAST:event_pcodeKeyTyped

    private void pcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcodeActionPerformed

    private void pbandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbandActionPerformed

    private void ppersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppersonActionPerformed

    private void ppersonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ppersonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ppersonKeyReleased

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void pnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameKeyReleased
 
   public void selectcombobox(){
       try {
           
           ResultSet rs = Select("SELECT da_band FROM v_da_band ");
    
           while (rs.next()) {               
               
               String band = rs.getString("da_band");
               pband.addItem(band);
           }
           
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null,"error1");
       }
   
   }
    
    public void num(JTextField a){
            a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e ){
                
        char c = e.getKeyChar();
        if(Character.isLetter(c)) {
           // getToolTipText().beep();
            e.consume();
        }  
  }   
            });
  }
public void text(JTextField a){
            a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e ){
                
        char c = e.getKeyChar();
        if(Character.isDefined(c)) {
            e.consume();
        }  
  }   
            });
  }
    
    
    int Num;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel band;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel num;
    private javax.swing.JLabel num2;
    private javax.swing.JComboBox pband;
    private javax.swing.JTextField pcode;
    private javax.swing.JLabel person;
    private javax.swing.JTextField pname;
    private javax.swing.JSpinner pnum;
    private javax.swing.JTextField pperson;
    private javax.swing.JComboBox proom;
    private javax.swing.JTextField pserial;
    private javax.swing.JButton reset;
    private javax.swing.JButton resetnum;
    private javax.swing.JLabel room;
    private javax.swing.JLabel serial;
    // End of variables declaration//GEN-END:variables
}
