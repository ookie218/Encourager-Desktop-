/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncouragerGui;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;


/**
 *
 * @author ookie
 */



public class EncouragerGui extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form EncouragerGui
     */
    public EncouragerGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yourNeed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ourEncouragement = new javax.swing.JTextArea();
        encourageMe = new javax.swing.JButton();
        responseYes = new javax.swing.JButton();
        responseNo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("The Encourager");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("What are you in need of today? ");

        yourNeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourNeedActionPerformed(evt);
            }
        });

        ourEncouragement.setColumns(20);
        ourEncouragement.setRows(5);
        jScrollPane1.setViewportView(ourEncouragement);

        encourageMe.setText("Speak Life");
        encourageMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encourageMeActionPerformed(evt);
            }
        });

        responseYes.setText("Yes");
        responseYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responseYesActionPerformed(evt);
            }
        });

        responseNo.setText("No");
        responseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responseNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Is there anything else we can encourage you with?");

        jLabel4.setText("Where we aim to lift you up in the name of Jesus!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(responseYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(responseNo)
                        .addGap(83, 83, 83))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yourNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(encourageMe)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourNeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(encourageMe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responseYes)
                    .addComponent(responseNo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
            //Scanner object initiated
        static Scanner sc = new Scanner(System.in);
//        //String used to gague response
//        static String again;
        static String need;
        
        public String outro() {
           //Ending message
           String outro = "\n\n\n\n ~Thank You for using The Encourager. May the Lord"
                    + " bless you in Your walk with Him! ~\n";
           
           ourEncouragement.append(outro);
           
           return outro;
        }
        

    
    private void encourageMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encourageMeActionPerformed

        
        ourEncouragement.setText("Hopefully this encourages you... \n\n");
        
        yourNeed.getText();
        
//  THESE IF STATEMENT MUST GO FIRST!!!
//--- Not sure why program will not run CORRECTLY if (!yourNeed...) is first

            //Finance options we recognize for comparison
            if (yourNeed.getText().equalsIgnoreCase("money") || yourNeed.getText().equalsIgnoreCase("bills") || 
                yourNeed.getText().equalsIgnoreCase("finances") || yourNeed.getText().equalsIgnoreCase("cash") || 
                yourNeed.getText().equalsIgnoreCase("tithing") || yourNeed.getText().equalsIgnoreCase("provision")) {    
            ourEncouragement.append(Finances.finResp());
            }

            //Healing options we recognize for comparison
            if (yourNeed.getText().equalsIgnoreCase("healing") || yourNeed.getText().equalsIgnoreCase("healer") || 
                yourNeed.getText().equalsIgnoreCase("health") || yourNeed.getText().equalsIgnoreCase("sick") || 
                yourNeed.getText().equalsIgnoreCase("sickness") || yourNeed.getText().equalsIgnoreCase("doctor")) {    
            ourEncouragement.append(Healing.healResp());
            }

            //Encouragement options we recognize for comparison
            if (yourNeed.getText().equalsIgnoreCase("depression") || yourNeed.getText().equalsIgnoreCase("depressed") || 
                yourNeed.getText().equalsIgnoreCase("uplift") || yourNeed.getText().equalsIgnoreCase("uplifted") || 
                yourNeed.getText().equalsIgnoreCase("encouragement")) {    
            ourEncouragement.append(Encouragement.encResp());
            }

            //Prayer options we recognize for comparison
            if (yourNeed.getText().equalsIgnoreCase("pray") || yourNeed.getText().equalsIgnoreCase("prayer")) {    
            ourEncouragement.append(Prayer.prayResp());
            }

            //Wisdom options we recognize for comparison
            if (yourNeed.getText().equalsIgnoreCase("wisdom") || yourNeed.getText().equalsIgnoreCase("wise") || 
                yourNeed.getText().equalsIgnoreCase("proverbs") || yourNeed.getText().equalsIgnoreCase("learning") || 
                yourNeed.getText().equalsIgnoreCase("learn")) {    
            ourEncouragement.append(Wisdom.wiseResp());
            }

            //Love options we recognize for comparison
            if (yourNeed.getText().equalsIgnoreCase("love") || yourNeed.getText().equalsIgnoreCase("lust") || 
                yourNeed.getText().equalsIgnoreCase("marriage") || yourNeed.getText().equalsIgnoreCase("engagement") || 
                yourNeed.getText().equalsIgnoreCase("sex")) {    
            ourEncouragement.append(Love.loveResp());
            }
            
        //What if response isn't what I accounted for?
            //While "answer" is not equal to x AND not equal to y AND not equal to z...
            if (!yourNeed.getText().equalsIgnoreCase("money") && !yourNeed.getText().equalsIgnoreCase("bills") && 
                !yourNeed.getText().equalsIgnoreCase("finances") && !yourNeed.getText().equalsIgnoreCase("cash") && 
                !yourNeed.getText().equalsIgnoreCase("tithing") && !yourNeed.getText().equalsIgnoreCase("provision") &&
                !yourNeed.getText().equalsIgnoreCase("healing") && !yourNeed.getText().equalsIgnoreCase("healer") && 
                !yourNeed.getText().equalsIgnoreCase("health") && !yourNeed.getText().equalsIgnoreCase("sick") && 
                !yourNeed.getText().equalsIgnoreCase("sickness") && !yourNeed.getText().equalsIgnoreCase("doctor") &&
                !yourNeed.getText().equalsIgnoreCase("depression") && !yourNeed.getText().equalsIgnoreCase("depressed") && 
                !yourNeed.getText().equalsIgnoreCase("uplift") && !yourNeed.getText().equalsIgnoreCase("uplifted") && 
                !yourNeed.getText().equalsIgnoreCase("encouragement") && !yourNeed.getText().equalsIgnoreCase("depression") && 
                !yourNeed.getText().equalsIgnoreCase("depressed") && 
                !yourNeed.getText().equalsIgnoreCase("uplift") && !yourNeed.getText().equalsIgnoreCase("uplifted") && 
                !yourNeed.getText().equalsIgnoreCase("encouragement") && !yourNeed.getText().equalsIgnoreCase("pray") && 
                !yourNeed.getText().equalsIgnoreCase("prayer") && !yourNeed.getText().equalsIgnoreCase("wisdom") && 
                !yourNeed.getText().equalsIgnoreCase("wise") && !yourNeed.getText().equalsIgnoreCase("proverbs") && 
                !yourNeed.getText().equalsIgnoreCase("learning") && !yourNeed.getText().equalsIgnoreCase("learn") &&
                !yourNeed.getText().equalsIgnoreCase("love") && !yourNeed.getText().equalsIgnoreCase("lust") && 
                !yourNeed.getText().equalsIgnoreCase("marriage") && !yourNeed.getText().equalsIgnoreCase("engagement") && 
                !yourNeed.getText().equalsIgnoreCase("sex")) {
            ourEncouragement.append("Please forgive me, but I didn't understand your need...");            
            
        }
        
            outro();
            
    }//GEN-LAST:event_encourageMeActionPerformed

    private void yourNeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourNeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yourNeedActionPerformed

    private void responseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responseNoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_responseNoActionPerformed

    private void responseYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responseYesActionPerformed
        yourNeed.setText("");
        ourEncouragement.setText("");
    }//GEN-LAST:event_responseYesActionPerformed

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
            java.util.logging.Logger.getLogger(EncouragerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncouragerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncouragerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncouragerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncouragerGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton encourageMe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ourEncouragement;
    private javax.swing.JButton responseNo;
    private javax.swing.JButton responseYes;
    private javax.swing.JTextField yourNeed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}