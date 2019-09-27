//This class was created on 2019.03.02 by Jaco van Stryp
package Graphics;

import handle.dbLocationManager;
import java.io.File;
import javax.swing.JOptionPane;
//Version 2 
/**
 *
 * @author Jaco van Stryp
 */
public class DeleteEventManagerMain extends javax.swing.JFrame {

    /**
     * Creates new form DeleteEventManagerMain
     */
    public DeleteEventManagerMain() {
        initComponents();
           btnVote8.setBackground(new java.awt.Color(19, 142, 222));
        btnVote7.setBackground(new java.awt.Color(255, 89, 33));
        btnVote6.setBackground(new java.awt.Color(255, 89, 33));
             eventRequest = "RemoveEvent";
                  jLabel8.setVisible(false);
                  sName1.setVisible(false);
                    jLabel4.setVisible(true);
                  sName.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVote6 = new javax.swing.JButton();
        btnVote7 = new javax.swing.JButton();
        btnVote8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnVote9 = new javax.swing.JButton();
        btnVote10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sName1 = new javax.swing.JTextField();
        sName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        eventGrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, -1));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Eduplex EVS v5 Small.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eduplex Culture Management System - Delete Event");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 67, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 477, 8, 24));

        btnVote6.setBackground(new java.awt.Color(255, 89, 33));
        btnVote6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote6.setForeground(new java.awt.Color(255, 255, 255));
        btnVote6.setText("Remove Entire Student");
        btnVote6.setEnabled(false);
        btnVote6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 300, 70));

        btnVote7.setBackground(new java.awt.Color(255, 89, 33));
        btnVote7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote7.setForeground(new java.awt.Color(255, 255, 255));
        btnVote7.setText("Remove Student From Event");
        btnVote7.setEnabled(false);
        btnVote7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 70));

        btnVote8.setBackground(new java.awt.Color(19, 142, 222));
        btnVote8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote8.setForeground(new java.awt.Color(255, 255, 255));
        btnVote8.setText("Remove Entire Event");
        btnVote8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 300, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("I Want To...");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 30));

        btnVote9.setBackground(new java.awt.Color(255, 89, 33));
        btnVote9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote9.setForeground(new java.awt.Color(255, 255, 255));
        btnVote9.setText("Back");
        btnVote9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 300, 70));

        btnVote10.setBackground(new java.awt.Color(255, 89, 33));
        btnVote10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote10.setForeground(new java.awt.Color(255, 255, 255));
        btnVote10.setText("Remove");
        btnVote10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 300, 70));

        jPanel3.setBackground(new java.awt.Color(8, 8, 94));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter Student Full Name");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter Event Name");

        sName1.setBackground(new java.awt.Color(34, 34, 78));
        sName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sName1.setForeground(new java.awt.Color(255, 255, 255));
        sName1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sName.setBackground(new java.awt.Color(34, 34, 78));
        sName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sName.setForeground(new java.awt.Color(255, 255, 255));
        sName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Grade");

        eventGrade.setBackground(new java.awt.Color(37, 37, 103));
        eventGrade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eventGrade.setForeground(new java.awt.Color(255, 255, 255));
        eventGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "Teacher" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(sName1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(eventGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sName1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eventGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1060, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Code will log the user out and then close the program

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

    }//GEN-LAST:event_jLabel15MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
  
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

      
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased

   
    }//GEN-LAST:event_jPanel2MouseReleased
String eventRequest = "RemoveStudentEvent";
    private void btnVote6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote6ActionPerformed
        btnVote6.setBackground(new java.awt.Color(19, 142, 222));
        btnVote8.setBackground(new java.awt.Color(255, 89, 33));
        btnVote7.setBackground(new java.awt.Color(255, 89, 33));
        
        eventRequest = "RemoveStudent";

        
          jLabel8.setVisible(true);
                  sName1.setVisible(true);
                  jLabel4.setVisible(false);
                  sName.setVisible(false);
    }//GEN-LAST:event_btnVote6ActionPerformed

    private void btnVote7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote7ActionPerformed
        btnVote7.setBackground(new java.awt.Color(19, 142, 222));
        btnVote8.setBackground(new java.awt.Color(255, 89, 33));
        btnVote6.setBackground(new java.awt.Color(255, 89, 33));
             eventRequest = "RemoveStudentEvent";
              jLabel8.setVisible(true);
                  sName1.setVisible(true);
                  jLabel4.setVisible(true);
                  sName.setVisible(true);
    }//GEN-LAST:event_btnVote7ActionPerformed

    private void btnVote8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote8ActionPerformed
        btnVote8.setBackground(new java.awt.Color(19, 142, 222));
        btnVote7.setBackground(new java.awt.Color(255, 89, 33));
        btnVote6.setBackground(new java.awt.Color(255, 89, 33));
             eventRequest = "RemoveEvent";
                  jLabel8.setVisible(false);
                  sName1.setVisible(false);
                    jLabel4.setVisible(true);
                  sName.setVisible(true);
    }//GEN-LAST:event_btnVote8ActionPerformed

    private void btnVote9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote9ActionPerformed
        new Administration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVote9ActionPerformed

    private void btnVote10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote10ActionPerformed
        dbLocationManager cm = new dbLocationManager();
        File file = new File(cm.getDatabaseLocation() + "\\Culture_Management_Admin\\Culture\\Events\\Grade_" + eventGrade.getSelectedItem() + "\\" + sName.getText().trim() + ".db"); 
          System.out.println(file + "");
        if(file.delete()) 
        { 
        JOptionPane.showMessageDialog(null, sName.getText() + " Has been deleted", "Sucess", JOptionPane.INFORMATION_MESSAGE);
        sName.setText("");
        } 
        else
        { 
            file = new File(cm.getDatabaseLocation() + "\\Culture_Management_Admin\\Culture\\Events\\Grade_" + eventGrade.getSelectedItem() + "\\" + sName.getText().trim() + " [I]" + ".db"); 
             if(file.delete()) 
        { 
        JOptionPane.showMessageDialog(null, sName.getText() + " Has been deleted", "Sucess", JOptionPane.INFORMATION_MESSAGE);
        sName.setText("");
        } 
        else
        { 
              file = new File(cm.getDatabaseLocation() + "\\Culture_Management_Admin\\Culture\\Events\\Grade_" + eventGrade.getSelectedItem() + "\\" + sName.getText().trim() + " [G]" + ".db"); 
             if(file.delete()) 
        { 
        JOptionPane.showMessageDialog(null, sName.getText() + " Has been deleted", "Sucess", JOptionPane.INFORMATION_MESSAGE);
        sName.setText("");
        } 
        else
        { 
        JOptionPane.showMessageDialog(null, "Unable to delete event, please make sure the event is spelled correctly \nand the grade is selected correctly\n\nmake sure Tags are included", "Sucess", JOptionPane.INFORMATION_MESSAGE);

        } 

        } 

        } 
    }//GEN-LAST:event_btnVote10ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteEventManagerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEventManagerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEventManagerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEventManagerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteEventManagerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVote10;
    private javax.swing.JButton btnVote6;
    private javax.swing.JButton btnVote7;
    private javax.swing.JButton btnVote8;
    private javax.swing.JButton btnVote9;
    private javax.swing.JComboBox<String> eventGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField sName;
    private javax.swing.JTextField sName1;
    // End of variables declaration//GEN-END:variables
}
