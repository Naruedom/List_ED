/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ed;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; 

/**
 *
 * @author DRAFT
 */
public class lend extends javax.swing.JPanel {

    /**
     * Creates new form lend
     */
    public lend() {
        initComponents();
        jLabel12.setVisible(false);
        jButton2.setVisible(false);  
        
       // printlist(list);
        
      }
    ArrayList<JButton> buttonlist = new ArrayList<JButton>(); 
    ArrayList<String[]>  list     = new ArrayList<String[]>();
    
    String  name   = "ผู้เบิก";
    String  status = "สถานะ";
    String  dap    = "แผนก";
    String  about  = "รายละเอียด";
     
    String  kname  = "ชื่อครุ";
    String  bran   = "ยี่ห้อ"; 
    String  num    = "2";
      
    public  void addButton() {  
       
        kname = jComboBoxK_Name.getSelectedItem().toString();
        bran  = jComboBoxBrane .getSelectedItem().toString();
        num   = jSpinnerNum.getValue().toString();
        
    final JButton b = new JButton(kname+" - "+bran+" - "+num+"ชิ้น                         X"); 
       b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {  removeButton(b);  } });
       jPanel1.add(b); 
       buttonlist.add(b);
       list.add( new String[] { kname,bran,num});  
    }

    public void removeButton(JButton x) { 
        int i = buttonlist.indexOf(x);
        buttonlist.get(i).setVisible(false);
        jPanel1.remove(buttonlist.get(i));  
        buttonlist.remove(i);
        list.remove(i);
        printlist(list);
    }
    
    static void printlist(ArrayList<String[]> x){
        for (int i = 0; i < x.size(); i++) {
             System.out.println(x.get(i)[0]+" "+x.get(i)[1]+" "+x.get(i)[2]); 
        }
        System.out.println("-------");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAbout = new javax.swing.JTextArea();
        jComboBoxBrane = new javax.swing.JComboBox<>();
        jSpinnerNum = new javax.swing.JSpinner();
        jComboBoxK_Name = new javax.swing.JComboBox<>();
        jComboBoxDAP = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonSAVE = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(860, 573));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("รายการที่เบิกทั้งหมด");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("สถานะ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("เลือกครุภัณฑ์");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ข้อมูลผู้เบิก");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ชื่อ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ชื่อครุภัณฑ์");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("แผนก");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("แจ้งเตือน");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("รายละเอียด");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ยี่ห้อ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("จำนวน");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
        add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));
        add(inputStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));

        inputAbout.setColumns(20);
        inputAbout.setRows(5);
        jScrollPane1.setViewportView(inputAbout);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 90));

        jComboBoxBrane.setEditable(true);
        jComboBoxBrane.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sony", "sumsung", " " }));
        add(jComboBoxBrane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 150, -1));
        add(jSpinnerNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 70, -1));

        jComboBoxK_Name.setEditable(true);
        jComboBoxK_Name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "คอม all in one", "คอม pc", "โต๊ะ" }));
        add(jComboBoxK_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 150, -1));

        jComboBoxDAP.setEditable(true);
        jComboBoxDAP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วิศวกรรมซอฟต์แวร์", "มัลติมีเดีย", "อื่น ๆ " }));
        add(jComboBoxDAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jButtonAdd.setText("เพิ่มในรายการ  >>");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 260, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("คอม all in one - sony - จำนวน 10");
        jPanel1.add(jLabel12);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("X");
        jButton2.setContentAreaFilled(false);
        jPanel1.add(jButton2);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 340, 420));

        jButtonSAVE.setText("บันทึก");
        jButtonSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSAVEActionPerformed(evt);
            }
        });
        add(jButtonSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
       addButton();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAVEActionPerformed
        
        name   = inputName  .getText();
        status = inputStatus.getText();
        dap    = jComboBoxDAP .getSelectedItem().toString();
        about  = inputAbout.getText();
        
        for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i)[0]+" "+list.get(i)[1]+" "+list.get(i)[2]); 
        }
        
    }//GEN-LAST:event_jButtonSAVEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputAbout;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputStatus;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonSAVE;
    private javax.swing.JComboBox<String> jComboBoxBrane;
    private javax.swing.JComboBox<String> jComboBoxDAP;
    private javax.swing.JComboBox<String> jComboBoxK_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerNum;
    // End of variables declaration//GEN-END:variables
}
