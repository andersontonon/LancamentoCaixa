/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Banco.ConexaoMySQL;
import Banco.Consultas;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Anderson Tonon
 */
public class Busca extends javax.swing.JInternalFrame {

    /**
     * Creates new form teste
     */
    public Busca() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); 
        cadastro.setBorder(null);
        
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoTef = new javax.swing.JTextField();
        campoPos = new javax.swing.JTextField();
        campoVendaPrazo = new javax.swing.JTextField();
        campoSuprimentos = new javax.swing.JTextField();
        campoPdv = new javax.swing.JTextField();
        campoSaldo = new javax.swing.JTextField();
        campoRecebimentos = new javax.swing.JTextField();
        campoSangria = new javax.swing.JTextField();
        campoVendaReceb = new javax.swing.JTextField();
        campoNome1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setForeground(new java.awt.Color(51, 51, 51));
        setIconifiable(true);
        setResizable(true);
        setTitle("Ajuda");
        setEnabled(false);
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(882, 651));
        setVisible(true);

        cadastro.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        campoNome.setForeground(new java.awt.Color(102, 102, 102));
        campoNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Magda", "Dayse", "Claudia", "Camila" }));
        campoNome.setBorder(null);
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        jLabel10.setBackground(new java.awt.Color(153, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BUSCA DE LANÇAMENTOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        message.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jList1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setText("Saldo:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Recebimentos:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Sangria:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Venda e Recebimentos:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("PDV:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Suprimentos:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("Vendas a Prazo:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("P.O.S:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Tef:");

        campoTef.setEditable(false);
        campoTef.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoTef.setForeground(new java.awt.Color(102, 102, 102));

        campoPos.setEditable(false);
        campoPos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoPos.setForeground(new java.awt.Color(102, 102, 102));

        campoVendaPrazo.setEditable(false);
        campoVendaPrazo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoVendaPrazo.setForeground(new java.awt.Color(102, 102, 102));

        campoSuprimentos.setEditable(false);
        campoSuprimentos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoSuprimentos.setForeground(new java.awt.Color(102, 102, 102));

        campoPdv.setEditable(false);
        campoPdv.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoPdv.setForeground(new java.awt.Color(102, 102, 102));

        campoSaldo.setEditable(false);
        campoSaldo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoSaldo.setForeground(new java.awt.Color(102, 102, 102));
        campoSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSaldoActionPerformed(evt);
            }
        });

        campoRecebimentos.setEditable(false);
        campoRecebimentos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoRecebimentos.setForeground(new java.awt.Color(102, 102, 102));
        campoRecebimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRecebimentosActionPerformed(evt);
            }
        });

        campoSangria.setEditable(false);
        campoSangria.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoSangria.setForeground(new java.awt.Color(102, 102, 102));
        campoSangria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSangriaActionPerformed(evt);
            }
        });

        campoVendaReceb.setEditable(false);
        campoVendaReceb.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoVendaReceb.setForeground(new java.awt.Color(102, 102, 102));
        campoVendaReceb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoVendaRecebActionPerformed(evt);
            }
        });

        campoNome1.setEditable(false);
        campoNome1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        campoNome1.setForeground(new java.awt.Color(102, 102, 102));

        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setText("Buscar");
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(140, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroLayout = new javax.swing.GroupLayout(cadastro);
        cadastro.setLayout(cadastroLayout);
        cadastroLayout.setHorizontalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(campoNome, 0, 174, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cadastroLayout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPos, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(campoTef)
                    .addComponent(campoVendaPrazo)
                    .addComponent(campoSuprimentos)
                    .addComponent(campoPdv)
                    .addComponent(campoVendaReceb)
                    .addComponent(campoSangria)
                    .addComponent(campoRecebimentos)
                    .addComponent(campoSaldo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNome1))
                .addContainerGap(155, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cadastroLayout.setVerticalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroLayout.createSequentialGroup()
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(cadastroLayout.createSequentialGroup()
                                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(campoPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(campoSuprimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addComponent(campoVendaPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(campoPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(campoTef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(campoVendaReceb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(campoSangria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(campoRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(campoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(70, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSaldoActionPerformed

    private void campoRecebimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRecebimentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRecebimentosActionPerformed

    private void campoSangriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSangriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSangriaActionPerformed

    private void campoVendaRecebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoVendaRecebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoVendaRecebActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nome = (String) campoNome.getSelectedItem();
        try {
            buscarLancamento(nome);
        } catch (SQLException ex) {
            Logger.getLogger(Busca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String nome = (String) campoNome.getSelectedItem();
        try {
            listarLancamento(nome);
        } catch (SQLException ex) {
            Logger.getLogger(Busca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList1MouseClicked
    public void buscarLancamento(String nome) throws SQLException{
        
        ConexaoMySQL sql = new ConexaoMySQL(); 
        
        String busca[][] = sql.BuscarLancamento(Consultas.BUSCA_LANCAMENTOS, nome);
        DefaultListModel model = new DefaultListModel();
        
        limparCampos();
        model.clear();
        jList1.setModel(model);
        
        for (int i = 0; i < busca.length; i++) {
          
            model.addElement(busca[i][0].concat(" - " + busca[i][11])); 
            jList1.setModel(model);
        }
        
       
    }
    
    public void listarLancamento(String nome) throws SQLException{
        
        ConexaoMySQL sql = new ConexaoMySQL(); 
        
        String busca[][] = sql.BuscarLancamento(Consultas.BUSCA_LANCAMENTOS, nome);
        DefaultListModel model = new DefaultListModel();
        
        int pos = jList1.getSelectedIndex();
        
        campoNome1.setText(busca[pos][1]);
        campoPdv.setText(busca[pos][2]);
        campoSuprimentos.setText(busca[pos][3]);
        campoVendaPrazo.setText(busca[pos][4]);
        campoPos.setText(busca[pos][5]);
        campoTef.setText(busca[pos][6]);
        campoVendaReceb.setText(busca[pos][7]);
        campoSangria.setText(busca[pos][8]);
        campoRecebimentos.setText(busca[pos][9]);
        campoSaldo.setText(busca[pos][10]);
               
    }
    private void limparCampos(){
        campoNome1.setText("");
        campoPdv.setText("");
        campoSuprimentos.setText("");
        campoVendaPrazo.setText("");
        campoPos.setText("");
        campoTef.setText("");
        campoVendaReceb.setText("");
        campoSangria.setText("");
        campoRecebimentos.setText("");
        campoSaldo.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cadastro;
    private javax.swing.JComboBox<String> campoNome;
    private javax.swing.JTextField campoNome1;
    private javax.swing.JTextField campoPdv;
    private javax.swing.JTextField campoPos;
    private javax.swing.JTextField campoRecebimentos;
    private javax.swing.JTextField campoSaldo;
    private javax.swing.JTextField campoSangria;
    private javax.swing.JTextField campoSuprimentos;
    private javax.swing.JTextField campoTef;
    private javax.swing.JTextField campoVendaPrazo;
    private javax.swing.JTextField campoVendaReceb;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}