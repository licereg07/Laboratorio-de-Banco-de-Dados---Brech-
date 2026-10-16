package DAO;

import Beans.Venda;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VendaDAO {
    private Connection conn;

    public VendaDAO() {
        this.conn = new Conexao().getConexao();
    }

    // Insere a venda e retorna o ID recém-gerado no banco
    public int salvarVenda(Venda v) {
        String sql = "INSERT INTO vendas (id_cliente, id_vendedor, valor_total) VALUES (?, ?, ?)";
        int idGerado = -1;

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, v.getIdCliente());
            stmt.setInt(2, v.getIdVendedor());
            stmt.setDouble(3, v.getValorTotal());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idGerado = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao registrar venda: " + ex.getMessage());
        }

        return idGerado;
    }
}