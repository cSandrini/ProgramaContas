package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import model.bean.Conta;
import model.dao.ContaDAO;

/**
 * @author cSandrini
 */

public class Consultar extends javax.swing.JFrame {

    JMenuBar menu = new JMenuBar();
    
    JMenu espaco1 =  new JMenu("Opções");
    JMenu espaco2 =  new JMenu("Janelas");
    
    JMenuItem item11 = new JMenuItem("Ajuda");
    //ITEM 2 DO ESPAÇO 1
    JMenuItem item21 = new JMenuItem("Sair");
    //ITEM 1 DO ESPAÇO 2
    JMenuItem item12 = new JMenuItem("Cadastrar uma conta");
    
    public Consultar() {
        initComponents();
        setLocationRelativeTo(null);
        txtNrContaResult.setEditable(false);
        txtNomeResult.setEditable(false);
        txtSaldoResult.setEditable(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        // ADIÇÃO DO MENU
        setJMenuBar(menu);
        //ADIÇÃO DOS ESPAÇOS
        menu.add(espaco1);
        menu.add(espaco2);
        //ADIÇÃO DO ITEM 1 NO ESPAÇO 1
        espaco1.add(item11);
        espaco1.add(item21);
        
        espaco2.add(item12);
        
        //AO CLICAR NO ITEM 1 DO ESPAÇO 1
        item11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "O programa possui 3 funcionalidades,\n\nCadastrar,"
                        + " Consultar e Excluir.\n\nPara cadastrar a conta, vá em janelas e\nselecione Cadastrar uma Conta\n\nPara consultar a conta, digite o número de sua\nconta"
                        + " no espaço em branco Número de Conta\n\nApós consultar, aparecerá a função"
                        + " Limpar\ne Excluir. A primeira limpa o campo de texto\ne a segunda"
                        + " exclui a conta selecionada.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        //AO CLICAR NO ITEM 1 DO ESPAÇO 2
        item12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cadastrar obj = new Cadastrar();
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);
            }
        });
        
        //AO CLICAR NO ITEM 2 DO ESPAÇO 1
        item21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtNrConta = new javax.swing.JTextField();
        apsNrConta = new javax.swing.JLabel();
        apsPesquisa = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSaldoResult = new javax.swing.JTextField();
        txtNrContaResult = new javax.swing.JTextField();
        txtNomeResult = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdadeResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Contas");
        setResizable(false);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNrConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNrContaActionPerformed(evt);
            }
        });

        apsNrConta.setText("Número da Conta");

        apsPesquisa.setText("Resultados da Pesquisa");

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº da Conta:");

        jLabel2.setText("Saldo:");

        jLabel3.setText("Propritário:");

        txtSaldoResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoResultActionPerformed(evt);
            }
        });

        txtNrContaResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNrContaResultActionPerformed(evt);
            }
        });

        txtNomeResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeResultActionPerformed(evt);
            }
        });

        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Idade");

        txtIdadeResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apsPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apsNrConta)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNrConta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(27, 27, 27))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdadeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNrContaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSaldoResult, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(apsNrConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNrConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(apsPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrContaResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSaldoResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdadeResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void excluirTxt() {
        txtNrContaResult.setText("");
        txtNomeResult.setText("");
        txtSaldoResult.setText("");
        txtIdadeResult.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtNrConta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "(Erro) Digite o número da conta no\ncampo de texto Número da Conta.");
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            excluirTxt();
        } else {
            ContaDAO cdao = new ContaDAO();
            java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(2);
            
            for (Conta c: cdao.read(Integer.parseInt(txtNrConta.getText()))) {
                txtNrContaResult.setText(String.valueOf(c.getNrConta()));
                txtSaldoResult.setText("R$ " + nf.format(c.getSaldo()));
                txtNomeResult.setText(c.getNome());
                txtIdadeResult.setText(String.valueOf(c.getIdade()));
                txtNrConta.setText("");
            }
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            
            if (txtNrContaResult.getText().equals("")) {
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            JOptionPane.showMessageDialog(null, "(Erro) O número digitado não\ncorresponde a nenhuma conta.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNrContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNrContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNrContaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ContaDAO dao = new ContaDAO();
        int input = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir\na conta nº " + txtNrContaResult.getText() + "?", "Excluir Conta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        if (input == 0) {
            dao.delete(Integer.parseInt(txtNrContaResult.getText()));
            excluirTxt();
            jButton2.setVisible(false);
            jButton3.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSaldoResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoResultActionPerformed

    private void txtNrContaResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNrContaResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNrContaResultActionPerformed

    private void txtNomeResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeResultActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        excluirTxt();
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIdadeResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeResultActionPerformed


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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apsNrConta;
    private javax.swing.JLabel apsPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtIdadeResult;
    private javax.swing.JTextField txtNomeResult;
    private javax.swing.JTextField txtNrConta;
    private javax.swing.JTextField txtNrContaResult;
    private javax.swing.JTextField txtSaldoResult;
    // End of variables declaration//GEN-END:variables
}
