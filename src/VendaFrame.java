
import Beans.Cliente;
import Beans.Vendedor;
import Beans.Venda;
import DAO.BrechoDAO;
import DAO.VendaDAO;
import DAO.ClienteDAO;
import DAO.VendedorDAO;
import beans.Brecho;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Util.ReciboPDF;


public class VendaFrame extends javax.swing.JFrame {

    private double valorTotalVenda = 0.0;
    private List<Brecho> listaPecas;

    public VendaFrame() {
        initComponents();
        carregarClientes();
        carregarVendedores();
        carregarPecas();
    }
    private void carregarClientes() {
        ClienteDAO cDAO = new ClienteDAO();
        List<Cliente> lista = cDAO.listarTodos();
        cmbCliente.removeAllItems();
        for (Cliente c : lista) {
            cmbCliente.addItem(c.getNome());
        }
    }
    private void carregarVendedores() {
        VendedorDAO vDAO = new VendedorDAO();
        List<Vendedor> lista = vDAO.listarTodos();
        cmbVendedor.removeAllItems();
        for (Vendedor v : lista) {
            cmbVendedor.addItem(v.getNome());
        }
    }
    private void carregarPecas() {
        BrechoDAO bDAO = new BrechoDAO();
        listaPecas = bDAO.listarDisponiveis(); // Traz só as disponíveis
        cmbPeca.removeAllItems();
        
        for (Brecho p : listaPecas) {
            cmbPeca.addItem(p.getTitulo() + " - R$ " + String.format("%.2f", p.getPreco()));
        }
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbVendedor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbPeca = new javax.swing.JComboBox<>();
        btnAdicionarItem = new javax.swing.JButton();
        txtPesquisaPeca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblTotalVenda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItensVenda = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisaCliente = new javax.swing.JTextField();
        txtPesquisaVendedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Cliente: ");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Vendedor: ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Peças", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 24))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Peça:");

        btnAdicionarItem.setText("Adicionar peça ➕");
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        txtPesquisaPeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaPecaKeyReleased(evt);
            }
        });

        jLabel4.setText("🔎");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbPeca, 0, 217, Short.MAX_VALUE)
                    .addComponent(txtPesquisaPeca))
                .addGap(84, 84, 84)
                .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarItem)
                    .addComponent(txtPesquisaPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        lblTotalVenda.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lblTotalVenda.setText("TOTAL DA VENDA: R$0,00");

        tblItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Preço Unit.", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tblItensVenda);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setText("Itens da Venda:");

        btnFinalizar.setText("Finalizar Venda ✔");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Cancelar / Limpar ✖");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("CPF");

        jLabel7.setText("🔎");

        txtPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaClienteKeyReleased(evt);
            }
        });

        txtPesquisaVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaVendedorKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Nome");

        jLabel9.setText("🔎");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalVenda)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addGap(46, 46, 46)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbCliente, 0, 200, Short.MAX_VALUE)
                                .addComponent(txtPesquisaCliente))
                            .addGap(145, 145, 145)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel9)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbVendedor, 0, 200, Short.MAX_VALUE)
                                .addComponent(txtPesquisaVendedor))))
                    .addComponent(jLabel5))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalVenda)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        if (cmbPeca.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma peça válida!");
            return;
        }

        Brecho pecaSelecionada = listaPecas.get(cmbPeca.getSelectedIndex());
        DefaultTableModel model = (DefaultTableModel) tblItensVenda.getModel();

        // VALIDAÇÃO: Verifica se o ID da peça já existe na tabela de itens
        for (int i = 0; i < model.getRowCount(); i++) {
            int idTabela = Integer.parseInt(model.getValueAt(i, 0).toString());
            if (idTabela == pecaSelecionada.getId()) {
                JOptionPane.showMessageDialog(this, "A peça '" + pecaSelecionada.getTitulo() + "' já foi adicionada à venda!");
                return; // Interrompe e não adiciona duplicado
            }
        }

        // Adiciona a peça única na tabela (ID, Título, Preço)
        model.addRow(new Object[]{
            pecaSelecionada.getId(),
            pecaSelecionada.getTitulo(),
            String.format("%.2f", pecaSelecionada.getPreco())
        });

        // Atualiza o total
        valorTotalVenda += pecaSelecionada.getPreco();
        lblTotalVenda.setText("TOTAL DA VENDA: R$ " + String.format("%.2f", valorTotalVenda));
    }//GEN-LAST:event_btnAdicionarItemActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblItensVenda.getModel();

    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Adicione pelo menos um item para finalizar a venda!");
        return;
    }

    // 1. CAPTURA OS DADOS DO CLIENTE E VENDEDOR
    String cliente = cmbCliente.getSelectedItem() != null ? cmbCliente.getSelectedItem().toString() : "Consumidor";
    String vendedor = cmbVendedor.getSelectedItem() != null ? cmbVendedor.getSelectedItem().toString() : "Atendente";
    String total = lblTotalVenda.getText();
    String data = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date());

