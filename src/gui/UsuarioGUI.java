package gui;
import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
/**
 * Classe criação dos Elementos SWING tela gráfica 
 * 
 * @author Jacques G. Silva  /  Leandro Reis
 * 
 */
public class UsuarioGUI extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	
    	public UsuarioGUI() {
    		initComponents();
    	}
    	private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jTextField1 = new javax.swing.JTextField();
	        jTextField2 = new javax.swing.JTextField();
	        jTextField3 = new javax.swing.JTextField();
	        jTextField4 = new javax.swing.JTextField();
	        jButton3 = new javax.swing.JButton();
	
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	
	        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        jLabel1.setText("Cadastro de Usuário");
	
	        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar novo usuário"));
	
	        jLabel2.setText("Nome");
	
	        jLabel3.setText("CPF");
	
	        jLabel4.setText("E-mail");
	
	        jLabel5.setText("Telefone");
	
	        jButton1.setText("Cadastrar");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("limpar");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jButton1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
	                        .addComponent(jButton2))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel4)
	                            .addComponent(jLabel5))
	                        .addGap(33, 33, 33)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jTextField1)
	                            .addComponent(jTextField2)
	                            .addComponent(jTextField3)
	                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(25, 25, 25)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(25, 25, 25)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(33, 33, 33)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel5)
	                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton2))
	                .addContainerGap())
	        );
	
	        jButton3.setText("Sair");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });
	
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(42, 42, 42)
	                        .addComponent(jLabel1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(34, 34, 34)
	                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(170, 170, 170)
	                        .addComponent(jButton3)))
	                .addContainerGap(66, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1)
	                .addGap(18, 18, 18)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jButton3)
	                .addContainerGap(47, Short.MAX_VALUE))
	        );
	
	        pack();
	    }// </editor-fold>//GEN-END:initComponents
	
	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	        System.exit(0); 
	    }//GEN-LAST:event_jButton3ActionPerformed
	
	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	    jTextField1.setText("");
	    jTextField2.setText("");
	    jTextField3.setText("");
	    jTextField4.setText("");
	    }//GEN-LAST:event_jButton2ActionPerformed
	
	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	    /**
	     * instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios 
	     */
	      
	    Usuario usuarios = new Usuario();
	    usuarios.setNome(jTextField1.getText());
	    usuarios.setCpf(jTextField2.getText());
	    usuarios.setEmail(jTextField3.getText());
	    usuarios.setTelefone(jTextField4.getText());
	
	    // fazendo a validação dos dados
	    if ((jTextField1.getText().isEmpty()) || (jTextField2.getText().isEmpty()) || (jTextField3.getText().isEmpty()) || (jTextField4.getText().isEmpty())) {
	        JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
	    }
	    else {
	
	    // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
	        UsuarioDAO dao = new UsuarioDAO();
	        dao.adiciona(usuarios);
	        JOptionPane.showMessageDialog(null, "Usuário "+jTextField1.getText()+" inserido com sucesso! ");
	    }
	
	    // apaga os dados preenchidos nos campos de texto
	    jTextField1.setText("");
	    jTextField2.setText("");
	    jTextField3.setText("");
	    jTextField4.setText("");
	    }//GEN-LAST:event_jButton1ActionPerformed
	
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
	            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>
	
	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new UsuarioGUI().setVisible(true);
	            }
	        });
	    }
	
	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JTextField jTextField2;
	    private javax.swing.JTextField jTextField3;
	    private javax.swing.JTextField jTextField4;
	    // End of variables declaration//GEN-END:variables
}
