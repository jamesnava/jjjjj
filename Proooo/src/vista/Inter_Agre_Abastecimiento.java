
package vista;

import javax.swing.table.DefaultTableModel;
import funciones.func_Abast;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Inter_Agre_Abastecimiento extends javax.swing.JInternalFrame {

    func_Abast obj_func_Abast;
    DefaultTableModel modelo1;
    public Inter_Agre_Abastecimiento() {
        initComponents();
        obj_func_Abast=new func_Abast();
        DefaultTableModel modelo=(DefaultTableModel)tabla_ProductosBuscar.getModel();
        obj_func_Abast.LlenarTablaProductos(modelo);
        tabla_ProductosBuscar.setModel(modelo);
        // tabla
        modelo1=(DefaultTableModel)tablaEnviar.getModel();
        modelo1.setRowCount(0);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_busquedaProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ProductosBuscar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEnviar = new javax.swing.JTable();
        boton_guia = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_documentoProveedor = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("PRODUCTO:");

        txt_busquedaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_busquedaProductoMouseClicked(evt);
            }
        });
        txt_busquedaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaProductoActionPerformed(evt);
            }
        });
        txt_busquedaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busquedaProductoKeyPressed(evt);
            }
        });

        tabla_ProductosBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "PRODUCTO", "PRECIO DE COMPRA", "PRECIO DE VENTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_ProductosBuscar);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaEnviar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "PRODUCTO", "PRECIO DE COMPRA", "CATIDAD", "IMPORTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEnviar);

        boton_guia.setText("Ver Guia");
        boton_guia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guiaActionPerformed(evt);
            }
        });

        jButton3.setText("LIMPIAR");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTOS SELECCIONADOS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setText("DNI PROVEEDOR: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 423, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(411, 411, 411))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_busquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(boton_guia)
                        .addGap(89, 89, 89)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_documentoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_busquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_documentoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guia)
                    .addComponent(jButton3))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busquedaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaProductoActionPerformed
        // buscador...
        
    }//GEN-LAST:event_txt_busquedaProductoActionPerformed

    private void txt_busquedaProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaProductoKeyPressed
        // buscador...
       String nombre= txt_busquedaProducto.getText();
       DefaultTableModel modelo=(DefaultTableModel)tabla_ProductosBuscar.getModel();
        obj_func_Abast.BusquedaKeyPressed(nombre, modelo);
        tabla_ProductosBuscar.setModel(modelo);
        
    }//GEN-LAST:event_txt_busquedaProductoKeyPressed

    private void txt_busquedaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_busquedaProductoMouseClicked
        // TODO add your handling code here:
        txt_busquedaProducto.setText("");
    }//GEN-LAST:event_txt_busquedaProductoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String valor=JOptionPane.showInputDialog("INGRESE LA CATIDAD DE PRODUCTO!");
        obj_func_Abast.LlenarTablaEnviar(tabla_ProductosBuscar, modelo1,Integer.parseInt(valor));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_guiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guiaActionPerformed
        
        ComprobantePedido obj_ComprobantePedido=new ComprobantePedido();
                            obj_ComprobantePedido.setVisible(true);
       
    }//GEN-LAST:event_boton_guiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_guia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEnviar;
    private javax.swing.JTable tabla_ProductosBuscar;
    private javax.swing.JTextField txt_busquedaProducto;
    private javax.swing.JTextField txt_documentoProveedor;
    // End of variables declaration//GEN-END:variables
}
