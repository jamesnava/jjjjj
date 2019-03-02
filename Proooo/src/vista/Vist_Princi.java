
package vista;

import javax.swing.JOptionPane;


public class Vist_Princi extends javax.swing.JFrame {

    
    int contador=0;
    public Vist_Princi() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        dni_usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoSede = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USUARIO:");

        jLabel2.setText("SEDE        :");

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap(1037, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dni_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CampoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(dni_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(CampoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(758, Short.MAX_VALUE))
        );
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(dni_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(CampoSede, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.darkGray));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("Tienda");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu8.setText("Tienda");

        jMenuItem4.setText("Actualizar Datos");
        jMenu8.add(jMenuItem4);

        jMenu2.add(jMenu8);

        jMenu12.setText("Sede");
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem1);

        jMenuItem2.setText("Actualizar Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem2);

        jMenuItem3.setText("Dar de Baja");
        jMenu12.add(jMenuItem3);

        jMenu2.add(jMenu12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Usuario");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem5.setText("Crear Usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Modificar Datos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Dar de Baja");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu9.setText("Productos");
        jMenu9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu10.setText("Producto");

        jMenuItem8.setText("Insertar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem8);

        jMenuItem19.setText("Precio");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem19);

        jMenu9.add(jMenu10);

        jMenu11.setText("Categoria de Producto");

        jMenuItem10.setText("Nueva");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem10);

        jMenuItem11.setText("Moficar");
        jMenu11.add(jMenuItem11);

        jMenu9.add(jMenu11);

        jMenu4.setText("Marca");

        jMenuItem12.setText("Insertar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Actualizar");
        jMenu4.add(jMenuItem13);

        jMenu9.add(jMenu4);

        jMenuBar1.add(jMenu9);

        jMenu5.setText("Proveedor");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Nuevo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Reporte");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu13.setText("Ventas");
        jMenu13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem14.setText("Factura");
        jMenu13.add(jMenuItem14);

        jMenuItem15.setText("Boleta");
        jMenu13.add(jMenuItem15);

        jMenuBar1.add(jMenu13);

        jMenu16.setText("Cliente");
        jMenu16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu16);

        jMenu17.setText("Impuesto");
        jMenu17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu17);

        jMenu7.setText("Gestion de Contraseña");
        jMenu7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem16.setText("Cambiar");
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        jMenu14.setText("Abastecimiento");
        jMenu14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem17.setText("Stock");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem17);

        jMenuItem18.setText("Abastecer");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem18);

        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
      
        Inter_Agre_Sede obj_Inter_Agre_Sede=new Inter_Agre_Sede();
       
       obj_Inter_Agre_Sede.LLenarElCombo();
        
        Escritorio.add(obj_Inter_Agre_Sede);
        obj_Inter_Agre_Sede.show();
        obj_Inter_Agre_Sede.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Sede.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Sede.getHeight()/2);
       
        
        
        
         
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Inter_Agre_Producto obj_Inter_Agre_Producto=new Inter_Agre_Producto();
                            Escritorio.add(obj_Inter_Agre_Producto);
                            obj_Inter_Agre_Producto.show();
                            obj_Inter_Agre_Producto.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Producto.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Producto.getHeight()/2);
                            obj_Inter_Agre_Producto.txt_usuario_producto.setText(dni_usuario.getText());
                            
                            
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
          Inter_Agre_Categoria obj_Inter_Agre_Categoria=new Inter_Agre_Categoria();
                            Escritorio.add(obj_Inter_Agre_Categoria);
                            obj_Inter_Agre_Categoria.show();
                            obj_Inter_Agre_Categoria.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Categoria.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Categoria.getHeight()/2);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Inter_Agre_Marca obj_Inter_Agre_Marca=new Inter_Agre_Marca();
                        Escritorio.add(obj_Inter_Agre_Marca);
                        obj_Inter_Agre_Marca.show();
                        obj_Inter_Agre_Marca.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Marca.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Marca.getHeight()/2);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         Inter_Agre_Usua obj_Inter_Agre_Usua=new Inter_Agre_Usua();
                        Escritorio.add(obj_Inter_Agre_Usua);
                        obj_Inter_Agre_Usua.show();
                        obj_Inter_Agre_Usua.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Usua.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Usua.getHeight()/2);
                        obj_Inter_Agre_Usua.btn_grabar.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        Inter_Agre_Proveedor obj_Inter_Agre_Proveedor=new Inter_Agre_Proveedor();
        Escritorio.add(obj_Inter_Agre_Proveedor);
        obj_Inter_Agre_Proveedor.show();
        obj_Inter_Agre_Proveedor.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Proveedor.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Proveedor.getHeight()/2);
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
         Inter_Agre_Proveedor obj_Inter_Agre_Proveedor=new Inter_Agre_Proveedor();
        Escritorio.add(obj_Inter_Agre_Proveedor);
        obj_Inter_Agre_Proveedor.show();
        obj_Inter_Agre_Proveedor.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Proveedor.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Proveedor.getHeight()/2);
        obj_Inter_Agre_Proveedor.btn_actualizar.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        Inter_Agre_Abastecimiento obj_Inter_Agre_Abastecimiento=new Inter_Agre_Abastecimiento();
                                    Escritorio.add(obj_Inter_Agre_Abastecimiento);
                                    obj_Inter_Agre_Abastecimiento.show();
                                    obj_Inter_Agre_Abastecimiento.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_Abastecimiento.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_Abastecimiento.getHeight()/2);
                                        obj_Inter_Agre_Abastecimiento.labelUsuario.setText(dni_usuario.getText());
                                        obj_Inter_Agre_Abastecimiento.Sede_Abast.setText(CampoSede.getText());
        
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        Inter_Agre_PrecioProducto obj_Inter_Agre_PrecioProducto=new Inter_Agre_PrecioProducto();
                                    Escritorio.add(obj_Inter_Agre_PrecioProducto);
                                    obj_Inter_Agre_PrecioProducto.show();
                                    obj_Inter_Agre_PrecioProducto.setLocation(Escritorio.getWidth()/2-obj_Inter_Agre_PrecioProducto.getWidth()/2,Escritorio.getHeight()/2-obj_Inter_Agre_PrecioProducto.getHeight()/2);
                      
        
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
   Inter_Stock obj_Inter_Stock=new Inter_Stock();
                                    Escritorio.add(obj_Inter_Stock);
                                    obj_Inter_Stock.show();
                                    obj_Inter_Stock.setLocation(0,0);
                                    obj_Inter_Stock.setSize(Escritorio.getWidth()/2, Escritorio.getHeight());
        
    }//GEN-LAST:event_jMenuItem17ActionPerformed

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
            java.util.logging.Logger.getLogger(Vist_Princi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vist_Princi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vist_Princi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vist_Princi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vist_Princi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CampoSede;
    public javax.swing.JDesktopPane Escritorio;
    public javax.swing.JLabel dni_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
