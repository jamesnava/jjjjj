
package vista;

import javax.swing.table.DefaultTableModel;
import funciones.func_Abast;
import funciones.func_Prove;
import java.awt.Color;
import javax.swing.JOptionPane;
import consultas.Consu_tien;

public class Inter_Agre_Abastecimiento extends javax.swing.JInternalFrame {

    func_Abast obj_func_Abast;
    DefaultTableModel modelo1;
    func_Prove obj_func_Prove;
    public Inter_Agre_Abastecimiento() {
        initComponents();
        obj_func_Prove=new func_Prove();
        obj_func_Abast=new func_Abast();
        DefaultTableModel modelo=(DefaultTableModel)tabla_ProductosBuscar.getModel();
        obj_func_Abast.LlenarTablaProductos(modelo);
        tabla_ProductosBuscar.setModel(modelo);
        // llenar el combo
        //obj_func_Abast.LlenarComboSede(comboSede);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_documentoProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sede_Abast = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

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
                "CODIGO", "PRODUCTO", "PRECIO DE COMPRA", "CANTIDAD", "IMPORTE"
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTOS SELECCIONADOS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setText("RUC PROVEEDOR: ");

        jLabel4.setText("Usuario:");

        jLabel5.setText("SEDE:");

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(boton_guia)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_documentoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sede_Abast, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_busquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jButton1)))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sede_Abast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_documentoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guia)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
       String valor=JOptionPane.showInputDialog(this,"INGRESE LA CATIDAD DE PRODUCTO!").toString();
        int valor1=0;
        try {
             valor1=Integer.parseInt(valor);
             System.out.println("valor: 00"+valor);
        obj_func_Abast.LlenarTablaEnviar(tabla_ProductosBuscar, modelo1,valor1);
       tablaEnviar.setModel(modelo1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Ingrese Solo Numeros!!");
        }
      
            
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void boton_guiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guiaActionPerformed
        String Ruc_Proveedor=txt_documentoProveedor.getText();
        
        
        if(obj_func_Prove.ComprobarProveedor(Ruc_Proveedor)){
          
        ComprobantePedido obj_ComprobantePedido=new ComprobantePedido();
         obj_func_Prove.DatosProveedorGuia(obj_ComprobantePedido.labelProvedor_razonSocial, obj_ComprobantePedido.labelProve_Ruc,obj_ComprobantePedido.labelProve_Direccion, Ruc_Proveedor);
         // llenar tabla productos....
         DefaultTableModel modeloGuia=(DefaultTableModel)obj_ComprobantePedido.tablaProductos.getModel();
         obj_func_Prove.pasarDatosEntreTabla(tablaEnviar,modeloGuia,obj_ComprobantePedido.label_totalPagar);
         obj_ComprobantePedido.labelDni.setText(labelUsuario.getText());
         obj_ComprobantePedido.labelSede.setText(Sede_Abast.getText());
         //obj_ComprobantePedido.labelSede.setText(comboSede.getSelectedItem());
         obj_ComprobantePedido.tablaProductos.setModel(modeloGuia);
         
         //llenar tabla productos.....
        
         //insertar datos empresa
            String rucTienda=obj_func_Abast.RetornarRucTienda(Sede_Abast.getText());
            obj_ComprobantePedido.LabelRucTienda.setText(rucTienda);
            obj_func_Abast.InsertarDatosEmpresa(obj_ComprobantePedido.labelTelefono,obj_ComprobantePedido.labelCorreo,Sede_Abast.getText());
          //pintar...
            obj_func_Abast.PintarLogoGuia(obj_ComprobantePedido.Label_logo_guia,rucTienda);
         //poner logo en la guia::::::::::::::::::::::
         
                            dispose();
                            obj_ComprobantePedido.setVisible(true);
                            obj_ComprobantePedido.setAlwaysOnTop(true);
        }
        else{
            JOptionPane.showMessageDialog(this,"Proveedor no Registrada, Registre Primero!");
        }
       
    }//GEN-LAST:event_boton_guiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Sede_Abast;
    public javax.swing.JButton boton_guia;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labelUsuario;
    private javax.swing.JTable tablaEnviar;
    private javax.swing.JTable tabla_ProductosBuscar;
    private javax.swing.JTextField txt_busquedaProducto;
    private javax.swing.JTextField txt_documentoProveedor;
    // End of variables declaration//GEN-END:variables
}
