/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.java;

import com.toedter.calendar.JDateChooser;
import java.io.PrintStream;
import static java.lang.System.in;
import static java.lang.System.out;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Calendar;


/**
 *
 * @author pedro
 */
public class Horarios extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Horarios
     */
    public Horarios() {
        initComponents();
        setSize(800,600);
        setTitle("Horarios");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        calendario = new com.toedter.calendar.JCalendar();
        sair = new javax.swing.JButton();
        dataa = new javax.swing.JLabel();
        data_txt = new javax.swing.JTextField();
        medico = new javax.swing.JLabel();
        medico_txt = new javax.swing.JTextField();
        hora = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        confirmar_data = new javax.swing.JButton();
        hora_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioMouseClicked(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        dataa.setText("Data: ");

        data_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_txtActionPerformed(evt);
            }
        });

        medico.setText("Médico:");

        hora.setText("Hora: ");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        confirmar_data.setText("Confirmar Data");
        confirmar_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataa)
                            .addComponent(hora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(data_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmar_data))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hora_txt)
                                .addGap(135, 135, 135)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(confirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataa)
                    .addComponent(data_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmar_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora)
                    .addComponent(hora_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medico)
                    .addComponent(medico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sair)
                    .addComponent(confirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void data_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_txtActionPerformed
      
    }//GEN-LAST:event_data_txtActionPerformed

    private void calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseClicked
     
    }//GEN-LAST:event_calendarioMouseClicked

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
            
    try {
            Agenda_DAO dd = new Agenda_DAO();
            horarioss h = new horarioss();

            h.setData(data_txt.getText());
            h.setHora(hora_txt.getText());
            h.setMedico(medico_txt.getText());
            dd.inserir(h);

            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");

            data_txt.setText("");
            hora_txt.setText("");
            medico_txt.setText("");


        } catch (NumberFormatException exx) {
            JOptionPane.showMessageDialog(null, "Erro! Por favor preencha o formulario");
        } 
    }//GEN-LAST:event_confirmarActionPerformed

    private void confirmar_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_dataActionPerformed
        String dia = Integer.toString(calendario.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(calendario.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(calendario.getCalendar().get(Calendar.YEAR));
        String fecha = (year + "-" + mes+ "-" + dia);
        data_txt.setText(fecha);
    }//GEN-LAST:event_confirmar_dataActionPerformed

//   private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) 
//   {
//    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //DEFINE FORMATO DE DATA  
//     String data = formato.format(jCalendar1.getDate()); //CONVERTE PRA STRING  
//     data_txt.setText(data);
//      
//   }
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
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Horarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton confirmar_data;
    private javax.swing.JTextField data_txt;
    private javax.swing.JLabel dataa;
    private javax.swing.JLabel hora;
    private javax.swing.JTextField hora_txt;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel medico;
    private javax.swing.JTextField medico_txt;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
