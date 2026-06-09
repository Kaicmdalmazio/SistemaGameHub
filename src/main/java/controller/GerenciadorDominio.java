/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;

import domain.Venda;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author strik
 */
public class GerenciadorDominio {
    
    private ClienteDAO cliDAO;
    private GenericDAO genDAO;
    
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        // ConexaoMySQL.obterConexao();        
        //ConexaoPostgresSQL.obterConexao();
        ConexaoHibernate.getSessionFactory();
        
        //colocar as classes dao aqui 
        cliDAO = new ClienteDAO();
        genDAO = new GenericDAO();
    }
    
    // LISTAR GENÉRICO
    public List listar( Class classe) throws HibernateException {        
        return genDAO.listar( classe );
    }
    
    // EXCLUIR GENÉRICO
    public void excluir(Object obj) throws HibernateException {                                
        genDAO.excluir(obj);
    }
    
    // INSERIR GENÉRICO
    public void inserir(Object obj) throws HibernateException {                                
        genDAO.inserir(obj);
    }

    public List<Venda> listarVendasComItensPorCliente(int idCliente) throws HibernateException {
        return genDAO.listarVendasComItensPorCliente(idCliente);
    }

//    List listar(Class classe) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    
    
}
