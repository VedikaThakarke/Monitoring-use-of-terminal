/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Shivraj
 */
public class ModulesSelect extends javax.swing.JFrame {

    public String data1,data2,data3,data4,data5;
    
    public ModulesSelect() {
        initComponents();
        ProcessDisplay();
        disableInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pent = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a1t = new javax.swing.JToggleButton();
        a2 = new javax.swing.JTextField();
        a2t = new javax.swing.JToggleButton();
        a3 = new javax.swing.JTextField();
        a3t = new javax.swing.JToggleButton();
        a4t = new javax.swing.JToggleButton();
        a4 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        a5t = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        current_process = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        browsert = new javax.swing.JToggleButton();

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ON MODULES ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Browser Detection");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Pendrive Detection");

        pent.setText("ON/OFF");
        pent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pentItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Application Name :-");

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a1t.setText("ON/OFF");
        a1t.setToolTipText("");
        a1t.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a1tItemStateChanged(evt);
            }
        });

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a2t.setText("ON/OFF");
        a2t.setToolTipText("");
        a2t.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a2tItemStateChanged(evt);
            }
        });

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a3t.setText("ON/OFF");
        a3t.setToolTipText("");
        a3t.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a3tItemStateChanged(evt);
            }
        });

        a4t.setText("ON/OFF");
        a4t.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a4tItemStateChanged(evt);
            }
        });

        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a5t.setText("ON/OFF");
        a5t.setToolTipText("");
        a5t.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a5tItemStateChanged(evt);
            }
        });

        current_process.setEditable(false);
        current_process.setColumns(20);
        current_process.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        current_process.setRows(5);
        jScrollPane1.setViewportView(current_process);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Current Processes :-");

        browsert.setText("ON/OFF");
        browsert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                browsertItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a3t, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2t, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a4t, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a5t, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pent, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1t, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(browsert, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(141, 389, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a4t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pentItemStateChanged
        // TODO add your handling code here:
        if(pent.isSelected())
        {
             pent.setText("ON");
        ServerConstants.pendrivedetect = true;
        }
//        else
//        {
//            pent.setText("OFF");
//        }
    }//GEN-LAST:event_pentItemStateChanged

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a1tItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a1tItemStateChanged
        // TODO add your handling code here:

         if(a1t.isSelected())
        {
             a1t.setText("ON");
             a2.setEnabled(true);
        data1 = a1.getText().toLowerCase();
       // data1.toLowerCase();
        
        ServerConstants.startapp1 = data1;
        ServerConstants.appdetect1 = true;
        }
//        else
//        {
//            a1t.setText("OFF");
//        }
       
    }//GEN-LAST:event_a1tItemStateChanged

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a2tItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a2tItemStateChanged
        // TODO add your handling code here:
        
         if(a2t.isSelected())
        {
             a2t.setText("ON");
             a3.setEnabled(true);
        data2 = a2.getText().toLowerCase();;
       //  data2.toLowerCase();
        ServerConstants.startapp2 = data2;
        ServerConstants.appdetect2 = true;
        }
//        else
//        {
//            a2t.setText("OFF");
//        }
    }//GEN-LAST:event_a2tItemStateChanged

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void a3tItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a3tItemStateChanged
        // TODO add your handling code here:
        
            if(a3t.isSelected())
        {
            a3t.setText("ON");
            a4.setEnabled(true);
            data3 = a3.getText().toLowerCase();
         //    data3.toLowerCase();
            ServerConstants.startapp3 = data3;
            ServerConstants.appdetect3 = true;
        }
//            else
//        {
//              a3t.setText("OFF");
//        }

    }//GEN-LAST:event_a3tItemStateChanged

    private void a4tItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a4tItemStateChanged
        // TODO add your handling code here:

         if(a4t.isSelected())
        {
        a4t.setText("ON");
        a5.setEnabled(true);
        data4 = a4.getText().toLowerCase();
      //   data4.toLowerCase();
        ServerConstants.startapp4 = data4;
        ServerConstants.appdetect4 = true;
        }
//        else
//        {
//            a4t.setText("OFF");
//        }

    }//GEN-LAST:event_a4tItemStateChanged

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void a5tItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a5tItemStateChanged
        // TODO add your handling code here:
        
         if(a5t.isSelected())
        { 
        a5t.setText("ON");
         data5 = a5.getText().toLowerCase();
     //     data5.toLowerCase();
         ServerConstants.startapp5 = data5;
         ServerConstants.appdetect5 = true;
        }
//        else
//        {
//            a5t.setText("OFF");
//        }
    }//GEN-LAST:event_a5tItemStateChanged

    private void browsertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_browsertItemStateChanged
        // TODO add your handling code here:
        
        if(browsert.isSelected())
        {
                browsert.setText("ON");
                ServerConstants.internetexp = true;
                ServerConstants.chrome = true;
                ServerConstants.mozilla = true;
                ServerConstants.ucbrowser = true;
                
        }
        
    }//GEN-LAST:event_browsertItemStateChanged

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
            java.util.logging.Logger.getLogger(ModulesSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModulesSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModulesSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModulesSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModulesSelect().setVisible(true);
            }
        });
    }
    public void ProcessDisplay()
    {
        try 
        {
            String line;
            Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe /fo csv /nh");
            BufferedReader input =
            new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) 
            {
               // System.out.println(line); //<-- Parse data here.
                current_process.append(line+"\n");
            }
            input.close();
        } 
        catch (Exception err) 
        {
            err.printStackTrace();
        }
    }
    public void disableInit()
    {
        
        a2.setEnabled(false);
        a3.setEnabled(false);
        a4.setEnabled(false);
        a5.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JToggleButton a1t;
    private javax.swing.JTextField a2;
    private javax.swing.JToggleButton a2t;
    private javax.swing.JTextField a3;
    private javax.swing.JToggleButton a3t;
    private javax.swing.JTextField a4;
    private javax.swing.JToggleButton a4t;
    private javax.swing.JTextField a5;
    private javax.swing.JToggleButton a5t;
    private javax.swing.JToggleButton browsert;
    private javax.swing.JTextArea current_process;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton pent;
    // End of variables declaration//GEN-END:variables
}
