
package design;

import classes.Nsa;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class DadosCadastrais extends javax.swing.JFrame {
TelaLogin tl = new TelaLogin();
    private Object idade;
    public DadosCadastrais() {
        initComponents();
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salvar_Cadastral = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id_chng = new javax.swing.JLabel();
        senha_chng = new javax.swing.JLabel();
        idade_chng = new javax.swing.JLabel();
        habilidade_chng = new javax.swing.JLabel();
        cargo_chng = new javax.swing.JLabel();
        situation_chng = new javax.swing.JLabel();
        point_chng = new javax.swing.JLabel();
        AnoIngr_chng = new javax.swing.JLabel();
        email_chng = new javax.swing.JLabel();
        salvar_Cadastral1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nome_chng = new javax.swing.JLabel();
        jb3 = new javax.swing.JLabel();
        AnoTerm_chng = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DadosCadastro"));

        jLabel1.setText("Idade");

        jb2.setText("AnoInsc");

        jLabel3.setText("email");

        jLabel4.setText("habilidade");

        jLabel5.setText("cargo");

        salvar_Cadastral.setText("sair");
        salvar_Cadastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_CadastralActionPerformed(evt);
            }
        });

        jLabel8.setText("nome");

        jLabel9.setText("ID");

        jLabel10.setText("pontuação");

        jLabel11.setText("situação");

        id_chng.setText("000000 ");
        id_chng.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                id_chngAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        senha_chng.setText("******");

        idade_chng.setText("nome");

        habilidade_chng.setText("telefone");

        cargo_chng.setText("email");

        situation_chng.setText("telefone");

        point_chng.setText("telefone");

        AnoIngr_chng.setText("ID");

        email_chng.setText("sexo");

        salvar_Cadastral1.setText("editar");
        salvar_Cadastral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_Cadastral1ActionPerformed(evt);
            }
        });

        jLabel12.setText("senha");

        nome_chng.setText("telefone");
        nome_chng.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nome_chngAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jb3.setText("AnoTerm");

        AnoTerm_chng.setText("telefone");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(salvar_Cadastral1)
                        .addGap(42, 42, 42)
                        .addComponent(salvar_Cadastral))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel12))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb3)
                                    .addComponent(jb2))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AnoIngr_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(situation_chng, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(point_chng, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargo_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidade_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_chng, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnoTerm_chng, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(id_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(senha_chng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha_chng)
                    .addComponent(jLabel12))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nome_chng))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idade_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(habilidade_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cargo_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb2)
                    .addComponent(AnoIngr_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb3)
                    .addComponent(AnoTerm_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(situation_chng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(point_chng))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_Cadastral)
                    .addComponent(salvar_Cadastral1))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 static int k=0;
 static int p;  
    
  
    void LimparLabel(){
 

 id_chng.setText(null);
senha_chng.setText(null);
idade_chng.setText(null);
habilidade_chng.setText(null);
cargo_chng.setText(null);
email_chng.setText(null);
cargo_chng.setText(null);
AnoIngr_chng.setText(null);
situation_chng.setText(null);
point_chng.setText(null);
 
    }
    
    
    
public void setLabel(int i){
    DateFormat data = new SimpleDateFormat("dd/MM/yy");
Date cad = new Date();
Calendar cal = Calendar.getInstance();

    
    
    
id_chng.setText(Nsa.member[i].getId());
nome_chng.setText(Nsa.member[i].getNome());
  idade_chng.setText(Integer.toString(Nsa.member[i].getIdade()));
  habilidade_chng.setText(Nsa.member[i].getHabilidade());
  cargo_chng.setText(Nsa.member[i].getCargo());
  email_chng.setText(Nsa.member[i].getEmail());
  AnoIngr_chng.setText(Nsa.member[i].getAnoIns());
  AnoTerm_chng.setText(Nsa.member[i].getAnoTerm());
  point_chng.setText(Integer.toString(Nsa.member[i].getPontos()));  
  situation_chng.setText(Nsa.member[i].getSituation());
  
    }
    





    
/*  editar e atualizar os valores no vetor,
/*  ex:
/*  x[0]=1,x.setId(2)
/*  x[0]=2;
*/
//String id,
void Edit(String pass,String nome,String idade,String email,String cargo,String habilidade){
//if(!id.equals("")){Nsa.member[k].setId(id);Nsa.prtc[p].setId(id);}
if(!pass.equals("")){Nsa.member[k].setPassword(pass);Nsa.prtc[p].setPassword(pass);}
if(!nome.equals("")){nome_chng.setText(nome);Nsa.member[k].setNome(nome);Nsa.prtc[p].setNome(nome);} 
if(!idade.equals("")){idade_chng.setText(idade);Nsa.member[k].setIdade(Integer.parseInt(idade));Nsa.prtc[p].setIdade(Integer.parseInt(idade));}
if(!email.equals("")){email_chng.setText(email);Nsa.member[k].setEmail(email);Nsa.prtc[p].setEmail(email);}
if(!cargo.equals(cargo_chng.getText())){cargo_chng.setText(cargo);Nsa.member[k].setCargo(cargo);Nsa.prtc[p].setCargo(cargo);}
if(!habilidade.equals(habilidade_chng.getText())){habilidade_chng.setText(habilidade);Nsa.member[k].setHabilidade(habilidade);Nsa.prtc[p].setHabilidade(habilidade);}
JOptionPane.showMessageDialog(null,"atualizado com sucesso");

} 
  








//prtc
void ver(){
for(int i=0;i<Nsa.Mb;i++)
if(Nsa.member[i].getId().equals(id_chng.getText()))
k=i;
}


//membr
void verr(){
for(int i=0;i<Nsa.key;i++)
if(Nsa.prtc[i].getId().equals(id_chng.getText()))
p=i;
}



    
    private void salvar_CadastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_CadastralActionPerformed
this.dispose();

    }//GEN-LAST:event_salvar_CadastralActionPerformed

    

 
 

    
    private void salvar_Cadastral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_Cadastral1ActionPerformed
//    LimparLabel();


        ver();
        verr();
        AtualizarCad AtuaCad = new AtualizarCad();
AtuaCad.setVisible(true);
AtuaCad.item();
//Dados
this.dispose();
    }//GEN-LAST:event_salvar_Cadastral1ActionPerformed

    private void id_chngAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_id_chngAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_id_chngAncestorAdded

    private void nome_chngAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nome_chngAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_chngAncestorAdded

    
    
    

           
    
    public static void main(String args[]) {
      
        DadosCadastrais lmp=new DadosCadastrais();
        lmp.LimparLabel();
   //  TelaLogin tl=new TelaLogin();
     //   TelaConsultarCadastro tc=new TelaConsultarCadastro();     
//tc.pesq(tl.getName());
     
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
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
     
                new DadosCadastrais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoIngr_chng;
    private javax.swing.JLabel AnoTerm_chng;
    private javax.swing.JLabel cargo_chng;
    private javax.swing.JLabel email_chng;
    private javax.swing.JLabel habilidade_chng;
    private javax.swing.JLabel id_chng;
    private javax.swing.JLabel idade_chng;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jb2;
    private javax.swing.JLabel jb3;
    private javax.swing.JLabel nome_chng;
    private javax.swing.JLabel point_chng;
    private javax.swing.JButton salvar_Cadastral;
    private javax.swing.JButton salvar_Cadastral1;
    private javax.swing.JLabel senha_chng;
    private javax.swing.JLabel situation_chng;
    // End of variables declaration//GEN-END:variables

  //  void Edit(String text, String string, String text0, String toString, String toString0, String text1, String toString1) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }
}
