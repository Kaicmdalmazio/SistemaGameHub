/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.HibernateException;

/**
 *
 * @author strik
 */

public class ClienteDAO {
    
    public ClienteDAO() {
    }
    
           
    
    private List<Cliente> pesquisar(int tipo, String pesq) throws HibernateException {
        
        List<Cliente> lista = new ArrayList();
        
        // TESTE
        //lista = this.listar(Cliente.class);
                       
        return lista;
    }
    
    public List<Cliente> listar() throws ClassNotFoundException, SQLException {
        return pesquisar(0,"");
    }

    public List<Cliente> pesquisarPorNome(String pesq) throws HibernateException {
        return pesquisar(1,pesq);
    }
    
    public List<Cliente> pesquisarPorCPF(String pesq) throws HibernateException {
        return pesquisar(2,pesq);
    }
    
    public List<Cliente> pesquisarPorBairro(String pesq) throws HibernateException {
        return pesquisar(3,pesq);
    }    
    
    public List<Cliente> pesquisarPorMes(String pesq) throws HibernateException {
        return pesquisar(4,pesq);
    }  
    
    
}
