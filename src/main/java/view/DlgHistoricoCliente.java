package view;

import controller.GerenciadorInterfaceGrafica;
import domain.Cliente;
import domain.ItemVenda;
import domain.Venda;
import java.awt.Frame;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class DlgHistoricoCliente extends javax.swing.JDialog {

    private final NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private Cliente clienteSelecionado;

    public DlgHistoricoCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ajustarDesign(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
        lblTotalComprado = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Historico de compras"));

        jLabel1.setText("Cliente");

        txtCliente.setEditable(false);

        jLabel2.setText("E-mail");

        txtEmail.setEditable(false);

        btnPesquisar.setText("Pesquisar cliente");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cliente", "E-mail", "Jogo", "Qtd.", "Preco unit.", "Total compra"
            }
        ));
        jScrollPane1.setViewportView(tblHistorico);

        lblTotalComprado.setText("Total comprado: R$ 0,00");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalComprado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalComprado)
                    .addComponent(btnFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisarCliente();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void ajustarDesign(java.awt.Frame parent) {
        setTitle("Historico de compras");
        setLocationRelativeTo(parent);
        tblHistorico.setDefaultEditor(Object.class, null);
        tblHistorico.setFillsViewportHeight(true);
        lblTotalComprado.setText("Total comprado: " + formatoMoeda.format(0));
    }

    private void pesquisarCliente() {
        DlgPesquisarCliente tela = new DlgPesquisarCliente(obterJanelaPai(), true);
        tela.setLocationRelativeTo(this);
        tela.setVisible(true);

        Cliente cliente = tela.getClienteSelecionado();
        if (cliente != null) {
            clienteSelecionado = cliente;
            txtCliente.setText(cliente.getNome());
            txtEmail.setText(cliente.getEndereco());
            carregarHistorico();
        }
    }

    private Frame obterJanelaPai() {
        return getOwner() instanceof Frame ? (Frame) getOwner() : null;
    }

    private void carregarHistorico() {
        DefaultTableModel modelo = (DefaultTableModel) tblHistorico.getModel();
        modelo.setRowCount(0);
        float totalComprado = 0;

        try {
            List<Venda> vendas = GerenciadorInterfaceGrafica.getMyInstance()
                    .getGerenciadorDominio()
                    .listarVendasComItensPorCliente(clienteSelecionado.getIdCliente());

            for (Venda venda : vendas) {
                totalComprado += venda.getValorVenda();

                if (venda.getItensVenda().isEmpty()) {
                    modelo.addRow(new Object[]{
                        formatarData(venda),
                        clienteSelecionado.getNome(),
                        clienteSelecionado.getEndereco(),
                        "Sem itens",
                        "",
                        "",
                        formatoMoeda.format(venda.getValorVenda())
                    });
                    continue;
                }

                for (ItemVenda item : venda.getItensVenda()) {
                    modelo.addRow(new Object[]{
                        formatarData(venda),
                        clienteSelecionado.getNome(),
                        clienteSelecionado.getEndereco(),
                        item.getJogo().getNome(),
                        item.getQuantidade(),
                        formatoMoeda.format(item.getPrecoUnitario()),
                        formatoMoeda.format(venda.getValorVenda())
                    });
                }
            }

            lblTotalComprado.setText("Total comprado: " + formatoMoeda.format(totalComprado));
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar historico: " + ex.getMessage(),
                    "Historico de compras", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String formatarData(Venda venda) {
        return venda.getData() == null ? "" : formatoData.format(venda.getData());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalComprado;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
