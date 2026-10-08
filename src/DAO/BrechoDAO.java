

package DAO;

import beans.Brecho;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

} 