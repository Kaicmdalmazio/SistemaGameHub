/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 1547816
 */
public class ConexaoHibernate {

    private static SessionFactory sessionFactory;
    
    static{
        try{
            
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            System.out.println("Hibernate conectado com sucesso!");
            
        }catch(Throwable ex){
            System.out.println("Erro ao conectar com Hibernate:");
            
            ex.printStackTrace();
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
   
}

