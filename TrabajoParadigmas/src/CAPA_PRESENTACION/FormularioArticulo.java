
package CAPA_PRESENTACION;
import CAPA_LOGICA_NEGOCIOS.DatoArticulo;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormularioArticulo extends javax.swing.JFrame {

    /**
     * Creates new form FormularioArticulo
     */
    public FormularioArticulo() {
        initComponents();
        this.setSize(1100,500);
        ListarArticulos();
        
        JBtGrabar.setEnabled(false);
                JBtNuevo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtNuevoActionPerformed(evt);
            }
        });

        JBtGrabar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGrabarActionPerformed(evt);
            }
        });

        JBtModificar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtModificarActionPerformed(evt);
            }
        });

        jButEliminar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEliminarActionPerformed(evt);
            }
        });

        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtSalirActionPerformed(evt);
            }
        });

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1Mousepressed(evt);
            }
        });
    
    }
    

    public void ListarArticulos(){
        DefaultTableModel tabla= new DefaultTableModel();
        DatoArticulo objart =new DatoArticulo();
        ArrayList<DatoArticulo> lista2=new ArrayList();
        lista2=objart.ListaArticulos();
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Unidad");
        tabla.addColumn("Precio");
        tabla.addColumn("Stock");
        tabla.addColumn("Marca");
        tabla.setRowCount(lista2.size());
        int i =0;
        for(DatoArticulo x: lista2){
            tabla.setValueAt(x.getArt_cod(), i, 0);
            tabla.setValueAt(x.getArt_nom(), i, 1);
            tabla.setValueAt(x.getArt_uni(), i, 2);
            tabla.setValueAt(x.getArt_pre(), i, 3);
            tabla.setValueAt(x.getArt_stk(), i, 4);
            tabla.setValueAt(x.getArt_marca(), i, 5);
            i++;
        }
    this.jTable1.setModel(tabla);
        
    }
    public void LimpiarCajasTexto(){
        this.txtcodigo.setText("");
        this.txtUniMedida.setText("");
        this.txtcantidad.setText("");
        this.txtmarca.setText("");
        this.txtnombre.setText("");
        this.txtprecio.setText("");
        
}
    @SuppressWarnings("unchecked")
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtUniMedida = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        JBtNuevo = new javax.swing.JButton();
        JBtGrabar = new javax.swing.JButton();
        JBtModificar = new javax.swing.JButton();
        jButEliminar = new javax.swing.JButton();
        jButSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Unidad de medida:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Marca:");

        JBtNuevo.setText("Nuevo:");

        JBtGrabar.setText("Grabar:");

        JBtModificar.setText("Modificar:");

        jButEliminar.setText("Eliminar:");

        jButSalir.setText("Salir:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(txtcodigo)
                    .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUniMedida, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcantidad)
                    .addComponent(txtmarca))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBtNuevo)
                .addGap(47, 47, 47)
                .addComponent(JBtGrabar)
                .addGap(41, 41, 41)
                .addComponent(JBtModificar)
                .addGap(46, 46, 46)
                .addComponent(jButEliminar)
                .addGap(47, 47, 47)
                .addComponent(jButSalir)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUniMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtNuevo)
                    .addComponent(JBtGrabar)
                    .addComponent(JBtModificar)
                    .addComponent(jButEliminar)
                    .addComponent(jButSalir))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void JBtSalirActionPerformed(java.awt.event.ActionEvent evt){
        int r =JOptionPane.showConfirmDialog(null,"Esta seguro?");
        if(r ==0){
            System.exit(0);
        }
    }
    
    private void jTable1Mousepressed(java.awt.event.MouseEvent evt){
        int rec= this.jTable1.getSelectedRow();
        this.txtcodigo.setText(jTable1.getValueAt(rec, 0).toString());
        this.txtnombre.setText(jTable1.getValueAt(rec, 1).toString());
        this.txtUniMedida.setText(jTable1.getValueAt(rec, 2).toString());
        this.txtprecio.setText(jTable1.getValueAt(rec, 3).toString());
        this.txtcantidad.setText(jTable1.getValueAt(rec, 4).toString());
        this.txtmarca.setText(jTable1.getValueAt(rec, 5).toString());
    }
    private void jBtEliminarActionPerformed(java.awt.event.ActionEvent evt){
        String codigo = this.txtcodigo.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un artículo para Eliminar.");
            return;
        }
        DatoArticulo objart = new DatoArticulo();
        int Res =JOptionPane.showConfirmDialog(null,"Esta seguro de elimianr el Articulo: "+this.txtcodigo.getText() + "?");
        if(Res==0){
            objart.setArt_cod(this.txtcodigo.getText());
            JOptionPane.showMessageDialog(null, objart.EliminarArticulo());
            ListarArticulos();
            JOptionPane.showMessageDialog(null, "Articulo Eliminado");  
        this.txtcodigo.setText("");
        this.txtUniMedida.setText("");
        this.txtcantidad.setText("");
        this.txtmarca.setText("");
        this.txtnombre.setText("");
        this.txtprecio.setText("");
        }
        
    }
    private void jBtGrabarActionPerformed(java.awt.event.ActionEvent evt){
        String codigo = this.txtcodigo.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, rellene los espacios para Grabar.");
            return;
        }
        DatoArticulo objart = new DatoArticulo();
        objart.setArt_cod(this.txtcodigo.getText());
        objart.setArt_nom(this.txtnombre.getText());
        objart.setArt_uni(this.txtUniMedida.getText());
        objart.setArt_pre(Double.parseDouble(this.txtprecio.getText()));
        objart.setArt_stk(Integer.parseInt(this.txtcantidad.getText()));
        objart.setArt_marca(this.txtmarca.getText());
        JOptionPane.showMessageDialog(null,objart.GrabarArticulo());
        ListarArticulos();
        this.txtcodigo.setText("");
        this.txtUniMedida.setText("");
        this.txtcantidad.setText("");
        this.txtmarca.setText("");
        this.txtnombre.setText("");
        this.txtprecio.setText("");
    }
    private void jBtModificarActionPerformed(java.awt.event.ActionEvent evt){
        String codigo = this.txtcodigo.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un artículo para Modificar.");
            return;
        }
        DatoArticulo objart = new DatoArticulo();
        objart.setArt_cod(this.txtcodigo.getText());
        objart.setArt_nom(this.txtnombre.getText());
        objart.setArt_uni(this.txtUniMedida.getText());
        objart.setArt_pre(Double.parseDouble(this.txtprecio.getText()));
        objart.setArt_stk(Integer.parseInt(this.txtcantidad.getText()));
        objart.setArt_marca(this.txtmarca.getText());
        JOptionPane.showMessageDialog(null,objart.EditarArticulo());
        ListarArticulos();
    }
    private void jBtNuevoActionPerformed(java.awt.event.ActionEvent evt){
        LimpiarCajasTexto();
        JBtGrabar.setEnabled(true);
    }
    
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtGrabar;
    private javax.swing.JButton JBtModificar;
    private javax.swing.JButton JBtNuevo;
    private javax.swing.JButton jButEliminar;
    private javax.swing.JButton jButSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField txtUniMedida;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
