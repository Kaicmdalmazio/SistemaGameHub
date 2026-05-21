
import dao.ConexaoHibernate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author strik
 */
public class TesteConexao {
    public static void main(String[] args){
        ConexaoHibernate.getSessionFactory();
        
        System.out.println("Conexão realizada!");
    }
}
