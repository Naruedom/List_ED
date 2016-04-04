/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ed;

import javax.swing.table.DefaultTableModel;

 
public class search extends javax.swing.JPanel {

    DefaultTableModel model,model2;
    
    public search() {
        initComponents();
        
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Type");
        model.addColumn("Price");
        model.addColumn("Search");
        search_package.setModel(model);
        
        model2 = new DefaultTableModel();
        model2.addColumn("ID");
        model2.addColumn("Room");
        model2.addColumn("Date");
        model2.addColumn("ID_Package");
        model2.addColumn("ID_User");
        search_ream.setModel(model2);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt2search = new javax.swing.JLabel();
        psearch1 = new javax.swing.JComboBox();
        txtsearch1 = new javax.swing.JLabel();
        txtwords1 = new javax.swing.JLabel();
        pwords1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        search_package = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        psearch2 = new javax.swing.JComboBox();
        txtsearch2 = new javax.swing.JLabel();
        txtwords2 = new javax.swing.JLabel();
        pwords2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        search_ream = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(870, 592));

        txt2search.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        txt2search.setForeground(new java.awt.Color(255, 255, 255));
        txt2search.setText("Search Package");

        psearch1.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        psearch1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Name", "Type", "Band", "Price", "Serial" }));

        txtsearch1.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        txtsearch1.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch1.setText("Search  :  ");

        txtwords1.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        txtwords1.setForeground(new java.awt.Color(255, 255, 255));
        txtwords1.setText("Words   : ");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(800, 150));

        search_package.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(search_package);

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search Ream");

        psearch2.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        psearch2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Room", "Date", "ID_Package", "ID_User" }));

        txtsearch2.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        txtsearch2.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch2.setText("Search  :  ");

        txtwords2.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        txtwords2.setForeground(new java.awt.Color(255, 255, 255));
        txtwords2.setText("Words   : ");

        search_ream.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(search_ream);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list_ed/img/bg.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(txt2search)
                        .addGap(92, 92, 92)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(txtsearch2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtwords2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwords2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(txtsearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(txtwords1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwords1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt2search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch1)
                    .addComponent(txtwords1)
                    .addComponent(pwords1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(pwords2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsearch2)
                            .addComponent(txtwords2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(0, 56, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox psearch1;
    private javax.swing.JComboBox psearch2;
    private javax.swing.JTextField pwords1;
    private javax.swing.JTextField pwords2;
    private javax.swing.JTable search_package;
    private javax.swing.JTable search_ream;
    private javax.swing.JLabel txt2search;
    private javax.swing.JLabel txtsearch1;
    private javax.swing.JLabel txtsearch2;
    private javax.swing.JLabel txtwords1;
    private javax.swing.JLabel txtwords2;
    // End of variables declaration//GEN-END:variables
}
