package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Conta;

/**
 * @author cSandrini
 */

public class ContaDAO {
    public void create(Conta o) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO contas (nrConta, nome, saldo, idade)VALUES(?,?,?,?)");
            stmt.setInt(1, o.getNrConta());
            stmt.setString(2, o.getNome());
            stmt.setDouble(3, o.getSaldo());
            stmt.setInt(4, o.getIdade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Conta> read(int txtNrConta) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Conta> contas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM contas WHERE nrConta = ?;");
            stmt.setInt(1, txtNrConta);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Conta conta = new Conta();
                conta.setNrConta(rs.getInt("nrConta"));
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setNome(rs.getString("nome"));
                conta.setIdade(rs.getInt("idade"));

                //Adiciona os resultados ao array
                contas.add(conta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return contas;
    }
    
    public void delete(int txtNrContaX) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM contas WHERE nrConta = ?;");
            stmt.setInt(1, txtNrContaX);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
