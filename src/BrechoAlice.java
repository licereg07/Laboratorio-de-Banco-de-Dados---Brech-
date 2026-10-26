
import beans.Brecho;
import DAO.BrechoDAO;
import java.util.List;
public class BrechoAlice extends javax.swing.JFrame {


    public BrechoAlice() {
        initComponents();
        
        preencherTabela();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblTituloPeça = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblTamanho = new javax.swing.JLabel();
        lblCondiçao = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        cbTamanho = new javax.swing.JComboBox<>();
        cbCondicao = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        txtBuscaTamanho = new javax.swing.JLabel();
        cbBuscarCategoria = new javax.swing.JComboBox<>();
        cbBuscarTamanho = new javax.swing.JComboBox<>();
        cbBuscarCondicao = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtBuscaTamanho1 = new javax.swing.JLabel();
        cbBuscarStatus = new javax.swing.JComboBox<>();
        ckbCategoria = new javax.swing.JCheckBox();
        ckbTamanho = new javax.swing.JCheckBox();
        ckbCondicao = new javax.swing.JCheckBox();
        ckbStatus = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPecas = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 218));
        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 24))); // NOI18N

        lblTituloPeça.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTituloPeça.setText("Título da peça");

        lblMarca.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblMarca.setText("Marca");

        lblCategoria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCategoria.setText("Categoria");

        lblTamanho.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTamanho.setText("Tamanho");

        lblCondiçao.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCondiçao.setText("Condição");

        lblPreco.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPreco.setText("Preço");

        txtTitulo.setToolTipText("");
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vestidos", "Partes de cima", "Casacos", "Shorts", "Saias", "Calças", "Acessórios" }));

        cbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG", "XG" }));

        cbCondicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo com etiqueta", "Seminovo", "Usado" }));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Status");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Reservado", "Vendido" }));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText(".");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setText(".");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setText(".");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel7.setText(".");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setText(".");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setText(".");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setText(".");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setText(".");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel13.setText(".");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel14.setText(".");

        jLabel12.setText("❤");

        jPanel2.setBackground(new java.awt.Color(228, 228, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), javax.swing.BorderFactory.createTitledBorder(null, "Consultas  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 24)))); // NOI18N

        jLabel4.setText("Categoria");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtBuscaTamanho.setText("Tamanho");

        cbBuscarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vestidos", "Partes de cima", "Casacos", "Shorts", "Saias", "Calças", "Acessórios" }));
        cbBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarCategoriaActionPerformed(evt);
            }
        });

        cbBuscarTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG", "XG" }));

        cbBuscarCondicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo com etiqueta", "Seminovo", "Usado" }));

        jLabel15.setText("Status");

        txtBuscaTamanho1.setText("Condição");

        cbBuscarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Reservado", "Vendido" }));

        ckbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbCategoriaActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(153, 153, 255));
        jLabel18.setText("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscaTamanho)
                            .addComponent(txtBuscaTamanho1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbBuscarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(ckbStatus))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBuscarTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBuscarCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbTamanho)
                                    .addComponent(ckbCondicao)
                                    .addComponent(ckbCategoria)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbCategoria)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscaTamanho)
                        .addComponent(cbBuscarTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckbTamanho))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscaTamanho1)
                    .addComponent(cbBuscarCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbCondicao))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbStatus)
                            .addComponent(cbBuscarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addGap(50, 50, 50)
                .addComponent(jLabel18))
        );

        jLabel19.setForeground(new java.awt.Color(221, 221, 172));
        jLabel19.setText("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ");

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(lblTituloPeça)
                            .addComponent(lblCategoria)
                            .addComponent(lblTamanho)
                            .addComponent(lblCondiçao)
                            .addComponent(lblPreco)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbCondicao, javax.swing.GroupLayout.Alignment.LEADING, 0, 236, Short.MAX_VALUE)
                            .addComponent(cbTamanho, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco)
                            .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addComponent(jLabel12))
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(38, 38, 38)
                        .addComponent(btnEditar)
                        .addGap(47, 47, 47)
                        .addComponent(btnExcluir)
                        .addGap(37, 37, 37)
                        .addComponent(btnLimpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMarca))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCategoria)
                                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblTituloPeça))
                                .addGap(18, 18, 18)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTamanho)
                                    .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCondiçao)
                                    .addComponent(cbCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPreco)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)
                            .addComponent(btnLimpar)))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel19))
        );

        jPanel1.setBackground(new java.awt.Color(255, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Catalogo de Peças", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 24))); // NOI18N

        tblPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Marca", "Categoria", "Tamanho", "Categoria", "Preco", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPecasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPecas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );

        jLabel20.setForeground(new java.awt.Color(234, 148, 238));
        jLabel20.setText("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤ ❤ ❤ ❤ ❤ ❤ ❤ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 3021, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel20))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela() {
   
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblPecas.getModel();

    model.setNumRows(0); 
    DAO.BrechoDAO bDAO = new DAO.BrechoDAO();
    java.util.List<Brecho> lista = bDAO.listarTodos();

    for (Brecho b : lista) {
        model.addRow(new Object[]{
            b.getId(),
            b.getTitulo(),
            b.getMarca(),
            b.getCategoria(),
            b.getTamanho(),
            b.getCondicao(),
            b.getPreco(),
            b.getStatus()
            });
        }
    }
    
    private void tblPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPecasMouseClicked
        int linha = tblPecas.getSelectedRow();

    if (linha != -1) {
        txtTitulo.setText(tblPecas.getValueAt(linha, 1).toString());
        txtMarca.setText(tblPecas.getValueAt(linha, 2).toString());
        cbCategoria.setSelectedItem(tblPecas.getValueAt(linha, 3).toString());
        cbTamanho.setSelectedItem(tblPecas.getValueAt(linha, 4).toString());
        cbCondicao.setSelectedItem(tblPecas.getValueAt(linha, 5).toString());
        
        String precoTexto = tblPecas.getValueAt(linha, 6).toString()
                .replace("R$", "").replace(" ", "").replace(",", ".");
        txtPreco.setText(precoTexto);

        cbStatus.setSelectedItem(tblPecas.getValueAt(linha, 7).toString());
        
        btnSalvar.setEnabled(false);
    }
    }//GEN-LAST:event_tblPecasMouseClicked

    private void ckbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbCategoriaActionPerformed

    private void cbBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBuscarCategoriaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String categoria = cbBuscarCategoria.getSelectedItem().toString();
        String tamanho = cbBuscarTamanho.getSelectedItem().toString();
        String condicao = cbBuscarCondicao.getSelectedItem().toString();
        String status = cbBuscarStatus.getSelectedItem().toString();

        boolean usaCategoria = ckbCategoria.isSelected();
        boolean usaTamanho = ckbTamanho.isSelected();
        boolean usaCondicao = ckbCondicao.isSelected();
        boolean usaStatus = ckbStatus.isSelected();

        BrechoDAO bDAO = new BrechoDAO();
        List<Brecho> lista = bDAO.consultarFiltros(
            categoria, usaCategoria,
            tamanho, usaTamanho,
            condicao, usaCondicao,
            status, usaStatus
        );

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblPecas.getModel();
        model.setNumRows(0);

        for (Brecho b : lista) {
            model.addRow(new Object[]{
                b.getId(),
                b.getTitulo(),
                b.getMarca(),
                b.getCategoria(),
                b.getTamanho(),
                b.getCondicao(),
                b.getPreco(),
                b.getStatus()
            });
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtTitulo.setText("");
        txtMarca.setText("");
        txtPreco.setText("");

        cbCategoria.setSelectedIndex(0);
        cbTamanho.setSelectedIndex(0);
        cbCondicao.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);

        txtTitulo.requestFocus();

        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linhaSelecionada = tblPecas.getSelectedRow();

        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione uma peça na tabela para excluir!", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = Integer.parseInt(tblPecas.getValueAt(linhaSelecionada, 0).toString());

        int confirmacao = javax.swing.JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta peça?", "Confirmar Exclusão", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirmacao == javax.swing.JOptionPane.YES_OPTION) {

            DAO.BrechoDAO bDAO = new DAO.BrechoDAO();
            bDAO.excluir(id);

            javax.swing.JOptionPane.showMessageDialog(this, "Peça excluída com sucesso!");
            preencherTabela();
            btnLimparActionPerformed(evt);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tblPecas.getSelectedRow();

        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma peça na tabela para editar!");
            return;
        }

        int id = Integer.parseInt(tblPecas.getValueAt(linha, 0).toString());

        Brecho b = new Brecho();
        b.setId(id);
        b.setTitulo(txtTitulo.getText());
        b.setMarca(txtMarca.getText());
        b.setCategoria(cbCategoria.getSelectedItem().toString());
        b.setTamanho(cbTamanho.getSelectedItem().toString());
        b.setCondicao(cbCondicao.getSelectedItem().toString());
        b.setPreco(Double.parseDouble(txtPreco.getText().replace(",", ".")));
        b.setStatus(cbStatus.getSelectedItem().toString());

        DAO.BrechoDAO bDAO = new DAO.BrechoDAO();
        bDAO.editar(b);

        javax.swing.JOptionPane.showMessageDialog(this, "Peça editada com sucesso!");

        preencherTabela();
        btnLimparActionPerformed(evt);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtTitulo.getText().trim().isEmpty() || txtPreco.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha pelo menos o Título e o Preço!", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Brecho b = new Brecho();
            b.setTitulo(txtTitulo.getText());
            b.setMarca(txtMarca.getText());
            b.setCategoria(cbCategoria.getSelectedItem().toString());
            b.setTamanho(cbTamanho.getSelectedItem().toString());
            b.setCondicao(cbCondicao.getSelectedItem().toString());
            b.setPreco(Double.parseDouble(txtPreco.getText().replace(",", "."))); // aceita vírgula ou ponto
            b.setStatus(cbStatus.getSelectedItem().toString());

            DAO.BrechoDAO bDAO = new DAO.BrechoDAO();
            bDAO.inserir(b);

            javax.swing.JOptionPane.showMessageDialog(this, "Peça cadastrada com sucesso!");

            preencherTabela();

            btnLimparActionPerformed(evt);

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite um preço válido (ex: 79.90)!", "Erro de Formatação", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

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
            java.util.logging.Logger.getLogger(BrechoAlice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrechoAlice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrechoAlice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrechoAlice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrechoAlice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbBuscarCategoria;
    private javax.swing.JComboBox<String> cbBuscarCondicao;
    private javax.swing.JComboBox<String> cbBuscarStatus;
    private javax.swing.JComboBox<String> cbBuscarTamanho;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbCondicao;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTamanho;
    private javax.swing.JCheckBox ckbCategoria;
    private javax.swing.JCheckBox ckbCondicao;
    private javax.swing.JCheckBox ckbStatus;
    private javax.swing.JCheckBox ckbTamanho;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCondiçao;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JLabel lblTituloPeça;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JTable tblPecas;
    private javax.swing.JLabel txtBuscaTamanho;
    private javax.swing.JLabel txtBuscaTamanho1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables



    private void listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void preecherTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
