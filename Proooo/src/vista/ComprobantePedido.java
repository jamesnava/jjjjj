
package vista;

import java.awt.print.PrinterJob;
import funciones.ImprimirA4;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import funciones.func_Abast;

public class ComprobantePedido extends javax.swing.JFrame {
    Calendar fecha;
     func_Abast obj_func_Abast;
    public ComprobantePedido() {
       
        initComponents();
        fecha=new GregorianCalendar();
       String dia=Integer.toString(fecha.get(Calendar.DATE));
       String mes=Integer.toString(fecha.get(Calendar.MONTH)+1);
       String anio=Integer.toString(fecha.get(Calendar.YEAR));
       String fechaCorrecta=anio+"-"+mes+"-"+dia;
       labelFech_Prove.setText(fechaCorrecta);
       obj_func_Abast=new func_Abast();
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelimprimir = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelProvedor_razonSocial = new javax.swing.JLabel();
        labelProve_Ruc = new javax.swing.JLabel();
        labelProve_Direccion = new javax.swing.JLabel();
        labelFech_Prove = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        label_totalPagar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelSede = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelDni = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Proveedor:");

        jLabel2.setText("Fecha:");

        jLabel3.setText("Ruc:");

        jLabel4.setText("Direccion:");

        labelProvedor_razonSocial.setText("jLabel5");

        labelProve_Ruc.setText("jLabel6");

        labelProve_Direccion.setText("jLabel7");

        labelFech_Prove.setText("jLabel8");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "N", "Producto", "Precio X U", "Cantidad", "Importe", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(430);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tablaProductos.getColumnModel().getColumn(5).setResizable(false);
            tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(0);
        }

        jLabel9.setText("Total");

        label_totalPagar.setText("jLabel10");

        jLabel5.setText("Sede");

        labelSede.setText("jLabel6");

        javax.swing.GroupLayout panelimprimirLayout = new javax.swing.GroupLayout(panelimprimir);
        panelimprimir.setLayout(panelimprimirLayout);
        panelimprimirLayout.setHorizontalGroup(
            panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelimprimirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelimprimirLayout.createSequentialGroup()
                        .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelimprimirLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelimprimirLayout.createSequentialGroup()
                                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelimprimirLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelimprimirLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelimprimirLayout.createSequentialGroup()
                                        .addComponent(labelProvedor_razonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(49, 49, 49)
                                        .addComponent(labelFech_Prove, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelimprimirLayout.createSequentialGroup()
                                        .addComponent(labelProve_Ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelProve_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelimprimirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(label_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelimprimirLayout.setVerticalGroup(
            panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelimprimirLayout.createSequentialGroup()
                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(labelProvedor_razonSocial))
                    .addComponent(labelFech_Prove))
                .addGap(18, 18, 18)
                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(labelProve_Ruc)
                    .addComponent(labelProve_Direccion)
                    .addComponent(jLabel5)
                    .addComponent(labelSede))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(label_totalPagar))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelimprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(332, 332, 332))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(panelimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Desea Grabar?")==0){
            
        PrinterJob obj_PrinterJob=PrinterJob.getPrinterJob();
        obj_PrinterJob.setPrintable(new ImprimirA4(panelimprimir));
        try {
            if(obj_PrinterJob.printDialog()){
               int codigo=obj_func_Abast.retornarIdMaximo();
               int codigoDetalle=obj_func_Abast.retornarIdMaximoDetalle();
               obj_func_Abast.insertarAbastecimiento(codigo+1,labelFech_Prove.getText(),Float.parseFloat(label_totalPagar.getText()),labelProve_Ruc.getText(),labelDni.getText());
               obj_func_Abast.insertarDetalleAbastecimiento(tablaProductos, codigoDetalle, codigo);
               // actualizamos stock
               
               
               
               // fin de actualizamos el estock
            obj_PrinterJob.print();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(ComprobantePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprobantePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprobantePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprobantePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprobantePedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelDni;
    public javax.swing.JLabel labelFech_Prove;
    public javax.swing.JLabel labelProve_Direccion;
    public javax.swing.JLabel labelProve_Ruc;
    public javax.swing.JLabel labelProvedor_razonSocial;
    public javax.swing.JLabel labelSede;
    public javax.swing.JLabel label_totalPagar;
    private javax.swing.JPanel panelimprimir;
    public javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
