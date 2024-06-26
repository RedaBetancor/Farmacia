/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmacia;

import java.awt.Color;
import javax.swing.ButtonGroup;

/**
 *
 * @author reda
 */
public class Pedido extends javax.swing.JFrame {

    public Pedido() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        nombreMedicamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoMedicamento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cantidadProducto = new javax.swing.JTextField();
        cofarma = new javax.swing.JRadioButton();
        empsephar = new javax.swing.JRadioButton();
        cemefar = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        principal = new javax.swing.JCheckBox();
        secundaria = new javax.swing.JCheckBox();
        confirmar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        errorDistribuidor = new javax.swing.JLabel();
        errorRecogida = new javax.swing.JLabel();
        errorTipo = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        errorCantidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreMedicamentoActionPerformed(evt);
            }
        });
        nombreMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreMedicamentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreMedicamentoKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo del Medicamento");

        tipoMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo a elegir", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "antidepresivo", "Antibióticos" }));

        jLabel3.setText("Cantidad de producto");

        cantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoActionPerformed(evt);
            }
        });
        cantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadProductoKeyTyped(evt);
            }
        });

        buttonGroup2.add(cofarma);
        cofarma.setText("Cofarma");
        cofarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cofarmaActionPerformed(evt);
            }
        });

        buttonGroup2.add(empsephar);
        empsephar.setText("Empsephar");

        buttonGroup2.add(cemefar);
        cemefar.setText("Cemefar");

        jLabel4.setText("Lugar de recogida");

        principal.setText("Principal");

        secundaria.setText("Secundaria");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");

        jLabel6.setText("Distribuidor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(tipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorTipo)
                                    .addComponent(errorNombre)
                                    .addComponent(errorCantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addGap(241, 241, 241)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secundaria)
                            .addComponent(cofarma)
                            .addComponent(empsephar)
                            .addComponent(cemefar)
                            .addComponent(jLabel4)
                            .addComponent(principal)
                            .addComponent(errorDistribuidor)
                            .addComponent(errorRecogida)
                            .addComponent(jLabel6))
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(borrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cofarma)
                        .addGap(18, 18, 18)
                        .addComponent(empsephar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cemefar)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorDistribuidor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(errorTipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(principal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(secundaria))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(errorRecogida))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorCantidad)))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(borrar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMedicamentoActionPerformed

    private void cantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoActionPerformed

    private void nombreMedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreMedicamentoKeyTyped
        char c = evt.getKeyChar();
        String text = nombreMedicamento.getText();

        long digitCount = text.chars().filter(Character::isDigit).count();

        if (text.isEmpty() && c == ' ') {
            evt.consume();
            return;
        }

        if ((c == ' ' && text.length() < 50)
                || (Character.isLetter(c) && text.replace(" ", "").length() < 50)
                || (Character.isDigit(c) && digitCount < 3)) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_nombreMedicamentoKeyTyped

    private void cantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProductoKeyTyped
        String text = cantidadProducto.getText();
        char c = evt.getKeyChar();

        if (text.isEmpty() && c == '0') {
            evt.consume();
        } else {
            if (Character.isDigit(c) && text.length() < 2) {

            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_cantidadProductoKeyTyped

    private void nombreMedicamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreMedicamentoKeyReleased
        String text = nombreMedicamento.getText();

        if (text.length() > 50) {
            nombreMedicamento.setText(text.substring(0, 50));
        }
    }//GEN-LAST:event_nombreMedicamentoKeyReleased

    private void cantidadProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProductoKeyReleased
        String text = cantidadProducto.getText();

        if (text.length() > 2) {
            cantidadProducto.setText(text.substring(0, 0));
        }
    }//GEN-LAST:event_cantidadProductoKeyReleased

    private void cofarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cofarmaActionPerformed

    }//GEN-LAST:event_cofarmaActionPerformed

    private String obtenerDireccion() {
        String direccionPrincipal = "Calle de la Rosa n.28";
        String direccionSecundaria = "Calle Alcazabilla n.3";
        String mensaje = "";

        boolean principalSelected = principal.isSelected();
        boolean secundariaSelected = secundaria.isSelected();

        if (principalSelected && secundariaSelected) {
            mensaje = "Para la farmacia situada en " + direccionPrincipal + " y para la situada en " + direccionSecundaria;
        } else {
            if (principalSelected) {
                mensaje = "Para la farmacia situada en " + direccionPrincipal;
            } else {
                if (secundariaSelected) {
                    mensaje = "Para la farmacia situada en " + direccionSecundaria;
                }
            }
        }

        return mensaje;
    }


    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        boolean errores = false;

        if (tipoMedicamento.getSelectedIndex() == 0) {
            errorTipo.setText("Seleccione un tipo de medicamento");
            errorTipo.setForeground(Color.RED);
            errores = true;
        } else {
            errorTipo.setText("");
        }

        if (!principal.isSelected() && !secundaria.isSelected()) {
            errorRecogida.setText("Seleccione una dirección de envío");
            errorRecogida.setForeground(Color.RED);
            errores = true;

        } else {
            errorRecogida.setText("");
        }

        if (!cofarma.isSelected() && !empsephar.isSelected() && !cemefar.isSelected()) {
            errorDistribuidor.setText("Seleccione un distribuidor");
            errorDistribuidor.setForeground(Color.RED);
            errores = true;

        } else {
            errorDistribuidor.setText("");
        }

        if (nombreMedicamento.getText().isEmpty()) {
            errorNombre.setText("Introduzca el nombre del medicamento");
            errorNombre.setForeground(Color.RED);
            errores = true;

        } else {
            errorNombre.setText("");
        }

        if (cantidadProducto.getText().isEmpty()) {
            errorCantidad.setText("Introduzca la cantidad a pedir");
            errorCantidad.setForeground(Color.red);
            errores = true;

        } else {
            errorCantidad.setText("");
        }

        if (!errores) {
            Resumen resumen = new Resumen(this);
            String mensaje = obtenerDireccion();
            resumen.setLabelDireccion(mensaje);
            String name = nombreMedicamento.getText();
            String units = cantidadProducto.getText();
            String type = (String) tipoMedicamento.getSelectedItem();
            resumen.setlabelText(name, units, type);
            resumen.setVisible(true);
        }
    }//GEN-LAST:event_confirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JRadioButton cemefar;
    private javax.swing.JRadioButton cofarma;
    private javax.swing.JButton confirmar;
    private javax.swing.JRadioButton empsephar;
    private javax.swing.JLabel errorCantidad;
    private javax.swing.JLabel errorDistribuidor;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel errorRecogida;
    private javax.swing.JLabel errorTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreMedicamento;
    private javax.swing.JCheckBox principal;
    private javax.swing.JCheckBox secundaria;
    private javax.swing.JComboBox<String> tipoMedicamento;
    // End of variables declaration//GEN-END:variables
}
