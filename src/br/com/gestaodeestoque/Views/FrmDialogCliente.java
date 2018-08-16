/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaodeestoque.Views;

import br.com.gestaodeestoque.Models.ClientesModelo;
import br.com.gestaodeestoque.dao.ClientesDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Guibs
 */
public class FrmDialogCliente extends javax.swing.JDialog {

    /**
     * Creates new form FrmDialogCliente
     */
    public FrmDialogCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNovoPedido = new javax.swing.JButton();
        btnCancelarPedido1 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNovoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add User Male_39px.png"))); // NOI18N
        btnNovoPedido.setText("Novo Cliente");
        btnNovoPedido.setFocusable(false);
        btnNovoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovoPedido);

        btnCancelarPedido1.setText("Salvar Cliente");
        btnCancelarPedido1.setFocusable(false);
        btnCancelarPedido1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarPedido1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedido1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancelarPedido1);

        btnAlterar.setText("Alterar Cliente");
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAlterar);

        btnCancelarPedido.setText("Excluir Cliente");
        btnCancelarPedido.setFocusable(false);
        btnCancelarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCancelarPedido);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 51));
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 290, -1));

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel2.setText("Rg");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));
        getContentPane().add(txtrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 290, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Cliente", "Nome", "Rg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 450, 170));

        setSize(new java.awt.Dimension(485, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        // TODO add your handling code here:
        //        CriaObjetos criapainel = new CriaObjetos();
        //        JPanel painel = criapainel.copiaPaineisCriados(painelAcoes);
        //        painel.setName("painel1");
        //        painel.setText("paineltexto1");

    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void btnCancelarPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedido1ActionPerformed
        // TODO add your handling code here:
        try {
            ClientesModelo clientemodelo = new ClientesModelo();
            clientemodelo.setCliente_nome(txtnome.getText());
            clientemodelo.setRg(txtrg.getText());

            ClientesDAO clientedao = new ClientesDAO();
            clientedao.inserirCliente(clientemodelo);
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Cliente! "+e);
        }

    }//GEN-LAST:event_btnCancelarPedido1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDialogCliente dialog = new FrmDialogCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnCancelarPedido1;
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtrg;
    // End of variables declaration//GEN-END:variables
}