// 2. INCREMENTA AS VENDAS DO VENDEDOR NO BANCO DE DADOS
    if (cmbVendedor.getSelectedItem() != null) {
        String nomeVendedor = cmbVendedor.getSelectedItem().toString();
        VendedorDAO vDAO = new VendedorDAO();
        
        // Procura o vendedor na lista pelo nome selecionado
        List<Vendedor> lista = vDAO.pesquisarPorNome(nomeVendedor);
        if (!lista.isEmpty()) {
            vDAO.incrementarVendas(lista.get(0).getId());
        }
    }

    // 3. GRAVA OS ITENS DA VENDA E MONTA O TEXTO DO RECIBO
    StringBuilder itens = new StringBuilder();
    BrechoDAO bDAO = new BrechoDAO();
    
    for (int i = 0; i < model.getRowCount(); i++) {
        int idPeca = Integer.parseInt(model.getValueAt(i, 0).toString());
        String titulo = model.getValueAt(i, 1).toString();
        String preco = model.getValueAt(i, 2).toString();
        
        bDAO.atualizarStatusVendido(idPeca); // Marca a peça como Vendida
        itens.append("- ").append(titulo).append(" (R$ ").append(preco).append(")\n");
    }

    JOptionPane.showMessageDialog(this, "Venda realizada com sucesso!");

    // 4. GERAR O RECIBO BONITO NO NAVEGADOR
    ReciboPDF.gerarReciboTexto(cliente, vendedor, total, data, itens.toString());

    // 5. LIMPAR A TELA E RECARREGAR
    model.setRowCount(0);
    valorTotalVenda = 0.0;
    lblTotalVenda.setText("TOTAL DA VENDA: R$ 0,00");
    
    carregarPecas();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtPesquisaPecaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPecaKeyReleased
    String termo = txtPesquisaPeca.getText().trim();

        if (termo.isEmpty()) {
            carregarPecas(); // Se apagar o campo, recarrega todas
            return;
        }

        BrechoDAO bDAO = new BrechoDAO();
        listaPecas = bDAO.pesquisarDisponiveis(termo);

        cmbPeca.removeAllItems();
        for (Brecho p : listaPecas) {
            cmbPeca.addItem(p.getTitulo() + " - R$ " + String.format("%.2f", p.getPreco()));
        }
    }//GEN-LAST:event_txtPesquisaPecaKeyReleased

    private void txtPesquisaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaClienteKeyReleased
        String cpf = txtPesquisaCliente.getText().trim();

        if (cpf.isEmpty()) {
            carregarClientes(); // Se apagar o campo, exibe todos
            return;
        }

        ClienteDAO cDAO = new ClienteDAO();
        List<Cliente> lista = cDAO.pesquisarPorCPF(cpf);

        cmbCliente.removeAllItems();
        for (Cliente c : lista) {
            cmbCliente.addItem(c.getNome());
        }
    }//GEN-LAST:event_txtPesquisaClienteKeyReleased

    private void txtPesquisaVendedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaVendedorKeyReleased
        String nome = txtPesquisaVendedor.getText().trim();

        if (nome.isEmpty()) {
            carregarVendedores(); // Se apagar a pesquisa, recarrega todos
            return;
        }

        VendedorDAO vDAO = new VendedorDAO();
        List<Vendedor> lista = vDAO.pesquisarPorNome(nome);

        cmbVendedor.removeAllItems();
        for (Vendedor v : lista) {
            cmbVendedor.addItem(v.getNome()); // O toString do Vendedor vai exibir o nome no combo!
        }
    }//GEN-LAST:event_txtPesquisaVendedorKeyReleased

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpa a tabela de itens
        DefaultTableModel model = (DefaultTableModel) tblItensVenda.getModel();
        model.setRowCount(0);

        // Reseta valores e labels
        valorTotalVenda = 0.0;
        lblTotalVenda.setText("TOTAL DA VENDA: R$ 0,00");

        // Limpa os campos de pesquisa
        if (txtPesquisaCliente != null) txtPesquisaCliente.setText("");
        if (txtPesquisaVendedor != null) txtPesquisaVendedor.setText("");
        if (txtPesquisaPeca != null) txtPesquisaPeca.setText("");

        // Recarrega as listas do banco de dados
        carregarClientes();
        carregarVendedores();
        carregarPecas();

        JOptionPane.showMessageDialog(this, "Venda cancelada e campos limpos com sucesso!");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(VendaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbPeca;
    private javax.swing.JComboBox<String> cmbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JTable tblItensVenda;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtPesquisaPeca;
    private javax.swing.JTextField txtPesquisaVendedor;
    // End of variables declaration//GEN-END:variables
}
