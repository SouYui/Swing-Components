/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author luisangelcuriel
 */
public class BotonesDeOpciones extends javax.swing.JDialog {
    private int numeroUsuario;
    
    /**
     * Creates new form BotonesDeOpciones
     */
    public BotonesDeOpciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    private void eventoCambio(ItemEvent evt) {
        if (decimalButton.isSelected()) {
            numeroOpcion.setText(Integer.toString(numeroUsuario));
        } else if (octalButton.isSelected()) {
            numeroOpcion.setText(Integer.toOctalString(numeroUsuario));
        } else {
            numeroOpcion.setText(Integer.toHexString(numeroUsuario));
        }
        
        numeroOpcion.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        numeroOpcion = new javax.swing.JTextField();
        decimalButton = new javax.swing.JRadioButton();
        octalButton = new javax.swing.JRadioButton();
        hexadecimalButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        numeroOpcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroOpcionKeyReleased(evt);
            }
        });

        buttonGroup1.add(decimalButton);
        decimalButton.setSelected(true);
        decimalButton.setText("Decimal");
        decimalButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                decimalButtonItemStateChanged(evt);
            }
        });

        buttonGroup1.add(octalButton);
        octalButton.setText("Octal");
        octalButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                octalButtonItemStateChanged(evt);
            }
        });

        buttonGroup1.add(hexadecimalButton);
        hexadecimalButton.setText("Hexadecimal");
        hexadecimalButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hexadecimalButtonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(numeroOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(decimalButton)
                .addGap(64, 64, 64)
                .addComponent(octalButton)
                .addGap(76, 76, 76)
                .addComponent(hexadecimalButton)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(numeroOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decimalButton)
                    .addComponent(octalButton)
                    .addComponent(hexadecimalButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroOpcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroOpcionKeyReleased
        // TODO add your handling code here:
        String texto = numeroOpcion.getText();
        
        if (texto.length() > 0) {
            int opcionBase = 0;
            if (decimalButton.isSelected()) {
                opcionBase = 10;
            } else if (octalButton.isSelected()) {
                opcionBase = 8;
            } else {
                opcionBase = 16;
            }
            try{
                numeroUsuario = Integer.parseInt(texto, opcionBase);
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "Número no válido para la base", 
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                numeroOpcion.setText("0");
                decimalButton.setSelected(true);
            }
        }
    }//GEN-LAST:event_numeroOpcionKeyReleased

    private void decimalButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_decimalButtonItemStateChanged
        // TODO add your handling code here:
        eventoCambio(evt);
    }//GEN-LAST:event_decimalButtonItemStateChanged

    private void octalButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_octalButtonItemStateChanged
        // TODO add your handling code here:
        eventoCambio(evt);
    }//GEN-LAST:event_octalButtonItemStateChanged

    private void hexadecimalButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hexadecimalButtonItemStateChanged
        // TODO add your handling code here:
        eventoCambio(evt);
    }//GEN-LAST:event_hexadecimalButtonItemStateChanged

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
            java.util.logging.Logger.getLogger(BotonesDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BotonesDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BotonesDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BotonesDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BotonesDeOpciones dialog = new BotonesDeOpciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton decimalButton;
    private javax.swing.JRadioButton hexadecimalButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeroOpcion;
    private javax.swing.JRadioButton octalButton;
    // End of variables declaration//GEN-END:variables
}
