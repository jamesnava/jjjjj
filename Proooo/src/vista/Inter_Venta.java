
package vista;

import funciones.Func_Factura;
import funciones.func_Ventas;
import funciones.func_tien;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Inter_Venta extends javax.swing.JInternalFrame {

    
    public Inter_Venta() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductoBuscar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAgregado = new javax.swing.JTable();
        txtDniCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LabelFechaC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        btn_Boleta = new javax.swing.JButton();
        btn_Proforma = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        DiaChooser = new com.toedter.components.JSpinField();
        MesChooser = new com.toedter.calendar.JMonthChooser();
        AnioChooser = new com.toedter.calendar.JYearChooser();
        jLabel3 = new javax.swing.JLabel();
        LabelVentaSede = new javax.swing.JLabel();
        btn_Factura = new javax.swing.JButton();

        setClosable(true);
        setTitle("Venta");

        jLabel1.setText("Producto");

        textBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarActionPerformed(evt);
            }
        });
        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBuscarKeyReleased(evt);
            }
        });

        TablaProductoBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRODUCTO", "PRECIO", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProductoBuscar);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaAgregado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRODUCTO", "PRECIO", "CANTIDAD", "IMPORTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaAgregado);

        jLabel2.setText("DNI                          :");

        LabelFechaC.setText("Fecha a Cancelar:");

        jLabel4.setText("Descuento %");

        btn_Boleta.setText("Boleta");
        btn_Boleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BoletaActionPerformed(evt);
            }
        });

        btn_Proforma.setText("Proforma");
        btn_Proforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProformaActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");

        jLabel3.setText("Sede:");

        btn_Factura.setText("Factura1");
        btn_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelFechaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(DiaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MesChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AnioChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(LabelVentaSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(btn_Factura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Boleta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Proforma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Limpiar)))
                        .addGap(0, 307, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(LabelVentaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelFechaC)
                                    .addComponent(DiaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AnioChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Boleta)
                            .addComponent(btn_Proforma)
                            .addComponent(btn_Limpiar)
                            .addComponent(btn_Factura))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MesChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LlenarTablaInicialmente(){
        func_Ventas obj_func_ventas=new func_Ventas();
                    String sede=LabelVentaSede.getText();
                    obj_func_ventas.llenarTablaProductoVentaInicial(TablaProductoBuscar,sede);
    }
    private void textBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarKeyPressed
       
        
        
        
    }//GEN-LAST:event_textBuscarKeyPressed

    private void textBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarActionPerformed

    private void textBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarKeyReleased
         func_Ventas obj_func_ventas=new func_Ventas();
        
        String texto=textBuscar.getText();
        String sede=LabelVentaSede.getText();
        obj_func_ventas.LlenarTablaProductoVenta(texto, TablaProductoBuscar, sede);
        
    }//GEN-LAST:event_textBuscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String cantidad=JOptionPane.showInputDialog(this,"Ingrese la Cantidad");
       func_Ventas obj_func_ventas=new func_Ventas();
       int valor=0;
       try{
           valor=Integer.parseInt(cantidad);
       }
       catch(Exception e){
           
       }
       if(valor==0){
           JOptionPane.showMessageDialog(this,"Debe Ingresar Numeros");
           
       }
       else{
           obj_func_ventas.PasarDatosEntreTablas(TablaProductoBuscar, tablaAgregado, valor);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ProformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProformaActionPerformed
        

        
    }//GEN-LAST:event_btn_ProformaActionPerformed

    private void btn_BoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BoletaActionPerformed

    private void btn_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FacturaActionPerformed
        
        Func_Factura obj_Func_Factura=new Func_Factura();
        Factura obj=new Factura();
        func_tien obj_func_tien=new func_tien();
        String sede=LabelVentaSede.getText();
        //obteniendo ruc
        String rucTiend=obj_func_tien.retornarRucTienda(sede);
        //obteniendo ruc
        String dni=txtDniCliente.getText();
        
        boolean comprobarDatos=obj_Func_Factura.InsertarDatosAFactura(dni,obj.labelRazon, obj.labelRuc,obj.labelDireccion);
        
        if(comprobarDatos){
        obj_Func_Factura.InsertarLogo(obj.logo,rucTiend);
        //insetar ruc
        obj.LabelRucTienda.setText(rucTiend);
        //insertar serie factura...
        obj.LabelSerieFactura.setText(obj_Func_Factura.RetornarSerieFactura());
        // importe total
        double importeTotal=obj_Func_Factura.importeFactura(tablaAgregado);
        // afectacion igv
        double afectacionIgv=obj_Func_Factura.AfectacionIgv(importeTotal);
        // gravada...
        double gravada=importeTotal-afectacionIgv;
        //descuento..
        double descuento=Double.parseDouble(txtDescuento.getText());
        //::::::::::::::::::::::::::insertar a factura diseño
        obj.labelGravada.setText(String.valueOf(gravada));
        obj.AfectacionIgv.setText(String.valueOf(afectacionIgv));
        obj.labelDescuento.setText(String.valueOf(descuento));
        obj.labelTotal.setText(String.valueOf(importeTotal));
        
        //::::::::::::::::::fin:::::::::::::::::::
        
        obj_Func_Factura.pasaDatosEntreTabla(tablaAgregado,obj.TablaFacturaProducto);
        obj.setVisible(true);
        obj.setAlwaysOnTop(true);
        }
        
    }//GEN-LAST:event_btn_FacturaActionPerformed
    
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JYearChooser AnioChooser;
    public com.toedter.components.JSpinField DiaChooser;
    public javax.swing.JLabel LabelFechaC;
    public javax.swing.JLabel LabelVentaSede;
    public com.toedter.calendar.JMonthChooser MesChooser;
    public javax.swing.JTable TablaProductoBuscar;
    public javax.swing.JButton btn_Boleta;
    public javax.swing.JButton btn_Factura;
    private javax.swing.JButton btn_Limpiar;
    public javax.swing.JButton btn_Proforma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAgregado;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDniCliente;
    // End of variables declaration//GEN-END:variables
}
