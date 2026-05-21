/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author strik
 */
public class ConexaoPostgresSQL {
    private static Connection conexao;
    
    public static Connection obterConexao() throws ClassNotFoundException, SQLException  {
        // VARIÁVEIS DE AMBIENTE
        String login = "postgres";
        String senha = "postgre";
        String ip = "127.0.0.1:5432";
        String nomeBanco = "jeanxfome";
        String url = "jdbc:postgresql://" + ip + "/" + nomeBanco;
        
        Class.forName("org.postgresql.Driver");
        conexao = DriverManager.getConnection(url, login, senha);
        return conexao;
    }
}
