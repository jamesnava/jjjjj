
package vista;
import funciones.func_Duen_Regis;
import funciones.func_tien;
import javax.swing.JOptionPane;
import funciones.func_Usua;
import getters_setters.usuario_Getters_setters;
import java.io.File;
//import javafx.stage.FileChooser;
import javax.swing.JFileChooser;


public class Inter_Agre_Usua extends javax.swing.JInternalFrame {

    func_Duen_Regis obj_fuc_Duen_Regis;
    func_tien obj_func_tienda;
    usuario_Getters_setters obj_usuarioGetSet;
    func_Usua obj_func_usuario;
    JFileChooser escoger;
    File file;
    
    public Inter_Agre_Usua() {
        initComponents();
        obj_fuc_Duen_Regis=new func_Duen_Regis();
        obj_func_tienda=new func_tien();
        // llenando el campo sede y cargo...
        obj_fuc_Duen_Regis.LlenarComboCargo(combo_cargo);
        obj_func_tienda.LlenarComboSede(combo_sede);
        //inicializando el objeto getters y setters
        obj_usuarioGetSet=new usuario_Getters_setters();
        // inicializando la funcion 
        obj_func_usuario=new func_Usua();
        //inicializamos 
        
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_grabar = new javax.swing.JButton();
        txt_dni_usuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_nombre_usuario = new javax.swing.JTextField();
        txt_apellidopater_usuario = new javax.swing.JTextField();
        txt_apellidomater_usuario = new javax.swing.JTextField();
        txt_direccion_usuario = new javax.swing.JTextField();
        txt_telefono_usuario = new javax.swing.JTextField();
        txt_correo_usuario = new javax.swing.JTextField();
        txt_usua_usuario = new javax.swing.JTextField();
        txt_estado_usuario = new javax.swing.JTextField();
        pass_contra_usuario = new javax.swing.JPasswordField();
        pass_contra1_usuario = new javax.swing.JPasswordField();
        combo_sede = new javax.swing.JComboBox();
        combo_cargo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ruta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Primer Apellido");

        jLabel4.setText("Segundo Apellido");

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        jLabel7.setText("Correo");

        jLabel8.setText("Usuario");

        jLabel9.setText("Contraseña");

        jLabel10.setText("Repita la Contraseña");

        jLabel11.setText("Sede");

        jLabel12.setText("Estado");

        btn_grabar.setText("Grabar");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        jLabel13.setText("Cargo");

        txt_direccion_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_usuarioActionPerformed(evt);
            }
        });

        txt_correo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_usuarioActionPerformed(evt);
            }
        });

        txt_estado_usuario.setText("ACTIVO");
        txt_estado_usuario.setEnabled(false);

        combo_sede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("validar contraseña");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Fotografia");

        ruta.setEnabled(false);

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(0, 404, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass_contra1_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_usua_usuario)
                                .addComponent(txt_telefono_usuario)
                                .addComponent(txt_direccion_usuario)
                                .addComponent(txt_apellidomater_usuario)
                                .addComponent(txt_dni_usuario)
                                .addComponent(txt_nombre_usuario)
                                .addComponent(txt_apellidopater_usuario)
                                .addComponent(txt_correo_usuario)
                                .addComponent(pass_contra_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_estado_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ruta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_cargo, javax.swing.GroupLayout.Alignment.LEADING, 0, 185, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btn_grabar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_dni_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellidopater_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_apellidomater_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_direccion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_telefono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_correo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_usua_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pass_contra_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pass_contra1_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(combo_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_estado_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(combo_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(btn_grabar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        // grabar un nuevo usuario...
        //recuperar datos...
        String dni=txt_dni_usuario.getText();
        String nombre=txt_nombre_usuario.getText();
        String apellidoP=txt_apellidopater_usuario.getText();
        String apellidoM=txt_apellidomater_usuario.getText();
        String direccion=txt_direccion_usuario.getText();
        String telefono=txt_telefono_usuario.getText();
        String correo=txt_correo_usuario.getText();
        String usuario=txt_usua_usuario.getText();
        String contra=new String(pass_contra_usuario.getPassword());
        String sede=combo_sede.getSelectedItem().toString();
        String estado=txt_estado_usuario.getText();
        String cargo=combo_cargo.getSelectedItem().toString();
        //encapsulando....
        obj_usuarioGetSet.setDni(dni);
        obj_usuarioGetSet.setNombre(nombre);
        obj_usuarioGetSet.setApellidoPaterno(apellidoP);
        obj_usuarioGetSet.setApellidoMaterno(apellidoM);
        obj_usuarioGetSet.setDireccion(direccion);
        obj_usuarioGetSet.setTelefono(telefono);
        obj_usuarioGetSet.setCorreo(correo);
        obj_usuarioGetSet.setUsuario(usuario);
        obj_usuarioGetSet.setContra(contra);
        //instanciando
        Vist_Princi objPrincipal=new Vist_Princi();
        //llamando a la funcion insertar...
       obj_func_usuario.InsertarUsuario(obj_usuarioGetSet.getDni(),obj_usuarioGetSet.getNombre(),
             obj_usuarioGetSet.getApellidoPaterno(),obj_usuarioGetSet.getDireccion(), obj_usuarioGetSet.getTelefono(),
               obj_usuarioGetSet.getCorreo(), obj_usuarioGetSet.getUsuario(), obj_usuarioGetSet.getContra(),sede, obj_usuarioGetSet.getApellidoMaterno(), estado, cargo,file);
               file=null;
        
       /* obj_func_usuario.InsertarUsuario("47584657","jaime","navarro","av.peru","930554471","navarro@gmail.com","james","james","SEDE TALAVERA","Cruz","ACTIVO","VENDEDOR");
         btn_grabar.setVisible(false);*/
        
        
        
        
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void txt_correo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_usuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // validar contraseña
        String contra1=new String(pass_contra1_usuario.getPassword());
        String contra2=new String(pass_contra_usuario.getPassword());
        if(contra1.equals(contra2)){
            btn_grabar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this,"La Contraseña No Coincide");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_direccion_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      escoger=new JFileChooser();
      escoger.showOpenDialog(this);
      file=escoger.getSelectedFile();
      ruta.setText(file.getAbsolutePath());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_grabar;
    private javax.swing.JComboBox combo_cargo;
    private javax.swing.JComboBox combo_sede;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pass_contra1_usuario;
    private javax.swing.JPasswordField pass_contra_usuario;
    private javax.swing.JTextField ruta;
    private javax.swing.JTextField txt_apellidomater_usuario;
    private javax.swing.JTextField txt_apellidopater_usuario;
    private javax.swing.JTextField txt_correo_usuario;
    private javax.swing.JTextField txt_direccion_usuario;
    private javax.swing.JTextField txt_dni_usuario;
    private javax.swing.JTextField txt_estado_usuario;
    private javax.swing.JTextField txt_nombre_usuario;
    private javax.swing.JTextField txt_telefono_usuario;
    private javax.swing.JTextField txt_usua_usuario;
    // End of variables declaration//GEN-END:variables
}
