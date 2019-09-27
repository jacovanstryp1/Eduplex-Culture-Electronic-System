//This class was created on 2018.11.28 by Jaco van Stryp
package Graphics;

import handle.dbLocationManager;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaco van Stryp
 */
public class GradeSelection extends javax.swing.JFrame {

    /**
     * Creates new form LanguageSelectionMain
     */
    dbLocationManager cm = new dbLocationManager();

    public GradeSelection() {
        initComponents();
    }
    int xMouse;
    int yMouse;

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
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVote9 = new javax.swing.JButton();
        btnVote13 = new javax.swing.JButton();
        btnVote22 = new javax.swing.JButton();
        btnVote23 = new javax.swing.JButton();
        btnVote24 = new javax.swing.JButton();
        btnVote25 = new javax.swing.JButton();
        btnVote26 = new javax.swing.JButton();
        btnVote27 = new javax.swing.JButton();
        btnVote28 = new javax.swing.JButton();
        btnVote29 = new javax.swing.JButton();
        btnVote30 = new javax.swing.JButton();
        btnVote31 = new javax.swing.JButton();
        btnVote32 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eduplex Book Management System");
        setUndecorated(true);
        setResizable(false);

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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eduplex Culture Management System");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please Choose Your Grade");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        btnVote9.setBackground(new java.awt.Color(255, 89, 33));
        btnVote9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote9.setForeground(new java.awt.Color(255, 255, 255));
        btnVote9.setText("3");
        btnVote9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 170, 70));

        btnVote13.setBackground(new java.awt.Color(255, 89, 33));
        btnVote13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote13.setForeground(new java.awt.Color(255, 255, 255));
        btnVote13.setText("1");
        btnVote13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote13ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 70));

        btnVote22.setBackground(new java.awt.Color(255, 89, 33));
        btnVote22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote22.setForeground(new java.awt.Color(255, 255, 255));
        btnVote22.setText("2");
        btnVote22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote22ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 170, 70));

        btnVote23.setBackground(new java.awt.Color(255, 89, 33));
        btnVote23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote23.setForeground(new java.awt.Color(255, 255, 255));
        btnVote23.setText("6");
        btnVote23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote23ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 170, 70));

        btnVote24.setBackground(new java.awt.Color(255, 89, 33));
        btnVote24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote24.setForeground(new java.awt.Color(255, 255, 255));
        btnVote24.setText("5");
        btnVote24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote24ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 170, 70));

        btnVote25.setBackground(new java.awt.Color(255, 89, 33));
        btnVote25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote25.setForeground(new java.awt.Color(255, 255, 255));
        btnVote25.setText("4");
        btnVote25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote25ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 70));

        btnVote26.setBackground(new java.awt.Color(255, 89, 33));
        btnVote26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote26.setForeground(new java.awt.Color(255, 255, 255));
        btnVote26.setText("7");
        btnVote26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote26ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, 70));

        btnVote27.setBackground(new java.awt.Color(255, 89, 33));
        btnVote27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote27.setForeground(new java.awt.Color(255, 255, 255));
        btnVote27.setText("8");
        btnVote27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote27ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 170, 70));

        btnVote28.setBackground(new java.awt.Color(255, 89, 33));
        btnVote28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote28.setForeground(new java.awt.Color(255, 255, 255));
        btnVote28.setText("9");
        btnVote28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote28ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 170, 70));

        btnVote29.setBackground(new java.awt.Color(255, 89, 33));
        btnVote29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote29.setForeground(new java.awt.Color(255, 255, 255));
        btnVote29.setText("10");
        btnVote29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote29ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 170, 70));

        btnVote30.setBackground(new java.awt.Color(255, 89, 33));
        btnVote30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote30.setForeground(new java.awt.Color(255, 255, 255));
        btnVote30.setText("Teacher & Other");
        btnVote30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote30ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 690, 70));

        btnVote31.setBackground(new java.awt.Color(255, 89, 33));
        btnVote31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote31.setForeground(new java.awt.Color(255, 255, 255));
        btnVote31.setText("12");
        btnVote31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote31ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 170, 70));

        btnVote32.setBackground(new java.awt.Color(255, 89, 33));
        btnVote32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote32.setForeground(new java.awt.Color(255, 255, 255));
        btnVote32.setText("11");
        btnVote32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote32ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

    }//GEN-LAST:event_jLabel15MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //This is used so the user can drag the window around without it having an frame
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MouseReleased

    private void btnVote9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote9ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));
            printer.println(3);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote9ActionPerformed

    private void btnVote13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote13ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(1);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote13ActionPerformed

    private void btnVote22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote22ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(2);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote22ActionPerformed

    private void btnVote23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote23ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(6);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote23ActionPerformed

    private void btnVote24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote24ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(5);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote24ActionPerformed

    private void btnVote25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote25ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(4);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote25ActionPerformed

    private void btnVote26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote26ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(7);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote26ActionPerformed

    private void btnVote27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote27ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(8);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote27ActionPerformed

    private void btnVote28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote28ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(9);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote28ActionPerformed

    private void btnVote29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote29ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(10);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote29ActionPerformed

    private void btnVote30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote30ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println("Teacher");
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote30ActionPerformed

    private void btnVote31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote31ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(12);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote31ActionPerformed

    private void btnVote32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote32ActionPerformed
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Grade.db"));

            printer.println(11);
            printer.close();
            new MainAddStudentName().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Warning", "Please Contact A Teacher, Something Went Wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVote32ActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

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
            java.util.logging.Logger.getLogger(GradeSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnVote13;
    private javax.swing.JButton btnVote22;
    private javax.swing.JButton btnVote23;
    private javax.swing.JButton btnVote24;
    private javax.swing.JButton btnVote25;
    private javax.swing.JButton btnVote26;
    private javax.swing.JButton btnVote27;
    private javax.swing.JButton btnVote28;
    private javax.swing.JButton btnVote29;
    private javax.swing.JButton btnVote30;
    private javax.swing.JButton btnVote31;
    private javax.swing.JButton btnVote32;
    private javax.swing.JButton btnVote9;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
