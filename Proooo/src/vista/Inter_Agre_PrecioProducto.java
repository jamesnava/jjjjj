
package vista;
import funciones.func_ProdCate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import consultas.Consu_ProdCate;
import javax.swing.JOptionPane;

public class Inter_Agre_PrecioProducto extends javax.swing.JInternalFrame {
        func_ProdCate obj_func_ProdCate;
        Calendar fecha;
        Consu_ProdCate obj_Consu_ProdCate;
  
    public Inter_Agre_PrecioProducto() {
        initComponents();
        obj_Consu_ProdCate=new Consu_ProdCate();
       obj_func_ProdCate=new func_ProdCate();
       obj_func_ProdCate.llenarComboProductoPrecio(comboProducto);
       fecha=new GregorianCalendar();
       String dia=Integer.toString(fecha.get(Calendar.DATE));
       String mes=Integer.toString(fecha.get(Calendar.MONTH)+1);
       String anio=Integer.toString(fecha.get(Calendar.YEAR));
       txt_fecha.setText(dia+"/"+mes+"/"+anio);
       txt_fecha.setEnabled(false);
       // llenado el codigo
       int n=obj_Consu_ProdCate.RetornarIdUltimoPrecio()+1;
       txt_codigoPrecio.setText(String.valueOf(n));
       txt_codigoPrecio.setEnabled(false);
       // llenado estado..
       txt_Estado.setText("ACTUAL");
       txt_Estado.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_codigoPrecio = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_PrecioVenta = new javax.swing.JTextField();
        txt_PrecioCompra = new javax.swing.JTextField();
        comboProducto = new javax.swing.JComboBox();
        txt_Estado = new javax.swing.JTextField();
        btn_Agrega = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Codigo");

        jLabel2.setText("Fecha");

        jLabel3.setText("Precio de Venta");

        jLabel4.setText("Precio de Compra");

        jLabel5.setText("Producto");

        jLabel6.setText("Estado");

        comboProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Agrega.setText("Agregar");
        btn_Agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigoPrecio)
                            .addComponent(txt_fecha)
                            .addComponent(txt_PrecioVenta)
                            .addComponent(txt_PrecioCompra)
                            .addComponent(comboProducto, 0, 206, Short.MAX_VALUE)
                            .addComponent(txt_Estado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btn_Agrega)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_PrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_PrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Agrega)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregaActionPerformed
        // recuperamos los datos
        String fecha=txt_fecha.getText();
        String precioVenta=txt_PrecioVenta.getText();
        String PrecioCompra=txt_PrecioCompra.getText();
        String producto=comboProducto.getSelectedItem().toString();
        String estado=txt_Estado.getText();
        float preciov,precioc;
        try {
            preciov=Float.parseFloat(precioVenta);
        precioc=Float.parseFloat(PrecioCompra);
        obj_func_ProdCate.InsertarPrecioProducto(fecha, preciov, precioc, producto, estado, this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Ingrese Solo Numero en los campos que correspondan!");
        }
        
        
    }//GEN-LAST:event_btn_AgregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agrega;
    private javax.swing.JComboBox comboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_Estado;
    private javax.swing.JTextField txt_PrecioCompra;
    private javax.swing.JTextField txt_PrecioVenta;
    private javax.swing.JTextField txt_codigoPrecio;
    private javax.swing.JTextField txt_fecha;
    // End of variables declaration//GEN-END:variables
}
