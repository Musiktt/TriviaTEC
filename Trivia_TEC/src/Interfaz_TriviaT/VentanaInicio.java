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
 * @author Gabriel
 */

public class VentanaInicio extends javax.swing.JFrame {

    
    /**
     * Creates new form Interfaz_TriviaTec
     * @param juego */
    public VentanaInicio(Trivia juego) {
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
        bNuevaPartida = new javax.swing.JButton();
        bGestionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("TRIVIA - TEC");

        bNuevaPartida.setText("Nueva Partida");
        bNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevaPartidaActionPerformed(evt);
            }
        });

        bGestionar.setText("Gestionar");
        bGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGestionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(bNuevaPartida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(bGestionar)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(bNuevaPartida)
                .addGap(18, 18, 18)
                .addComponent(bGestionar)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGestionarActionPerformed
        // TODO add your handling code here:
        VentanaLogProfesor LogProf = new VentanaLogProfesor(juego);
        LogProf.show();
    }//GEN-LAST:event_bGestionarActionPerformed

    
    private void bNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevaPartidaActionPerformed
        // TODO add your handling code here:
        VentanaParticipantes participantes = new VentanaParticipantes(juego);
        
        this.hide();
        participantes.show();
        
    }//GEN-LAST:event_bNuevaPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio(juego).setVisible(true);
            }
        });
        Profesor profe1 = new Profesor("Lorena", "1-234-567", "lvalerio@itcr.ac.cr", "123456", "01/10/2014");
        juego.agregarProfesor(profe1);
        Curso curso1 = new Curso("Programación Orientada a Objetos", "IC2101", 30, 2, 2014, profe1);
        juego.agregarCurso(curso1);
        Estudiante est1 = new Estudiante(2014012861, "Gabriel", "2-123-123", "gabrielrojas_a", "123", "10/10/2014");
        juego.agregarEstudiante(est1, curso1);
        Estudiante est2 = new Estudiante(2014012345, "Stward", "2-123-123", "musiktt", "123", "10/10/2014");
        juego.agregarEstudiante(est2, curso1);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGestionar;
    private javax.swing.JButton bNuevaPartida;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
