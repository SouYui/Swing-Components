/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import udemy.poo.codigo.BotonesDeOpciones;
import udemy.poo.codigo.CasillaDeVerificacion;
import udemy.poo.codigo.DialogoImagen;
import udemy.poo.codigo.FondoImagen;
import udemy.poo.codigo.ListaDesplegables;
import udemy.poo.codigo.ListaModelo;
import udemy.poo.codigo.Listas;
import udemy.poo.codigo.Tabla;
import udemy.poo.codigo.tabDialog;

/**
 *
 * @author luisangelcuriel
 */
public class Inicio extends javax.swing.JFrame {
    private Timer reloj;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTitle("Programación con Swing - Componentes");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e); //To change body of generated methods, choose Tools | Templates.
                tiempo();
            }
        });
        ActionListener alarma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempo();
            }
        };
        reloj = new Timer(1000, alarma);
        reloj.start();
    }
    
    private void tiempo(){
        Date hora = new Date();
        String patron = "hh:mm:ss";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        tiempo.setText(formato.format(hora));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoImagen(this);
        tiempo = new javax.swing.JLabel();
        messageDialog = new javax.swing.JButton();
        confirmDialog = new javax.swing.JButton();
        inputDIalog = new javax.swing.JButton();
        inputDIalogDos = new javax.swing.JButton();
        jDialogButton = new javax.swing.JButton();
        casillasVerificacionButton = new javax.swing.JButton();
        botonesOpciones = new javax.swing.JButton();
        listasButton = new javax.swing.JButton();
        listaModelo = new javax.swing.JButton();
        listaDesplegable = new javax.swing.JButton();
        tabButton = new javax.swing.JButton();
        tablaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tiempo.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        messageDialog.setText("MessageDialog");
        messageDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageDialogActionPerformed(evt);
            }
        });

        confirmDialog.setText("ConfirmDialog");
        confirmDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDialogActionPerformed(evt);
            }
        });

        inputDIalog.setText("InputDialog");
        inputDIalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDIalogActionPerformed(evt);
            }
        });

        inputDIalogDos.setText("InputDialogDos");
        inputDIalogDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDIalogDosActionPerformed(evt);
            }
        });

        jDialogButton.setText("JDialog");
        jDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDialogButtonActionPerformed(evt);
            }
        });

        casillasVerificacionButton.setText("Casillas de Verificación");
        casillasVerificacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillasVerificacionButtonActionPerformed(evt);
            }
        });

        botonesOpciones.setText("Botones de Opciones");
        botonesOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonesOpcionesActionPerformed(evt);
            }
        });

        listasButton.setText("Listas");
        listasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listasButtonActionPerformed(evt);
            }
        });

        listaModelo.setText("Lista Modelo");
        listaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaModeloActionPerformed(evt);
            }
        });

        listaDesplegable.setText("Lista Desplegable");
        listaDesplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDesplegableActionPerformed(evt);
            }
        });

        tabButton.setText("Pestañas");
        tabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabButtonActionPerformed(evt);
            }
        });

        tablaButton.setText("Tabla");
        tablaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(messageDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputDIalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputDIalogDos, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jDialogButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casillasVerificacionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonesOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(listasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaDesplegable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tiempo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageDialog)
                    .addComponent(botonesOpciones))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmDialog)
                    .addComponent(listasButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDIalog)
                    .addComponent(listaModelo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDIalogDos)
                    .addComponent(listaDesplegable))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDialogButton)
                    .addComponent(tabButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casillasVerificacionButton)
                    .addComponent(tablaButton))
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void messageDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageDialogActionPerformed
        // TODO add your handling code here:
        Image imagen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/udemy/poo/recursos/icono.png"));
        JOptionPane.showMessageDialog(rootPane, "Contenido del mensaje", "Título del panel", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(imagen));
    }//GEN-LAST:event_messageDialogActionPerformed

    private void confirmDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDialogActionPerformed
        // TODO add your handling code here:
        Image imagen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/udemy/poo/recursos/icono.png"));
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Te gusta programar?", 
                "Pregunta de programación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(imagen));
        
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Excelente, sabes de la vida", 
                    "Título de respuesta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "¿Al menos lo has intentado?", 
                    "Título de respuesta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmDialogActionPerformed

    private void inputDIalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDIalogActionPerformed
        // TODO add your handling code here:
        Image imagen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/udemy/poo/recursos/icono.png"));
        String clave = JOptionPane.showInputDialog(rootPane, "Digite su nombre: ","Nombre del usuario" , JOptionPane.QUESTION_MESSAGE);
        
        if (clave == null || clave.isEmpty() || clave.regionMatches(0, " ", 0, 1)) {
            JOptionPane.showMessageDialog(rootPane, "Escribe algo", 
                    "Título de respuesta", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(imagen));
        } else {
            JOptionPane.showMessageDialog(rootPane, clave, 
                    "Título de respuesta", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(imagen));
        }
    }//GEN-LAST:event_inputDIalogActionPerformed

    private void inputDIalogDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDIalogDosActionPerformed
        // TODO add your handling code here:
        Object[] lenguuajes = {"Java", "C#", "PHP", "Python", "JavaScript", "C++"};
        Image imagen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/udemy/poo/recursos/icono.png"));
        
        String lenguaje = (String) JOptionPane.showInputDialog(rootPane, "¿Qué lenguaje te gusta?", 
                "Lenguajes", JOptionPane.QUESTION_MESSAGE, new ImageIcon(imagen), lenguuajes, lenguuajes[0]);
        JOptionPane.showMessageDialog(rootPane, lenguaje, "Lenguaje seleccionado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_inputDIalogDosActionPerformed

    private void jDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDialogButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoImagen dialog = new DialogoImagen(new javax.swing.JFrame(), false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_jDialogButtonActionPerformed

    private void casillasVerificacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillasVerificacionButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CasillaDeVerificacion dialog = new CasillaDeVerificacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_casillasVerificacionButtonActionPerformed

    private void botonesOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonesOpcionesActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BotonesDeOpciones dialog = new BotonesDeOpciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_botonesOpcionesActionPerformed

    private void listasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listasButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Listas dialog = new Listas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_listasButtonActionPerformed

    private void listaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaModeloActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaModelo dialog = new ListaModelo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_listaModeloActionPerformed

    private void listaDesplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDesplegableActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaDesplegables dialog = new ListaDesplegables(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_listaDesplegableActionPerformed

    private void tabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tabDialog dialog = new tabDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_tabButtonActionPerformed

    private void tablaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tabla dialog = new Tabla(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_tablaButtonActionPerformed

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
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonesOpciones;
    private javax.swing.JButton casillasVerificacionButton;
    private javax.swing.JButton confirmDialog;
    private javax.swing.JButton inputDIalog;
    private javax.swing.JButton inputDIalogDos;
    private javax.swing.JButton jDialogButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listaDesplegable;
    private javax.swing.JButton listaModelo;
    private javax.swing.JButton listasButton;
    private javax.swing.JButton messageDialog;
    private javax.swing.JButton tabButton;
    private javax.swing.JButton tablaButton;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
