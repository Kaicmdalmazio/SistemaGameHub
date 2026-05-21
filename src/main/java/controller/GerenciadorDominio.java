/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoPostgresSQL;
import java.sql.SQLException;

/**
 *
 * @author strik
 */
public class GerenciadorDominio {
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        // ConexaoMySQL.obterConexao();        
        ConexaoPostgresSQL.obterConexao();
    }
}
