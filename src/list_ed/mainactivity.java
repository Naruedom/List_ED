package list_ed;
 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainactivity extends javax.swing.JFrame {
    
    ////Layou/////
    GridBagLayout layout = new GridBagLayout(); 
    GridBagConstraints c = new GridBagConstraints();
    
    ///////Date////
    int day,mounth,year;
    int hour,minute,secound;
    
    //////Class///////
    addpackage add = new addpackage();
    search     s   = new search();
    home       h   = new home();
    lend       r   = new lend();
    Check      k   = new Check();
     
    
    public mainactivity() {
        initComponents();
         
        /////Time/////
        clock(); 
        
        changepage();  
        main.add(k,c);
        }  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        search = new javax.swing.JButton();
        con = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pusername = new javax.swing.JTextField();
        ppassword = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Date = new javax.swing.JMenu();
        date = new javax.swing.JMenu();
        Time = new javax.swing.JMenu();
        time = new javax.swing.JMenu();
        time1 = new javax.swing.JMenu();
        Time1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/home.png"))); // NOI18N
        home.setBorder(null);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setFocusable(false);
        home.setMaximumSize(new java.awt.Dimension(100, 100));
        home.setMinimumSize(new java.awt.Dimension(100, 100));
        home.setPreferredSize(new java.awt.Dimension(100, 100));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/add.png"))); // NOI18N
        edit.setBorder(null);
        edit.setContentAreaFilled(false);
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setFocusable(false);
        edit.setMaximumSize(new java.awt.Dimension(100, 100));
        edit.setMinimumSize(new java.awt.Dimension(100, 100));
        edit.setPreferredSize(new java.awt.Dimension(100, 100));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/search.png"))); // NOI18N
        search.setBorder(null);
        search.setContentAreaFilled(false);
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setFocusable(false);
        search.setMaximumSize(new java.awt.Dimension(100, 100));
        search.setMinimumSize(new java.awt.Dimension(100, 100));
        search.setPreferredSize(new java.awt.Dimension(100, 100));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        con.setBackground(new java.awt.Color(255, 255, 255));
        con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/edit.png"))); // NOI18N
        con.setBorder(null);
        con.setContentAreaFilled(false);
        con.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        con.setFocusable(false);
        con.setMaximumSize(new java.awt.Dimension(100, 100));
        con.setMinimumSize(new java.awt.Dimension(100, 100));
        con.setPreferredSize(new java.awt.Dimension(100, 100));
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/remove.png"))); // NOI18N
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusable(false);
        exit.setMaximumSize(new java.awt.Dimension(100, 100));
        exit.setMinimumSize(new java.awt.Dimension(100, 100));
        exit.setPreferredSize(new java.awt.Dimension(100, 100));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        main.setPreferredSize(new java.awt.Dimension(870, 592));

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/username.png"))); // NOI18N
        jLabel2.setText("Username :");

        jLabel1.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/password.png"))); // NOI18N
        jLabel1.setText("Password :");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pusername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pusername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ppassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(945, 30));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Urdu Typesetting", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/exit2.png"))); // NOI18N
        jMenuItem1.setText("   Exit   :  ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        Date.setForeground(new java.awt.Color(255, 0, 0));
        Date.setText("                                                                                                                                           วันที่ :");
        Date.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jMenuBar1.add(Date);

        date.setForeground(new java.awt.Color(0, 0, 204));
        date.setText("       Date");
        date.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jMenuBar1.add(date);

        Time.setForeground(new java.awt.Color(255, 0, 0));
        Time.setText("  เวลา    : ");
        Time.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jMenuBar1.add(Time);

        time.setForeground(new java.awt.Color(0, 0, 204));
        time.setText("   Time   ");
        time.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jMenuBar1.add(time);

        time1.setForeground(new java.awt.Color(255, 0, 0));
        time1.setText("   สถานะ  :  ");
        time1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jMenuBar1.add(time1);

        Time1.setForeground(new java.awt.Color(0, 0, 204));
        Time1.setText("Offline");
        Time1.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jMenuBar1.add(Time1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        ////////Set And Remove///////
        changepage(); 
         
        //////AddLaout//////
        main.add(add,c);
    }//GEN-LAST:event_editActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        changepage(); 
        
        main.add(s,c); 
    }//GEN-LAST:event_searchActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       changepage();
            main.add(k,c);
//System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        changepage(); 
        
        main.add(h,c);
    }//GEN-LAST:event_homeActionPerformed
 
         
    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
           changepage(); 
           main.add(r,c);
    }//GEN-LAST:event_conActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          
    }//GEN-LAST:event_jMenuItem1ActionPerformed
 
    void changepage(){
        main.removeAll();
        main.repaint();;
        main.revalidate();
        main.setLayout(layout); 
        
        c.gridx = 0;
        c.gridy = 0;
       }
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  new mainactivity().setVisible(true);
            }
        });
    }
    ///////Time And Date//////
        public void clock(){
            Thread clock = new Thread(){
                public void run(){
                    for(;;){
                        
         /////////////Date/////////////////
         Calendar cal = new GregorianCalendar();
         day     = cal.get(Calendar.DAY_OF_MONTH);
         mounth  = cal.get(Calendar.MONTH)+1;
         year    = cal.get(Calendar.YEAR);
         //////////Time//////////////////
         secound = cal.get(Calendar.SECOND);
         minute  = cal.get(Calendar.MINUTE);
         hour    = cal.get(Calendar.HOUR_OF_DAY);
        //////////Set TIme/////////////
        time.setText(hour+":"+minute+":"+secound);
        /////////Set Date//////////////
        date.setText(day+"/"+mounth+"/"+year);
        ///////////Count Time 1Second//////////
                    try {
                        ////Set 1Second//////
                        sleep(1000);
                    } catch (Exception e) {
                        
                    }
                }
            }
        }; 
        /////Start Time////////  
        clock.start();
    }
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Date;
    private javax.swing.JMenu Time;
    private javax.swing.JMenu Time1;
    private javax.swing.JButton con;
    private javax.swing.JMenu date;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField ppassword;
    private javax.swing.JTextField pusername;
    private javax.swing.JButton search;
    private javax.swing.JMenu time;
    private javax.swing.JMenu time1;
    // End of variables declaration//GEN-END:variables
}
