/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import dao.ConexaoHibernate;

import java.sql.SQLException;

/**
 *
 * @author strik
 */
public class GerenciadorDominio {
    
    //private ClienteDAO cliDAO;
    
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        // ConexaoMySQL.obterConexao();        
        //ConexaoPostgresSQL.obterConexao();
        ConexaoHibernate.getSessionFactory();
        
        //colocar as classes dao aqui 
        //cliDAO = new ClienteDAO();
    }
}
