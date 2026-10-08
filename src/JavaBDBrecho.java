
import Conexao.Conexao;
import beans.Brecho;
import DAO.BrechoDAO;

public class JavaBDBrecho {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
        
        Brecho b = new Brecho();
        b.setTitulo("Vestido Midi Floral");
        b.setMarca("Farm");
        b.setCategoria("Vestidos");
        b.setTamanho("M");
        b.setCondicao("Seminovo");
        b.setPreco(79.90);
        b.setStatus("Disponível");

    BrechoDAO bDAO = new BrechoDAO();
    bDAO.inserir(b);
    }
    
}
