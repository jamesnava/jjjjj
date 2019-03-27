package vista;

import javafx.scene.paint.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.plaf.metal.MetalBorders;

public class Vist_Princi extends javax.swing.JFrame {

    int contador = 0;
  

    public Vist_Princi() {
        initComponents();
        
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //MenuTienda.setBorder(BorderFactory.createLineBorder(Color.RED,10));
        
        MenuDeuda.setBorder(BorderFactory.createCompoundBorder(MenuDeuda.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuSesion.setBorder(BorderFactory.createCompoundBorder(MenuSesion.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuTienda.setBorder(BorderFactory.createCompoundBorder(MenuTienda.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuUsuario.setBorder(BorderFactory.createCompoundBorder(MenuUsuario.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuProducto.setBorder(BorderFactory.createCompoundBorder(MenuProducto.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuProveedor.setBorder(BorderFactory.createCompoundBorder(MenuProveedor.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuReporte.setBorder(BorderFactory.createCompoundBorder(MenuReporte.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuVentas.setBorder(BorderFactory.createCompoundBorder(MenuVentas.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuCliente.setBorder(BorderFactory.createCompoundBorder(MenuCliente.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuImpuesto.setBorder(BorderFactory.createCompoundBorder(MenuImpuesto.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        //MenuContrasenia.setBorder(BorderFactory.createCompoundBorder(MenuContrasenia.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        MenuAbastecimiento.setBorder(BorderFactory.createCompoundBorder(MenuAbastecimiento.getBorder(),BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        dni_usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoSede = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuSesion = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        MenuTienda = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        MenuReporte = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        MenuFactura = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        MenuImpuesto = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        MenuAbastecimiento = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        MenuDeuda = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel PRINCIPAL");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        Escritorio.setPreferredSize(new java.awt.Dimension(1300, 868));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO:");

        dni_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("SEDE        :");

        CampoSede.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        labelImagen.setText("jLabel3");
        labelImagen.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dni_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1086, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CampoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(dni_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(614, Short.MAX_VALUE))
        );
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(dni_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(CampoSede, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(labelImagen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MenuBar.setBackground(new java.awt.Color(153, 153, 255));
        MenuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        MenuBar.setAlignmentX(1.0F);
        MenuBar.setBorderPainted(false);
        MenuBar.setMargin(new java.awt.Insets(0, 10, 0, 0));

        MenuSesion.setBackground(new java.awt.Color(153, 153, 255));
        MenuSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuSesion.setText("Sesion");
        MenuSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem11.setText("Salir");
        MenuSesion.add(jMenuItem11);

        jMenuItem13.setText("Cerrar Sesion");
        MenuSesion.add(jMenuItem13);

        MenuBar.add(MenuSesion);

        MenuTienda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuTienda.setIcon(new ImageIcon(getClass().getClassLoader().getResource("tienda.png")));
        MenuTienda.setText("Tienda");
        MenuTienda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu8.setIcon(new ImageIcon(getClass().getClassLoader().getResource("tiendaN.png")));
        jMenu8.setText("Tienda");

        jMenuItem4.setText("Actualizar Datos");
        jMenu8.add(jMenuItem4);

        MenuTienda.add(jMenu8);

        jMenu12.setIcon(new ImageIcon(getClass().getClassLoader().getResource("sedeN.png")));
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

        MenuTienda.add(jMenu12);

        MenuBar.add(MenuTienda);

        MenuUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuUsuario.setIcon(new ImageIcon(getClass().getClassLoader().getResource("usuarioP.png")));
        MenuUsuario.setText("Usuario");
        MenuUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem5.setBackground(new java.awt.Color(0, 0, 255));
        jMenuItem5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("agreUsuario.png")));
        jMenuItem5.setText("Crear Usuario");
        jMenuItem5.setMargin(new java.awt.Insets(2, 2, 5, 2));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuUsuario.add(jMenuItem5);

        jMenuItem7.setText("Dar de Baja");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MenuUsuario.add(jMenuItem7);

        jMenuItem16.setIcon(new ImageIcon(getClass().getClassLoader().getResource("CambiarContraseña.png")));
        jMenuItem16.setText("Cambiar Contraseña");
        MenuUsuario.add(jMenuItem16);

        MenuBar.add(MenuUsuario);

        MenuProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuProducto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Producto.png")));
        MenuProducto.setText("Productos");
        MenuProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu10.setIcon(new ImageIcon(getClass().getClassLoader().getResource("productoN.png")));
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

        MenuProducto.add(jMenu10);

        jMenu11.setText("Categoria de Producto");

        jMenuItem10.setText("Nueva");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem10);

        MenuProducto.add(jMenu11);

        jMenu4.setText("Marca");

        jMenuItem12.setText("Insertar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        MenuProducto.add(jMenu4);

        MenuBar.add(MenuProducto);

        MenuProveedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuProveedor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ProveedorP.png")));
        MenuProveedor.setText("Proveedor");
        MenuProveedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MenuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedorActionPerformed(evt);
            }
        });

        jMenuItem9.setIcon(new ImageIcon(getClass().getClassLoader().getResource("agregarProveedor.png")));
        jMenuItem9.setText("Nuevo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        MenuProveedor.add(jMenuItem9);

        MenuBar.add(MenuProveedor);

        MenuReporte.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuReporte.setIcon(new ImageIcon(getClass().getClassLoader().getResource("reporte.png")));
        MenuReporte.setText("Reporte");
        MenuReporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu1.setText("Ventas");
        MenuReporte.add(jMenu1);

        jMenu15.setText("Producto");
        MenuReporte.add(jMenu15);

        jMenu18.setText("Deuda");

        jMenuItem21.setText("Deudores");
        jMenu18.add(jMenuItem21);

        MenuReporte.add(jMenu18);

        MenuBar.add(MenuReporte);

        MenuVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuVentas.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ventas.png")));
        MenuVentas.setText("Ventas");
        MenuVentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        MenuFactura.setIcon(new ImageIcon(getClass().getClassLoader().getResource("facturacion.png")));
        MenuFactura.setText("Factura");
        MenuFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFacturaActionPerformed(evt);
            }
        });
        MenuVentas.add(MenuFactura);

        jMenuItem15.setText("Boleta");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        MenuVentas.add(jMenuItem15);

        jMenuItem20.setText("A Credito");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        MenuVentas.add(jMenuItem20);

        MenuBar.add(MenuVentas);

        MenuCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuCliente.setIcon(new ImageIcon(getClass().getClassLoader().getResource("cliente.png")));
        MenuCliente.setText("Cliente");
        MenuCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem23.setText("Nuevo");
        MenuCliente.add(jMenuItem23);

        MenuBar.add(MenuCliente);

        MenuImpuesto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuImpuesto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("impuesto.png")));
        MenuImpuesto.setText("Impuesto");
        MenuImpuesto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem22.setText("IGV");
        MenuImpuesto.add(jMenuItem22);

        MenuBar.add(MenuImpuesto);

        MenuAbastecimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        MenuAbastecimiento.setIcon(new ImageIcon(getClass().getClassLoader().getResource("abastecer.png")));
        MenuAbastecimiento.setText("Abastecimiento");
        MenuAbastecimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem17.setText("Stock");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        MenuAbastecimiento.add(jMenuItem17);

        jMenuItem18.setText("Abastecer");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        MenuAbastecimiento.add(jMenuItem18);

        MenuBar.add(MenuAbastecimiento);

        MenuDeuda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 2, new java.awt.Color(0, 0, 0)));
        MenuDeuda.setIcon(new ImageIcon(getClass().getClassLoader().getResource("deudor.png")));
        MenuDeuda.setText("Deuda");
        MenuDeuda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem24.setText("Pagar");
        MenuDeuda.add(jMenuItem24);

        MenuBar.add(MenuDeuda);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        Inter_Agre_Sede obj_Inter_Agre_Sede = new Inter_Agre_Sede();

        obj_Inter_Agre_Sede.LLenarElCombo();

        Escritorio.add(obj_Inter_Agre_Sede);
        obj_Inter_Agre_Sede.show();
        obj_Inter_Agre_Sede.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Sede.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Sede.getHeight() / 2);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Inter_Agre_Producto obj_Inter_Agre_Producto = new Inter_Agre_Producto();
        Escritorio.add(obj_Inter_Agre_Producto);
        obj_Inter_Agre_Producto.show();
        obj_Inter_Agre_Producto.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Producto.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Producto.getHeight() / 2);
        obj_Inter_Agre_Producto.txt_usuario_producto.setText(dni_usuario.getText());


    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Inter_Agre_Categoria obj_Inter_Agre_Categoria = new Inter_Agre_Categoria();
        Escritorio.add(obj_Inter_Agre_Categoria);
        obj_Inter_Agre_Categoria.show();
        obj_Inter_Agre_Categoria.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Categoria.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Categoria.getHeight() / 2);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Inter_Agre_Marca obj_Inter_Agre_Marca = new Inter_Agre_Marca();
        Escritorio.add(obj_Inter_Agre_Marca);
        obj_Inter_Agre_Marca.show();
        obj_Inter_Agre_Marca.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Marca.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Marca.getHeight() / 2);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Inter_Agre_Usua obj_Inter_Agre_Usua = new Inter_Agre_Usua();
        Escritorio.add(obj_Inter_Agre_Usua);
        obj_Inter_Agre_Usua.show();
        obj_Inter_Agre_Usua.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Usua.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Usua.getHeight() / 2);
        obj_Inter_Agre_Usua.btn_grabar.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MenuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedorActionPerformed
        Inter_Agre_Proveedor obj_Inter_Agre_Proveedor = new Inter_Agre_Proveedor();
        Escritorio.add(obj_Inter_Agre_Proveedor);
        obj_Inter_Agre_Proveedor.show();
        obj_Inter_Agre_Proveedor.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Proveedor.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Proveedor.getHeight() / 2);

    }//GEN-LAST:event_MenuProveedorActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Inter_Agre_Proveedor obj_Inter_Agre_Proveedor = new Inter_Agre_Proveedor();
        Escritorio.add(obj_Inter_Agre_Proveedor);
        obj_Inter_Agre_Proveedor.show();
        obj_Inter_Agre_Proveedor.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Proveedor.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Proveedor.getHeight() / 2);
        obj_Inter_Agre_Proveedor.btn_actualizar.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        Inter_Agre_Abastecimiento obj_Inter_Agre_Abastecimiento = new Inter_Agre_Abastecimiento();
        Escritorio.add(obj_Inter_Agre_Abastecimiento);
        obj_Inter_Agre_Abastecimiento.show();
        obj_Inter_Agre_Abastecimiento.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_Abastecimiento.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_Abastecimiento.getHeight() / 2);
        obj_Inter_Agre_Abastecimiento.labelUsuario.setText(dni_usuario.getText());
        obj_Inter_Agre_Abastecimiento.Sede_Abast.setText(CampoSede.getText());
        

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        Inter_Agre_PrecioProducto obj_Inter_Agre_PrecioProducto = new Inter_Agre_PrecioProducto();
        Escritorio.add(obj_Inter_Agre_PrecioProducto);
        obj_Inter_Agre_PrecioProducto.show();
        obj_Inter_Agre_PrecioProducto.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Agre_PrecioProducto.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Agre_PrecioProducto.getHeight() / 2);


    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        Inter_Stock obj_Inter_Stock = new Inter_Stock();
        Escritorio.add(obj_Inter_Stock);
        obj_Inter_Stock.show();
        obj_Inter_Stock.setLocation(0, 0);
        obj_Inter_Stock.setSize(Escritorio.getWidth() / 2, Escritorio.getHeight());
        String sede=CampoSede.getText();
        
        obj_Inter_Stock.LabelSede.setText(sede);
        System.out.println("valor "+sede);
        obj_Inter_Stock.llenarStock();

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void MenuFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFacturaActionPerformed
       Inter_Venta obj_Inter_Venta = new Inter_Venta();
        Escritorio.add(obj_Inter_Venta);
        obj_Inter_Venta.show();
        obj_Inter_Venta.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Venta.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Venta.getHeight() / 2);
        obj_Inter_Venta.btn_Factura.setVisible(true);
        obj_Inter_Venta.btn_Boleta.setVisible(false);
        obj_Inter_Venta.btn_Proforma.setVisible(false);
        obj_Inter_Venta.LabelFechaC.setVisible(false);
        obj_Inter_Venta.DiaChooser.setVisible(false);
       // obj_Inter_Venta.MesChooser.setVisible(false);
        obj_Inter_Venta.AnioChooser.setVisible(false);
        //obj_Inter_Venta.labelUsuario.setText(dni_usuario.getText());
        //obj_Inter_Agre_Abastecimiento.Sede_Abast.setText(CampoSede.getText());
        obj_Inter_Venta.LabelVentaSede.setText(CampoSede.getText());
        //llenatar tabla inicialmente...
        obj_Inter_Venta.LlenarTablaInicialmente();
       
    }//GEN-LAST:event_MenuFacturaActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Inter_Venta obj_Inter_Venta = new Inter_Venta();
        Escritorio.add(obj_Inter_Venta);
        obj_Inter_Venta.show();
        obj_Inter_Venta.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Venta.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Venta.getHeight() / 2);
        obj_Inter_Venta.btn_Boleta.setVisible(true);
        obj_Inter_Venta.btn_Factura.setVisible(false);
        obj_Inter_Venta.btn_Proforma.setVisible(false);
        obj_Inter_Venta.LabelFechaC.setVisible(false);
        obj_Inter_Venta.DiaChooser.setVisible(false);
        //obj_Inter_Venta.MesChooser.setVisible(false);
        obj_Inter_Venta.AnioChooser.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
           Inter_Venta obj_Inter_Venta = new Inter_Venta();
        Escritorio.add(obj_Inter_Venta);
        obj_Inter_Venta.show();
        obj_Inter_Venta.setLocation(Escritorio.getWidth() / 2 - obj_Inter_Venta.getWidth() / 2, Escritorio.getHeight() / 2 - obj_Inter_Venta.getHeight() / 2);
        obj_Inter_Venta.btn_Boleta.setVisible(false);
        obj_Inter_Venta.btn_Factura.setVisible(false);
        obj_Inter_Venta.btn_Proforma.setVisible(true);
        obj_Inter_Venta.LabelFechaC.setVisible(true);
        obj_Inter_Venta.DiaChooser.setVisible(true);
        //obj_Inter_Venta.MesChooser.setVisible(true);
        obj_Inter_Venta.AnioChooser.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
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
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vist_Princi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CampoSede;
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu MenuAbastecimiento;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuDeuda;
    private javax.swing.JMenuItem MenuFactura;
    private javax.swing.JMenu MenuImpuesto;
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JMenu MenuProveedor;
    private javax.swing.JMenu MenuReporte;
    private javax.swing.JMenu MenuSesion;
    private javax.swing.JMenu MenuTienda;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenu MenuVentas;
    public javax.swing.JLabel dni_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JLabel labelImagen;
    // End of variables declaration//GEN-END:variables
}
