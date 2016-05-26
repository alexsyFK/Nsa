
package design;

import classes.Nsa;
import classes.ParticipantesNsa;
import java.awt.event.KeyEvent;


public class TelaLogin extends javax.swing.JInternalFrame {

    public TelaLogin() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome_Login = new javax.swing.JTextField();
        entrar_Login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        password_Login = new javax.swing.JPasswordField();

        setClosable(true);
        setTitle("NSALogin");

        jLabel1.setText("ID");

        nome_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nome_LoginKeyPressed(evt);
            }
        });

        entrar_Login.setText("entrar");
        entrar_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_LoginActionPerformed(evt);
            }
        });

        jLabel2.setText("senha");

        password_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_LoginActionPerformed(evt);
            }
        });
        password_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_LoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(entrar_Login)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_Login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(password_Login, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entrar_Login)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    //limpar entradas
public void cls(){
nome_Login.setText(null);
password_Login.setText(null);
}
    
    
    private void entrar_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_LoginActionPerformed

Nsa ns = new Nsa();
ns.chk(nome_Login.getText(),new String(password_Login.getPassword()));    
    cls();

    }//GEN-LAST:event_entrar_LoginActionPerformed

    private void password_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_LoginActionPerformed
    
    
    }//GEN-LAST:event_password_LoginActionPerformed

    private void password_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_LoginKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
Nsa ns = new Nsa();
    ns.chk(nome_Login.getText(),new String(password_Login.getPassword()));    
    cls();
}
      
    }//GEN-LAST:event_password_LoginKeyPressed

    
    
    
    
    
    private void nome_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome_LoginKeyPressed

      
    }//GEN-LAST:event_nome_LoginKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nome_Login;
    private javax.swing.JPasswordField password_Login;
    // End of variables declaration//GEN-END:variables
}
