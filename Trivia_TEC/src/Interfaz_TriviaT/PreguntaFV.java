/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz_TriviaT;
import static trivia_tec.Trivia_TEC.juego;
import trivia_tec.*;
/**
 *
 * @author Stward
 */
public class PreguntaFV extends javax.swing.JFrame {

    /**
     * Creates new form CreaPregunta
     */
    public PreguntaFV() {
        initComponents();
    }

    PreguntaFV(Trivia juego) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        contentFV = new javax.swing.JTextField();
        guardarFV = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxFV = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        respuestaFV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Formule la pregunta en el siguiente espacio en blanco");

        contentFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentFVActionPerformed(evt);
            }
        });

        guardarFV.setText("Guardar");
        guardarFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFVActionPerformed(evt);
            }
        });

        jLabel3.setText("Dificultad de la pregunta");

        jComboBoxFV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4", "Nivel 5" }));
        jComboBoxFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFVActionPerformed(evt);
            }
        });

        jLabel5.setText("Respuesta");

        respuestaFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaFVActionPerformed(evt);
            }
        });

        jLabel6.setText("Formulando pregunta de Falso o Verdadero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contentFV)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(respuestaFV, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFV, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guardarFV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(contentFV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(respuestaFV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(guardarFV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contentFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentFVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentFVActionPerformed

    private void jComboBoxFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFVActionPerformed

    private void respuestaFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaFVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaFVActionPerformed

    
    
    private void guardarFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFVActionPerformed
        
        
        String resp;//para guardar respuestaFV
        String dificultadFV;//para guardar dificultadFV de pregunta
        int vecesAc = 0;
       
        resp = respuestaFV.getText();
        
        int obtenerdifFV = jComboBoxFV.getSelectedIndex(); //conseguir el nivel de dificultadFV
        
        if (obtenerdifFV == 0){
            dificultadFV = "Nivel 1";
        }
        else if (obtenerdifFV == 1){
            dificultadFV = "Nivel 2";
        }
        else if (obtenerdifFV == 2){
            dificultadFV = "Nivel 3";
        }
        else if (obtenerdifFV == 3){
            dificultadFV = "Nivel 4";
        }
        else if (obtenerdifFV == 4){
            dificultadFV = "Nivel 5";
        };
        Pregunta nuevaP = new Pregunta(resp, obtenerdifFV, vecesAc);
    }//GEN-LAST:event_guardarFVActionPerformed

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
            java.util.logging.Logger.getLogger(PreguntaFV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreguntaFV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreguntaFV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreguntaFV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreguntaFV(juego).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contentFV;
    private javax.swing.JButton guardarFV;
    private javax.swing.JComboBox jComboBoxFV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField respuestaFV;
    // End of variables declaration//GEN-END:variables
}
