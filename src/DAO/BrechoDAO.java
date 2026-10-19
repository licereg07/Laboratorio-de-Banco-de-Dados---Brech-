

package DAO;

import beans.Brecho;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrechoDAO {
    private Conexao conexao;
    private Connection conn;

    public BrechoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
    public void inserir(Brecho brecho) {
        String sql = "INSERT INTO catalogo (titulo, marca, categoria, tamanho, condicao, preco, status) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, brecho.getTitulo());
            stmt.setString(2, brecho.getMarca());
            stmt.setString(3, brecho.getCategoria());
            stmt.setString(4, brecho.getTamanho());
            stmt.setString(5, brecho.getCondicao());
            stmt.setDouble(6, brecho.getPreco());
            stmt.setString(7, brecho.getStatus());

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir peça: " + ex.getMessage());
        }
    } 
    
    public java.util.List<beans.Brecho> listarTodos() {
    String sql = "SELECT * FROM catalogo";
    java.util.List<beans.Brecho> lista = new java.util.ArrayList<>();

    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        java.sql.ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            beans.Brecho b = new beans.Brecho();
            b.setId(rs.getInt("ID"));
            b.setTitulo(rs.getString("Titulo"));
            b.setMarca(rs.getString("Marca"));
            b.setCategoria(rs.getString("Categoria"));
            b.setTamanho(rs.getString("Tamanho"));
            b.setCondicao(rs.getString("Condicao"));
            b.setPreco(rs.getDouble("Preco"));
            b.setStatus(rs.getString("Status"));

            lista.add(b);
        }
         } catch (SQLException ex) {
        System.out.println("Erro ao listar peças: " + ex.getMessage());
         }
    return lista;
    }

    public void excluir(int id) {
        String sql = "DELETE FROM catalogo WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir peça: " + ex.getMessage());
        }
    }
    
    public void editar(Brecho brecho) {
    String sql = "UPDATE catalogo SET titulo = ?, marca = ?, categoria = ?, tamanho = ?, condicao = ?, preco = ?, status = ? WHERE id = ?";

    try {
        java.sql.PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, brecho.getTitulo());
        stmt.setString(2, brecho.getMarca());
        stmt.setString(3, brecho.getCategoria());
        stmt.setString(4, brecho.getTamanho());
        stmt.setString(5, brecho.getCondicao());
        stmt.setDouble(6, brecho.getPreco());
        stmt.setString(7, brecho.getStatus());
        stmt.setInt(8, brecho.getId());

        stmt.execute();
    } catch (java.sql.SQLException ex) {
        System.out.println("Erro ao atualizar peça: " + ex.getMessage());
    }
}
    
    public java.util.List<Brecho> consultarFiltros(
        String categoria, boolean usaCategoria,
        String tamanho, boolean usaTamanho,
        String condicao, boolean usaCondicao,
        String status, boolean usaStatus) {

    java.util.List<Brecho> lista = new java.util.ArrayList<>();
    String sql = "SELECT * FROM catalogo WHERE 1=1";


    if (usaCategoria) {
        sql += " AND categoria = ?";
    }
    if (usaTamanho) {
        sql += " AND tamanho = ?";
    }
    if (usaCondicao) {
        sql += " AND condicao = ?";
    }
    if (usaStatus) {
        sql += " AND status = ?";
    }

    try {
        java.sql.PreparedStatement stmt = this.conn.prepareStatement(sql);
        int index = 1;

        if (usaCategoria) {
            stmt.setString(index++, categoria);
        }
        if (usaTamanho) {
            stmt.setString(index++, tamanho);
        }
        if (usaCondicao) {
            stmt.setString(index++, condicao);
        }
        if (usaStatus) {
            stmt.setString(index++, status);
        }

        java.sql.ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Brecho b = new Brecho();
            b.setId(rs.getInt("id"));
            b.setTitulo(rs.getString("titulo"));
            b.setMarca(rs.getString("marca"));
            b.setCategoria(rs.getString("categoria"));
            b.setTamanho(rs.getString("tamanho"));
            b.setCondicao(rs.getString("condicao"));
            b.setPreco(rs.getDouble("preco"));
            b.setStatus(rs.getString("status"));

            lista.add(b);
        }
    } catch (java.sql.SQLException ex) {
        System.out.println("Erro ao consultar peças: " + ex.getMessage());
    }
    return lista;
}
    public void atualizarStatusVendido(int idPeca) {
        String sql = "UPDATE catalogo SET status = 'Vendido' WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idPeca);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar status da peça: " + ex.getMessage());
        }
    }
// 1. Listar apenas peças Disponíveis
    public List<Brecho> listarDisponiveis() {
        List<Brecho> lista = new ArrayList<>();
        // Traz apenas quem é Disponivel (ou status nulo/vazio)
        String sql = "SELECT * FROM catalogo WHERE status IS NULL OR status = '' OR LOWER(status) = 'disponível' OR LOWER(status) = 'disponivel'";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Brecho p = new Brecho();
                p.setId(rs.getInt("id"));
                p.setTitulo(rs.getString("titulo"));
                p.setPreco(rs.getDouble("preco"));
                p.setStatus(rs.getString("status"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar peças disponíveis: " + ex.getMessage());
        }
        return lista;
    }

    // 2. Pesquisar apenas peças Disponíveis
    public List<Brecho> pesquisarDisponiveis(String termo) {
        List<Brecho> lista = new ArrayList<>();
        String sql = "SELECT * FROM catalogo WHERE (status IS NULL OR status = '' OR LOWER(status) = 'disponível' OR LOWER(status) = 'disponivel') AND LOWER(titulo) LIKE LOWER(?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + termo + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Brecho p = new Brecho();
                p.setId(rs.getInt("id"));
                p.setTitulo(rs.getString("titulo"));
                p.setPreco(rs.getDouble("preco"));
                p.setStatus(rs.getString("status"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao pesquisar peças disponíveis: " + ex.getMessage());
        }
        return lista;
    }

} 