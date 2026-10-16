package DAO;

import Beans.ItemVenda;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemVendaDAO {
    private Connection conn;

    public ItemVendaDAO() {
        this.conn = new Conexao().getConexao();
    }

    // Salva cada item associado ao ID da Venda
    public void inserir(ItemVenda item) {
        String sql = "INSERT INTO itens_venda (id_venda, id_peca, quantidade, preco_unitario) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, item.getIdVenda());
            stmt.setInt(2, item.getIdPeca());
            stmt.setInt(3, item.getQuantidade());
            stmt.setDouble(4, item.getPrecoUnitario());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar item da venda: " + ex.getMessage());
        }
    }
}