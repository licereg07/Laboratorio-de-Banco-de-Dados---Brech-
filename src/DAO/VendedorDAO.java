package DAO;

import Beans.Vendedor;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {
    private Connection conn;

    public VendedorDAO() {
        this.conn = new Conexao().getConexao();
    }

    // Inserir novo vendedor
    public void inserir(Vendedor v) {
        String sql = "INSERT INTO vendedores (nome, cpf, comissao) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, v.getNome());
            stmt.setString(2, v.getCpf());
            stmt.setDouble(3, v.getComissao());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar vendedor: " + ex.getMessage());
        }
    }

    // Listar todos os vendedores
    public List<Vendedor> listarTodos() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedores";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vendedor v = new Vendedor();
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("nome"));
                v.setCpf(rs.getString("cpf"));
                v.setComissao(rs.getDouble("comissao"));
                lista.add(v);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar vendedores: " + ex.getMessage());
        }
        return lista;
    }

    // Editar dados do vendedor
    public void editar(Vendedor v) {
        String sql = "UPDATE vendedores SET nome=?, cpf=?, comissao=? WHERE id=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, v.getNome());
            stmt.setString(2, v.getCpf());
            stmt.setDouble(3, v.getComissao());
            stmt.setInt(4, v.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar vendedor: " + ex.getMessage());
        }
    }

    // Excluir vendedor
    public void excluir(int id) {
        String sql = "DELETE FROM vendedores WHERE id=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir vendedor: " + ex.getMessage());
        }
    }

    // Método extra: Conta o número de vendas efetuadas por um vendedor específico
    public int contarVendas(int idVendedor) {
        String sql = "SELECT COUNT(*) AS total FROM vendas WHERE id_vendedor = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idVendedor);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao contar vendas do vendedor: " + ex.getMessage());
        }
        return 0;
    }
}