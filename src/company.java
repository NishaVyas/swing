
import java.sql.DriverManager;
import java.sql.*;
public class company extends javax.swing.JFrame {
    int flag=0;
    public company() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Company Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("         Package");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("              Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("        Branch");

        jCheckBox1.setText("CS");

        jCheckBox2.setText("IT");

        jCheckBox3.setText("ECE");

        jCheckBox4.setText("EICE");

        jCheckBox5.setText("ME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("         Aggregate");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText(" Backlog");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("   Location");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("management");
        jButton4.setToolTipText("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(67, 67, 67)
                        .addComponent(jButton4)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try{
                String company_name = jTextField1.getText();
                String pkg = jTextField2.getText();
                String date = jTextField3.getText();
                int agg = Integer.parseInt(jTextField4.getText());
                int backlog = Integer.parseInt(jTextField5.getText());
                String location = jTextField6.getText();
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecb","root","");
                Statement st=cn.createStatement();
                if(flag==0){
                    PreparedStatement ps = cn.prepareStatement("insert into company values(?,?,?,?,?,?)");
                    ps.setString(1,company_name);
                    ps.setString(2,pkg);
                    ps.setString(3,date);
                    ps.setInt(4,agg);
                    ps.setInt(5,backlog);
                    ps.setString(6,location);
                    
                  if(ps.executeUpdate()>0){
                    PreparedStatement ps1 = cn.prepareStatement("insert into branch values(?,?)");
                    if(jCheckBox1.isSelected()){
                       ps1.setString(1,company_name);
                       ps1.setString(2,jCheckBox1.getText());
                       ps1.executeUpdate();
                    }
                    if(jCheckBox2.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox2.getText());
                        ps1.executeUpdate();
                    }
                    if(jCheckBox3.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox3.getText());
                        ps1.executeUpdate();
                    }
                    if(jCheckBox4.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox4.getText());
                        ps1.executeUpdate();
                    }
                    if(jCheckBox5.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox5.getText());
                        ps1.executeUpdate();
                    }  
                    jOptionPane1.showMessageDialog(null,"Record Inserted");
                }
                else{
                    jOptionPane1.showMessageDialog(null,"Try Again");
                }
                cn.close();
          }
          else if(flag==1){
                PreparedStatement ps=cn.prepareStatement("update company set pkg=? , date=? , agg=? , backlog=? , location=? where company_name=?");
                ps.setString(1,pkg);
                ps.setString(2,date);
                ps.setInt(3,agg);
                ps.setInt(4,backlog);
                ps.setString(5,location); 
                ps.setString(6,company_name);
                if(ps.executeUpdate()>0){
                    Statement st1 = cn.createStatement();
                    st1.execute("delete from branch where company_name='"+company_name+"'");
                    PreparedStatement ps1 = cn.prepareStatement("insert into branch values(?,?)");
                    if(jCheckBox1.isSelected()){
                       ps1.setString(1,company_name);
                       ps1.setString(2,jCheckBox1.getText());
                       ps1.executeUpdate();
                    }
                    if(jCheckBox2.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox2.getText());
                        ps1.executeUpdate();
                    }
                    if(jCheckBox3.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox3.getText());
                        ps1.executeUpdate();
                    }
                    if(jCheckBox4.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox4.getText());
                        ps1.executeUpdate();
                    }
                    if(jCheckBox5.isSelected()){
                        ps1.setString(1,company_name);
                        ps1.setString(2,jCheckBox5.getText());
                        ps1.executeUpdate();
                    }  
                    jOptionPane1.showMessageDialog(null,"Record Updated");
                }
                else{
                    jOptionPane1.showMessageDialog(null,"Try Again");
                }
                cn.close();
           }
          else if(flag==2){
              Statement st1=cn.createStatement();
              st1.execute("delete from company where company_name='"+company_name+"'");
              Statement st2=cn.createStatement();
              st2.execute("delete from branch where company_name='"+company_name+"'");
              
           }
           cn.close();
        }
        catch(ClassNotFoundException e){
            jOptionPane1.showMessageDialog(null,e.getMessage());
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null,e.getMessage());
        }
          new company().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
          String company_name = jTextField1.getText();
          Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecb","root","");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select * from company where company_name='"+company_name+"'");
               if(rs.next()){
                   jTextField2.setText(rs.getString(2));
                   jTextField3.setText(rs.getString(3));
                   jTextField4.setText(rs.getInt(4)+"");
                   jTextField5.setText(rs.getInt(5)+"");
                   jTextField6.setText(rs.getString(6));
                   Statement st1 = cn.createStatement();
                   ResultSet rs1 = st1.executeQuery("select * from branch where company_name='"+company_name+"'");
                   while(rs1.next()){
                       if(rs1.getString(2).equals("CS")){
                           jCheckBox1.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("IT")){
                           jCheckBox2.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("ECE")){
                           jCheckBox3.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("EICE")){
                           jCheckBox4.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("ME")){
                           jCheckBox5.setSelected(true);
                       }
                       flag=1;
                   }
               }
               else{
                   jOptionPane1.showMessageDialog(null,"Invalid Company");
                   new company().setVisible(true);
                   this.setVisible(false);
                   jTextField1.setText("");
               }
               cn.close();
        }
        catch(ClassNotFoundException e){
            jOptionPane1.showMessageDialog(null,e.getMessage());
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
          String company_name = jTextField1.getText();
          Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecb","root","");
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select * from company where company_name='"+company_name+"'");
               if(rs.next()){
                   jTextField2.setText(rs.getString(2));
                   jTextField3.setText(rs.getString(3));
                   jTextField4.setText(rs.getInt(4)+"");
                   jTextField5.setText(rs.getInt(5)+"");
                   jTextField6.setText(rs.getString(6));
                   Statement st1 = cn.createStatement();
                   ResultSet rs1 = st1.executeQuery("select * from branch where company_name='"+company_name+"'");
                   while(rs1.next()){
                       if(rs1.getString(2).equals("CS")){
                           jCheckBox1.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("IT")){
                           jCheckBox2.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("ECE")){
                           jCheckBox3.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("EICE")){
                           jCheckBox4.setSelected(true);
                       }
                       else if(rs1.getString(2).equals("ME")){
                           jCheckBox5.setSelected(true);
                       }
                       flag=2;
                   }
               }
               else{
                   jOptionPane1.showMessageDialog(null,"Invalid Company");
                   new company().setVisible(true);
                   this.setVisible(false);
                   jTextField1.setText("");
               }
               cn.close();
        }
        catch(ClassNotFoundException e){
            jOptionPane1.showMessageDialog(null,e.getMessage());
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new management().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new company().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
