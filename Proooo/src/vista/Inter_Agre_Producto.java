
package vista;
import funciones.func_ProdCate;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

public class Inter_Agre_Producto extends javax.swing.JInternalFrame {

    Vist_Princi obj_vist_princi;
    func_ProdCate obj_func_ProdCate;
    
    public Inter_Agre_Producto() {
        initComponents();
        //llenando categoria
        obj_vist_princi=new Vist_Princi();
        obj_func_ProdCate=new func_ProdCate();
        obj_func_ProdCate.LlenadoAlComboCategoria(combo_categoria);
        obj_func_ProdCate.LlenadoAlComboMarca(combo_marca);
        
        //llenar tabla producto....
        
        DefaultTableModel modelo=(DefaultTableModel)tabla_productos.getModel();
        obj_func_ProdCate.LlenarTablaProducto(modelo);
        tabla_productos.setModel(modelo);
        btn_Actualizar.setVisible(false);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_codigo_producto = new javax.swing.JTextField();
        txt_nombre_producto = new javax.swing.JTextField();
        txt_color_producto = new javax.swing.JTextField();
        txt_tamanio_producto = new javax.swing.JTextField();
        txt_usuario_producto = new javax.swing.JTextField();
        combo_categoria = new javax.swing.JComboBox();
        combo_marca = new javax.swing.JComboBox();
        btn_grabar_producto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion_producto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        modificar_producto = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("AGREGAR PRODUCTO");

        txt_codigo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_productoActionPerformed(evt);
            }
        });

        txt_tamanio_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tamanio_productoActionPerformed(evt);
            }
        });

        txt_usuario_producto.setEditable(false);

        combo_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_grabar_producto.setText("GRABAR");
        btn_grabar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabar_productoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Color");

        jLabel4.setText("Tamaño");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Categoria");

        jLabel7.setText("Marca");

        jLabel8.setText("Usuario");

        txt_descripcion_producto.setColumns(20);
        txt_descripcion_producto.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion_producto);

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Descripcion", "Color", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_productos.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(tabla_productos);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel9.setText("BUSCAR");

        modificar_producto.setText("MODIFICAR");
        modificar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_productoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(modificar_producto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(modificar_producto)
                .addContainerGap())
        );

        btn_Actualizar.setText("ACTUALIZAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_grabar_producto)
                        .addGap(27, 27, 27)
                        .addComponent(btn_Actualizar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(txt_codigo_producto)
                        .addComponent(txt_nombre_producto)
                        .addComponent(txt_color_producto)
                        .addComponent(txt_tamanio_producto)
                        .addComponent(combo_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_usuario_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_color_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_tamanio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(combo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_usuario_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_grabar_producto)
                            .addComponent(btn_Actualizar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_productoActionPerformed

    private void txt_tamanio_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tamanio_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tamanio_productoActionPerformed

    private void btn_grabar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabar_productoActionPerformed
        // TODO add your handling code here:
        //recuperamos datos de los campos de texto....
        String codigo=txt_codigo_producto.getText();
        String nombre=txt_nombre_producto.getText();
        String color=txt_color_producto.getText();
        String tamaño=txt_tamanio_producto.getText();
        String descripcion=txt_descripcion_producto.getText();
        String categoria=combo_categoria.getSelectedItem().toString();
        String marca=combo_marca.getSelectedItem().toString();
        String usuario=txt_usuario_producto.getText();
        // getters y setters
        //fin getters y setters
       obj_func_ProdCate.insertarProducto(codigo, nombre, descripcion, color, tamaño,categoria, usuario, marca, this);
        //System.out.println("fs "+marca+categoria );
       //Actualizar tabla productos...
       DefaultTableModel modelo=(DefaultTableModel)tabla_productos.getModel();
        obj_func_ProdCate.LlenarTablaProducto(modelo);
        tabla_productos.setModel(modelo);
        
    }//GEN-LAST:event_btn_grabar_productoActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        String valor=jTextField1.getText();
        DefaultTableModel modelo=(DefaultTableModel)tabla_productos.getModel();
        obj_func_ProdCate.LlenarBusquedaTabla(modelo,valor);
        tabla_productos.setModel(modelo);
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void modificar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_productoActionPerformed
      
        obj_func_ProdCate.LlenarLosCamposParaActualizar(tabla_productos, txt_codigo_producto, txt_nombre_producto, txt_color_producto, txt_tamanio_producto,txt_descripcion_producto);
       txt_usuario_producto.setText(obj_vist_princi.dni_usuario.getText());
        btn_Actualizar.setVisible(true);
    }//GEN-LAST:event_modificar_productoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_grabar_producto;
    private javax.swing.JComboBox combo_categoria;
    private javax.swing.JComboBox combo_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modificar_producto;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField txt_codigo_producto;
    private javax.swing.JTextField txt_color_producto;
    private javax.swing.JTextArea txt_descripcion_producto;
    private javax.swing.JTextField txt_nombre_producto;
    private javax.swing.JTextField txt_tamanio_producto;
    public javax.swing.JTextField txt_usuario_producto;
    // End of variables declaration//GEN-END:variables
}
