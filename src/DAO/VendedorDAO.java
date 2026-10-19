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

    public void inserir(Vendedor v) {
        String sql = "INSERT INTO vendedores (nome, cpf) VALUES (?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, v.getNome());
            stmt.setString(2, v.getCpf());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar vendedor: " + ex.getMessage());
        }
    }

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
                
                // Preenche o total de vendas vindo do MySQL
                try {
                    v.setTotalVendas(rs.getInt("total_vendas"));
                } catch (SQLException e) {
                    v.setTotalVendas(0); // Se a coluna ainda não existir no banco, coloca 0
                }
                
                lista.add(v);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar vendedores: " + ex.getMessage());
        }
        return lista;
    }

    public void editar(Vendedor v) {
        String sql = "UPDATE vendedores SET nome=?, cpf=? WHERE id=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, v.getNome());
            stmt.setString(2, v.getCpf());
            stmt.setInt(3, v.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar vendedor: " + ex.getMessage());
        }
    }

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

    // Retorna a quantidade total de vendas realizadas por este vendedor
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
            System.out.println("Erro ao contar vendas: " + ex.getMessage());
        }
        return 0;
    }
    
    public List<Vendedor> pesquisarPorNome(String nome) {
        List<Vendedor> lista = new ArrayList<>();
        // Usa LOWER() para ignorar maiúsculas e minúsculas
        String sql = "SELECT * FROM vendedores WHERE LOWER(nome) LIKE LOWER(?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Vendedor v = new Vendedor();
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("nome"));
                v.setCpf(rs.getString("cpf"));
                lista.add(v);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao pesquisar vendedor por nome: " + ex.getMessage());
        }
        return lista;
    }
    // Método para atualizar a contagem de vendas do vendedor
    public void incrementarVendas(int idVendedor) {
        String sql = "UPDATE vendedores SET total_vendas = total_vendas + 1 WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idVendedor);
            int linhasAfetadas = stmt.executeUpdate();
            
            System.out.println("ID Vendedor atualizado: " + idVendedor + " | Linhas alteradas: " + linhasAfetadas);
        } catch (SQLException ex) {
            System.out.println("Erro ao incrementar vendas: " + ex.getMessage());
        }
    }
}