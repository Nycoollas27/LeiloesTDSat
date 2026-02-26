import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public boolean venderProduto(int idProduto) {
    boolean sucesso = false;
    String sql = "UPDATE produtos SET status = 'Vendido' WHERE id = ?";

    try {
        PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, idProduto);
        int linhas = pst.executeUpdate();

        if (linhas > 0) {
            sucesso = true; // Produto vendido com sucesso
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return sucesso;
}
    
    public void cadastrarProduto (ProdutosDTO produto){
        
        
        //conn = new conectaDAO().connectDB();
        
        
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }

    private static class Conexao {

        public Conexao() {
        }
    }
    
    
    
        
}

